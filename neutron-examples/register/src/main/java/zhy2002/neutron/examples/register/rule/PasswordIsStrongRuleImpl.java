package zhy2002.neutron.examples.register.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.examples.register.gen.node.PasswordNode;
import zhy2002.neutron.examples.register.gen.rule.PasswordIsStrongRule;
import zhy2002.neutron.core.util.CollectionUtil;

import javax.inject.Inject;
import java.util.Collection;

public class PasswordIsStrongRuleImpl extends PasswordIsStrongRule {

    public static final String WEAK_PASSWORD = "Password is not strong enough.";

    @Inject
    public PasswordIsStrongRuleImpl(@Owner PasswordNode owner) {
        super(owner);
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
        if (isActivated())
            return WEAK_PASSWORD;
        return null;
    }

    private boolean isActivated() {
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
