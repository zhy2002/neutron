package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductCardHolderNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductCardHolderNode extends ObjectUiNode<ProductFeaturesNode> {

    @Inject
    protected ProductCardHolderNode(@Owner ProductFeaturesNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductCardHolderNode.class;
    }

    protected final ProductCardHolderNodeComponent getComponent() {
        return component;
    }


    private ProductCardHolderNodeComponent component;

    @Inject
    void createComponent(ProductCardHolderNodeComponent.Builder builder) {
        this.component = builder.setProductCardHolderNodeModule(new ProductCardHolderNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    //region children getters

    @JsMethod
    public productCardHolderNameNode getProductCardHolderNameNode() {
        return (productCardHolderNameNode)getChildByName("productCardHolderNameNode");
    }

    @JsMethod
    public ProductRewardsProgramNode getProductRewardsProgramNode() {
        return (ProductRewardsProgramNode)getChildByName("productRewardsProgramNode");
    }

    @JsMethod
    public ProductRewardsMembershipNode getProductRewardsMembershipNode() {
        return (ProductRewardsMembershipNode)getChildByName("productRewardsMembershipNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("productCardHolderNameNode");
        children.add(getComponent().createproductCardHolderNameNode());
        setChildNodeIdentity("productRewardsProgramNode");
        children.add(getComponent().createProductRewardsProgramNode());
        setChildNodeIdentity("productRewardsMembershipNode");
        children.add(getComponent().createProductRewardsMembershipNode());
        setChildNodeIdentity(null);
        return children;
    }

}
