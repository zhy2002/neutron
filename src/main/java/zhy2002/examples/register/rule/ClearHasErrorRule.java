package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.RegisterNode;
import zhy2002.examples.register.event.ErrorNodeRemoveEvent;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.rule.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

public abstract class ClearHasErrorRule extends UiNodeRule<ErrorNodeRemoveEvent, RegisterNode> {

    @FunctionalInterface
    public interface Factory {
        ClearHasErrorRule create(RegisterNode owner);
    }

    protected ClearHasErrorRule(RegisterNode owner) {
        super(owner, PredefinedPhases.Post);
    }

    @Override
    protected void doFire(ErrorNodeRemoveEvent typedEvent) {
        if (typedEvent.getTarget().getParent().getChildCount() == 0) {
            getOwner().setHasError(false);
        }
    }

    @Override
    public EnhancedLinkedList<Class<? extends ErrorNodeRemoveEvent>> observedEventTypes() {
        return super.observedEventTypes().and(ErrorNodeRemoveEvent.class);
    }

    @Override
    public boolean canFire(UiNodeEvent event) {
        UiNode<?> eventTarget = event.getTarget();
        return eventTarget instanceof ErrorNode;
    }
}
