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

    private ProductPackageNameNode productPackageNameNode;
    private ProductRepaymentFrequencyNode productRepaymentFrequencyNode;
    private ProductRateLockFlagNode productRateLockFlagNode;
    private ProductTransactionAccountFlagNode productTransactionAccountFlagNode;
    private ProductOptOutReasonNode productOptOutReasonNode;
    private ProductCreditCardFlagNode productCreditCardFlagNode;
    private ProductCreditCardTypeNode productCreditCardTypeNode;
    private ProductCreditCardLimitNode productCreditCardLimitNode;
    private ProductExpressConsentFlagNode productExpressConsentFlagNode;
    private Product100PercentOffsetFlagNode product100PercentOffsetFlagNode;
    private ProductCardHolderNode productPrimaryCardHolderNode;
    private ProductCardHolderNode productAdditionalCardHolderNode;

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

    private ProductFeaturesNodeRuleProvider getRuleProvider() {
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
        return productPackageNameNode;
    }

    @JsMethod
    public ProductRepaymentFrequencyNode getProductRepaymentFrequencyNode() {
        return productRepaymentFrequencyNode;
    }

    @JsMethod
    public ProductRateLockFlagNode getProductRateLockFlagNode() {
        return productRateLockFlagNode;
    }

    @JsMethod
    public ProductTransactionAccountFlagNode getProductTransactionAccountFlagNode() {
        return productTransactionAccountFlagNode;
    }

    @JsMethod
    public ProductOptOutReasonNode getProductOptOutReasonNode() {
        return productOptOutReasonNode;
    }

    @JsMethod
    public ProductCreditCardFlagNode getProductCreditCardFlagNode() {
        return productCreditCardFlagNode;
    }

    @JsMethod
    public ProductCreditCardTypeNode getProductCreditCardTypeNode() {
        return productCreditCardTypeNode;
    }

    @JsMethod
    public ProductCreditCardLimitNode getProductCreditCardLimitNode() {
        return productCreditCardLimitNode;
    }

    @JsMethod
    public ProductExpressConsentFlagNode getProductExpressConsentFlagNode() {
        return productExpressConsentFlagNode;
    }

    @JsMethod
    public Product100PercentOffsetFlagNode getProduct100PercentOffsetFlagNode() {
        return product100PercentOffsetFlagNode;
    }

    @JsMethod
    public ProductCardHolderNode getProductPrimaryCardHolderNode() {
        return productPrimaryCardHolderNode;
    }

    @JsMethod
    public ProductCardHolderNode getProductAdditionalCardHolderNode() {
        return productAdditionalCardHolderNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        productPackageNameNode = childFactory.createProductPackageNameNode();
        children.add(productPackageNameNode);
        productRepaymentFrequencyNode = childFactory.createProductRepaymentFrequencyNode();
        children.add(productRepaymentFrequencyNode);
        productRateLockFlagNode = childFactory.createProductRateLockFlagNode();
        children.add(productRateLockFlagNode);
        productTransactionAccountFlagNode = childFactory.createProductTransactionAccountFlagNode();
        children.add(productTransactionAccountFlagNode);
        productOptOutReasonNode = childFactory.createProductOptOutReasonNode();
        children.add(productOptOutReasonNode);
        productCreditCardFlagNode = childFactory.createProductCreditCardFlagNode();
        children.add(productCreditCardFlagNode);
        productCreditCardTypeNode = childFactory.createProductCreditCardTypeNode();
        children.add(productCreditCardTypeNode);
        productCreditCardLimitNode = childFactory.createProductCreditCardLimitNode();
        children.add(productCreditCardLimitNode);
        productExpressConsentFlagNode = childFactory.createProductExpressConsentFlagNode();
        children.add(productExpressConsentFlagNode);
        product100PercentOffsetFlagNode = childFactory.createProduct100PercentOffsetFlagNode();
        children.add(product100PercentOffsetFlagNode);
        productPrimaryCardHolderNode = childFactory.createProductPrimaryCardHolderNode();
        children.add(productPrimaryCardHolderNode);
        productAdditionalCardHolderNode = childFactory.createProductAdditionalCardHolderNode();
        children.add(productAdditionalCardHolderNode);
        return children;
    }

}
