package zhy2002.examples.register.gen;

import jsinterop.annotations.JsMethod;
import zhy2002.neutron.ObjectUiNode;
import zhy2002.neutron.PredefinedEventSubjects;
import zhy2002.neutron.UiNode;
import zhy2002.neutron.UiNodeContext;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

public class PropertyDetailsNode extends ObjectUiNode<RegisterNode> {

    private PropertyAddressNode propertyAddressNode;
    private PropertyStateNode propertyStateNode;

    protected PropertyDetailsNode(@NotNull RegisterNode parent, @NotNull String name) {
        super(parent, name);
    }

    @JsMethod
    public PropertyAddressNode getPropertyAddressNode() {
        return propertyAddressNode;
    }

    @JsMethod
    public PropertyStateNode getPropertyStateNode() {
        return propertyStateNode;
    }

    @JsMethod
    public String getTooltip() {
        return getStateValue(PredefinedEventSubjects.TOOLTIP);
    }

    public void setTooltip(String tooltip) {
        setStateValue(PredefinedEventSubjects.TOOLTIP, String.class, tooltip);
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        UiNodeContext<?> context = getContext();
        propertyAddressNode = context.createChildNode(PropertyAddressNode.class, this, "propertyAddressNode");
        propertyStateNode = context.createChildNode(PropertyStateNode.class, this, "propertyStateNode");

        return Arrays.asList(
                propertyAddressNode,
                propertyStateNode
        );
    }

}
