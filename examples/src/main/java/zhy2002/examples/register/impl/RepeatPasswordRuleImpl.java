package zhy2002.examples.register.impl;

import zhy2002.examples.register.gen.*;
import zhy2002.examples.register.gen.rule.RepeatPasswordRule;
import zhy2002.neutron.EventBinding;
import zhy2002.neutron.event.StringStateChangeEventBinding;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.ValidationRule;
import zhy2002.neutron.util.CollectionUtil;

import java.util.Collection;

public class RepeatPasswordRuleImpl extends RepeatPasswordRule {

    public static final String ERROR_MESSAGE = "Please repeat the same password.";

    public RepeatPasswordRuleImpl(RepeatPasswordNode owner) {
        super(owner);
    }

    private PasswordNode getPasswordNode() {
        return getOwner().getParent().getPasswordNode();
    }

    private RepeatPasswordNode getRepeatPasswordNode() {
        return getOwner();
    }

    @Override
    protected UiNode<?> findHost() {
        return getOwner().getParent();
    }

    @Override
    protected Collection<EventBinding> createEventBindings() {

        return CollectionUtil.combine(
                super.createEventBindings(),
                new StringStateChangeEventBinding(
                        e -> {
                            UiNode<?> eventTarget = e.getOrigin();
                            return eventTarget == getPasswordNode() || eventTarget == getRepeatPasswordNode();
                        },
                        e -> validate()
                )
        );
    }

    @Override
    protected String getErrorMessage() {
        return ERROR_MESSAGE;
    }

    @Override
    protected boolean isActivated() {
        String password = getPasswordNode().getValue();
        String repeat = getRepeatPasswordNode().getValue();
        if(password == null || repeat == null)
            return false;
        return !password.equals(repeat);
    }

}
