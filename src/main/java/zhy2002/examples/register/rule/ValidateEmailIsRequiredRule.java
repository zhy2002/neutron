package zhy2002.examples.register.rule;

import zhy2002.examples.register.EmailNode;
import zhy2002.examples.register.ErrorListNode;


public class ValidateEmailIsRequiredRule extends ValidationRule<EmailNode> {

    public static final String ERROR_MESSAGE = "Email is required";

    public static class Factory {
        public ValidateEmailIsRequiredRule create(EmailNode owner) {
            return new ValidateEmailIsRequiredRule(owner);
        }
    }

    protected ValidateEmailIsRequiredRule(EmailNode owner) {
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
    protected boolean isValid() {
        Boolean required = getEmailNode().getRequired();
        if (!Boolean.TRUE.equals(required)) {
            return true;
        }

        String email = getEmailNode().getValue();
        return email != null && email.length() > 0;
    }

    @Override
    protected String getErrorMessage() {
        return ERROR_MESSAGE;
    }
}
