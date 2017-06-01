package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductFeaturesNode extends ObjectUiNode<ProductNode> {

    private ProductFeaturesNodeChildFactory childFactory;
    private ProductFeaturesNodeComponent component;

    @Inject
    public ProductFeaturesNode(@Owner ProductNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductFeaturesNode.class;
    }

    @Inject
    void receiveNodeProvider(ProductFeaturesNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(ProductFeaturesNodeComponent.Builder builder) {
        this.component = builder.setProductFeaturesNodeModule(new ProductFeaturesNodeModule(this)).build();
    }

    private RuleProvider<ProductFeaturesNode> getRuleProvider() {
        return component.getProductFeaturesNodeRuleProvider();
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

    private RuleProvider<ProductFeaturesNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @JsMethod
    public ProductPackageNameNode getProductPackageNameNode() {
        return (ProductPackageNameNode)getChildByName("productPackageNameNode");
    }

    @JsMethod
    public ProductRepaymentFrequencyNode getProductRepaymentFrequencyNode() {
        return (ProductRepaymentFrequencyNode)getChildByName("productRepaymentFrequencyNode");
    }

    @JsMethod
    public ProductRateLockFlagNode getProductRateLockFlagNode() {
        return (ProductRateLockFlagNode)getChildByName("productRateLockFlagNode");
    }

    @JsMethod
    public ProductTransactionAccountFlagNode getProductTransactionAccountFlagNode() {
        return (ProductTransactionAccountFlagNode)getChildByName("productTransactionAccountFlagNode");
    }

    @JsMethod
    public ProductOptOutReasonNode getProductOptOutReasonNode() {
        return (ProductOptOutReasonNode)getChildByName("productOptOutReasonNode");
    }

    @JsMethod
    public ProductCreditCardFlagNode getProductCreditCardFlagNode() {
        return (ProductCreditCardFlagNode)getChildByName("productCreditCardFlagNode");
    }

    @JsMethod
    public ProductCreditCardTypeNode getProductCreditCardTypeNode() {
        return (ProductCreditCardTypeNode)getChildByName("productCreditCardTypeNode");
    }

    @JsMethod
    public ProductCreditCardLimitNode getProductCreditCardLimitNode() {
        return (ProductCreditCardLimitNode)getChildByName("productCreditCardLimitNode");
    }

    @JsMethod
    public ProductExpressConsentFlagNode getProductExpressConsentFlagNode() {
        return (ProductExpressConsentFlagNode)getChildByName("productExpressConsentFlagNode");
    }

    @JsMethod
    public Product100PercentOffsetFlagNode getProduct100PercentOffsetFlagNode() {
        return (Product100PercentOffsetFlagNode)getChildByName("product100PercentOffsetFlagNode");
    }

    @JsMethod
    public ProductCardHolderNode getProductPrimaryCardHolderNode() {
        return (ProductCardHolderNode)getChildByName("productPrimaryCardHolderNode");
    }

    @JsMethod
    public ProductCardHolderNode getProductAdditionalCardHolderNode() {
        return (ProductCardHolderNode)getChildByName("productAdditionalCardHolderNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("productPackageNameNode");
        children.add(childFactory.createProductPackageNameNode());
        setChildNodeIdentity("productRepaymentFrequencyNode");
        children.add(childFactory.createProductRepaymentFrequencyNode());
        setChildNodeIdentity("productRateLockFlagNode");
        children.add(childFactory.createProductRateLockFlagNode());
        setChildNodeIdentity("productTransactionAccountFlagNode");
        children.add(childFactory.createProductTransactionAccountFlagNode());
        setChildNodeIdentity("productOptOutReasonNode");
        children.add(childFactory.createProductOptOutReasonNode());
        setChildNodeIdentity("productCreditCardFlagNode");
        children.add(childFactory.createProductCreditCardFlagNode());
        setChildNodeIdentity("productCreditCardTypeNode");
        children.add(childFactory.createProductCreditCardTypeNode());
        setChildNodeIdentity("productCreditCardLimitNode");
        children.add(childFactory.createProductCreditCardLimitNode());
        setChildNodeIdentity("productExpressConsentFlagNode");
        children.add(childFactory.createProductExpressConsentFlagNode());
        setChildNodeIdentity("product100PercentOffsetFlagNode");
        children.add(childFactory.createProduct100PercentOffsetFlagNode());
        setChildNodeIdentity("productPrimaryCardHolderNode");
        children.add(childFactory.createProductPrimaryCardHolderNode());
        setChildNodeIdentity("productAdditionalCardHolderNode");
        children.add(childFactory.createProductAdditionalCardHolderNode());
        setChildNodeIdentity(null);
        return children;
    }

}
