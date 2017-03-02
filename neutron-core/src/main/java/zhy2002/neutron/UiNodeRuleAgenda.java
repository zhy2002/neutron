package zhy2002.neutron;

/**
 * Find out which rules should be activated when a event occurs
 * and determines the rule with the highest priority in the agenda.
 */
public interface UiNodeRuleAgenda {

    void addActivations(UiNodeEvent event);

    boolean hasActivation(TickPhase phase);

    BindingActivation getNextActivation(TickPhase phase);
}
