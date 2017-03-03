package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface ProductFeaturesNodeChildFactory {
    ProductPackageNameNode createProductPackageNameNode();
    ProductRepaymentFrequencyNode createProductRepaymentFrequencyNode();
    ProductRateLockFlagNode createProductRateLockFlagNode();
    ProductTransactionAccountFlagNode createProductTransactionAccountFlagNode();
    ProductOptOutReasonNode createProductOptOutReasonNode();
    ProductCreditCardFlagNode createProductCreditCardFlagNode();
    ProductCreditCardTypeNode createProductCreditCardTypeNode();
    ProductCreditCardLimitNode createProductCreditCardLimitNode();
    ProductExpressConsentFlagNode createProductExpressConsentFlagNode();
    Product100PercentOffsetFlagNode createProduct100PercentOffsetFlagNode();
    ProductCardHolderNode createProductPrimaryCardHolderNode();
    ProductCardHolderNode createProductAdditionalCardHolderNode();
}

@Singleton
public class ProductFeaturesNodeChildProvider {
    @Inject
    MembersInjector<ProductCardHolderNode> productCardHolderNodeInjector;
    @Inject
    MembersInjector<ProductCreditCardFlagNode> productCreditCardFlagNodeInjector;
    @Inject
    MembersInjector<ProductExpressConsentFlagNode> productExpressConsentFlagNodeInjector;
    @Inject
    MembersInjector<Product100PercentOffsetFlagNode> product100PercentOffsetFlagNodeInjector;
    @Inject
    MembersInjector<ProductCreditCardTypeNode> productCreditCardTypeNodeInjector;
    @Inject
    MembersInjector<ProductRepaymentFrequencyNode> productRepaymentFrequencyNodeInjector;
    @Inject
    MembersInjector<ProductPackageNameNode> productPackageNameNodeInjector;
    @Inject
    MembersInjector<ProductTransactionAccountFlagNode> productTransactionAccountFlagNodeInjector;
    @Inject
    MembersInjector<ProductOptOutReasonNode> productOptOutReasonNodeInjector;
    @Inject
    MembersInjector<ProductCreditCardLimitNode> productCreditCardLimitNodeInjector;
    @Inject
    MembersInjector<ProductRateLockFlagNode> productRateLockFlagNodeInjector;

    @Inject
    protected ProductFeaturesNodeChildProvider () {}

    protected MembersInjector<ProductCardHolderNode> getProductCardHolderNodeInjector() {
        return this.productCardHolderNodeInjector;
    }

    protected MembersInjector<ProductCreditCardFlagNode> getProductCreditCardFlagNodeInjector() {
        return this.productCreditCardFlagNodeInjector;
    }

    protected MembersInjector<ProductExpressConsentFlagNode> getProductExpressConsentFlagNodeInjector() {
        return this.productExpressConsentFlagNodeInjector;
    }

    protected MembersInjector<Product100PercentOffsetFlagNode> getProduct100PercentOffsetFlagNodeInjector() {
        return this.product100PercentOffsetFlagNodeInjector;
    }

    protected MembersInjector<ProductCreditCardTypeNode> getProductCreditCardTypeNodeInjector() {
        return this.productCreditCardTypeNodeInjector;
    }

    protected MembersInjector<ProductRepaymentFrequencyNode> getProductRepaymentFrequencyNodeInjector() {
        return this.productRepaymentFrequencyNodeInjector;
    }

    protected MembersInjector<ProductPackageNameNode> getProductPackageNameNodeInjector() {
        return this.productPackageNameNodeInjector;
    }

    protected MembersInjector<ProductTransactionAccountFlagNode> getProductTransactionAccountFlagNodeInjector() {
        return this.productTransactionAccountFlagNodeInjector;
    }

    protected MembersInjector<ProductOptOutReasonNode> getProductOptOutReasonNodeInjector() {
        return this.productOptOutReasonNodeInjector;
    }

    protected MembersInjector<ProductCreditCardLimitNode> getProductCreditCardLimitNodeInjector() {
        return this.productCreditCardLimitNodeInjector;
    }

    protected MembersInjector<ProductRateLockFlagNode> getProductRateLockFlagNodeInjector() {
        return this.productRateLockFlagNodeInjector;
    }

    protected ProductPackageNameNode newProductPackageNameNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductPackageNameNode(parent, name);
    }

    protected void configureProductPackageNameNode(ProductPackageNameNode node) {
    }

    protected ProductRepaymentFrequencyNode newProductRepaymentFrequencyNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductRepaymentFrequencyNode(parent, name);
    }

    protected void configureProductRepaymentFrequencyNode(ProductRepaymentFrequencyNode node) {
    }

    protected ProductRateLockFlagNode newProductRateLockFlagNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductRateLockFlagNode(parent, name);
    }

    protected void configureProductRateLockFlagNode(ProductRateLockFlagNode node) {
    }

    protected ProductTransactionAccountFlagNode newProductTransactionAccountFlagNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductTransactionAccountFlagNode(parent, name);
    }

    protected void configureProductTransactionAccountFlagNode(ProductTransactionAccountFlagNode node) {
    }

    protected ProductOptOutReasonNode newProductOptOutReasonNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductOptOutReasonNode(parent, name);
    }

    protected void configureProductOptOutReasonNode(ProductOptOutReasonNode node) {
    }

    protected ProductCreditCardFlagNode newProductCreditCardFlagNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductCreditCardFlagNode(parent, name);
    }

    protected void configureProductCreditCardFlagNode(ProductCreditCardFlagNode node) {
    }

    protected ProductCreditCardTypeNode newProductCreditCardTypeNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductCreditCardTypeNode(parent, name);
    }

    protected void configureProductCreditCardTypeNode(ProductCreditCardTypeNode node) {
    }

    protected ProductCreditCardLimitNode newProductCreditCardLimitNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductCreditCardLimitNode(parent, name);
    }

    protected void configureProductCreditCardLimitNode(ProductCreditCardLimitNode node) {
    }

    protected ProductExpressConsentFlagNode newProductExpressConsentFlagNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductExpressConsentFlagNode(parent, name);
    }

    protected void configureProductExpressConsentFlagNode(ProductExpressConsentFlagNode node) {
    }

    protected Product100PercentOffsetFlagNode newProduct100PercentOffsetFlagNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new Product100PercentOffsetFlagNode(parent, name);
    }

    protected void configureProduct100PercentOffsetFlagNode(Product100PercentOffsetFlagNode node) {
    }

    protected ProductCardHolderNode newProductPrimaryCardHolderNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductCardHolderNode(parent, name);
    }

    protected void configureProductPrimaryCardHolderNode(ProductCardHolderNode node) {
    }

    protected ProductCardHolderNode newProductAdditionalCardHolderNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductCardHolderNode(parent, name);
    }

    protected void configureProductAdditionalCardHolderNode(ProductCardHolderNode node) {
    }

    ProductFeaturesNodeChildFactory createFactory(ProductFeaturesNode parent) {
        return new ProductFeaturesNodeChildFactoryImpl(parent);
    }

    private class ProductFeaturesNodeChildFactoryImpl implements ProductFeaturesNodeChildFactory {

        private final ProductFeaturesNode parent;
        
        private ProductFeaturesNodeChildFactoryImpl(ProductFeaturesNode parent) {
            this.parent = parent;
        }

        @Override
        public ProductPackageNameNode createProductPackageNameNode() {
            ProductPackageNameNode node = newProductPackageNameNode(parent, "productPackageNameNode");
            productPackageNameNodeInjector.injectMembers(node);
            configureProductPackageNameNode(node);
            return node;
        }

        @Override
        public ProductRepaymentFrequencyNode createProductRepaymentFrequencyNode() {
            ProductRepaymentFrequencyNode node = newProductRepaymentFrequencyNode(parent, "productRepaymentFrequencyNode");
            productRepaymentFrequencyNodeInjector.injectMembers(node);
            configureProductRepaymentFrequencyNode(node);
            return node;
        }

        @Override
        public ProductRateLockFlagNode createProductRateLockFlagNode() {
            ProductRateLockFlagNode node = newProductRateLockFlagNode(parent, "productRateLockFlagNode");
            productRateLockFlagNodeInjector.injectMembers(node);
            configureProductRateLockFlagNode(node);
            return node;
        }

        @Override
        public ProductTransactionAccountFlagNode createProductTransactionAccountFlagNode() {
            ProductTransactionAccountFlagNode node = newProductTransactionAccountFlagNode(parent, "productTransactionAccountFlagNode");
            productTransactionAccountFlagNodeInjector.injectMembers(node);
            configureProductTransactionAccountFlagNode(node);
            return node;
        }

        @Override
        public ProductOptOutReasonNode createProductOptOutReasonNode() {
            ProductOptOutReasonNode node = newProductOptOutReasonNode(parent, "productOptOutReasonNode");
            productOptOutReasonNodeInjector.injectMembers(node);
            configureProductOptOutReasonNode(node);
            return node;
        }

        @Override
        public ProductCreditCardFlagNode createProductCreditCardFlagNode() {
            ProductCreditCardFlagNode node = newProductCreditCardFlagNode(parent, "productCreditCardFlagNode");
            productCreditCardFlagNodeInjector.injectMembers(node);
            configureProductCreditCardFlagNode(node);
            return node;
        }

        @Override
        public ProductCreditCardTypeNode createProductCreditCardTypeNode() {
            ProductCreditCardTypeNode node = newProductCreditCardTypeNode(parent, "productCreditCardTypeNode");
            productCreditCardTypeNodeInjector.injectMembers(node);
            configureProductCreditCardTypeNode(node);
            return node;
        }

        @Override
        public ProductCreditCardLimitNode createProductCreditCardLimitNode() {
            ProductCreditCardLimitNode node = newProductCreditCardLimitNode(parent, "productCreditCardLimitNode");
            productCreditCardLimitNodeInjector.injectMembers(node);
            configureProductCreditCardLimitNode(node);
            return node;
        }

        @Override
        public ProductExpressConsentFlagNode createProductExpressConsentFlagNode() {
            ProductExpressConsentFlagNode node = newProductExpressConsentFlagNode(parent, "productExpressConsentFlagNode");
            productExpressConsentFlagNodeInjector.injectMembers(node);
            configureProductExpressConsentFlagNode(node);
            return node;
        }

        @Override
        public Product100PercentOffsetFlagNode createProduct100PercentOffsetFlagNode() {
            Product100PercentOffsetFlagNode node = newProduct100PercentOffsetFlagNode(parent, "product100PercentOffsetFlagNode");
            product100PercentOffsetFlagNodeInjector.injectMembers(node);
            configureProduct100PercentOffsetFlagNode(node);
            return node;
        }

        @Override
        public ProductCardHolderNode createProductPrimaryCardHolderNode() {
            ProductCardHolderNode node = newProductPrimaryCardHolderNode(parent, "productPrimaryCardHolderNode");
            productCardHolderNodeInjector.injectMembers(node);
            configureProductPrimaryCardHolderNode(node);
            return node;
        }

        @Override
        public ProductCardHolderNode createProductAdditionalCardHolderNode() {
            ProductCardHolderNode node = newProductAdditionalCardHolderNode(parent, "productAdditionalCardHolderNode");
            productCardHolderNodeInjector.injectMembers(node);
            configureProductAdditionalCardHolderNode(node);
            return node;
        }

    }
}
