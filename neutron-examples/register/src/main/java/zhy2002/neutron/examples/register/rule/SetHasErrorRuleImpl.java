package zhy2002.neutron.examples.register.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.NodeAddEventBinding;
import zhy2002.neutron.core.NodeRemoveEventBinding;
import zhy2002.neutron.core.UiNodeEvent;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.examples.register.gen.event.ErrorNodeAddEvent;
import zhy2002.neutron.examples.register.gen.event.ErrorNodeRemoveEvent;
import zhy2002.neutron.examples.register.gen.node.ErrorListNode;
import zhy2002.neutron.examples.register.gen.node.RegisterNode;
import zhy2002.neutron.examples.register.gen.rule.SetHasErrorRule;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

public class SetHasErrorRuleImpl extends SetHasErrorRule {

    @Inject
    public SetHasErrorRuleImpl(@Owner RegisterNode owner) {
        super(owner);
    }

    private ErrorListNode getErrorListNode() {
        return getOwner().getErrorListNode();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new NodeAddEventBinding<>(
                        this::updateHasError,
                        ErrorNodeAddEvent.class
                ),
                new NodeRemoveEventBinding<>(
                        this::updateHasError,
                        ErrorNodeRemoveEvent.class
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
