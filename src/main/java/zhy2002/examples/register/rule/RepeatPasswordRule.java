package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.PasswordNode;
import zhy2002.examples.register.RepeatPasswordNode;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.util.EnhancedLinkedList;

public class RepeatPasswordRule extends ValidationRule<RepeatPasswordNode> {

    public static final String ERROR_MESSAGE = "Please repeat the same password.";

    public static class Factory {
        public RepeatPasswordRule create(RepeatPasswordNode owner) {
            return new RepeatPasswordRule(owner);
        }
    }

    protected RepeatPasswordRule(RepeatPasswordNode owner) {
        super(owner);
    }

    private PasswordNode getPasswordNode() {
        return getOwner().getParent().getPasswordNode();
    }

    private RepeatPasswordNode getRepeatPasswordNode() {
        return getOwner();
    }

    @Override
    protected ErrorNode createErrorNode(UiNodeEvent typedEvent) {
        return createErrorNode(getRepeatPasswordNode(), getErrorMessage(typedEvent));
    }

    @Override
    protected ErrorListNode getErrorListNode() {
        return getOwner().getParent().getErrorListNode();
    }

    @Override
    protected boolean isValid() {
        String errorMessage = getPasswordNode().getMessage();
        if (errorMessage != null && errorMessage.length() > 0)
            return true;

        String password = getPasswordNode().getValue();
        String repeat = getRepeatPasswordNode().getValue();

        return password.equals(repeat);
    }

    @Override
    public String getErrorMessage(UiNodeEvent event) {
        return ERROR_MESSAGE;
    }

    @Override
    protected UiNode<?> findHost() {
        return getOwner().getParent();
    }

    @Override
    public boolean canFire(UiNodeEvent event) {
        UiNode<?> eventTarget = event.getTarget();
        return eventTarget == getPasswordNode() || eventTarget == getRepeatPasswordNode();
    }

}
