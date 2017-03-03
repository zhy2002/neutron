package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface ProductDescriptionNodeChildFactory {
    ProductGroupNode createProductGroupNode();
    ProductNameNode createProductNameNode();
    ProductLoanPrimaryPurposeNode createProductLoanPrimaryPurposeNode();
    ProductLendingPurposeNode createProductLendingPurposeNode();
    ProductRequestedAmountNode createProductRequestedAmountNode();
    ProductTotalLoanTermNode createProductTotalLoanTermNode();
    ProductPaymentTypeNode createProductPaymentTypeNode();
    ProductInterestOnlyTermNode createProductInterestOnlyTermNode();
    ProductFixedTermNode createProductFixedTermNode();
    ProductConstructionApplicationFlagNode createProductConstructionApplicationFlagNode();
    ProductCostRecuctionFlagNode createProductCostRecuctionFlagNode();
    ProductConsolidationFlagNode createProductConsolidationFlagNode();
    ProductDissatisfactionFlagNode createProductDissatisfactionFlagNode();
    ProductSpecificFeaturesFlagNode createProductSpecificFeaturesFlagNode();
    ProductAccountHolderListNode createProductAccountHolderListNode();
}

@Singleton
public class ProductDescriptionNodeChildProvider {
    @Inject
    MembersInjector<ProductRequestedAmountNode> productRequestedAmountNodeInjector;
    @Inject
    MembersInjector<ProductFixedTermNode> productFixedTermNodeInjector;
    @Inject
    MembersInjector<ProductGroupNode> productGroupNodeInjector;
    @Inject
    MembersInjector<ProductPaymentTypeNode> productPaymentTypeNodeInjector;
    @Inject
    MembersInjector<ProductLendingPurposeNode> productLendingPurposeNodeInjector;
    @Inject
    MembersInjector<ProductConsolidationFlagNode> productConsolidationFlagNodeInjector;
    @Inject
    MembersInjector<ProductCostRecuctionFlagNode> productCostRecuctionFlagNodeInjector;
    @Inject
    MembersInjector<ProductAccountHolderListNode> productAccountHolderListNodeInjector;
    @Inject
    MembersInjector<ProductLoanPrimaryPurposeNode> productLoanPrimaryPurposeNodeInjector;
    @Inject
    MembersInjector<ProductTotalLoanTermNode> productTotalLoanTermNodeInjector;
    @Inject
    MembersInjector<ProductDissatisfactionFlagNode> productDissatisfactionFlagNodeInjector;
    @Inject
    MembersInjector<ProductNameNode> productNameNodeInjector;
    @Inject
    MembersInjector<ProductSpecificFeaturesFlagNode> productSpecificFeaturesFlagNodeInjector;
    @Inject
    MembersInjector<ProductConstructionApplicationFlagNode> productConstructionApplicationFlagNodeInjector;
    @Inject
    MembersInjector<ProductInterestOnlyTermNode> productInterestOnlyTermNodeInjector;

    @Inject
    protected ProductDescriptionNodeChildProvider () {}

    protected MembersInjector<ProductRequestedAmountNode> getProductRequestedAmountNodeInjector() {
        return this.productRequestedAmountNodeInjector;
    }

    protected MembersInjector<ProductFixedTermNode> getProductFixedTermNodeInjector() {
        return this.productFixedTermNodeInjector;
    }

    protected MembersInjector<ProductGroupNode> getProductGroupNodeInjector() {
        return this.productGroupNodeInjector;
    }

    protected MembersInjector<ProductPaymentTypeNode> getProductPaymentTypeNodeInjector() {
        return this.productPaymentTypeNodeInjector;
    }

    protected MembersInjector<ProductLendingPurposeNode> getProductLendingPurposeNodeInjector() {
        return this.productLendingPurposeNodeInjector;
    }

    protected MembersInjector<ProductConsolidationFlagNode> getProductConsolidationFlagNodeInjector() {
        return this.productConsolidationFlagNodeInjector;
    }

    protected MembersInjector<ProductCostRecuctionFlagNode> getProductCostRecuctionFlagNodeInjector() {
        return this.productCostRecuctionFlagNodeInjector;
    }

    protected MembersInjector<ProductAccountHolderListNode> getProductAccountHolderListNodeInjector() {
        return this.productAccountHolderListNodeInjector;
    }

    protected MembersInjector<ProductLoanPrimaryPurposeNode> getProductLoanPrimaryPurposeNodeInjector() {
        return this.productLoanPrimaryPurposeNodeInjector;
    }

    protected MembersInjector<ProductTotalLoanTermNode> getProductTotalLoanTermNodeInjector() {
        return this.productTotalLoanTermNodeInjector;
    }

    protected MembersInjector<ProductDissatisfactionFlagNode> getProductDissatisfactionFlagNodeInjector() {
        return this.productDissatisfactionFlagNodeInjector;
    }

    protected MembersInjector<ProductNameNode> getProductNameNodeInjector() {
        return this.productNameNodeInjector;
    }

    protected MembersInjector<ProductSpecificFeaturesFlagNode> getProductSpecificFeaturesFlagNodeInjector() {
        return this.productSpecificFeaturesFlagNodeInjector;
    }

    protected MembersInjector<ProductConstructionApplicationFlagNode> getProductConstructionApplicationFlagNodeInjector() {
        return this.productConstructionApplicationFlagNodeInjector;
    }

    protected MembersInjector<ProductInterestOnlyTermNode> getProductInterestOnlyTermNodeInjector() {
        return this.productInterestOnlyTermNodeInjector;
    }

    protected ProductGroupNode newProductGroupNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductGroupNode(parent, name);
    }

    protected void configureProductGroupNode(ProductGroupNode node) {
    }

    protected ProductNameNode newProductNameNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductNameNode(parent, name);
    }

    protected void configureProductNameNode(ProductNameNode node) {
    }

    protected ProductLoanPrimaryPurposeNode newProductLoanPrimaryPurposeNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductLoanPrimaryPurposeNode(parent, name);
    }

    protected void configureProductLoanPrimaryPurposeNode(ProductLoanPrimaryPurposeNode node) {
    }

    protected ProductLendingPurposeNode newProductLendingPurposeNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductLendingPurposeNode(parent, name);
    }

    protected void configureProductLendingPurposeNode(ProductLendingPurposeNode node) {
    }

    protected ProductRequestedAmountNode newProductRequestedAmountNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductRequestedAmountNode(parent, name);
    }

    protected void configureProductRequestedAmountNode(ProductRequestedAmountNode node) {
    }

    protected ProductTotalLoanTermNode newProductTotalLoanTermNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductTotalLoanTermNode(parent, name);
    }

    protected void configureProductTotalLoanTermNode(ProductTotalLoanTermNode node) {
    }

    protected ProductPaymentTypeNode newProductPaymentTypeNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductPaymentTypeNode(parent, name);
    }

    protected void configureProductPaymentTypeNode(ProductPaymentTypeNode node) {
    }

    protected ProductInterestOnlyTermNode newProductInterestOnlyTermNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductInterestOnlyTermNode(parent, name);
    }

    protected void configureProductInterestOnlyTermNode(ProductInterestOnlyTermNode node) {
    }

    protected ProductFixedTermNode newProductFixedTermNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductFixedTermNode(parent, name);
    }

    protected void configureProductFixedTermNode(ProductFixedTermNode node) {
    }

    protected ProductConstructionApplicationFlagNode newProductConstructionApplicationFlagNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductConstructionApplicationFlagNode(parent, name);
    }

    protected void configureProductConstructionApplicationFlagNode(ProductConstructionApplicationFlagNode node) {
    }

    protected ProductCostRecuctionFlagNode newProductCostRecuctionFlagNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductCostRecuctionFlagNode(parent, name);
    }

    protected void configureProductCostRecuctionFlagNode(ProductCostRecuctionFlagNode node) {
    }

    protected ProductConsolidationFlagNode newProductConsolidationFlagNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductConsolidationFlagNode(parent, name);
    }

    protected void configureProductConsolidationFlagNode(ProductConsolidationFlagNode node) {
    }

    protected ProductDissatisfactionFlagNode newProductDissatisfactionFlagNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductDissatisfactionFlagNode(parent, name);
    }

    protected void configureProductDissatisfactionFlagNode(ProductDissatisfactionFlagNode node) {
    }

    protected ProductSpecificFeaturesFlagNode newProductSpecificFeaturesFlagNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductSpecificFeaturesFlagNode(parent, name);
    }

    protected void configureProductSpecificFeaturesFlagNode(ProductSpecificFeaturesFlagNode node) {
    }

    protected ProductAccountHolderListNode newProductAccountHolderListNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductAccountHolderListNode(parent, name);
    }

    protected void configureProductAccountHolderListNode(ProductAccountHolderListNode node) {
    }

    ProductDescriptionNodeChildFactory createFactory(ProductDescriptionNode parent) {
        return new ProductDescriptionNodeChildFactoryImpl(parent);
    }

    private class ProductDescriptionNodeChildFactoryImpl implements ProductDescriptionNodeChildFactory {

        private final ProductDescriptionNode parent;
        
        private ProductDescriptionNodeChildFactoryImpl(ProductDescriptionNode parent) {
            this.parent = parent;
        }

        @Override
        public ProductGroupNode createProductGroupNode() {
            ProductGroupNode node = newProductGroupNode(parent, "productGroupNode");
            productGroupNodeInjector.injectMembers(node);
            configureProductGroupNode(node);
            return node;
        }

        @Override
        public ProductNameNode createProductNameNode() {
            ProductNameNode node = newProductNameNode(parent, "productNameNode");
            productNameNodeInjector.injectMembers(node);
            configureProductNameNode(node);
            return node;
        }

        @Override
        public ProductLoanPrimaryPurposeNode createProductLoanPrimaryPurposeNode() {
            ProductLoanPrimaryPurposeNode node = newProductLoanPrimaryPurposeNode(parent, "productLoanPrimaryPurposeNode");
            productLoanPrimaryPurposeNodeInjector.injectMembers(node);
            configureProductLoanPrimaryPurposeNode(node);
            return node;
        }

        @Override
        public ProductLendingPurposeNode createProductLendingPurposeNode() {
            ProductLendingPurposeNode node = newProductLendingPurposeNode(parent, "productLendingPurposeNode");
            productLendingPurposeNodeInjector.injectMembers(node);
            configureProductLendingPurposeNode(node);
            return node;
        }

        @Override
        public ProductRequestedAmountNode createProductRequestedAmountNode() {
            ProductRequestedAmountNode node = newProductRequestedAmountNode(parent, "productRequestedAmountNode");
            productRequestedAmountNodeInjector.injectMembers(node);
            configureProductRequestedAmountNode(node);
            return node;
        }

        @Override
        public ProductTotalLoanTermNode createProductTotalLoanTermNode() {
            ProductTotalLoanTermNode node = newProductTotalLoanTermNode(parent, "productTotalLoanTermNode");
            productTotalLoanTermNodeInjector.injectMembers(node);
            configureProductTotalLoanTermNode(node);
            return node;
        }

        @Override
        public ProductPaymentTypeNode createProductPaymentTypeNode() {
            ProductPaymentTypeNode node = newProductPaymentTypeNode(parent, "productPaymentTypeNode");
            productPaymentTypeNodeInjector.injectMembers(node);
            configureProductPaymentTypeNode(node);
            return node;
        }

        @Override
        public ProductInterestOnlyTermNode createProductInterestOnlyTermNode() {
            ProductInterestOnlyTermNode node = newProductInterestOnlyTermNode(parent, "productInterestOnlyTermNode");
            productInterestOnlyTermNodeInjector.injectMembers(node);
            configureProductInterestOnlyTermNode(node);
            return node;
        }

        @Override
        public ProductFixedTermNode createProductFixedTermNode() {
            ProductFixedTermNode node = newProductFixedTermNode(parent, "productFixedTermNode");
            productFixedTermNodeInjector.injectMembers(node);
            configureProductFixedTermNode(node);
            return node;
        }

        @Override
        public ProductConstructionApplicationFlagNode createProductConstructionApplicationFlagNode() {
            ProductConstructionApplicationFlagNode node = newProductConstructionApplicationFlagNode(parent, "productConstructionApplicationFlagNode");
            productConstructionApplicationFlagNodeInjector.injectMembers(node);
            configureProductConstructionApplicationFlagNode(node);
            return node;
        }

        @Override
        public ProductCostRecuctionFlagNode createProductCostRecuctionFlagNode() {
            ProductCostRecuctionFlagNode node = newProductCostRecuctionFlagNode(parent, "productCostRecuctionFlagNode");
            productCostRecuctionFlagNodeInjector.injectMembers(node);
            configureProductCostRecuctionFlagNode(node);
            return node;
        }

        @Override
        public ProductConsolidationFlagNode createProductConsolidationFlagNode() {
            ProductConsolidationFlagNode node = newProductConsolidationFlagNode(parent, "productConsolidationFlagNode");
            productConsolidationFlagNodeInjector.injectMembers(node);
            configureProductConsolidationFlagNode(node);
            return node;
        }

        @Override
        public ProductDissatisfactionFlagNode createProductDissatisfactionFlagNode() {
            ProductDissatisfactionFlagNode node = newProductDissatisfactionFlagNode(parent, "productDissatisfactionFlagNode");
            productDissatisfactionFlagNodeInjector.injectMembers(node);
            configureProductDissatisfactionFlagNode(node);
            return node;
        }

        @Override
        public ProductSpecificFeaturesFlagNode createProductSpecificFeaturesFlagNode() {
            ProductSpecificFeaturesFlagNode node = newProductSpecificFeaturesFlagNode(parent, "productSpecificFeaturesFlagNode");
            productSpecificFeaturesFlagNodeInjector.injectMembers(node);
            configureProductSpecificFeaturesFlagNode(node);
            return node;
        }

        @Override
        public ProductAccountHolderListNode createProductAccountHolderListNode() {
            ProductAccountHolderListNode node = newProductAccountHolderListNode(parent, "productAccountHolderListNode");
            productAccountHolderListNodeInjector.injectMembers(node);
            configureProductAccountHolderListNode(node);
            return node;
        }

    }
}
