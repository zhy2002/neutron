package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.rule.UiNodeRule;

/**
 * Generated skeleton code.
 */
public abstract class UsernameLengthRule extends UiNodeRule<StringStateChangeEvent, UsernameNode> {

    public static final String ERROR_MESSAGE = "Length of name field must be greater than 3";

    public UsernameLengthRule(UsernameNode owner) {
        super(owner, PredefinedPhases.Post);
    }

    protected ErrorListNode getErrorListNode() {
        return getOwner().getParent().getErrorListNode();
    }

    public static abstract class Factory {
        public abstract UsernameLengthRule create(UsernameNode owner);
    }

    @Override
    public Class<StringStateChangeEvent> getEventType() {
        return StringStateChangeEvent.class;
    }
}
