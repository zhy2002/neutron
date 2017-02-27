package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface ProductsNodeChildFactory {
    ProductListNode createProductListNode();
    ProductCustomerContributionNode createProductCustomerContributionNode();
    ProductFeesNode createProductFeesNode();
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
    MembersInjector<ProductTotalSecurityAmountNode> productTotalSecurityAmountNodeInjector;
    @Inject
    MembersInjector<ProductLoanTypeNode> productLoanTypeNodeInjector;
    @Inject
    MembersInjector<ProductTotalLoanAmountNode> productTotalLoanAmountNodeInjector;
    @Inject
    MembersInjector<ProductTotalLvrLmiNode> productTotalLvrLmiNodeInjector;
    @Inject
    MembersInjector<ProductCustomerContributionNode> productCustomerContributionNodeInjector;
    @Inject
    MembersInjector<ProductListNode> productListNodeInjector;
    @Inject
    MembersInjector<ProductTotalLoanLmiAmountNode> productTotalLoanLmiAmountNodeInjector;
    @Inject
    MembersInjector<ProductFeesNode> productFeesNodeInjector;
    @Inject
    MembersInjector<ProductTotalLvrNode> productTotalLvrNodeInjector;

    @Inject
    protected ProductsNodeChildProvider () {}

    protected MembersInjector<SettlementDateNode> getSettlementDateNodeInjector() {
        return this.settlementDateNodeInjector;
    }

    protected MembersInjector<ProductTotalSecurityAmountNode> getProductTotalSecurityAmountNodeInjector() {
        return this.productTotalSecurityAmountNodeInjector;
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

    protected MembersInjector<ProductCustomerContributionNode> getProductCustomerContributionNodeInjector() {
        return this.productCustomerContributionNodeInjector;
    }

    protected MembersInjector<ProductListNode> getProductListNodeInjector() {
        return this.productListNodeInjector;
    }

    protected MembersInjector<ProductTotalLoanLmiAmountNode> getProductTotalLoanLmiAmountNodeInjector() {
        return this.productTotalLoanLmiAmountNodeInjector;
    }

    protected MembersInjector<ProductFeesNode> getProductFeesNodeInjector() {
        return this.productFeesNodeInjector;
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

    protected ProductCustomerContributionNode newProductCustomerContributionNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductCustomerContributionNode(parent, name);
    }

    protected void configureProductCustomerContributionNode(ProductCustomerContributionNode node) {
    }

    protected ProductFeesNode newProductFeesNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductFeesNode(parent, name);
    }

    protected void configureProductFeesNode(ProductFeesNode node) {
    }

    protected ProductLoanTypeNode newProductLoanTypeNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductLoanTypeNode(parent, name);
    }

    protected void configureProductLoanTypeNode(ProductLoanTypeNode node) {
    }

    protected SettlementDateNode newSettlementDateNode(
        ProductsNode parent,
        String name
    ) {
        return new SettlementDateNode(parent, name);
    }

    protected void configureSettlementDateNode(SettlementDateNode node) {
    }

    protected ProductTotalLoanAmountNode newProductTotalLoanAmountNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductTotalLoanAmountNode(parent, name);
    }

    protected void configureProductTotalLoanAmountNode(ProductTotalLoanAmountNode node) {
    }

    protected ProductTotalSecurityAmountNode newProductTotalSecurityAmountNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductTotalSecurityAmountNode(parent, name);
    }

    protected void configureProductTotalSecurityAmountNode(ProductTotalSecurityAmountNode node) {
    }

    protected ProductTotalLoanLmiAmountNode newProductTotalLoanLmiAmountNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductTotalLoanLmiAmountNode(parent, name);
    }

    protected void configureProductTotalLoanLmiAmountNode(ProductTotalLoanLmiAmountNode node) {
    }

    protected ProductTotalLvrNode newProductTotalLvrNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductTotalLvrNode(parent, name);
    }

    protected void configureProductTotalLvrNode(ProductTotalLvrNode node) {
    }

    protected ProductTotalLvrLmiNode newProductTotalLvrLmiNode(
        ProductsNode parent,
        String name
    ) {
        return new ProductTotalLvrLmiNode(parent, name);
    }

    protected void configureProductTotalLvrLmiNode(ProductTotalLvrLmiNode node) {
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
        public ProductCustomerContributionNode createProductCustomerContributionNode() {
            ProductCustomerContributionNode node = newProductCustomerContributionNode(parent, "productCustomerContributionNode");
            productCustomerContributionNodeInjector.injectMembers(node);
            configureProductCustomerContributionNode(node);
            return node;
        }

        @Override
        public ProductFeesNode createProductFeesNode() {
            ProductFeesNode node = newProductFeesNode(parent, "productFeesNode");
            productFeesNodeInjector.injectMembers(node);
            configureProductFeesNode(node);
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
