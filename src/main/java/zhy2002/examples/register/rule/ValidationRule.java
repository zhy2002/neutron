package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.PasswordNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.RefreshUiNodeEvent;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.rule.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

/**
 * The common logic for validation rules.
 */
public abstract class ValidationRule<N extends UiNode<?>> extends UiNodeRule<UiNodeEvent, N> {

    private ErrorNode errorNode;

    protected abstract ErrorListNode getErrorListNode();

    protected abstract boolean isValid();

    protected void clearError() {
        getErrorListNode().removeItem(errorNode);
        errorNode = null;
    }

    protected abstract String getErrorMessage();

    protected void createError(UiNodeEvent typedEvent) {
        errorNode = getErrorListNode().createItem();
        errorNode.setSource(typedEvent.getTarget());
        errorNode.setMessage(getErrorMessage());
        errorNode.setRule(this);
    }

    @Override
    protected void execute(UiNodeEvent typedEvent) {
        if (isValid()) {
            if (errorNode != null) {
                clearError();
            }
        } else {
            if (errorNode == null) {
                createError(typedEvent);
            }
        }
    }

    protected ValidationRule(N owner) {
        super(owner, PredefinedPhases.Post);
    }

    @Override
    public EnhancedLinkedList<Class<? extends UiNodeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(RefreshUiNodeEvent.class).and(StringStateChangeEvent.class);
    }
}
