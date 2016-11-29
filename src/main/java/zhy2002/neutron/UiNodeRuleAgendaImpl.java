package zhy2002.neutron;

import zhy2002.neutron.rule.UiNodeRule;

import java.util.*;

/**
 * The default implementation.
 */
public class UiNodeRuleAgendaImpl implements UiNodeRuleAgenda {
    private final Map<TickPhase, Deque<UiNodeRuleActivation>> activationQueueMap = new HashMap<>(); //todo this is actually a priority queue.

    @Override
    public void addActivations(UiNodeEvent event) {
        for (UiNodeRuleActivation activation : event.getActivations()) {
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
