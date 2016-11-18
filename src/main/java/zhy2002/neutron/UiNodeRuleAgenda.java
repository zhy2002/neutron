package zhy2002.neutron;

import zhy2002.neutron.event.TickPhase;
import zhy2002.neutron.event.UiNodeEvent;

/**
 * Find out which rules should be activated when a event occurs
 * and determines the rule with the highest priority in the agenda.
 */
public interface UiNodeRuleAgenda {

    void addActivations(UiNodeEvent event);

    boolean isEmpty(TickPhase phase);

    UiNodeRuleActivation getNextActivation(TickPhase phase);

    void clear();
}
