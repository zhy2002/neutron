package zhy2002.examples.register.rule.impl;

import zhy2002.examples.register.UsernameNode;
import zhy2002.examples.register.rule.UsernameInvalidCharRule;
import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEvent;

public class UsernameInvalidCharRuleImpl extends UsernameInvalidCharRule {

    public static class Factory implements UsernameInvalidCharRule.Factory {

        @Override
        public UsernameInvalidCharRule create(UsernameNode owner) {
            return new UsernameInvalidCharRuleImpl(owner);
        }
    }

    private UsernameInvalidCharRuleImpl(UsernameNode owner) {
        super(owner);
    }

    @Override
    public void execute(StringStateChangeEvent event) {

        if (event.getNewValue() != null && event.getNewValue().contains("#")) {
            throw new RuntimeException("no");
        }

    }
}
