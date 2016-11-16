package zhy2002.examples.register.rules;

import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.StateChangeEvent;
import zhy2002.neutron.node.UiNodeRule;

/**
 * A sample pre-change rule.
 */
public class UsernameInvalidCharRule extends UiNodeRule<StateChangeEvent<String>, UsernameNode> {
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
