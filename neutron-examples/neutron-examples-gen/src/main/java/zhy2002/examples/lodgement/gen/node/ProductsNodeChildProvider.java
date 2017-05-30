package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface ProductsNodeChildFactory {
    ProductListNode createProductListNode();
    ProductCustomerContributionListNode createProductCustomerContributionListNode();
    ProductFeeListNode createProductFeeListNode();
    ProductLoanTypeNode createProductLoanTypeNode();
    SettlementDateNode createSettlementDateNode();
    ProductTotalLoanAmountNode createProductTotalLoanAmountNode();
    ProductTotalSecurityAmountNode createProductTotalSecurityAmountNode();
    ProductTotalLoanLmiAmountNode createProductTotalLoanLmiAmountNode();
    ProductTotalLvrNode createProductTotalLvrNode();
    ProductTotalLvrLmiNode createProductTotalLvrLmiNode();
}

@Singleton
public class ProductsNodeChildProvider {
    @Inject
    MembersInjector<SettlementDateNode> settlementDateNodeInjector;
    @Inject
    MembersInjector<ProductFeeListNode> productFeeListNodeInjector;
    @Inject
    MembersInjector<ProductTotalSecurityAmountNode> productTotalSecurityAmountNodeInjector;
    @Inject
    MembersInjector<ProductCustomerContributionListNode> productCustomerContributionListNodeInjector;
    @Inject
    MembersInjector<ProductLoanTypeNode> productLoanTypeNodeInjector;
    @Inject
    MembersInjector<ProductTotalLoanAmountNode> productTotalLoanAmountNodeInjector;
    @Inject
    MembersInjector<ProductTotalLvrLmiNode> productTotalLvrLmiNodeInjector;
    @Inject
    MembersInjector<ProductListNode> productListNodeInjector;
    @Inject
    MembersInjector<ProductTotalLoanLmiAmountNode> productTotalLoanLmiAmountNodeInjector;
    @Inject
    MembersInjector<ProductTotalLvrNode> productTotalLvrNodeInjector;

    @Inject
    protected ProductsNodeChildProvider () {}

    protected MembersInjector<SettlementDateNode> getSettlementDateNodeInjector() {
        return this.settlementDateNodeInjector;
    }

    protected MembersInjector<ProductFeeListNode> getProductFeeListNodeInjector() {
        return this.productFeeListNodeInjector;
    }

    protected MembersInjector<ProductTotalSecurityAmountNode> getProductTotalSecurityAmountNodeInjector() {
        return this.productTotalSecurityAmountNodeInjector;
    }

    protected MembersInjector<ProductCustomerContributionListNode> getProductCustomerContributionListNodeInjector() {
        return this.productCustomerContributionListNodeInjector;
    }

    protected MembersInjector<ProductLoanTypeNode> getProductLoanTypeNodeInjector() {
        return this.productLoanTypeNodeInjector;
    }

    protected MembersInjector<ProductTotalLoanAmountNode> getProductTotalLoanAmountNodeInjector() {
        return this.productTotalLoanAmountNodeInjector;
    }

    protected MembersInjector<ProductTotalLvrLmiNode> getProductTotalLvrLmiNodeInjector() {
        return this.productTotalLvrLmiNodeInjector;
    }

    protected MembersInjector<ProductListNode> getProductListNodeInjector() {
        return this.productListNodeInjector;
    }

    protected MembersInjector<ProductTotalLoanLmiAmountNode> getProductTotalLoanLmiAmountNodeInjector() {
        return this.productTotalLoanLmiAmountNodeInjector;
    }

    protected MembersInjector<ProductTotalLvrNode> getProductTotalLvrNodeInjector() {
        return this.productTotalLvrNodeInjector;
    }

    protected ProductListNode newProductListNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductListNode(parent, name);
    }

    protected void configureProductListNode(ProductListNode node) {
    }

    @ProductListNodeScope
    public static class ProductListNodeRuleProvider implements RuleProvider<ProductListNode> {

        @Inject
        public ProductListNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductCustomerContributionListNode newProductCustomerContributionListNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductCustomerContributionListNode(parent, name);
    }

    protected void configureProductCustomerContributionListNode(ProductCustomerContributionListNode node) {
    }

    @ProductCustomerContributionListNodeScope
    public static class ProductCustomerContributionListNodeRuleProvider implements RuleProvider<ProductCustomerContributionListNode> {

        @Inject
        public ProductCustomerContributionListNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductCustomerContributionListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductFeeListNode newProductFeeListNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductFeeListNode(parent, name);
    }

    protected void configureProductFeeListNode(ProductFeeListNode node) {
    }

    @ProductFeeListNodeScope
    public static class ProductFeeListNodeRuleProvider implements RuleProvider<ProductFeeListNode> {

        @Inject
        public ProductFeeListNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductFeeListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductLoanTypeNode newProductLoanTypeNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductLoanTypeNode(parent, name);
    }

    protected void configureProductLoanTypeNode(ProductLoanTypeNode node) {
    }

    @ProductLoanTypeNodeScope
    public static class ProductLoanTypeNodeRuleProvider implements RuleProvider<ProductLoanTypeNode> {

        @Inject
        public ProductLoanTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductLoanTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected SettlementDateNode newSettlementDateNode(
        ProductsNode parent,
        String name
    ) {
        return new SettlementDateNode(parent, name);
    }

    protected void configureSettlementDateNode(SettlementDateNode node) {
    }

    @SettlementDateNodeScope
    public static class SettlementDateNodeRuleProvider implements RuleProvider<SettlementDateNode> {

        @Inject
        public SettlementDateNodeRuleProvider() {

        }

        @Override
        public void initializeState(SettlementDateNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductTotalLoanAmountNode newProductTotalLoanAmountNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductTotalLoanAmountNode(parent, name);
    }

    protected void configureProductTotalLoanAmountNode(ProductTotalLoanAmountNode node) {
    }

    @ProductTotalLoanAmountNodeScope
    public static class ProductTotalLoanAmountNodeRuleProvider implements RuleProvider<ProductTotalLoanAmountNode> {

        @Inject
        public ProductTotalLoanAmountNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductTotalLoanAmountNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductTotalSecurityAmountNode newProductTotalSecurityAmountNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductTotalSecurityAmountNode(parent, name);
    }

    protected void configureProductTotalSecurityAmountNode(ProductTotalSecurityAmountNode node) {
    }

    @ProductTotalSecurityAmountNodeScope
    public static class ProductTotalSecurityAmountNodeRuleProvider implements RuleProvider<ProductTotalSecurityAmountNode> {

        @Inject
        public ProductTotalSecurityAmountNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductTotalSecurityAmountNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductTotalLoanLmiAmountNode newProductTotalLoanLmiAmountNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductTotalLoanLmiAmountNode(parent, name);
    }

    protected void configureProductTotalLoanLmiAmountNode(ProductTotalLoanLmiAmountNode node) {
    }

    @ProductTotalLoanLmiAmountNodeScope
    public static class ProductTotalLoanLmiAmountNodeRuleProvider implements RuleProvider<ProductTotalLoanLmiAmountNode> {

        @Inject
        public ProductTotalLoanLmiAmountNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductTotalLoanLmiAmountNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductTotalLvrNode newProductTotalLvrNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductTotalLvrNode(parent, name);
    }

    protected void configureProductTotalLvrNode(ProductTotalLvrNode node) {
    }

    @ProductTotalLvrNodeScope
    public static class ProductTotalLvrNodeRuleProvider implements RuleProvider<ProductTotalLvrNode> {

        @Inject
        public ProductTotalLvrNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductTotalLvrNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductTotalLvrLmiNode newProductTotalLvrLmiNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductTotalLvrLmiNode(parent, name);
    }

    protected void configureProductTotalLvrLmiNode(ProductTotalLvrLmiNode node) {
    }

    @ProductTotalLvrLmiNodeScope
    public static class ProductTotalLvrLmiNodeRuleProvider implements RuleProvider<ProductTotalLvrLmiNode> {

        @Inject
        public ProductTotalLvrLmiNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductTotalLvrLmiNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    ProductsNodeChildFactory createFactory(ProductsNode parent) {
        return new ProductsNodeChildFactoryImpl(parent);
    }

    private class ProductsNodeChildFactoryImpl implements ProductsNodeChildFactory {

        private final ProductsNode parent;
        
        private ProductsNodeChildFactoryImpl(ProductsNode parent) {
            this.parent = parent;
        }

        @Override
        public ProductListNode createProductListNode() {
            ProductListNode node = newProductListNode(parent, "productListNode");
            productListNodeInjector.injectMembers(node);
            configureProductListNode(node);
            return node;
        }

        @Override
        public ProductCustomerContributionListNode createProductCustomerContributionListNode() {
            ProductCustomerContributionListNode node = newProductCustomerContributionListNode(parent, "productCustomerContributionListNode");
            productCustomerContributionListNodeInjector.injectMembers(node);
            configureProductCustomerContributionListNode(node);
            return node;
        }

        @Override
        public ProductFeeListNode createProductFeeListNode() {
            ProductFeeListNode node = newProductFeeListNode(parent, "productFeeListNode");
            productFeeListNodeInjector.injectMembers(node);
            configureProductFeeListNode(node);
            return node;
        }

        @Override
        public ProductLoanTypeNode createProductLoanTypeNode() {
            ProductLoanTypeNode node = newProductLoanTypeNode(parent, "productLoanTypeNode");
            productLoanTypeNodeInjector.injectMembers(node);
            configureProductLoanTypeNode(node);
            return node;
        }

        @Override
        public SettlementDateNode createSettlementDateNode() {
            SettlementDateNode node = newSettlementDateNode(parent, "settlementDateNode");
            settlementDateNodeInjector.injectMembers(node);
            configureSettlementDateNode(node);
            return node;
        }

        @Override
        public ProductTotalLoanAmountNode createProductTotalLoanAmountNode() {
            ProductTotalLoanAmountNode node = newProductTotalLoanAmountNode(parent, "productTotalLoanAmountNode");
            productTotalLoanAmountNodeInjector.injectMembers(node);
            configureProductTotalLoanAmountNode(node);
            return node;
        }

        @Override
        public ProductTotalSecurityAmountNode createProductTotalSecurityAmountNode() {
            ProductTotalSecurityAmountNode node = newProductTotalSecurityAmountNode(parent, "productTotalSecurityAmountNode");
            productTotalSecurityAmountNodeInjector.injectMembers(node);
            configureProductTotalSecurityAmountNode(node);
            return node;
        }

        @Override
        public ProductTotalLoanLmiAmountNode createProductTotalLoanLmiAmountNode() {
            ProductTotalLoanLmiAmountNode node = newProductTotalLoanLmiAmountNode(parent, "productTotalLoanLmiAmountNode");
            productTotalLoanLmiAmountNodeInjector.injectMembers(node);
            configureProductTotalLoanLmiAmountNode(node);
            return node;
        }

        @Override
        public ProductTotalLvrNode createProductTotalLvrNode() {
            ProductTotalLvrNode node = newProductTotalLvrNode(parent, "productTotalLvrNode");
            productTotalLvrNodeInjector.injectMembers(node);
            configureProductTotalLvrNode(node);
            return node;
        }

        @Override
        public ProductTotalLvrLmiNode createProductTotalLvrLmiNode() {
            ProductTotalLvrLmiNode node = newProductTotalLvrLmiNode(parent, "productTotalLvrLmiNode");
            productTotalLvrLmiNodeInjector.injectMembers(node);
            configureProductTotalLvrLmiNode(node);
            return node;
        }

    }
}
