package zhy2002.neutron.rule;

import zhy2002.neutron.ObjectUiNode;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.di.Owner;

import javax.inject.Inject;

/**
 * Optional rule that validates an ObjectUiNode must have value.
 */
public class ObjectValueRequiredValidationRule extends ValidationRule<ObjectUiNode<?>> {

    @Inject
    public ObjectValueRequiredValidationRule(@Owner ObjectUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected String getErrorMessage() {
        Boolean required = getOwner().getRequired();
        if (Boolean.TRUE.equals(required) && !getOwner().hasValue())
            return "Cannot be empty.";
        return null;
    }
}
