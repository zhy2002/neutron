package zhy2002.examples.register.rule;

import zhy2002.examples.register.ErrorListNode;
import zhy2002.examples.register.PropertyStateNode;
import zhy2002.neutron.UiNodeEvent;

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
    protected boolean isValid() {
        String value = getPropertyStateNode().getValue();
        return value != null && value.length() > 0;
    }

    @Override
    public String getErrorMessage(UiNodeEvent typedEvent) {
        return "State is required in property details.";
    }
}
