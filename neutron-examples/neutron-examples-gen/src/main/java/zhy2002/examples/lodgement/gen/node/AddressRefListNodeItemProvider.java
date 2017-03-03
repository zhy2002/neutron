package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface AddressRefListNodeItemFactory {
    NodeAddEvent<AddressRefNode> createItemAddEvent(String name);
    NodeRemoveEvent<AddressRefNode> createItemRemoveEvent(AddressRefNode item);
}

@Singleton
public class AddressRefListNodeItemProvider {
    @Inject
    MembersInjector<AddressRefNode> addressRefNodeInjector;

    @Inject
    protected AddressRefListNodeItemProvider () {}

    protected MembersInjector<AddressRefNode> getAddressRefNodeInjector() {
        return this.addressRefNodeInjector;
    }

    protected AddressRefNode newAddressRefNode (
        AddressRefListNode parent,
        String name
    ) {
        return new AddressRefNode(parent, name);
    }

    protected void configureAddressRefNode(AddressRefNode node) {
    }

    protected NodeAddEvent<AddressRefNode> newItemAddEvent(AddressRefNode item) {
        return new AddressRefNodeAddEvent(item);
    }

    protected NodeRemoveEvent<AddressRefNode> newItemRemoveEvent(AddressRefNode item) {
        return new AddressRefNodeRemoveEvent(item);
    }

    AddressRefListNodeItemFactory createFactory(AddressRefListNode parent) {
        return new AddressRefListNodeItemFactoryImpl(parent);
    }

    private class AddressRefListNodeItemFactoryImpl implements AddressRefListNodeItemFactory {

        private final AddressRefListNode parent;
        
        private AddressRefListNodeItemFactoryImpl(AddressRefListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<AddressRefNode> createItemAddEvent(String name) {
            AddressRefNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<AddressRefNode> createItemRemoveEvent(AddressRefNode item) {
            return newItemRemoveEvent(item);
        }

        private AddressRefNode createItemNode(String name) {
            AddressRefNode node = newAddressRefNode(parent, name);
            addressRefNodeInjector.injectMembers(node);
            configureAddressRefNode(node);
            return node;
        }

    }
}
