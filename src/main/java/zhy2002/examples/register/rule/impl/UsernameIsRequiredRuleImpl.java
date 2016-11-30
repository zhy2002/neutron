package zhy2002.examples.register.rule.impl;

import zhy2002.examples.register.UsernameNode;
import zhy2002.examples.register.rule.UsernameIsRequiredRule;

public class UsernameIsRequiredRuleImpl extends UsernameIsRequiredRule {

    public static class Factory implements UsernameIsRequiredRule.Factory {

        @Override
        public UsernameIsRequiredRule create(UsernameNode owner) {
            return new UsernameIsRequiredRuleImpl(owner);
        }
    }

    private UsernameIsRequiredRuleImpl(UsernameNode owner) {
        super(owner);
    }
}
