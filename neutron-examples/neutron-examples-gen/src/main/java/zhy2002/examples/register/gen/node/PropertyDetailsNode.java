package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


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

    private PropertyDetailsNodeRuleProvider getRuleProvider() {
        return component.getPropertyDetailsNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<PropertyDetailsNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public PropertyDetailsNode(@NotNull RegisterNode parent, String name) {
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
