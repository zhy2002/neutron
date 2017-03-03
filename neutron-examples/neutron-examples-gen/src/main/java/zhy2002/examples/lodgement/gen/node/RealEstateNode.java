package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class RealEstateNode extends ObjectUiNode<RealEstateListNode> {

    private UsageNode usageNode;
    private PropertyNode propertyNode;
    private AccessNode accessNode;

    private RealEstateNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(RealEstateNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return RealEstateNode.class;
    }

    private RealEstateNodeComponent component;

    @Inject
    void createComponent(RealEstateNodeComponent.Builder builder) {
        this.component = builder.setRealEstateNodeModule(new RealEstateNodeModule(this)).build();
    }

    @Override
    protected RealEstateNodeRuleProvider getRuleProvider() {
        return component.getRealEstateNodeRuleProvider();
    }

    public RealEstateNode(@NotNull RealEstateListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public UsageNode getUsageNode() {
        return usageNode;
    }

    @JsMethod
    public PropertyNode getPropertyNode() {
        return propertyNode;
    }

    @JsMethod
    public AccessNode getAccessNode() {
        return accessNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        usageNode = childFactory.createUsageNode();
        children.add(usageNode);
        propertyNode = childFactory.createPropertyNode();
        children.add(propertyNode);
        accessNode = childFactory.createAccessNode();
        children.add(accessNode);
        return children;
    }

}
