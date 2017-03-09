package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


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

    @ProductGroupNodeScope
    public static class ProductGroupNodeRuleProvider implements RuleProvider<ProductGroupNode> {

        @Inject
        public ProductGroupNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductGroupNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductNameNode newProductNameNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductNameNode(parent, name);
    }

    protected void configureProductNameNode(ProductNameNode node) {
    }

    @ProductNameNodeScope
    public static class ProductNameNodeRuleProvider implements RuleProvider<ProductNameNode> {

        @Inject
        public ProductNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductLoanPrimaryPurposeNode newProductLoanPrimaryPurposeNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductLoanPrimaryPurposeNode(parent, name);
    }

    protected void configureProductLoanPrimaryPurposeNode(ProductLoanPrimaryPurposeNode node) {
    }

    @ProductLoanPrimaryPurposeNodeScope
    public static class ProductLoanPrimaryPurposeNodeRuleProvider implements RuleProvider<ProductLoanPrimaryPurposeNode> {

        @Inject
        public ProductLoanPrimaryPurposeNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductLoanPrimaryPurposeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductLendingPurposeNode newProductLendingPurposeNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductLendingPurposeNode(parent, name);
    }

    protected void configureProductLendingPurposeNode(ProductLendingPurposeNode node) {
    }

    @ProductLendingPurposeNodeScope
    public static class ProductLendingPurposeNodeRuleProvider implements RuleProvider<ProductLendingPurposeNode> {

        @Inject
        public ProductLendingPurposeNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductLendingPurposeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductRequestedAmountNode newProductRequestedAmountNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductRequestedAmountNode(parent, name);
    }

    protected void configureProductRequestedAmountNode(ProductRequestedAmountNode node) {
    }

    @ProductRequestedAmountNodeScope
    public static class ProductRequestedAmountNodeRuleProvider implements RuleProvider<ProductRequestedAmountNode> {

        @Inject
        public ProductRequestedAmountNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductRequestedAmountNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductTotalLoanTermNode newProductTotalLoanTermNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductTotalLoanTermNode(parent, name);
    }

    protected void configureProductTotalLoanTermNode(ProductTotalLoanTermNode node) {
    }

    @ProductTotalLoanTermNodeScope
    public static class ProductTotalLoanTermNodeRuleProvider implements RuleProvider<ProductTotalLoanTermNode> {

        @Inject
        public ProductTotalLoanTermNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductTotalLoanTermNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductPaymentTypeNode newProductPaymentTypeNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductPaymentTypeNode(parent, name);
    }

    protected void configureProductPaymentTypeNode(ProductPaymentTypeNode node) {
    }

    @ProductPaymentTypeNodeScope
    public static class ProductPaymentTypeNodeRuleProvider implements RuleProvider<ProductPaymentTypeNode> {

        @Inject
        public ProductPaymentTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductPaymentTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductInterestOnlyTermNode newProductInterestOnlyTermNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductInterestOnlyTermNode(parent, name);
    }

    protected void configureProductInterestOnlyTermNode(ProductInterestOnlyTermNode node) {
    }

    @ProductInterestOnlyTermNodeScope
    public static class ProductInterestOnlyTermNodeRuleProvider implements RuleProvider<ProductInterestOnlyTermNode> {

        @Inject
        public ProductInterestOnlyTermNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductInterestOnlyTermNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductFixedTermNode newProductFixedTermNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductFixedTermNode(parent, name);
    }

    protected void configureProductFixedTermNode(ProductFixedTermNode node) {
    }

    @ProductFixedTermNodeScope
    public static class ProductFixedTermNodeRuleProvider implements RuleProvider<ProductFixedTermNode> {

        @Inject
        public ProductFixedTermNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductFixedTermNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductConstructionApplicationFlagNode newProductConstructionApplicationFlagNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductConstructionApplicationFlagNode(parent, name);
    }

    protected void configureProductConstructionApplicationFlagNode(ProductConstructionApplicationFlagNode node) {
    }

    @ProductConstructionApplicationFlagNodeScope
    public static class ProductConstructionApplicationFlagNodeRuleProvider implements RuleProvider<ProductConstructionApplicationFlagNode> {

        @Inject
        public ProductConstructionApplicationFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductConstructionApplicationFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductCostRecuctionFlagNode newProductCostRecuctionFlagNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductCostRecuctionFlagNode(parent, name);
    }

    protected void configureProductCostRecuctionFlagNode(ProductCostRecuctionFlagNode node) {
    }

    @ProductCostRecuctionFlagNodeScope
    public static class ProductCostRecuctionFlagNodeRuleProvider implements RuleProvider<ProductCostRecuctionFlagNode> {

        @Inject
        public ProductCostRecuctionFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductCostRecuctionFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductConsolidationFlagNode newProductConsolidationFlagNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductConsolidationFlagNode(parent, name);
    }

    protected void configureProductConsolidationFlagNode(ProductConsolidationFlagNode node) {
    }

    @ProductConsolidationFlagNodeScope
    public static class ProductConsolidationFlagNodeRuleProvider implements RuleProvider<ProductConsolidationFlagNode> {

        @Inject
        public ProductConsolidationFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductConsolidationFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductDissatisfactionFlagNode newProductDissatisfactionFlagNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductDissatisfactionFlagNode(parent, name);
    }

    protected void configureProductDissatisfactionFlagNode(ProductDissatisfactionFlagNode node) {
    }

    @ProductDissatisfactionFlagNodeScope
    public static class ProductDissatisfactionFlagNodeRuleProvider implements RuleProvider<ProductDissatisfactionFlagNode> {

        @Inject
        public ProductDissatisfactionFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductDissatisfactionFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductSpecificFeaturesFlagNode newProductSpecificFeaturesFlagNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductSpecificFeaturesFlagNode(parent, name);
    }

    protected void configureProductSpecificFeaturesFlagNode(ProductSpecificFeaturesFlagNode node) {
    }

    @ProductSpecificFeaturesFlagNodeScope
    public static class ProductSpecificFeaturesFlagNodeRuleProvider implements RuleProvider<ProductSpecificFeaturesFlagNode> {

        @Inject
        public ProductSpecificFeaturesFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductSpecificFeaturesFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductAccountHolderListNode newProductAccountHolderListNode(
        ProductDescriptionNode parent,
        String name
    ) {
        return new ProductAccountHolderListNode(parent, name);
    }

    protected void configureProductAccountHolderListNode(ProductAccountHolderListNode node) {
    }

    @ProductAccountHolderListNodeScope
    public static class ProductAccountHolderListNodeRuleProvider implements RuleProvider<ProductAccountHolderListNode> {

        @Inject
        public ProductAccountHolderListNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductAccountHolderListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
