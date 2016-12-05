package zhy2002.examples.register.rule;

import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.UiNodeEventException;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.rule.PreStateChangeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

import java.util.List;

/**
 * A sample pre-change rule.
 */
public class UsernameInvalidCharRule extends PreStateChangeRule<StringStateChangeEvent, UsernameNode> {

    public UsernameInvalidCharRule(UsernameNode owner) {
        super(owner, PredefinedPhases.Pre);
    }

    @Override
    public EnhancedLinkedList<Class<? extends StringStateChangeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(StringStateChangeEvent.class);
    }

    @Override
    public void doFire(StringStateChangeEvent event) {

        if (event.getNewValue() != null && event.getNewValue().contains("#")) {
            throw new UiNodeEventException("Cannot have char '#'");
        }
    }
}
