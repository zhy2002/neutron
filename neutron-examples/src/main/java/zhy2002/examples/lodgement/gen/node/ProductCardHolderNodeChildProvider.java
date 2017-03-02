package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


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

    protected ProductRewardsProgramNode newProductRewardsProgramNode(
        ProductCardHolderNode parent,
        String name
    ) {
        return new ProductRewardsProgramNode(parent, name);
    }

    protected void configureProductRewardsProgramNode(ProductRewardsProgramNode node) {
    }

    protected ProductRewardsMembershipNode newProductRewardsMembershipNode(
        ProductCardHolderNode parent,
        String name
    ) {
        return new ProductRewardsMembershipNode(parent, name);
    }

    protected void configureProductRewardsMembershipNode(ProductRewardsMembershipNode node) {
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
