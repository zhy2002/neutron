package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.rule.ValidateStateChangeRule;

/**
 * Generated skeleton code.
 */
public abstract class UsernameLengthRule extends ValidateStateChangeRule<String, UsernameNode> {

    public static final String ERROR_MESSAGE = "";

    public UsernameLengthRule(UsernameNode owner) {
        super(owner);
    }

    protected ErrorListNode getErrorListNode() {
        return getOwner().getParent().getErrorListNode();
    }

    public static abstract class Factory {
        public abstract UsernameLengthRule create(UsernameNode owner);
    }
}
