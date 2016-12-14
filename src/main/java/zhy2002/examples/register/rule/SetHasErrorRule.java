package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.RegisterNode;
import zhy2002.examples.register.event.ErrorNodeAddEvent;
import zhy2002.examples.register.event.ErrorNodeRemoveEvent;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

public class SetHasErrorRule extends UiNodeRule<UiNodeEvent, RegisterNode> {

    public SetHasErrorRule(RegisterNode owner) {
        super(owner, PredefinedPhases.Post);
    }

    @Override
    public EnhancedLinkedList<Class<? extends UiNodeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(ErrorNodeAddEvent.class).and(ErrorNodeRemoveEvent.class);
    }

    @Override
    protected boolean doCanFire(UiNodeEvent event) {
        return true;
    }

    private ErrorListNode getErrorListNode() {
        return getOwner().getErrorListNode();
    }

    private RegisterNode getRegisterNode() {
        return getOwner();
    }

    @Override
    protected void doFire(UiNodeEvent typedEvent) {
        if (typedEvent instanceof ErrorNodeAddEvent) {
            getRegisterNode().setHasError(true);
        } else if (getErrorListNode().getItemCount() == 0) {
            getRegisterNode().setHasError(false);
        }
    }


}
