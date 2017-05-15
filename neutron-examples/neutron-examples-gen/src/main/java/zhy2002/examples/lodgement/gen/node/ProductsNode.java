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

public class ProductsNode extends ObjectUiNode<ApplicationNode> {

    private ProductsNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(ProductsNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ProductsNode.class;
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


    public ProductsNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        children.add(childFactory.createProductListNode());
        children.add(childFactory.createProductCustomerContributionListNode());
        children.add(childFactory.createProductFeeListNode());
        children.add(childFactory.createProductLoanTypeNode());
        children.add(childFactory.createSettlementDateNode());
        children.add(childFactory.createProductTotalLoanAmountNode());
        children.add(childFactory.createProductTotalSecurityAmountNode());
        children.add(childFactory.createProductTotalLoanLmiAmountNode());
        children.add(childFactory.createProductTotalLvrNode());
        children.add(childFactory.createProductTotalLvrLmiNode());
        return children;
    }

}
