package zhy2002.neutron;

import java.util.*;

/**
 * The default implementation.
 */
public class UiNodeRuleAgendaImpl implements UiNodeRuleAgenda {
    private final Map<TickPhase, Deque<BindingActivation>> activationQueueMap = new HashMap<>(); //todo this is actually a priority queue.

    @Override
    public void addActivations(UiNodeEvent event) {
        for (BindingActivation activation : event.getActivations()) {
            Deque<BindingActivation> activationDeque = activationQueueMap.computeIfAbsent(activation.getPhase(), k -> new ArrayDeque<>());
            activationDeque.add(activation);
        }
    }

    @Override
    public boolean isEmpty(TickPhase phase) {
        Deque<BindingActivation> activationDeque = activationQueueMap.get(phase);
        return activationDeque == null || activationDeque.isEmpty();
    }

    @Override
    public BindingActivation getNextActivation(TickPhase phase) {
        Deque<BindingActivation> activationDeque = activationQueueMap.get(phase);
        return activationDeque.poll();
    }

    @Override
    public void clear() {
        activationQueueMap.clear();
    }
}
