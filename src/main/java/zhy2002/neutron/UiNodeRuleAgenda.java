package zhy2002.neutron;

import zhy2002.neutron.event.TickPhase;
import zhy2002.neutron.event.UiNodeEvent;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZHY on 13/11/2016.
 */
public class UiNodeRuleAgenda {
    private final Map<TickPhase, Deque<UiNodeRuleActivation>> activationQueueMap = new HashMap<>(); //todo this is actually a priority queue.

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

    public boolean isEmpty(TickPhase phase) {
        Deque<UiNodeRuleActivation> activationDeque = activationQueueMap.get(phase);
        return activationDeque == null || activationDeque.isEmpty();
    }

    public UiNodeRuleActivation getNextActivation(TickPhase phase) {
        Deque<UiNodeRuleActivation> activationDeque = activationQueueMap.get(phase);
        return activationDeque.poll();
    }

    public void clear() {
        activationQueueMap.clear();
    }
}
