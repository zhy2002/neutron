package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductCardHolderNode extends ObjectUiNode<ProductFeaturesNode> {
    private ProductCardHolderNodeChildFactory childFactory;
    private ProductCardHolderNodeComponent component;

    public ProductCardHolderNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCardHolderNode.class;
    }

    @Inject
    void receiveNodeProvider(ProductCardHolderNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(ProductCardHolderNodeComponent.Builder builder) {
        this.component = builder.setProductCardHolderNodeModule(new ProductCardHolderNodeModule(this)).build();
    }

    private RuleProvider<ProductCardHolderNode> getRuleProvider() {
        return component.getProductCardHolderNodeRuleProvider();
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

    private RuleProvider<ProductCardHolderNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @JsMethod
    public ProductCardHodlerNameNode getProductCardHodlerNameNode() {
        return (ProductCardHodlerNameNode)getChildByName("productCardHodlerNameNode");
    }

    @JsMethod
    public ProductRewardsProgramNode getProductRewardsProgramNode() {
        return (ProductRewardsProgramNode)getChildByName("productRewardsProgramNode");
    }

    @JsMethod
    public ProductRewardsMembershipNode getProductRewardsMembershipNode() {
        return (ProductRewardsMembershipNode)getChildByName("productRewardsMembershipNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("productCardHodlerNameNode");
        children.add(childFactory.createProductCardHodlerNameNode());
        setChildNodeIdentity("productRewardsProgramNode");
        children.add(childFactory.createProductRewardsProgramNode());
        setChildNodeIdentity("productRewardsMembershipNode");
        children.add(childFactory.createProductRewardsMembershipNode());
        setChildNodeIdentity(null);
        return children;
    }

}
