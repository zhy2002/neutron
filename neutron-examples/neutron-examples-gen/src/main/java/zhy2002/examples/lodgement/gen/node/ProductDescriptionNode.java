package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductDescriptionNode extends ObjectUiNode<ProductNode> {

    private ProductGroupNode productGroupNode;
    private ProductNameNode productNameNode;
    private ProductLoanPrimaryPurposeNode productLoanPrimaryPurposeNode;
    private ProductLendingPurposeNode productLendingPurposeNode;
    private ProductRequestedAmountNode productRequestedAmountNode;
    private ProductTotalLoanTermNode productTotalLoanTermNode;
    private ProductPaymentTypeNode productPaymentTypeNode;
    private ProductInterestOnlyTermNode productInterestOnlyTermNode;
    private ProductFixedTermNode productFixedTermNode;
    private ProductConstructionApplicationFlagNode productConstructionApplicationFlagNode;
    private ProductCostRecuctionFlagNode productCostRecuctionFlagNode;
    private ProductConsolidationFlagNode productConsolidationFlagNode;
    private ProductDissatisfactionFlagNode productDissatisfactionFlagNode;
    private ProductSpecificFeaturesFlagNode productSpecificFeaturesFlagNode;
    private ProductAccountHolderListNode productAccountHolderListNode;

    private ProductDescriptionNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(ProductDescriptionNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductDescriptionNode.class;
    }

    private ProductDescriptionNodeComponent component;

    @Inject
    void createComponent(ProductDescriptionNodeComponent.Builder builder) {
        this.component = builder.setProductDescriptionNodeModule(new ProductDescriptionNodeModule(this)).build();
    }

    private ProductDescriptionNodeRuleProvider getRuleProvider() {
        return component.getProductDescriptionNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ProductDescriptionNode(@NotNull ProductNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public ProductGroupNode getProductGroupNode() {
        return productGroupNode;
    }

    @JsMethod
    public ProductNameNode getProductNameNode() {
        return productNameNode;
    }

    @JsMethod
    public ProductLoanPrimaryPurposeNode getProductLoanPrimaryPurposeNode() {
        return productLoanPrimaryPurposeNode;
    }

    @JsMethod
    public ProductLendingPurposeNode getProductLendingPurposeNode() {
        return productLendingPurposeNode;
    }

    @JsMethod
    public ProductRequestedAmountNode getProductRequestedAmountNode() {
        return productRequestedAmountNode;
    }

    @JsMethod
    public ProductTotalLoanTermNode getProductTotalLoanTermNode() {
        return productTotalLoanTermNode;
    }

    @JsMethod
    public ProductPaymentTypeNode getProductPaymentTypeNode() {
        return productPaymentTypeNode;
    }

    @JsMethod
    public ProductInterestOnlyTermNode getProductInterestOnlyTermNode() {
        return productInterestOnlyTermNode;
    }

    @JsMethod
    public ProductFixedTermNode getProductFixedTermNode() {
        return productFixedTermNode;
    }

    @JsMethod
    public ProductConstructionApplicationFlagNode getProductConstructionApplicationFlagNode() {
        return productConstructionApplicationFlagNode;
    }

    @JsMethod
    public ProductCostRecuctionFlagNode getProductCostRecuctionFlagNode() {
        return productCostRecuctionFlagNode;
    }

    @JsMethod
    public ProductConsolidationFlagNode getProductConsolidationFlagNode() {
        return productConsolidationFlagNode;
    }

    @JsMethod
    public ProductDissatisfactionFlagNode getProductDissatisfactionFlagNode() {
        return productDissatisfactionFlagNode;
    }

    @JsMethod
    public ProductSpecificFeaturesFlagNode getProductSpecificFeaturesFlagNode() {
        return productSpecificFeaturesFlagNode;
    }

    @JsMethod
    public ProductAccountHolderListNode getProductAccountHolderListNode() {
        return productAccountHolderListNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        productGroupNode = childFactory.createProductGroupNode();
        children.add(productGroupNode);
        productNameNode = childFactory.createProductNameNode();
        children.add(productNameNode);
        productLoanPrimaryPurposeNode = childFactory.createProductLoanPrimaryPurposeNode();
        children.add(productLoanPrimaryPurposeNode);
        productLendingPurposeNode = childFactory.createProductLendingPurposeNode();
        children.add(productLendingPurposeNode);
        productRequestedAmountNode = childFactory.createProductRequestedAmountNode();
        children.add(productRequestedAmountNode);
        productTotalLoanTermNode = childFactory.createProductTotalLoanTermNode();
        children.add(productTotalLoanTermNode);
        productPaymentTypeNode = childFactory.createProductPaymentTypeNode();
        children.add(productPaymentTypeNode);
        productInterestOnlyTermNode = childFactory.createProductInterestOnlyTermNode();
        children.add(productInterestOnlyTermNode);
        productFixedTermNode = childFactory.createProductFixedTermNode();
        children.add(productFixedTermNode);
        productConstructionApplicationFlagNode = childFactory.createProductConstructionApplicationFlagNode();
        children.add(productConstructionApplicationFlagNode);
        productCostRecuctionFlagNode = childFactory.createProductCostRecuctionFlagNode();
        children.add(productCostRecuctionFlagNode);
        productConsolidationFlagNode = childFactory.createProductConsolidationFlagNode();
        children.add(productConsolidationFlagNode);
        productDissatisfactionFlagNode = childFactory.createProductDissatisfactionFlagNode();
        children.add(productDissatisfactionFlagNode);
        productSpecificFeaturesFlagNode = childFactory.createProductSpecificFeaturesFlagNode();
        children.add(productSpecificFeaturesFlagNode);
        productAccountHolderListNode = childFactory.createProductAccountHolderListNode();
        children.add(productAccountHolderListNode);
        return children;
    }

}
