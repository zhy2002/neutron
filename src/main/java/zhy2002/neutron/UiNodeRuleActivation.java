package zhy2002.neutron;

import zhy2002.neutron.rule.UiNodeRule;

/**
 * Immutable data class that encapsulates all the objects
 * needed to fire a rule.
 */
public class UiNodeRuleActivation {

    private final UiNodeRule<?, ?> rule;
    private final UiNodeEvent event;

    public UiNodeRuleActivation(UiNodeRule<?, ?> rule, UiNodeEvent event) {
        this.rule = rule;
        this.event = event;
    }

    public void fire() {
        rule.fire(event);
    }

    public TickPhase getPhase() {
        return rule.getPhase();
    }

    public UiNodeRule<?, ?> getRule() {
        return rule;
    }

    public UiNodeEvent getEvent() {
        return event;
    }

}
