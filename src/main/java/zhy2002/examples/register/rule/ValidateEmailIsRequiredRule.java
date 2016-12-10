package zhy2002.examples.register.rule;

import zhy2002.examples.register.EmailNode;
import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.ErrorNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.event.BooleanStateChangeEvent;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.util.EnhancedLinkedList;


public class ValidateEmailIsRequiredRule extends ValidationRule<EmailNode> {

    public static final String ERROR_MESSAGE = "Email is required";

    public ValidateEmailIsRequiredRule(EmailNode owner) {
        super(owner);
    }

    @Override
    protected ErrorListNode getErrorListNode() {
        return getOwner().getParent().getErrorListNode();
    }

    private EmailNode getEmailNode() {
        return getOwner();
    }

    @Override
    protected ErrorNode createErrorNode(UiNodeEvent typedEvent) {
        return createErrorNode(getEmailNode(), getErrorMessage(typedEvent));
    }

    @Override
    protected boolean isValid(UiNodeEvent typedEvent) {
        Boolean required = getEmailNode().getRequired();
        if (!Boolean.TRUE.equals(required)) {
            return true;
        }

        String email = getEmailNode().getValue();
        return email != null && email.length() > 0;
    }

    @Override
    public String getErrorMessage(UiNodeEvent typedEvent) {
        return ERROR_MESSAGE;
    }

    @Override
    public EnhancedLinkedList<Class<? extends UiNodeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(BooleanStateChangeEvent.class).and(StringStateChangeEvent.class);
    }
}
