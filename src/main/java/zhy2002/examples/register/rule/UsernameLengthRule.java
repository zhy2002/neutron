package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.UiNodeEventTypeEnum;
import zhy2002.neutron.DefaultPhases;
import zhy2002.neutron.StateChangeEvent;
import zhy2002.neutron.rule.UiNodeRule;

/**
 * Generated skeleton code.
 */
public abstract class UsernameLengthRule extends UiNodeRule<StateChangeEvent<String>, UsernameNode> {

    public static final String ERROR_MESSAGE = "Length of name field must be greater than 3";

    public UsernameLengthRule(UsernameNode owner) {
        super(owner, DefaultPhases.Post);
    }

    protected ErrorListNode getErrorListNode() {
        return getOwner().getParent().getErrorListNode();
    }

    public static abstract class Factory {
        public abstract UsernameLengthRule create(UsernameNode owner);
    }

    @Override
    public UiNodeEventTypeEnum getEventType() {
        return UiNodeEventTypeEnum.StateChange;
    }
}
