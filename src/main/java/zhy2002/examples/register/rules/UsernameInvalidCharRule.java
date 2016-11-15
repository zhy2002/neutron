package zhy2002.examples.register.rules;

import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.StateChangeEvent;
import zhy2002.neutron.event.UiNodeEvent;
import zhy2002.neutron.node.UiNodeRule;

/**
 * A sample pre-change rule.
 */
public class UsernameInvalidCharRule extends UiNodeRule<UsernameNode> {
    public UsernameInvalidCharRule(UsernameNode host) {
        super(host, DefaultPhases.Pre);
    }

    @Override
    public void fire(UiNodeEvent event) {
        if(event instanceof StateChangeEvent) {
            StateChangeEvent<?> event1 = (StateChangeEvent)event;
            if(event1.getNewValue() != null && event1.getNewValue().toString().contains("#")) {
                throw new RuntimeException("no");
            }
        }
    }
}
