package zhy2002.neutron.examples.register.rule;

import zhy2002.neutron.core.EventBinding;
import zhy2002.neutron.core.UiNode;
import zhy2002.neutron.core.di.Owner;
import zhy2002.neutron.core.event.StringStateChangeEventBinding;
import zhy2002.neutron.examples.register.gen.node.PasswordNode;
import zhy2002.neutron.examples.register.gen.node.RepeatPasswordNode;
import zhy2002.neutron.examples.register.gen.rule.RepeatPasswordRule;
import zhy2002.neutron.core.util.CollectionUtil;

import javax.inject.Inject;
import java.util.Collection;

public class RepeatPasswordRuleImpl extends RepeatPasswordRule {

    public static final String ERROR_MESSAGE = "Please repeat the same password.";

    @Inject
    public RepeatPasswordRuleImpl(@Owner RepeatPasswordNode owner) {
        super(owner);
    }

    private PasswordNode getPasswordNode() {
        return getOwner().getParent().getPasswordNode();
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
        if (isActivated())
            return ERROR_MESSAGE;
        return null;
    }

    private boolean isActivated() {
        String password = getPasswordNode().getValue();
        String repeat = getRepeatPasswordNode().getValue();
        if (password == null || repeat == null)
            return false;
        return !password.equals(repeat);
    }

}
