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
    public ProductDescriptionNode(@Owner ProductNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductDescriptionNode.class;
    }

    private ProductDescriptionNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(ProductDescriptionNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }



    protected final ProductDescriptionNodeComponent getComponent() {
        return component;
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
