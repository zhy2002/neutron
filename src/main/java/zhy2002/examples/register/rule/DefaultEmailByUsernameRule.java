package zhy2002.examples.register.rule;

import zhy2002.examples.register.EmailNode;
import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.EventTypeEnum;
import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.StateChangeEvent;
import zhy2002.neutron.rule.UiNodeRule;

/**
 * Email is always username + '@gmail.com'
 */
public class DefaultEmailByUsernameRule extends UiNodeRule<StateChangeEvent<String>, UsernameNode> {

    public DefaultEmailByUsernameRule(UsernameNode owner) {
        super(owner, DefaultPhases.Post);
    }

    protected EmailNode getEmailNdde() {
        return getOwner().getParent().getEmailNode();
    }

    @Override
    protected void execute(StateChangeEvent<String> typedEvent) {
        String value = getOwner().getValue();
        String email = value == null ? "" : value + "@gmail.com";
        getEmailNdde().setValue(email);
    }

    @Override
    public EventTypeEnum getEventType() {
        return EventTypeEnum.StateChange;
    }
}
