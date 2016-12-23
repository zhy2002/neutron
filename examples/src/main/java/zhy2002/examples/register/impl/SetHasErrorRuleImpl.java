package zhy2002.examples.register.impl;

import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.event.ErrorNodeAddEvent;
import zhy2002.examples.register.gen.event.ErrorNodeRemoveEvent;
import zhy2002.examples.register.gen.rule.SetHasErrorRule;
import zhy2002.neutron.*;

import java.util.Arrays;
import java.util.Collection;

public class SetHasErrorRuleImpl extends SetHasErrorRule {

    public SetHasErrorRuleImpl(RegisterNode owner) {
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
