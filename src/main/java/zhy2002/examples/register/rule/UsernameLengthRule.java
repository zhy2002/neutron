package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.EventTypeEnum;
import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.StateChangeEvent;
import zhy2002.neutron.event.TickPhase;
import zhy2002.neutron.rule.UiNodeRule;
import zhy2002.neutron.rule.ValidateStateChangeRule;

/**
 * Generated skeleton code.
 */
public abstract class UsernameLengthRule extends UiNodeRule<StateChangeEvent<String>, UsernameNode> {

    public static final String ERROR_MESSAGE = "";

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
    public EventTypeEnum getEventType() {
        return EventTypeEnum.StateChange;
    }
}
