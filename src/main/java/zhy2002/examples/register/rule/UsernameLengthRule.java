package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.event.StateChangeEvent;
import zhy2002.neutron.rule.ValidateStateChangeRule;

/**
 * Created by ZHY on 13/11/2016.
 */
public class UsernameLengthRule extends ValidateStateChangeRule<String, UsernameNode> {

    public static final String ERROR_MESSAGE = "";
    private ErrorNode errorNode;

    public UsernameLengthRule(UsernameNode owner) {
        super(owner);
    }

    private ErrorListNode getErrorListNode() {
        return getOwner().getParent().getErrorListNode();
    }

    @Override
    protected boolean isActivated(StateChangeEvent<String> event) {
        return getOwner().getValue() != null && getOwner().getValue().length() < 4;
    }

    @Override
    protected void activate(StateChangeEvent<String> event) {
        errorNode = getErrorListNode().addItem();
        errorNode.setSource(event.getTarget());
        errorNode.setMessage(ERROR_MESSAGE);
    }

    @Override
    protected void deactivate(StateChangeEvent<String> event) {
        if (errorNode != null) {
            getErrorListNode().removeItem(errorNode);
            errorNode = null;
        }
    }
}
