package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ProductsNode extends ObjectUiNode<ApplicationNode> {

    private ProductListNode productListNode;
    private ProductCustomerContributionNode productCustomerContributionNode;
    private ProductFeesNode productFeesNode;
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

    @Override
    protected ProductsNodeRuleProvider getRuleProvider() {
        return component.getProductsNodeRuleProvider();
    }

    public ProductsNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public ProductListNode getProductListNode() {
        return productListNode;
    }

    @JsMethod
    public ProductCustomerContributionNode getProductCustomerContributionNode() {
        return productCustomerContributionNode;
    }

    @JsMethod
    public ProductFeesNode getProductFeesNode() {
        return productFeesNode;
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
        productCustomerContributionNode = childFactory.createProductCustomerContributionNode();
        children.add(productCustomerContributionNode);
        productFeesNode = childFactory.createProductFeesNode();
        children.add(productFeesNode);
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
