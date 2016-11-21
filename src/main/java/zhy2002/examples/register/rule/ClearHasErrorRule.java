package zhy2002.examples.register.rule;


import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.RegisterNode;
import zhy2002.neutron.UiNodeEventTypeEnum;
import zhy2002.neutron.DefaultPhases;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.rule.UiNodeRule;

public class ClearHasErrorRule extends UiNodeRule<NodeRemoveEvent<ErrorNode>, RegisterNode> {

    public ClearHasErrorRule(RegisterNode owner) {
        super(owner, DefaultPhases.Post);
    }

    @Override
    protected void execute(NodeRemoveEvent<ErrorNode> typedEvent) {
        if (typedEvent.getTarget().getParent().getChildCount() == 0) {
            getOwner().setHasError(false);
        }
    }

    @Override
    public UiNodeEventTypeEnum getEventType() {
        return UiNodeEventTypeEnum.NodeRemove;
    }

    @Override
    public boolean isObservedUiNode(UiNode<?> eventTarget) {
        return eventTarget instanceof ErrorNode;
    }
}
