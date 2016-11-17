package zhy2002.examples.register.rule.impl;

import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.UsernameNode;
import zhy2002.examples.register.rule.UsernameLengthRule;
import zhy2002.neutron.event.StateChangeEvent;

/**
 * Implementation of the rule.
 */
public class UsernameLengthRuleImpl extends UsernameLengthRule {

    private UsernameLengthRuleImpl(UsernameNode owner) {
        super(owner);
    }

    public static class Factory extends UsernameLengthRule.Factory {
        @Override
        public UsernameLengthRule create(UsernameNode owner) {
            return new UsernameLengthRuleImpl(owner);
        }
    }

    private ErrorNode errorNode;

    @Override
    protected void execute(StateChangeEvent<String> typedEvent) {
        if(isActivated(typedEvent)) {
            activate(typedEvent);
        } else {
            deactivate(typedEvent);
        }
    }


    protected boolean isActivated(StateChangeEvent<String> event) {
        return getOwner().getValue() != null && getOwner().getValue().length() < 4;
    }


    protected void activate(StateChangeEvent<String> event) {
        errorNode = getErrorListNode().createItem();
        errorNode.setSource(event.getTarget());
        errorNode.setMessage(ERROR_MESSAGE);
    }


    protected void deactivate(StateChangeEvent<String> event) {
        if (errorNode != null) {
            getErrorListNode().removeItem(errorNode);
            errorNode = null;
        }
    }


}
