package zhy2002.examples.register.rule.impl;

import zhy2002.examples.register.UsernameNode;
import zhy2002.examples.register.rule.UsernameInvalidCharRule;
import zhy2002.examples.register.rule.UsernameInvalidCharRuleFactory;

public class UsernameInvalidCharRuleImplFactory extends UsernameInvalidCharRuleFactory {

    @Override
    public UsernameInvalidCharRule create(UsernameNode owner) {
        return new UsernameInvalidCharRuleImpl(owner);
    }

}
