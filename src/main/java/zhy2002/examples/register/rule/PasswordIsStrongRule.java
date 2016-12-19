package zhy2002.examples.register.rule;

import zhy2002.examples.register.PasswordNode;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.util.CollectionUtil;

import java.util.Collection;

public class PasswordIsStrongRule extends ValidationRule<PasswordNode> {

    public static final String WEAK_PASSWORD = "Password is not strong enough.";

    public PasswordIsStrongRule(PasswordNode owner) {
        super(owner);
    }

    private PasswordNode getPasswordNode() {
        return getOwner();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {
        return CollectionUtil.combine(
                super.createEventBindings(),
                new StringStateChangeEventBinding(e -> validate())
        );
    }

    @Override
    protected String getErrorMessage() {
        return WEAK_PASSWORD;
    }

    @Override
    protected boolean isActivated() {
        String password = getPasswordNode().getValue();
        if (password == null) {
            return false;
        }

        if (password.length() < 6)
            return true;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            } else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            } else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
        }

        return !(hasUpper && hasLower && hasDigit);
    }


}
