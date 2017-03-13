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

    private ProductListNode productListNode;
    private ProductCustomerContributionListNode productCustomerContributionListNode;
    private ProductFeeListNode productFeeListNode;
    private ProductLoanTypeNode productLoanTypeNode;
    private SettlementDateNode settlementDateNode;
    private ProductTotalLoanAmountNode productTotalLoanAmountNode;
    private ProductTotalSecurityAmountNode productTotalSecurityAmountNode;
    private ProductTotalLoanLmiAmountNode productTotalLoanLmiAmountNode;
    private ProductTotalLvrNode productTotalLvrNode;
    private ProductTotalLvrLmiNode productTotalLvrLmiNode;

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

    private ProductsNodeRuleProvider getRuleProvider() {
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
        return productListNode;
    }

    @JsMethod
    public ProductCustomerContributionListNode getProductCustomerContributionListNode() {
        return productCustomerContributionListNode;
    }

    @JsMethod
    public ProductFeeListNode getProductFeeListNode() {
        return productFeeListNode;
    }

    @JsMethod
    public ProductLoanTypeNode getProductLoanTypeNode() {
        return productLoanTypeNode;
    }

    @JsMethod
    public SettlementDateNode getSettlementDateNode() {
        return settlementDateNode;
    }

    @JsMethod
    public ProductTotalLoanAmountNode getProductTotalLoanAmountNode() {
        return productTotalLoanAmountNode;
    }

    @JsMethod
    public ProductTotalSecurityAmountNode getProductTotalSecurityAmountNode() {
        return productTotalSecurityAmountNode;
    }

    @JsMethod
    public ProductTotalLoanLmiAmountNode getProductTotalLoanLmiAmountNode() {
        return productTotalLoanLmiAmountNode;
    }

    @JsMethod
    public ProductTotalLvrNode getProductTotalLvrNode() {
        return productTotalLvrNode;
    }

    @JsMethod
    public ProductTotalLvrLmiNode getProductTotalLvrLmiNode() {
        return productTotalLvrLmiNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        productListNode = childFactory.createProductListNode();
        children.add(productListNode);
        productCustomerContributionListNode = childFactory.createProductCustomerContributionListNode();
        children.add(productCustomerContributionListNode);
        productFeeListNode = childFactory.createProductFeeListNode();
        children.add(productFeeListNode);
        productLoanTypeNode = childFactory.createProductLoanTypeNode();
        children.add(productLoanTypeNode);
        settlementDateNode = childFactory.createSettlementDateNode();
        children.add(settlementDateNode);
        productTotalLoanAmountNode = childFactory.createProductTotalLoanAmountNode();
        children.add(productTotalLoanAmountNode);
        productTotalSecurityAmountNode = childFactory.createProductTotalSecurityAmountNode();
        children.add(productTotalSecurityAmountNode);
        productTotalLoanLmiAmountNode = childFactory.createProductTotalLoanLmiAmountNode();
        children.add(productTotalLoanLmiAmountNode);
        productTotalLvrNode = childFactory.createProductTotalLvrNode();
        children.add(productTotalLvrNode);
        productTotalLvrLmiNode = childFactory.createProductTotalLvrLmiNode();
        children.add(productTotalLvrLmiNode);
        return children;
    }

}
