package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProductsNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ProductsNode extends ObjectUiNode<ApplicationNode> {

    @Inject
    public ProductsNode(@Owner ApplicationNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProductsNode.class;
    }

    protected final ProductsNodeComponent getComponent() {
        return component;
    }


    private ProductsNodeComponent component;

    @Inject
    void createComponent(ProductsNodeComponent.Builder builder) {
        this.component = builder.setProductsNodeModule(new ProductsNodeModule(this)).build();
    }

    private RuleProvider<ProductsNode> getRuleProvider() {
        return component.getProductsNodeRuleProvider();
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

    private RuleProvider<ProductsNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    //region children getters

    @JsMethod
    public ProductListNode getProductListNode() {
        return (ProductListNode)getChildByName("productListNode");
    }

    @JsMethod
    public ProductCustomerContributionListNode getProductCustomerContributionListNode() {
        return (ProductCustomerContributionListNode)getChildByName("productCustomerContributionListNode");
    }

    @JsMethod
    public ProductFeeListNode getProductFeeListNode() {
        return (ProductFeeListNode)getChildByName("productFeeListNode");
    }

    @JsMethod
    public ProductLoanTypeNode getProductLoanTypeNode() {
        return (ProductLoanTypeNode)getChildByName("productLoanTypeNode");
    }

    @JsMethod
    public SettlementDateNode getSettlementDateNode() {
        return (SettlementDateNode)getChildByName("settlementDateNode");
    }

    @JsMethod
    public ProductTotalLoanAmountNode getProductTotalLoanAmountNode() {
        return (ProductTotalLoanAmountNode)getChildByName("productTotalLoanAmountNode");
    }

    @JsMethod
    public ProductTotalSecurityAmountNode getProductTotalSecurityAmountNode() {
        return (ProductTotalSecurityAmountNode)getChildByName("productTotalSecurityAmountNode");
    }

    @JsMethod
    public ProductTotalLoanLmiAmountNode getProductTotalLoanLmiAmountNode() {
        return (ProductTotalLoanLmiAmountNode)getChildByName("productTotalLoanLmiAmountNode");
    }

    @JsMethod
    public ProductTotalLvrNode getProductTotalLvrNode() {
        return (ProductTotalLvrNode)getChildByName("productTotalLvrNode");
    }

    @JsMethod
    public ProductTotalLvrLmiNode getProductTotalLvrLmiNode() {
        return (ProductTotalLvrLmiNode)getChildByName("productTotalLvrLmiNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("productListNode");
        children.add(getComponent().createProductListNode());
        setChildNodeIdentity("productCustomerContributionListNode");
        children.add(getComponent().createProductCustomerContributionListNode());
        setChildNodeIdentity("productFeeListNode");
        children.add(getComponent().createProductFeeListNode());
        setChildNodeIdentity("productLoanTypeNode");
        children.add(getComponent().createProductLoanTypeNode());
        setChildNodeIdentity("settlementDateNode");
        children.add(getComponent().createSettlementDateNode());
        setChildNodeIdentity("productTotalLoanAmountNode");
        children.add(getComponent().createProductTotalLoanAmountNode());
        setChildNodeIdentity("productTotalSecurityAmountNode");
        children.add(getComponent().createProductTotalSecurityAmountNode());
        setChildNodeIdentity("productTotalLoanLmiAmountNode");
        children.add(getComponent().createProductTotalLoanLmiAmountNode());
        setChildNodeIdentity("productTotalLvrNode");
        children.add(getComponent().createProductTotalLvrNode());
        setChildNodeIdentity("productTotalLvrLmiNode");
        children.add(getComponent().createProductTotalLvrLmiNode());
        setChildNodeIdentity(null);
        return children;
    }

}
