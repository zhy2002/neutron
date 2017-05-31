package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


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

    @ComponentScope
    public static class ProductPackageNameNodeRuleProvider implements RuleProvider<ProductPackageNameNode> {

        @Inject
        public ProductPackageNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductPackageNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductRepaymentFrequencyNode newProductRepaymentFrequencyNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductRepaymentFrequencyNode(parent, name);
    }

    protected void configureProductRepaymentFrequencyNode(ProductRepaymentFrequencyNode node) {
    }

    @ComponentScope
    public static class ProductRepaymentFrequencyNodeRuleProvider implements RuleProvider<ProductRepaymentFrequencyNode> {

        @Inject
        public ProductRepaymentFrequencyNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductRepaymentFrequencyNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductRateLockFlagNode newProductRateLockFlagNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductRateLockFlagNode(parent, name);
    }

    protected void configureProductRateLockFlagNode(ProductRateLockFlagNode node) {
    }

    @ComponentScope
    public static class ProductRateLockFlagNodeRuleProvider implements RuleProvider<ProductRateLockFlagNode> {

        @Inject
        public ProductRateLockFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductRateLockFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductTransactionAccountFlagNode newProductTransactionAccountFlagNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductTransactionAccountFlagNode(parent, name);
    }

    protected void configureProductTransactionAccountFlagNode(ProductTransactionAccountFlagNode node) {
    }

    @ComponentScope
    public static class ProductTransactionAccountFlagNodeRuleProvider implements RuleProvider<ProductTransactionAccountFlagNode> {

        @Inject
        public ProductTransactionAccountFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductTransactionAccountFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductOptOutReasonNode newProductOptOutReasonNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductOptOutReasonNode(parent, name);
    }

    protected void configureProductOptOutReasonNode(ProductOptOutReasonNode node) {
    }

    @ComponentScope
    public static class ProductOptOutReasonNodeRuleProvider implements RuleProvider<ProductOptOutReasonNode> {

        @Inject
        public ProductOptOutReasonNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductOptOutReasonNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductCreditCardFlagNode newProductCreditCardFlagNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductCreditCardFlagNode(parent, name);
    }

    protected void configureProductCreditCardFlagNode(ProductCreditCardFlagNode node) {
    }

    @ComponentScope
    public static class ProductCreditCardFlagNodeRuleProvider implements RuleProvider<ProductCreditCardFlagNode> {

        @Inject
        public ProductCreditCardFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductCreditCardFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductCreditCardTypeNode newProductCreditCardTypeNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductCreditCardTypeNode(parent, name);
    }

    protected void configureProductCreditCardTypeNode(ProductCreditCardTypeNode node) {
    }

    @ComponentScope
    public static class ProductCreditCardTypeNodeRuleProvider implements RuleProvider<ProductCreditCardTypeNode> {

        @Inject
        public ProductCreditCardTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductCreditCardTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductCreditCardLimitNode newProductCreditCardLimitNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductCreditCardLimitNode(parent, name);
    }

    protected void configureProductCreditCardLimitNode(ProductCreditCardLimitNode node) {
    }

    @ComponentScope
    public static class ProductCreditCardLimitNodeRuleProvider implements RuleProvider<ProductCreditCardLimitNode> {

        @Inject
        public ProductCreditCardLimitNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductCreditCardLimitNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductExpressConsentFlagNode newProductExpressConsentFlagNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductExpressConsentFlagNode(parent, name);
    }

    protected void configureProductExpressConsentFlagNode(ProductExpressConsentFlagNode node) {
    }

    @ComponentScope
    public static class ProductExpressConsentFlagNodeRuleProvider implements RuleProvider<ProductExpressConsentFlagNode> {

        @Inject
        public ProductExpressConsentFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductExpressConsentFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected Product100PercentOffsetFlagNode newProduct100PercentOffsetFlagNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new Product100PercentOffsetFlagNode(parent, name);
    }

    protected void configureProduct100PercentOffsetFlagNode(Product100PercentOffsetFlagNode node) {
    }

    @ComponentScope
    public static class Product100PercentOffsetFlagNodeRuleProvider implements RuleProvider<Product100PercentOffsetFlagNode> {

        @Inject
        public Product100PercentOffsetFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(Product100PercentOffsetFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductCardHolderNode newProductPrimaryCardHolderNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductCardHolderNode(parent, name);
    }

    protected void configureProductPrimaryCardHolderNode(ProductCardHolderNode node) {
    }

    @ComponentScope
    public static class ProductPrimaryCardHolderNodeRuleProvider implements RuleProvider<ProductCardHolderNode> {

        @Inject
        public ProductPrimaryCardHolderNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductCardHolderNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductCardHolderNode newProductAdditionalCardHolderNode(
        ProductFeaturesNode parent,
        String name
    ) {
        return new ProductCardHolderNode(parent, name);
    }

    protected void configureProductAdditionalCardHolderNode(ProductCardHolderNode node) {
    }

    @ComponentScope
    public static class ProductAdditionalCardHolderNodeRuleProvider implements RuleProvider<ProductCardHolderNode> {

        @Inject
        public ProductAdditionalCardHolderNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductCardHolderNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
