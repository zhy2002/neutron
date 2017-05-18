package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class RealEstateNode extends ObjectUiNode<RealEstateListNode> {

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

    private RuleProvider<RealEstateNode> getRuleProvider() {
        return component.getRealEstateNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public RealEstateNode(@NotNull RealEstateListNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public UsageNode getUsageNode() {
        return (UsageNode)getChildByName("usageNode");
    }

    @JsMethod
    public PropertyNode getPropertyNode() {
        return (PropertyNode)getChildByName("propertyNode");
    }

    @JsMethod
    public AccessNode getAccessNode() {
        return (AccessNode)getChildByName("accessNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("usageNode");
        children.add(childFactory.createUsageNode());
        setChildNodeIdentity("propertyNode");
        children.add(childFactory.createPropertyNode());
        setChildNodeIdentity("accessNode");
        children.add(childFactory.createAccessNode());
        setChildNodeIdentity(null);
        return children;
    }

}
