package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.ErrorNode;
import zhy2002.neutron.PredefinedPhases;
import zhy2002.neutron.RefreshUiNodeEvent;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.UiNodeRule;
import zhy2002.neutron.util.EnhancedLinkedList;

/**
 * The common logic for validation rules.
 */
public abstract class ValidationRule<N extends UiNode<?>> extends UiNodeRule<UiNodeEvent, N> {

    private ErrorNode errorNode;

    protected abstract ErrorListNode getErrorListNode();

    protected abstract boolean isValid(UiNodeEvent typedEvent);

    protected void clearErrorNode() {
        getErrorListNode().removeItem(errorNode);
        errorNode = null;
    }

    protected ErrorNode createErrorNode(UiNode<?> source, String errorMessage) {
        ErrorNode errorNode = getErrorListNode().createItem();
        errorNode.setSource(source);
        errorNode.setMessage(errorMessage);
        errorNode.setRule(this);
        return errorNode;
    }

    protected ErrorNode createErrorNode(UiNodeEvent typedEvent) {
        return createErrorNode(typedEvent.getTarget(), getErrorMessage(typedEvent));
    }

    public abstract String getErrorMessage(UiNodeEvent typedEvent);

    @Override
    protected void doFire(UiNodeEvent typedEvent) {
        if (isValid(typedEvent)) {
            if (errorNode != null) {
                clearErrorNode();
            }
        } else {
            if (errorNode == null) {
                errorNode = createErrorNode(typedEvent);
            }
        }
    }

    protected ValidationRule(N owner) {
        super(owner, PredefinedPhases.Post);
    }

    @Override
    public EnhancedLinkedList<Class<? extends UiNodeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(RefreshUiNodeEvent.class);
    }
}
