package zhy2002.neutron;

import java.util.*;

/**
 * Contains all changes done in this cycle.
 * A cycle must be complete, otherwise every change
 * occurred in it will revert.
 */
public class Cycle implements CycleStatus {

    /**
     * Maximum number of rules fired in one cycle.
     */
    private static final int MAX_RULE_ACTIVATION_COUNT = 500;
    /**
     * The predefined phases of a tick.
     * Rule prioritization on happens in the same phase.
     * Full priority is Tick -> Phase -> Priority.
     */
    private static final TickPhase[] TICK_PHASES = {PredefinedPhases.Pre, PredefinedPhases.Post, PredefinedPhases.Validate, PredefinedPhases.CleanUp};

    /**
     * UiNode events that are parsed by not applied.
     * "parse" means the activations of the event is added to the agenda.
     */
    private final Deque<UiNodeEvent> notAppliedDeque = new ArrayDeque<>();
    /**
     * UiNode events that are parsed and applied.
     */
    private final Deque<UiNodeEvent> appliedDeque = new ArrayDeque<>();
    /**
     * An object that prioritize rule activations.
     */
    private final UiNodeRuleAgendaImpl agenda = new UiNodeRuleAgendaImpl();
    /**
     * This field tracks the current phase of in tick.
     */
    private TickPhase currentPhase;
    /**
     * An enum value indicating what this cycle is doing at the moment.
     */
    private CycleStatusEnum status;
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

    private int ruleActivationCount;

    private boolean resetTick;


    public void apply() {
        status = CycleStatusEnum.Applying;
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
        status = null;
    }

    public void revert() {
        status = CycleStatusEnum.Applying;
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
        status = null;
    }

    @Override
    public TickPhase getCurrentPhase() {
        return currentPhase;
    }

    @Override
    public CycleStatusEnum getCurrentStatus() {
        return status;
    }

    @Override
    public ChangeUiNodeEvent getCurrentChangeEvent() {
        return currentChangeEvent;
    }

    @Override
    public BindingActivation getCurrentActivation() {
        return currentActivation;
    }

    void notifyChanges() {
        Iterator<UiNodeEvent> iterator = appliedDeque.iterator();
        List<UiNode<?>> changedNodes = new ArrayList<>();
        while (iterator.hasNext()) {
            UiNodeEvent uiNodeEvent = iterator.next();
            if (uiNodeEvent instanceof NodeAddEvent || uiNodeEvent instanceof NodeRemoveEvent) {
                changedNodes.add(uiNodeEvent.getOrigin().getParent());
            }
            if (uiNodeEvent instanceof ChangeUiNodeEvent) {
                changedNodes.add(uiNodeEvent.getOrigin());
            }
        }
        Set<UiNode<?>> notified = new HashSet<>();
        for (UiNode<?> node : changedNodes) {
            if (notified.contains(node))
                continue;
            node.notifyChange();
            notified.add(node);
        }
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
            status = CycleStatusEnum.Firing;
            while (!resetTick && agenda.hasActivation(currentPhase)) {
                currentActivation = agenda.getNextActivation(currentPhase);
                increaseActivationCount();
                currentActivation.fire();
            }
        } finally {
            currentActivation = null;
            status = null;
        }
    }

    private void increaseActivationCount() {
        if (++ruleActivationCount > MAX_RULE_ACTIVATION_COUNT)
            throw new UiNodeEventException("Rule activation limit exceeded.");
    }

    boolean canRevert() {
        return !appliedDeque.isEmpty();
    }

    boolean canApply() {
        return !notAppliedDeque.isEmpty();
    }

    void resetTick() {
        this.resetTick = true;
    }

}
