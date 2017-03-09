package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface ProductCardHolderNodeChildFactory {
    ProductCardHodlerNameNode createProductCardHodlerNameNode();
    ProductRewardsProgramNode createProductRewardsProgramNode();
    ProductRewardsMembershipNode createProductRewardsMembershipNode();
}

@Singleton
public class ProductCardHolderNodeChildProvider {
    @Inject
    MembersInjector<ProductRewardsMembershipNode> productRewardsMembershipNodeInjector;
    @Inject
    MembersInjector<ProductCardHodlerNameNode> productCardHodlerNameNodeInjector;
    @Inject
    MembersInjector<ProductRewardsProgramNode> productRewardsProgramNodeInjector;

    @Inject
    protected ProductCardHolderNodeChildProvider () {}

    protected MembersInjector<ProductRewardsMembershipNode> getProductRewardsMembershipNodeInjector() {
        return this.productRewardsMembershipNodeInjector;
    }

    protected MembersInjector<ProductCardHodlerNameNode> getProductCardHodlerNameNodeInjector() {
        return this.productCardHodlerNameNodeInjector;
    }

    protected MembersInjector<ProductRewardsProgramNode> getProductRewardsProgramNodeInjector() {
        return this.productRewardsProgramNodeInjector;
    }

    protected ProductCardHodlerNameNode newProductCardHodlerNameNode(
        ProductCardHolderNode parent,
        String name
    ) {
        return new ProductCardHodlerNameNode(parent, name);
    }

    protected void configureProductCardHodlerNameNode(ProductCardHodlerNameNode node) {
    }

    @ProductCardHodlerNameNodeScope
    public static class ProductCardHodlerNameNodeRuleProvider implements RuleProvider<ProductCardHodlerNameNode> {

        @Inject
        public ProductCardHodlerNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductCardHodlerNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductRewardsProgramNode newProductRewardsProgramNode(
        ProductCardHolderNode parent,
        String name
    ) {
        return new ProductRewardsProgramNode(parent, name);
    }

    protected void configureProductRewardsProgramNode(ProductRewardsProgramNode node) {
    }

    @ProductRewardsProgramNodeScope
    public static class ProductRewardsProgramNodeRuleProvider implements RuleProvider<ProductRewardsProgramNode> {

        @Inject
        public ProductRewardsProgramNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductRewardsProgramNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ProductRewardsMembershipNode newProductRewardsMembershipNode(
        ProductCardHolderNode parent,
        String name
    ) {
        return new ProductRewardsMembershipNode(parent, name);
    }

    protected void configureProductRewardsMembershipNode(ProductRewardsMembershipNode node) {
    }

    @ProductRewardsMembershipNodeScope
    public static class ProductRewardsMembershipNodeRuleProvider implements RuleProvider<ProductRewardsMembershipNode> {

        @Inject
        public ProductRewardsMembershipNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProductRewardsMembershipNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    ProductCardHolderNodeChildFactory createFactory(ProductCardHolderNode parent) {
        return new ProductCardHolderNodeChildFactoryImpl(parent);
    }

    private class ProductCardHolderNodeChildFactoryImpl implements ProductCardHolderNodeChildFactory {

        private final ProductCardHolderNode parent;
        
        private ProductCardHolderNodeChildFactoryImpl(ProductCardHolderNode parent) {
            this.parent = parent;
        }

        @Override
        public ProductCardHodlerNameNode createProductCardHodlerNameNode() {
            ProductCardHodlerNameNode node = newProductCardHodlerNameNode(parent, "productCardHodlerNameNode");
            productCardHodlerNameNodeInjector.injectMembers(node);
            configureProductCardHodlerNameNode(node);
            return node;
        }

        @Override
        public ProductRewardsProgramNode createProductRewardsProgramNode() {
            ProductRewardsProgramNode node = newProductRewardsProgramNode(parent, "productRewardsProgramNode");
            productRewardsProgramNodeInjector.injectMembers(node);
            configureProductRewardsProgramNode(node);
            return node;
        }

        @Override
        public ProductRewardsMembershipNode createProductRewardsMembershipNode() {
            ProductRewardsMembershipNode node = newProductRewardsMembershipNode(parent, "productRewardsMembershipNode");
            productRewardsMembershipNodeInjector.injectMembers(node);
            configureProductRewardsMembershipNode(node);
            return node;
        }

    }
}
