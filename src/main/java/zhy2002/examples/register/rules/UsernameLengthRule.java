package zhy2002.examples.register.rules;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.event.DefaultPhases;
import zhy2002.neutron.event.UiNodeEvent;
import zhy2002.neutron.node.UiNodeRule;

/**
 * Created by ZHY on 13/11/2016.
 */
public class UsernameLengthRule extends UiNodeRule<UsernameNode> {

    public static final String ERROR_MESSAGE = "";
    private ErrorNode errorNode;

    public UsernameLengthRule(UsernameNode host) {
        super(host, DefaultPhases.Validate);
    }

    private ErrorListNode getErrorListNode() {
        return getHost().getParent().getErrorListNode();
    }

    @Override
    public void fire(UiNodeEvent event) {
        if(getHost().getValue() != null && getHost().getValue().length() < 4) {
            errorNode = getErrorListNode().addItem();
            errorNode.setSource(event.getTarget());
            errorNode.setMessage(ERROR_MESSAGE);
        } else {
            if(errorNode != null) {
                getErrorListNode().removeItem(errorNode);
                errorNode = null;
            }

        }
    }
}
