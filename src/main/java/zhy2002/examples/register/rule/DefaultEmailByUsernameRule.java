package zhy2002.examples.register.rule;

import zhy2002.examples.register.EmailNode;
import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.rule.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

/**
 * Email is always username + '@gmail.com'
 */
public abstract class DefaultEmailByUsernameRule extends UiNodeRule<StringStateChangeEvent, UsernameNode> {

    @FunctionalInterface
    public interface Factory {
        DefaultEmailByUsernameRule create(UsernameNode owner);
    }

    protected DefaultEmailByUsernameRule(UsernameNode owner) {
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
    public EnhancedLinkedList<Class<? extends StringStateChangeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(StringStateChangeEvent.class);
    }

}
