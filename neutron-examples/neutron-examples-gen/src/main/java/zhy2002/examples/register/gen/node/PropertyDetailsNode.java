package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.register.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;
import zhy2002.examples.register.gen.event.*;

public class PropertyDetailsNode extends ObjectUiNode<RegisterNode> {

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

    private RuleProvider<PropertyDetailsNode> getRuleProvider() {
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

    @Override
    protected final NodeLoadEvent<PropertyDetailsNode> createNodeLoadEvent() {
        return new PropertyDetailsNodeLoadEvent(this);
    }

    @Override
    protected final NodeUnloadEvent<PropertyDetailsNode> createNodeUnloadEvent() {
        return new PropertyDetailsNodeUnloadEvent(this);
    }


    public PropertyDetailsNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
    }

    public static final PropertyMetadata<String> TOOLTIP_PROPERTY = MetadataRegistry.createProperty(PropertyDetailsNode.class, "tooltip", String.class);

    @JsMethod
    public String getTooltip() {
        return getStateValue(TOOLTIP_PROPERTY);
    }

    @JsMethod
    public void setTooltip(String value) {
        setStateValue(TOOLTIP_PROPERTY, value);
    }

    @JsMethod
    public PropertyAddressNode getPropertyAddressNode() {
        return (PropertyAddressNode)getChildByName("propertyAddressNode");
    }

    @JsMethod
    public PropertyStateNode getPropertyStateNode() {
        return (PropertyStateNode)getChildByName("propertyStateNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("propertyAddressNode");
        children.add(childFactory.createPropertyAddressNode());
        setChildNodeIdentity("propertyStateNode");
        children.add(childFactory.createPropertyStateNode());
        setChildNodeIdentity(null);
        return children;
    }

}
