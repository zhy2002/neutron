package zhy2002.neutron.core.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.NodeActionEventBinding;
import zhy2002.neutron.core.RefreshEventBinding;
import zhy2002.neutron.core.config.NeutronConstants;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.IntegerStateChangeEventBinding;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.core.event.VoidActionEvent;
import zhy2002.neutron.core.node.StringUiNode;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collection;

public class AcceptValueLengthValidationRule extends LengthValidationRule {

    @Inject
    public AcceptValueLengthValidationRule(@Owner StringUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return Arrays.asList(
                new RefreshEventBinding(
                        e -> true,
                        e -> validate()
                ),
                new StringStateChangeEventBinding(
                        e -> tryClear(),
                        StringUiNode.VALUE_PROPERTY.getStateKey()
                ),
                new NodeActionEventBinding<>(
                        e -> validate(),
                        VoidActionEvent.class,
                        NeutronConstants.ACCEPT_VALUE_ACTION
                ),
                new IntegerStateChangeEventBinding(
                        e -> validate(),
                        StringUiNode.MIN_LENGTH_PROPERTY.getStateKey()
                ),
                new IntegerStateChangeEventBinding(
                        e -> validate(),
                        StringUiNode.MAX_LENGTH_PROPERTY.getStateKey()
                )
        );
    }

    private void tryClear() {
        if (!isActivated()) {
            deactivate();
        }
    }
}
