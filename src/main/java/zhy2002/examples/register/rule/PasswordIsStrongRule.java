package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.PasswordNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.PredefinedUiNodeStateKeys;
import zhy2002.neutron.RefreshUiNodeEvent;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.rule.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

public class PasswordIsStrongRule extends UiNodeRule<UiNodeEvent, PasswordNode> {

    public static final String WEAK_PASSWORD = "Password is not strong enough.";

    private ErrorNode errorNode;

    private PasswordNode getPasswordNode() {
        return getOwner();
    }

    private ErrorListNode getErrorListNode() {
        return getOwner().getParent().getErrorListNode();
    }

    private boolean isValid(String password) {
        if (password == null) {
            return false;
        }

        if (password.length() < 6)
            return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                hasUpper = true;
            } else if (ch >= 'a' && ch <= 'z') {
                hasLower = true;
            } else if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
        }

        return hasUpper && hasLower && hasDigit;
    }


    @Override
    protected void execute(UiNodeEvent typedEvent) {
        String password = getPasswordNode().getValue();
        if (isValid(password)) {
            if (errorNode != null) {
                getErrorListNode().removeItem(errorNode);
                errorNode = null;
                getPasswordNode().setMessage("");
            }
        } else {
            if (errorNode == null) {
                errorNode = getErrorListNode().createItem();
                errorNode.setSource(getPasswordNode());
                errorNode.setMessage(WEAK_PASSWORD);
                errorNode.setRule(this);
                getPasswordNode().setMessage(WEAK_PASSWORD);
            }
        }
    }


    public static class Factory {
        public PasswordIsStrongRule create(PasswordNode owner) {
            return new PasswordIsStrongRule(owner);
        }
    }

    protected PasswordIsStrongRule(PasswordNode owner) {
        super(owner, PredefinedPhases.Post);
    }

    @Override
    public EnhancedLinkedList<Class<? extends UiNodeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(RefreshUiNodeEvent.class).and(StringStateChangeEvent.class);
    }
}
