package zhy2002.examples.register.rule;

import zhy2002.examples.register.EmailNode;
import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.rule.UiNodeRule;

/**
 * Email is always username + '@gmail.com'
 */
public class DefaultEmailByUsernameRule extends UiNodeRule<StringStateChangeEvent, UsernameNode> {

    public DefaultEmailByUsernameRule(UsernameNode owner) {
        super(owner, PredefinedPhases.Post);
    }

    protected EmailNode getEmailNode() {
        return getOwner().getParent().getEmailNode();
    }

    @Override
    protected void execute(StringStateChangeEvent typedEvent) {
        String value = getOwner().getValue();
        String email = value == null ? "" : value + "@gmail.com";
        getEmailNode().setValue(email);
    }

    @Override
    public Class<StringStateChangeEvent> getEventType() {
        return StringStateChangeEvent.class;
    }

}
