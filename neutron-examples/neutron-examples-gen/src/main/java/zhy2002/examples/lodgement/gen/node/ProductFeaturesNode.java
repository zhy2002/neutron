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

public class ProductFeaturesNode extends ObjectUiNode<ProductNode> {

    private ProductFeaturesNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(ProductFeaturesNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductFeaturesNode.class;
    }

    private ProductFeaturesNodeComponent component;

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


    public ProductFeaturesNode(@NotNull ProductNode parent, String name) {
        super(parent, name);
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
        children.add(childFactory.createProductPackageNameNode());
        children.add(childFactory.createProductRepaymentFrequencyNode());
        children.add(childFactory.createProductRateLockFlagNode());
        children.add(childFactory.createProductTransactionAccountFlagNode());
        children.add(childFactory.createProductOptOutReasonNode());
        children.add(childFactory.createProductCreditCardFlagNode());
        children.add(childFactory.createProductCreditCardTypeNode());
        children.add(childFactory.createProductCreditCardLimitNode());
        children.add(childFactory.createProductExpressConsentFlagNode());
        children.add(childFactory.createProduct100PercentOffsetFlagNode());
        children.add(childFactory.createProductPrimaryCardHolderNode());
        children.add(childFactory.createProductAdditionalCardHolderNode());
        return children;
    }

}
