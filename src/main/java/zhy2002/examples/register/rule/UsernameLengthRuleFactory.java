package zhy2002.examples.register.rule;

import zhy2002.examples.register.UsernameNode;

public abstract class UsernameLengthRuleFactory {

    public abstract UsernameLengthRule create(UsernameNode owner);
}
