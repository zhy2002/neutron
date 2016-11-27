package zhy2002.neutron;

import zhy2002.neutron.rule.UiNodeRule;

import java.util.*;

/**
 * The default implementation.
 */
public class UiNodeRuleAgendaImpl implements UiNodeRuleAgenda {
    private final Map<TickPhase, Deque<UiNodeRuleActivation>> activationQueueMap = new HashMap<>(); //todo this is actually a priority queue.

    protected Iterable<UiNodeRuleActivation> getActivations(UiNodeEvent event) {
        List<UiNodeRuleActivation> result = new ArrayList<>();
        UiNode<?> anchor = event.getTarget();
        do {
            for (UiNodeRule<?, ?> rule : anchor.getAttachedRules(event.getClass())) {//todo not right, event inheritance
                if (rule.isObservedUiNode(event.getTarget())) {
                    UiNodeRuleActivation activation = new UiNodeRuleActivation(rule, event);
                    result.add(activation);
                }
            }
            anchor = anchor.getParent();
        } while (anchor != null);

        return result;
    }

    @Override
    public void addActivations(UiNodeEvent event) {
        for (UiNodeRuleActivation activation : getActivations(event)) {
            Deque<UiNodeRuleActivation> activationDeque = activationQueueMap.get(activation.getPhase());
            if (activationDeque == null) {
                activationDeque = new ArrayDeque<>();
                activationQueueMap.put(activation.getPhase(), activationDeque);
            }
            activationDeque.add(activation);
        }
    }

    @Override
    public boolean isEmpty(TickPhase phase) {
        Deque<UiNodeRuleActivation> activationDeque = activationQueueMap.get(phase);
        return activationDeque == null || activationDeque.isEmpty();
    }

    @Override
    public UiNodeRuleActivation getNextActivation(TickPhase phase) {
        Deque<UiNodeRuleActivation> activationDeque = activationQueueMap.get(phase);
        return activationDeque.poll();
    }

    @Override
    public void clear() {
        activationQueueMap.clear();
    }
}
