package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductDescriptionNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProductDescriptionNode extends ObjectUiNode<ProductNode> {

    @Inject
    public ProductDescriptionNode(@Owner ProductNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductDescriptionNode.class;
    }

    protected final ProductDescriptionNodeComponent getComponent() {
        return component;
    }


    private ProductDescriptionNodeComponent component;

    @Inject
    void createComponent(ProductDescriptionNodeComponent.Builder builder) {
        this.component = builder.setProductDescriptionNodeModule(new ProductDescriptionNodeModule(this)).build();
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

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("productGroupNode");
        children.add(getComponent().createProductGroupNode());
        setChildNodeIdentity("productNameNode");
        children.add(getComponent().createProductNameNode());
        setChildNodeIdentity("productLoanPrimaryPurposeNode");
        children.add(getComponent().createProductLoanPrimaryPurposeNode());
        setChildNodeIdentity("productLendingPurposeNode");
        children.add(getComponent().createProductLendingPurposeNode());
        setChildNodeIdentity("productRequestedAmountNode");
        children.add(getComponent().createProductRequestedAmountNode());
        setChildNodeIdentity("productTotalLoanTermNode");
        children.add(getComponent().createProductTotalLoanTermNode());
        setChildNodeIdentity("productPaymentTypeNode");
        children.add(getComponent().createProductPaymentTypeNode());
        setChildNodeIdentity("productInterestOnlyTermNode");
        children.add(getComponent().createProductInterestOnlyTermNode());
        setChildNodeIdentity("productFixedTermNode");
        children.add(getComponent().createProductFixedTermNode());
        setChildNodeIdentity("productConstructionApplicationFlagNode");
        children.add(getComponent().createProductConstructionApplicationFlagNode());
        setChildNodeIdentity("productCostRecuctionFlagNode");
        children.add(getComponent().createProductCostRecuctionFlagNode());
        setChildNodeIdentity("productConsolidationFlagNode");
        children.add(getComponent().createProductConsolidationFlagNode());
        setChildNodeIdentity("productDissatisfactionFlagNode");
        children.add(getComponent().createProductDissatisfactionFlagNode());
        setChildNodeIdentity("productSpecificFeaturesFlagNode");
        children.add(getComponent().createProductSpecificFeaturesFlagNode());
        setChildNodeIdentity("productAccountHolderListNode");
        children.add(getComponent().createProductAccountHolderListNode());
        setChildNodeIdentity(null);
        return children;
    }

}
