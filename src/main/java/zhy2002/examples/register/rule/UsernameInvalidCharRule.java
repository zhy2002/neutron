package zhy2002.examples.register.rule;

import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.rule.PreStateChangeRule;

/**
 * A sample pre-change rule.
 */
public abstract class UsernameInvalidCharRule extends PreStateChangeRule<StringStateChangeEvent, UsernameNode> {
    protected UsernameInvalidCharRule(UsernameNode owner) {
        super(owner, PredefinedPhases.Pre);
    }

    @Override
    public Class<StringStateChangeEvent> getEventType() {
        return StringStateChangeEvent.class;
    }
}
