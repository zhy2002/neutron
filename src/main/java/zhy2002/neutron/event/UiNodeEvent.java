package zhy2002.neutron.event;

import zhy2002.neutron.EventTypeEnum;
import zhy2002.neutron.UiNodeRuleActivation;
import zhy2002.neutron.node.UiNode;

/**
 * The base class for all UiNode events.
 */
public abstract class UiNodeEvent {

    private final UiNode<?> target; //the node whose value is changing

    protected UiNodeEvent(UiNode<?> target) {
        this.target = target;
    }

    public abstract EventTypeEnum getEventType();

    public UiNode<?> getTarget() {
        return target;
    }

    public abstract Iterable<UiNodeRuleActivation> getActivations();

    public abstract void apply();

    public abstract void revert();
}
