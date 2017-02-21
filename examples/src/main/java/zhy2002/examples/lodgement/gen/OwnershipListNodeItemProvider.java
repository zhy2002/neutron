package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface OwnershipListNodeItemFactory {
    NodeAddEvent<OwnershipNode> createItemAddEvent(String name);
    NodeRemoveEvent<OwnershipNode> createItemRemoveEvent(OwnershipNode item);
}

@Singleton
public class OwnershipListNodeItemProvider {
    @Inject
    MembersInjector<OwnershipNode> ownershipNodeInjector;

    @Inject
    protected OwnershipListNodeItemProvider () {}

    protected MembersInjector<OwnershipNode> getOwnershipNodeInjector() {
        return this.ownershipNodeInjector;
    }

    protected OwnershipNode newOwnershipNode (
        OwnershipListNode<?> parent,
        String name
    ) {
        return new OwnershipNode(parent, name);
    }

    protected void configureOwnershipNode(OwnershipNode node) {
    }

    protected NodeAddEvent<OwnershipNode> newItemAddEvent(OwnershipNode item) {
        return new OwnershipNodeAddEvent(item);
    }

    protected NodeRemoveEvent<OwnershipNode> newItemRemoveEvent(OwnershipNode item) {
        return new OwnershipNodeRemoveEvent(item);
    }

    OwnershipListNodeItemFactory createFactory(OwnershipListNode<?> parent) {
        return new OwnershipListNodeItemFactoryImpl(parent);
    }

    private class OwnershipListNodeItemFactoryImpl implements OwnershipListNodeItemFactory {

        private final OwnershipListNode<?> parent;
        
        private OwnershipListNodeItemFactoryImpl(OwnershipListNode<?> parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<OwnershipNode> createItemAddEvent(String name) {
            OwnershipNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<OwnershipNode> createItemRemoveEvent(OwnershipNode item) {
            return newItemRemoveEvent(item);
        }

        private OwnershipNode createItemNode(String name) {
            OwnershipNode node = newOwnershipNode(parent, name);
            ownershipNodeInjector.injectMembers(node);
            configureOwnershipNode(node);
            return node;
        }

    }
}
