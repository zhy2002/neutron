package zhy2002.neutron.core.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.NodeActionEventBinding;
import zhy2002.neutron.core.ValidationRule;
import zhy2002.neutron.core.config.NeutronConstants;
import zhy2002.neutron.core.event.IntegerStateChangeEventBinding;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.core.event.VoidActionEvent;
import zhy2002.neutron.core.node.StringUiNode;
import zhy2002.neutron.core.util.CollectionUtil;
import zhy2002.neutron.core.util.ValueUtil;

import java.util.Collection;

/**
 * Built in string length validation for StringUiNode.
 */
public class LengthValidationRule extends ValidationRule<StringUiNode<?>> {

    public LengthValidationRule(StringUiNode<?> owner) {
        super(owner);
    }


    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                getOwner().isImmediate() ?
                        new StringStateChangeEventBinding(
                                e -> validate(),
                                StringUiNode.VALUE_PROPERTY.getStateKey()
                        ) :
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

    @Override
    protected String getErrorMessage() {
        if (isActivated())
            return getOwner().getLengthMessage()
                    .replace("{label}", getOwner().getNodeLabel())
                    .replace("{max}", String.valueOf(getOwner().getMaxLength()))
                    .replace("{min}", String.valueOf(getOwner().getMinLength()));
        return null;
    }

    protected boolean isActivated() {
        String value = getOwner().getValue();
        if (ValueUtil.isEmpty(value))
            return false;

        Integer minLength = getOwner().getMinLength();
        if (minLength != null && value.length() < minLength)
            return true;

        Integer maxLength = getOwner().getMaxLength();
        if (maxLength != null && value.length() > maxLength)
            return true;

        return false;
    }
}
