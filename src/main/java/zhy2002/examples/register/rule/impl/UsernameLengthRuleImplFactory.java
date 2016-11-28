package zhy2002.examples.register.rule.impl;

import zhy2002.examples.register.UsernameNode;
import zhy2002.examples.register.rule.UsernameLengthRule;
import zhy2002.examples.register.rule.UsernameLengthRuleFactory;

public class UsernameLengthRuleImplFactory  extends UsernameLengthRuleFactory {
    @Override
    public UsernameLengthRule create(UsernameNode owner) {
        return new UsernameLengthRuleImpl(owner);
    }
}
