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

public class ProductDescriptionNode extends ObjectUiNode<ProductNode> {

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

    private RuleProvider<ProductDescriptionNode> getRuleProvider() {
        return component.getProductDescriptionNodeRuleProvider();
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

    private RuleProvider<ProductDescriptionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public ProductDescriptionNode(@NotNull ProductNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public ProductGroupNode getProductGroupNode() {
        return (ProductGroupNode)getChildByName("productGroupNode");
    }

    @JsMethod
    public ProductNameNode getProductNameNode() {
        return (ProductNameNode)getChildByName("productNameNode");
    }

    @JsMethod
    public ProductLoanPrimaryPurposeNode getProductLoanPrimaryPurposeNode() {
        return (ProductLoanPrimaryPurposeNode)getChildByName("productLoanPrimaryPurposeNode");
    }

    @JsMethod
    public ProductLendingPurposeNode getProductLendingPurposeNode() {
        return (ProductLendingPurposeNode)getChildByName("productLendingPurposeNode");
    }

    @JsMethod
    public ProductRequestedAmountNode getProductRequestedAmountNode() {
        return (ProductRequestedAmountNode)getChildByName("productRequestedAmountNode");
    }

    @JsMethod
    public ProductTotalLoanTermNode getProductTotalLoanTermNode() {
        return (ProductTotalLoanTermNode)getChildByName("productTotalLoanTermNode");
    }

    @JsMethod
    public ProductPaymentTypeNode getProductPaymentTypeNode() {
        return (ProductPaymentTypeNode)getChildByName("productPaymentTypeNode");
    }

    @JsMethod
    public ProductInterestOnlyTermNode getProductInterestOnlyTermNode() {
        return (ProductInterestOnlyTermNode)getChildByName("productInterestOnlyTermNode");
    }

    @JsMethod
    public ProductFixedTermNode getProductFixedTermNode() {
        return (ProductFixedTermNode)getChildByName("productFixedTermNode");
    }

    @JsMethod
    public ProductConstructionApplicationFlagNode getProductConstructionApplicationFlagNode() {
        return (ProductConstructionApplicationFlagNode)getChildByName("productConstructionApplicationFlagNode");
    }

    @JsMethod
    public ProductCostRecuctionFlagNode getProductCostRecuctionFlagNode() {
        return (ProductCostRecuctionFlagNode)getChildByName("productCostRecuctionFlagNode");
    }

    @JsMethod
    public ProductConsolidationFlagNode getProductConsolidationFlagNode() {
        return (ProductConsolidationFlagNode)getChildByName("productConsolidationFlagNode");
    }

    @JsMethod
    public ProductDissatisfactionFlagNode getProductDissatisfactionFlagNode() {
        return (ProductDissatisfactionFlagNode)getChildByName("productDissatisfactionFlagNode");
    }

    @JsMethod
    public ProductSpecificFeaturesFlagNode getProductSpecificFeaturesFlagNode() {
        return (ProductSpecificFeaturesFlagNode)getChildByName("productSpecificFeaturesFlagNode");
    }

    @JsMethod
    public ProductAccountHolderListNode getProductAccountHolderListNode() {
        return (ProductAccountHolderListNode)getChildByName("productAccountHolderListNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        children.add(childFactory.createProductGroupNode());
        children.add(childFactory.createProductNameNode());
        children.add(childFactory.createProductLoanPrimaryPurposeNode());
        children.add(childFactory.createProductLendingPurposeNode());
        children.add(childFactory.createProductRequestedAmountNode());
        children.add(childFactory.createProductTotalLoanTermNode());
        children.add(childFactory.createProductPaymentTypeNode());
        children.add(childFactory.createProductInterestOnlyTermNode());
        children.add(childFactory.createProductFixedTermNode());
        children.add(childFactory.createProductConstructionApplicationFlagNode());
        children.add(childFactory.createProductCostRecuctionFlagNode());
        children.add(childFactory.createProductConsolidationFlagNode());
        children.add(childFactory.createProductDissatisfactionFlagNode());
        children.add(childFactory.createProductSpecificFeaturesFlagNode());
        children.add(childFactory.createProductAccountHolderListNode());
        return children;
    }

}
