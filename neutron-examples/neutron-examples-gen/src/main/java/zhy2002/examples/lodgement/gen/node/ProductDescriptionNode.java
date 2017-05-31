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
    private ProductDescriptionNodeComponent component;

    public ProductDescriptionNode(@NotNull ProductNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductDescriptionNode.class;
    }

    @Inject
    void receiveNodeProvider(ProductDescriptionNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

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
        setChildNodeIdentity("productGroupNode");
        children.add(childFactory.createProductGroupNode());
        setChildNodeIdentity("productNameNode");
        children.add(childFactory.createProductNameNode());
        setChildNodeIdentity("productLoanPrimaryPurposeNode");
        children.add(childFactory.createProductLoanPrimaryPurposeNode());
        setChildNodeIdentity("productLendingPurposeNode");
        children.add(childFactory.createProductLendingPurposeNode());
        setChildNodeIdentity("productRequestedAmountNode");
        children.add(childFactory.createProductRequestedAmountNode());
        setChildNodeIdentity("productTotalLoanTermNode");
        children.add(childFactory.createProductTotalLoanTermNode());
        setChildNodeIdentity("productPaymentTypeNode");
        children.add(childFactory.createProductPaymentTypeNode());
        setChildNodeIdentity("productInterestOnlyTermNode");
        children.add(childFactory.createProductInterestOnlyTermNode());
        setChildNodeIdentity("productFixedTermNode");
        children.add(childFactory.createProductFixedTermNode());
        setChildNodeIdentity("productConstructionApplicationFlagNode");
        children.add(childFactory.createProductConstructionApplicationFlagNode());
        setChildNodeIdentity("productCostRecuctionFlagNode");
        children.add(childFactory.createProductCostRecuctionFlagNode());
        setChildNodeIdentity("productConsolidationFlagNode");
        children.add(childFactory.createProductConsolidationFlagNode());
        setChildNodeIdentity("productDissatisfactionFlagNode");
        children.add(childFactory.createProductDissatisfactionFlagNode());
        setChildNodeIdentity("productSpecificFeaturesFlagNode");
        children.add(childFactory.createProductSpecificFeaturesFlagNode());
        setChildNodeIdentity("productAccountHolderListNode");
        children.add(childFactory.createProductAccountHolderListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
