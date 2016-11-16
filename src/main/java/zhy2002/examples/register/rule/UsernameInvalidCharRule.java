package zhy2002.examples.register.rule;

import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.StateChangeEvent;
import zhy2002.neutron.rule.PreStateChangeRule;

/**
 * A sample pre-change rule.
 */
public abstract class UsernameInvalidCharRule extends PreStateChangeRule<StateChangeEvent<String>, UsernameNode> {
    protected UsernameInvalidCharRule(UsernameNode owner) {
        super(owner, DefaultPhases.Pre);
    }

    public static abstract class Factory {
        public abstract UsernameInvalidCharRule create(UsernameNode owner);
    }

}
