package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface ProductCustomerContributionListNodeItemFactory {
    NodeAddEvent<ProductCustomerContributionNode> createItemAddEvent(String name);
    NodeRemoveEvent<ProductCustomerContributionNode> createItemRemoveEvent(ProductCustomerContributionNode item);
}

@Singleton
public class ProductCustomerContributionListNodeItemProvider {
    @Inject
    MembersInjector<ProductCustomerContributionNode> productCustomerContributionNodeInjector;

    @Inject
    protected ProductCustomerContributionListNodeItemProvider () {}

    protected MembersInjector<ProductCustomerContributionNode> getProductCustomerContributionNodeInjector() {
        return this.productCustomerContributionNodeInjector;
    }

    protected ProductCustomerContributionNode newProductCustomerContributionNode (
        ProductCustomerContributionListNode parent,
        String name
    ) {
        return new ProductCustomerContributionNode(parent, name);
    }

    protected void configureProductCustomerContributionNode(ProductCustomerContributionNode node) {
    }

    protected NodeAddEvent<ProductCustomerContributionNode> newItemAddEvent(ProductCustomerContributionNode item) {
        return new ProductCustomerContributionNodeAddEvent(item);
    }

    protected NodeRemoveEvent<ProductCustomerContributionNode> newItemRemoveEvent(ProductCustomerContributionNode item) {
        return new ProductCustomerContributionNodeRemoveEvent(item);
    }

    ProductCustomerContributionListNodeItemFactory createFactory(ProductCustomerContributionListNode parent) {
        return new ProductCustomerContributionListNodeItemFactoryImpl(parent);
    }

    private class ProductCustomerContributionListNodeItemFactoryImpl implements ProductCustomerContributionListNodeItemFactory {

        private final ProductCustomerContributionListNode parent;
        
        private ProductCustomerContributionListNodeItemFactoryImpl(ProductCustomerContributionListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<ProductCustomerContributionNode> createItemAddEvent(String name) {
            ProductCustomerContributionNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<ProductCustomerContributionNode> createItemRemoveEvent(ProductCustomerContributionNode item) {
            return newItemRemoveEvent(item);
        }

        private ProductCustomerContributionNode createItemNode(String name) {
            ProductCustomerContributionNode node = newProductCustomerContributionNode(parent, name);
            productCustomerContributionNodeInjector.injectMembers(node);
            configureProductCustomerContributionNode(node);
            return node;
        }

    }
}
