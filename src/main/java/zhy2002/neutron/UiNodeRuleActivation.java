package zhy2002.neutron;

import zhy2002.neutron.event.TickPhase;
import zhy2002.neutron.event.UiNodeEvent;
import zhy2002.neutron.node.UiNode;
import zhy2002.neutron.node.UiNodeRule;

/**
 * Created by ZHY on 13/11/2016.
 */
public class UiNodeRuleActivation {

    private UiNodeRule<?, ?> rule;
    private UiNodeEvent event;
    private UiNode<?> anchor;

    public UiNodeRuleActivation(UiNodeRule<?, ?> rule, UiNodeEvent event, UiNode<?> anchor) {
        this.rule = rule;
        this.event = event;
        this.anchor = anchor;
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

    public UiNode<?> getAnchor() {
        return anchor;
    }
}
