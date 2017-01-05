package zhy2002.neutron.rule;

import zhy2002.neutron.ObjectUiNode;
import zhy2002.neutron.ValidationRule;


public class ObjectValueRequiredValidationRule extends ValidationRule<ObjectUiNode<?>> {

    public ObjectValueRequiredValidationRule(ObjectUiNode<?> owner) {
        super(owner);
    }

    @Override
    protected String getErrorMessage() {
        return "Cannot be empty.";
    }

    @Override
    protected boolean isActivated() {
        Boolean required = getOwner().getRequired();
        return Boolean.TRUE.equals(required) && !getOwner().hasValue();
    }
}
