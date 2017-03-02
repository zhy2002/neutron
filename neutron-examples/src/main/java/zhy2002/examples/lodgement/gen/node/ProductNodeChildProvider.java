package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface ProductNodeChildFactory {
    ProductDescriptionNode createProductDescriptionNode();
    ProductFeaturesNode createProductFeaturesNode();
}

@Singleton
public class ProductNodeChildProvider {
    @Inject
    MembersInjector<ProductDescriptionNode> productDescriptionNodeInjector;
    @Inject
    MembersInjector<ProductFeaturesNode> productFeaturesNodeInjector;

    @Inject
    protected ProductNodeChildProvider () {}

    protected MembersInjector<ProductDescriptionNode> getProductDescriptionNodeInjector() {
        return this.productDescriptionNodeInjector;
    }

    protected MembersInjector<ProductFeaturesNode> getProductFeaturesNodeInjector() {
        return this.productFeaturesNodeInjector;
    }

    protected ProductDescriptionNode newProductDescriptionNode(
        ProductNode parent,
        String name
    ) {
        return new ProductDescriptionNode(parent, name);
    }

    protected void configureProductDescriptionNode(ProductDescriptionNode node) {
    }

    protected ProductFeaturesNode newProductFeaturesNode(
        ProductNode parent,
        String name
    ) {
        return new ProductFeaturesNode(parent, name);
    }

    protected void configureProductFeaturesNode(ProductFeaturesNode node) {
    }

    ProductNodeChildFactory createFactory(ProductNode parent) {
        return new ProductNodeChildFactoryImpl(parent);
    }

    private class ProductNodeChildFactoryImpl implements ProductNodeChildFactory {

        private final ProductNode parent;
        
        private ProductNodeChildFactoryImpl(ProductNode parent) {
            this.parent = parent;
        }

        @Override
        public ProductDescriptionNode createProductDescriptionNode() {
            ProductDescriptionNode node = newProductDescriptionNode(parent, "productDescriptionNode");
            productDescriptionNodeInjector.injectMembers(node);
            configureProductDescriptionNode(node);
            return node;
        }

        @Override
        public ProductFeaturesNode createProductFeaturesNode() {
            ProductFeaturesNode node = newProductFeaturesNode(parent, "productFeaturesNode");
            productFeaturesNodeInjector.injectMembers(node);
            configureProductFeaturesNode(node);
            return node;
        }

    }
}