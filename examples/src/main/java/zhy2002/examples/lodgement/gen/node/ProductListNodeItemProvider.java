package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface ProductListNodeItemFactory {
    NodeAddEvent<ProductNode> createItemAddEvent(String name);
    NodeRemoveEvent<ProductNode> createItemRemoveEvent(ProductNode item);
}

@Singleton
public class ProductListNodeItemProvider {
    @Inject
    MembersInjector<ProductNode> productNodeInjector;

    @Inject
    protected ProductListNodeItemProvider () {}

    protected MembersInjector<ProductNode> getProductNodeInjector() {
        return this.productNodeInjector;
    }

    protected ProductNode newProductNode (
        ProductListNode parent,
        String name
    ) {
        return new ProductNode(parent, name);
    }

    protected void configureProductNode(ProductNode node) {
    }

    protected NodeAddEvent<ProductNode> newItemAddEvent(ProductNode item) {
        return new ProductNodeAddEvent(item);
    }

    protected NodeRemoveEvent<ProductNode> newItemRemoveEvent(ProductNode item) {
        return new ProductNodeRemoveEvent(item);
    }

    ProductListNodeItemFactory createFactory(ProductListNode parent) {
        return new ProductListNodeItemFactoryImpl(parent);
    }

    private class ProductListNodeItemFactoryImpl implements ProductListNodeItemFactory {

        private final ProductListNode parent;
        
        private ProductListNodeItemFactoryImpl(ProductListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<ProductNode> createItemAddEvent(String name) {
            ProductNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<ProductNode> createItemRemoveEvent(ProductNode item) {
            return newItemRemoveEvent(item);
        }

        private ProductNode createItemNode(String name) {
            ProductNode node = newProductNode(parent, name);
            productNodeInjector.injectMembers(node);
            configureProductNode(node);
            return node;
        }

    }
}
