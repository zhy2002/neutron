package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.RegisterNode;
import zhy2002.neutron.EventTypeEnum;
import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.NodeAddEvent;
import zhy2002.neutron.node.UiNode;
import zhy2002.neutron.rule.UiNodeRule;

public class SetHasErrorRule extends UiNodeRule<NodeAddEvent<ErrorNode>, RegisterNode> {


    public SetHasErrorRule(RegisterNode owner ) {
        super(owner, DefaultPhases.Post);
    }

    @Override
    protected void execute(NodeAddEvent<ErrorNode> typedEvent) {
        getOwner().setHasError(true);
    }

    @Override
    public EventTypeEnum getEventType() {
        return EventTypeEnum.Load;
    }

    @Override
    public boolean isObservedUiNode(UiNode<?> eventTarget) {
        return eventTarget instanceof ErrorNode;
    }
}
