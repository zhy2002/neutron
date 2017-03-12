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

    private ProductCardHodlerNameNode productCardHodlerNameNode;
    private ProductRewardsProgramNode productRewardsProgramNode;
    private ProductRewardsMembershipNode productRewardsMembershipNode;

    private ProductCardHolderNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(ProductCardHolderNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductCardHolderNode.class;
    }

    private ProductCardHolderNodeComponent component;

    @Inject
    void createComponent(ProductCardHolderNodeComponent.Builder builder) {
        this.component = builder.setProductCardHolderNodeModule(new ProductCardHolderNodeModule(this)).build();
    }

    private ProductCardHolderNodeRuleProvider getRuleProvider() {
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

    public ProductCardHolderNode(@NotNull ProductFeaturesNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public ProductCardHodlerNameNode getProductCardHodlerNameNode() {
        return productCardHodlerNameNode;
    }

    @JsMethod
    public ProductRewardsProgramNode getProductRewardsProgramNode() {
        return productRewardsProgramNode;
    }

    @JsMethod
    public ProductRewardsMembershipNode getProductRewardsMembershipNode() {
        return productRewardsMembershipNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        productCardHodlerNameNode = childFactory.createProductCardHodlerNameNode();
        children.add(productCardHodlerNameNode);
        productRewardsProgramNode = childFactory.createProductRewardsProgramNode();
        children.add(productRewardsProgramNode);
        productRewardsMembershipNode = childFactory.createProductRewardsMembershipNode();
        children.add(productRewardsMembershipNode);
        return children;
    }

}
