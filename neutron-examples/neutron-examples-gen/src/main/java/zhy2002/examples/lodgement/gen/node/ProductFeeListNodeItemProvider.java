package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface ProductFeeListNodeItemFactory {
    NodeAddEvent<ProductFeeNode> createItemAddEvent(String name);
    NodeRemoveEvent<ProductFeeNode> createItemRemoveEvent(ProductFeeNode item);
}

@Singleton
public class ProductFeeListNodeItemProvider {
    @Inject
    MembersInjector<ProductFeeNode> productFeeNodeInjector;

    @Inject
    protected ProductFeeListNodeItemProvider () {}

    protected MembersInjector<ProductFeeNode> getProductFeeNodeInjector() {
        return this.productFeeNodeInjector;
    }

    protected ProductFeeNode newProductFeeNode (
        ProductFeeListNode parent,
        String name
    ) {
        return new ProductFeeNode(parent, name);
    }

    protected void configureProductFeeNode(ProductFeeNode node) {
    }

    protected NodeAddEvent<ProductFeeNode> newItemAddEvent(ProductFeeNode item) {
        return new ProductFeeNodeAddEvent(item);
    }

    protected NodeRemoveEvent<ProductFeeNode> newItemRemoveEvent(ProductFeeNode item) {
        return new ProductFeeNodeRemoveEvent(item);
    }

    ProductFeeListNodeItemFactory createFactory(ProductFeeListNode parent) {
        return new ProductFeeListNodeItemFactoryImpl(parent);
    }

    private class ProductFeeListNodeItemFactoryImpl implements ProductFeeListNodeItemFactory {

        private final ProductFeeListNode parent;
        
        private ProductFeeListNodeItemFactoryImpl(ProductFeeListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<ProductFeeNode> createItemAddEvent(String name) {
            ProductFeeNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<ProductFeeNode> createItemRemoveEvent(ProductFeeNode item) {
            return newItemRemoveEvent(item);
        }

        private ProductFeeNode createItemNode(String name) {
            ProductFeeNode node = newProductFeeNode(parent, name);
            productFeeNodeInjector.injectMembers(node);
            configureProductFeeNode(node);
            return node;
        }

    }
}
