package zhy2002.examples.register.rule.impl;

import zhy2002.examples.register.UsernameNode;
import zhy2002.examples.register.rule.DefaultEmailByUsernameRule;

public class DefaultEmailByUsernameRuleImpl extends DefaultEmailByUsernameRule {

    public static class Factory implements DefaultEmailByUsernameRule.Factory {

        @Override
        public DefaultEmailByUsernameRule create(UsernameNode owner) {
            return new DefaultEmailByUsernameRuleImpl(owner);
        }
    }

    DefaultEmailByUsernameRuleImpl(UsernameNode owner) {
        super(owner);
    }
}
