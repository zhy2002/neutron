package zhy2002.neutron;

import zhy2002.neutron.event.TickPhase;
import zhy2002.neutron.event.UiNodeEvent;
import zhy2002.neutron.node.UiNode;
import zhy2002.neutron.rules.UiNodeRule;

/**
 * Created by ZHY on 13/11/2016.
 */
public class UiNodeRuleActivation {

    private UiNodeRule<?> rule;
    private UiNodeEvent event;
    private UiNode<?> transmitter;

    public void fire() {

    }

    public TickPhase getPhase() {
        return rule.getPhase();
    }
}
