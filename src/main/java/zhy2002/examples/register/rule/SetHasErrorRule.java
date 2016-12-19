package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.RegisterNode;
import zhy2002.examples.register.event.ErrorNodeAddEvent;
import zhy2002.examples.register.event.ErrorNodeRemoveEvent;
import zhy2002.neutron.*;

import java.util.Arrays;
import java.util.Collection;

public class SetHasErrorRule extends UiNodeRule<RegisterNode> {

    public SetHasErrorRule(RegisterNode owner) {
        super(owner);
    }

    private ErrorListNode getErrorListNode() {
        return getOwner().getErrorListNode();
    }

    private RegisterNode getRegisterNode() {
        return getOwner();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new NodeAddEventBinding<>(
                        this::updateHasError,
                        ErrorNodeAddEvent.class,
                        "errorListNode"
                ),
                new NodeRemoveEventBinding<>(
                        this::updateHasError,
                        ErrorNodeRemoveEvent.class,
                        "errorListNode"
                )
        );
    }

    private void updateHasError(UiNodeEvent typedEvent) {
        if (typedEvent instanceof ErrorNodeAddEvent) {
            getRegisterNode().setHasError(true);
        } else if (getErrorListNode().getItemCount() == 0) {
            getRegisterNode().setHasError(false);
        }
    }


}
