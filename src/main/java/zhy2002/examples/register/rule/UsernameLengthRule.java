package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.UsernameNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

/**
 * Generated skeleton code.
 */
public class UsernameLengthRule extends ValidationRule<UsernameNode> {

    public static final String ERROR_MESSAGE = "Length of name field must be greater than 3";

    public UsernameLengthRule(UsernameNode owner) {
        super(owner);
    }

    private UsernameNode getUsernameNode() {
        return getOwner();
    }

    protected ErrorListNode getErrorListNode() {
        return getOwner().getParent().getErrorListNode();
    }

    @Override
    protected boolean isValid() {
        return !(getOwner().getValue() != null && getOwner().getValue().length() > 0 && getOwner().getValue().length() < 4);
    }

    @Override
    protected ErrorNode createErrorNode(UiNodeEvent typedEvent) {
        return createErrorNode(getUsernameNode(), getErrorMessage(typedEvent));
    }

    @Override
    public String getErrorMessage(UiNodeEvent event) {
        return ERROR_MESSAGE;
    }

    @Override
    public EnhancedLinkedList<Class<? extends UiNodeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(StringStateChangeEvent.class);
    }
}
