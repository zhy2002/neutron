package zhy2002.neutron.rule;

import zhy2002.neutron.EventBinding;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.di.Owner;
import zhy2002.neutron.event.IntegerStateChangeEventBinding;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.node.StringUiNode;
import zhy2002.neutron.util.CollectionUtil;
import zhy2002.neutron.util.NeutronConstants;
import zhy2002.neutron.util.ValueUtil;

import javax.inject.Inject;
import java.util.Collection;

/**
 * Built in string length validation for StringUiNode.
 */
public class LengthValidationRule extends ValidationRule<StringUiNode<?>> {

    @Inject
    public LengthValidationRule(@Owner StringUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new StringStateChangeEventBinding(
                        e -> validate(),
                        NeutronConstants.VALUE
                ),
                new IntegerStateChangeEventBinding(
                        e -> validate(),
                        NeutronConstants.MIN_LENGTH
                ),
                new IntegerStateChangeEventBinding(
                        e -> validate(),
                        NeutronConstants.MAX_LENGTH
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        if (isActivated())
            return getOwner().getLengthMessage();
        return null;
    }

    private boolean isActivated() {
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
