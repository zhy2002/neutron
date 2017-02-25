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
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;

public class PropertyDetailsNode extends ObjectUiNode<RegisterNode> {

    private PropertyAddressNode propertyAddressNode;
    private PropertyStateNode propertyStateNode;

    private PropertyDetailsNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(PropertyDetailsNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PropertyDetailsNode.class;
    }

    private PropertyDetailsNodeComponent component;

    @Inject
    void createComponent(PropertyDetailsNodeComponent.Builder builder) {
        this.component = builder.setPropertyDetailsNodeModule(new PropertyDetailsNodeModule(this)).build();
    }

    @Override
    protected PropertyDetailsNodeRuleProvider getRuleProvider() {
        return component.getPropertyDetailsNodeRuleProvider();
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
