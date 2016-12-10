package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.ErrorNode;
import zhy2002.examples.register.PropertyStateNode;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeEvent;
import zhy2002.neutron.event.StringStateChangeEvent;
import zhy2002.neutron.util.EnhancedLinkedList;

public class PropertyStateRequiredRule extends ValidationRule<PropertyStateNode> {

    public PropertyStateRequiredRule(PropertyStateNode owner) {
        super(owner);
    }

    private PropertyStateNode getPropertyStateNode() {
        return getOwner();
    }

    @Override
    protected ErrorListNode getErrorListNode() {
        return getOwner().getParent().getParent().getErrorListNode();
    }

    @Override
    public EnhancedLinkedList<Class<? extends UiNodeEvent>> observedEventTypes() {
        return super.observedEventTypes().and(StringStateChangeEvent.class);
    }

    @Override
    protected boolean isValid(UiNodeEvent typedEvent) {
        String value = getPropertyStateNode().getValue();
        return value != null && value.length() > 0;
    }

    @Override
    public String getErrorMessage(UiNodeEvent typedEvent) {
        return "State is required in property details.";
    }

    @Override
    protected ErrorNode createErrorNode(UiNodeEvent typedEvent) {
        ErrorNode errorNode = super.createErrorNode(typedEvent);
        errorNode.setSource(getOwner());
        return errorNode;
    }
}
