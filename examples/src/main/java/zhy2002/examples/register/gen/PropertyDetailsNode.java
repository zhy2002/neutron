package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;

public class PropertyDetailsNode extends ObjectUiNode<RegisterNode>
{
    private PropertyAddressNode propertyAddressNode;
    private PropertyStateNode propertyStateNode;

    private PropertyDetailsNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PropertyDetailsNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<PropertyDetailsNode> config = classRegistry.getUiNodeConfig(PropertyDetailsNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public PropertyDetailsNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public String getTooltip() {
        return getStateValue(RegisterNodeConstants.TOOLTIP);
    }

    @JsMethod
    public void setTooltip(String value) {
        setStateValue(RegisterNodeConstants.TOOLTIP, String.class, value);
    }

    @JsMethod
    public PropertyAddressNode getPropertyAddressNode() {
        return propertyAddressNode;
    }

    @JsMethod
    public PropertyStateNode getPropertyStateNode() {
        return propertyStateNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        propertyAddressNode = childFactory.createPropertyAddressNode();
        children.add(propertyAddressNode);
        propertyStateNode = childFactory.createPropertyStateNode();
        children.add(propertyStateNode);
        return children;
    }

}
