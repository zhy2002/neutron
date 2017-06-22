package zhy2002.neutron;

import zhy2002.neutron.config.NeutronConstants;
import zhy2002.neutron.exception.UiNodeEventException;

import java.util.*;

/**
 * A cycle is triggered by one or multiple change events
 * and contains all the changes that ensue (e.g. via rules).
 * A cycle is atomic, meaning all of its changes must be either
 * complete or abort.
 * A cycle is processed in multiple ticks.
 * A tick is dequeue all events in event queue + executing all rules polled
 * into the cycles agenda.
 * When the agenda is emptied the cycle will check if the event queue is empty.
 * If not another tick is executed.
 * In Send mode events triggered by rules will be polled into agenda directly and
 * thus be included into the current tick.
 */
public class Cycle implements CycleStatus {

    /**
     * Maximum number of rules fired in one cycle.
     */
    private static final int MAX_RULE_ACTIVATION_COUNT = 10000;
    /**
     * The predefined phases of a tick.
     * Rule prioritization on happens in the same phase.
     * Full priority is Tick -> Phase -> Priority.
     */
    private static final TickPhase[] TICK_PHASES = {PredefinedPhases.Pre, PredefinedPhases.Post, PredefinedPhases.Validate};

    /**
     * UiNode events that are parsed but not applied.
     * "parsed" means the activations of the event is added to the agenda.
     */
    private final Deque<UiNodeEvent> notAppliedDeque = new ArrayDeque<>();
    /**
     * UiNode events that are parsed and applied.
     */
    private final Deque<UiNodeEvent> appliedDeque = new ArrayDeque<>();
    /**
     * Notifications to be sent out at the end of this cycle.
     */
    private final List<UiNodeNotification> notifications = new ArrayList<>();
    /**
     * An object that prioritize rule activations.
     */
    private final UiNodeRuleAgenda agenda = new UiNodeRuleAgendaImpl();
    /**
     * This field tracks the current phase of in tick.
     */
    private TickPhase currentPhase;
    /**
     * An enum value indicating what this cycle is doing at the moment.
     */
    private CycleStateEnum state;
    /**
     * The current event being applied or reverted.
     * When rules are firing this is null.
     */
    private ChangeUiNodeEvent currentChangeEvent;
    /**
     * The executing rule activation. Code can access this field
     * to find out what is causing itself to execute.
     */
    private BindingActivation currentActivation;
    /**
     * Count the number of rules activated.
     */
    private int ruleActivationCount;
    /**
     * A flag that indicates the current tick should rerun all the phases.
     */
    private boolean resetTick;

    boolean canRevert() {
        return !appliedDeque.isEmpty();
    }

    boolean canApply() {
        return !notAppliedDeque.isEmpty();
    }

    private void increaseActivationCount() {
        if (++ruleActivationCount > MAX_RULE_ACTIVATION_COUNT)
            throw new UiNodeEventException("Rule activation limit exceeded.");
    }

    void resetTick() {
        this.resetTick = true;
    }

    public void apply() {
        state = CycleStateEnum.Applying;
        try {
            while (!notAppliedDeque.isEmpty()) {
                UiNodeEvent uiNodeEvent = notAppliedDeque.poll();
                if (uiNodeEvent instanceof ChangeUiNodeEvent) {
                    currentChangeEvent = (ChangeUiNodeEvent) uiNodeEvent;
                    currentActivation = new BindingActivation(null, currentChangeEvent);
                    currentChangeEvent.apply();
                    currentChangeEvent = null;
                    currentActivation = null;
                }
                appliedDeque.add(uiNodeEvent);
            }
        } finally {
            state = null;
        }
    }

    public void revert() {
        state = CycleStateEnum.Reverting;
        try {
            while (!appliedDeque.isEmpty()) {
                UiNodeEvent uiNodeEvent = appliedDeque.pollLast();
                if (uiNodeEvent instanceof ChangeUiNodeEvent) {
                    currentChangeEvent = (ChangeUiNodeEvent) uiNodeEvent;
                    currentActivation = new BindingActivation(null, currentChangeEvent);
                    currentChangeEvent.revert();
                    currentChangeEvent = null;
                    currentActivation = null;
                }
                notAppliedDeque.addFirst(uiNodeEvent);
            }
        } finally {
            state = null;
        }
    }

    void queueNotification(UiNodeNotification uiNodeNotification) {
        notifications.add(uiNodeNotification);
    }

    void queueChangeNotifications() {
        Iterator<UiNodeEvent> iterator = appliedDeque.iterator();
        Set<UiNode<?>> queued = new HashSet<>();
        while (iterator.hasNext()) {
            UiNodeEvent uiNodeEvent = iterator.next();
            if (uiNodeEvent instanceof NodeAddEvent || uiNodeEvent instanceof NodeRemoveEvent) {
                UiNode<?> parent = uiNodeEvent.getOrigin().getParent();
                if (!queued.contains(parent)) {
                    parent.queueNotification(NeutronConstants.STATE_CHANGE_NOTIFICATION, null);
                    queued.add(parent);
                }
            }
            if (uiNodeEvent instanceof ChangeUiNodeEvent) {
                if (!queued.contains(uiNodeEvent.getOrigin())) {
                    uiNodeEvent.getOrigin().queueNotification(NeutronConstants.STATE_CHANGE_NOTIFICATION, null);
                    queued.add(uiNodeEvent.getOrigin());
                }
            }
        }
    }

    void sendNotifications() {
        //ensure change notification is not sent once
        Set<UiNode<?>> changeNotificationSent = new HashSet<>();
        for (UiNodeNotification notification : notifications) {
            if (NeutronConstants.STATE_CHANGE_NOTIFICATION.equals(notification.getName())) {
                if (changeNotificationSent.contains(notification.getOrigin()))
                    continue;
                changeNotificationSent.add(notification.getOrigin());
            }
            notification.send();
        }
    }

    @Override
    public TickPhase getCurrentPhase() {
        return currentPhase;
    }

    @Override
    public CycleStateEnum getCurrentStatus() {
        return state;
    }

    @Override
    public ChangeUiNodeEvent getCurrentChangeEvent() {
        return currentChangeEvent;
    }

    @Override
    public BindingActivation getCurrentActivation() {
        return currentActivation;
    }

    void pollAll(Deque<UiNodeEvent> eventDeque) {
        while (!eventDeque.isEmpty()) {
            UiNodeEvent event = eventDeque.poll();
            agenda.addActivations(event);
            notAppliedDeque.add(event);
        }
    }

    /**
     * Fire all rules activated by the events in the event queue
     * when this method is called.
     */
    void processTick() {
        boolean changesApplied = false;
        for (int i = 0; i < TICK_PHASES.length; i++) {
            TickPhase phase = TICK_PHASES[i];
            //apply changes if required
            if (!changesApplied && phase.PostChanges()) {
                apply();
                changesApplied = true;
            }

            //fire rules in phase
            currentPhase = phase;
            try {
                processPhase();
                if (resetTick) {
                    i = -1;
                    changesApplied = false;
                    resetTick = false;
                }

            } finally {
                currentPhase = null;
            }
        }

        if (!changesApplied) {
            apply();
        }
    }

    private void processPhase() {
        try {
            state = CycleStateEnum.Firing;
            while (!resetTick && agenda.hasActivation(currentPhase)) {
                currentActivation = agenda.getNextActivation(currentPhase);
                increaseActivationCount();
                currentActivation.fire();
            }
        } finally {
            currentActivation = null;
            state = null;
        }
    }
}
