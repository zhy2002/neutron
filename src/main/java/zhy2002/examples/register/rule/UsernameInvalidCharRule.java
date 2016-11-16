package zhy2002.examples.register.rule;

import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.StateChangeEvent;
import zhy2002.neutron.rule.PreStateChangeRule;

/**
 * A sample pre-change rule.
 */
public class UsernameInvalidCharRule extends PreStateChangeRule<StateChangeEvent<String>, UsernameNode> {
    public UsernameInvalidCharRule(UsernameNode owner) {
        super(owner, DefaultPhases.Pre);
    }

    @Override
    public void execute(StateChangeEvent<String> event) {

        if (event.getNewValue() != null && event.getNewValue().contains("#")) {
            throw new RuntimeException("no");
        }

    }

}
