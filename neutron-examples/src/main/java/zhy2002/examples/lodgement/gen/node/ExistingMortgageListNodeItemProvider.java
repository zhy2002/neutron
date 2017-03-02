package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface ExistingMortgageListNodeItemFactory {
    NodeAddEvent<ExistingMortgageNode> createItemAddEvent(String name);
    NodeRemoveEvent<ExistingMortgageNode> createItemRemoveEvent(ExistingMortgageNode item);
}

@Singleton
public class ExistingMortgageListNodeItemProvider {
    @Inject
    MembersInjector<ExistingMortgageNode> existingMortgageNodeInjector;

    @Inject
    protected ExistingMortgageListNodeItemProvider () {}

    protected MembersInjector<ExistingMortgageNode> getExistingMortgageNodeInjector() {
        return this.existingMortgageNodeInjector;
    }

    protected ExistingMortgageNode newExistingMortgageNode (
        ExistingMortgageListNode parent,
        String name
    ) {
        return new ExistingMortgageNode(parent, name);
    }

    protected void configureExistingMortgageNode(ExistingMortgageNode node) {
    }

    protected NodeAddEvent<ExistingMortgageNode> newItemAddEvent(ExistingMortgageNode item) {
        return new ExistingMortgageNodeAddEvent(item);
    }

    protected NodeRemoveEvent<ExistingMortgageNode> newItemRemoveEvent(ExistingMortgageNode item) {
        return new ExistingMortgageNodeRemoveEvent(item);
    }

    ExistingMortgageListNodeItemFactory createFactory(ExistingMortgageListNode parent) {
        return new ExistingMortgageListNodeItemFactoryImpl(parent);
    }

    private class ExistingMortgageListNodeItemFactoryImpl implements ExistingMortgageListNodeItemFactory {

        private final ExistingMortgageListNode parent;
        
        private ExistingMortgageListNodeItemFactoryImpl(ExistingMortgageListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<ExistingMortgageNode> createItemAddEvent(String name) {
            ExistingMortgageNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<ExistingMortgageNode> createItemRemoveEvent(ExistingMortgageNode item) {
            return newItemRemoveEvent(item);
        }

        private ExistingMortgageNode createItemNode(String name) {
            ExistingMortgageNode node = newExistingMortgageNode(parent, name);
            existingMortgageNodeInjector.injectMembers(node);
            configureExistingMortgageNode(node);
            return node;
        }

    }
}
