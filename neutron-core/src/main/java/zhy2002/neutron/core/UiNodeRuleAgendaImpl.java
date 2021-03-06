package zhy2002.neutron.core;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

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
    public boolean hasActivation(TickPhase phase) {
        Deque<BindingActivation> activationDeque = activationQueueMap.get(phase);
        return activationDeque != null && !activationDeque.isEmpty();
    }

    @Override
    public BindingActivation getNextActivation(TickPhase phase) {
        Deque<BindingActivation> activationDeque = activationQueueMap.get(phase);
        return activationDeque.poll();
    }
}
