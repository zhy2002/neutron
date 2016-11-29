package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.RefreshUiNodeEvent;
import zhy2002.neutron.rule.UiNodeRule;


public class UsernameIsRequiredRule extends UiNodeRule<RefreshUiNodeEvent, UsernameNode> {

    public static final String ERROR_MESSAGE = "Username is required";
    private ErrorNode errorNode;

    public UsernameIsRequiredRule(UsernameNode owner) {
        super(owner, PredefinedPhases.Post);
    }

    private ErrorListNode getErrorListNode() {
        return getOwner().getParent().getErrorListNode();
    }

    @Override
    protected void execute(RefreshUiNodeEvent typedEvent) {
        if (getOwner().getValue() == null || getOwner().getValue().trim().length() == 0) {
            if (errorNode == null) {
                errorNode = getErrorListNode().createItem();
                errorNode.setMessage(ERROR_MESSAGE);
                errorNode.setSource(getOwner());
                errorNode.setRule(this);
            }

        } else {
            if(errorNode != null) {
                getErrorListNode().removeItem(errorNode);
                errorNode = null;
            }
        }

    }

    @Override
    public Class<RefreshUiNodeEvent> getEventType() {
        return RefreshUiNodeEvent.class;
    }
}
