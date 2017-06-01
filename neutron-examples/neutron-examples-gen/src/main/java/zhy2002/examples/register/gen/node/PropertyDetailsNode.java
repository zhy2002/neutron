package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.PropertyDetailsNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.register.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;
import zhy2002.examples.register.gen.event.*;

public class PropertyDetailsNode extends ObjectUiNode<RegisterNode> {

    @Inject
    public PropertyDetailsNode(@Owner RegisterNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PropertyDetailsNode.class;
    }

    protected final PropertyDetailsNodeComponent getComponent() {
        return component;
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

    public static final PropertyMetadata<String> TOOLTIP_PROPERTY = MetadataRegistry.createProperty(PropertyDetailsNode.class, "tooltip", String.class);

    @JsMethod
    public String getTooltip() {
        return getStateValue(TOOLTIP_PROPERTY);
    }

    @JsMethod
    public void setTooltip(String value) {
        setStateValue(TOOLTIP_PROPERTY, value);
    }

    //region children getters

    @JsMethod
    public PropertyAddressNode getPropertyAddressNode() {
        return (PropertyAddressNode)getChildByName("propertyAddressNode");
    }

    @JsMethod
    public PropertyStateNode getPropertyStateNode() {
        return (PropertyStateNode)getChildByName("propertyStateNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("propertyAddressNode");
        children.add(getComponent().createPropertyAddressNode());
        setChildNodeIdentity("propertyStateNode");
        children.add(getComponent().createPropertyStateNode());
        setChildNodeIdentity(null);
        return children;
    }

}
