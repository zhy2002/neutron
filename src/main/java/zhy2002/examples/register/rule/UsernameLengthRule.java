package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.rule.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

/**
 * Generated skeleton code.
 */
public abstract class UsernameLengthRule extends UiNodeRule<StringStateChangeEvent, UsernameNode> {

    public static final String ERROR_MESSAGE = "Length of name field must be greater than 3";

    @FunctionalInterface
    public interface Factory {
        UsernameLengthRule create(UsernameNode owner);
    }

    protected UsernameLengthRule(UsernameNode owner) {
        super(owner, PredefinedPhases.Post);
    }

    protected ErrorListNode getErrorListNode() {
        return getOwner().getParent().getErrorListNode();
    }

    @Override
    public EnhancedLinkedList<Class<? extends StringStateChangeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(StringStateChangeEvent.class);
    }
}
