package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.RegisterNode;
import zhy2002.neutron.UiNodeEventTypeEnum;
import zhy2002.neutron.DefaultPhases;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.UiNode;
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
    public UiNodeEventTypeEnum getEventType() {
        return UiNodeEventTypeEnum.NodeAdd;
    }

    @Override
    public boolean isObservedUiNode(UiNode<?> eventTarget) {
        return eventTarget instanceof ErrorNode;
    }
}
