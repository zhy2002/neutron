package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface AddressListNodeItemFactory {
    NodeAddEvent<AddressRefUiNode> createItemAddEvent(String name);
    NodeRemoveEvent<AddressRefUiNode> createItemRemoveEvent(AddressRefUiNode item);
}

@Singleton
public class AddressListNodeItemProvider {
    @Inject
    MembersInjector<AddressRefUiNode> addressRefUiNodeInjector;

    @Inject
    protected AddressListNodeItemProvider () {}

    protected MembersInjector<AddressRefUiNode> getAddressRefUiNodeInjector() {
        return this.addressRefUiNodeInjector;
    }

    protected AddressRefUiNode newAddressRefUiNode (
        AddressListNode parent,
        String name
    ) {
        return new AddressRefUiNode(parent, name);
    }

    protected void configureAddressRefUiNode(AddressRefUiNode node) {
    }

    protected NodeAddEvent<AddressRefUiNode> newItemAddEvent(AddressRefUiNode item) {
        return new AddressRefUiNodeAddEvent(item);
    }

    protected NodeRemoveEvent<AddressRefUiNode> newItemRemoveEvent(AddressRefUiNode item) {
        return new AddressRefUiNodeRemoveEvent(item);
    }

    AddressListNodeItemFactory createFactory(AddressListNode parent) {
        return new AddressListNodeItemFactoryImpl(parent);
    }

    private class AddressListNodeItemFactoryImpl implements AddressListNodeItemFactory {

        private final AddressListNode parent;
        
        private AddressListNodeItemFactoryImpl(AddressListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<AddressRefUiNode> createItemAddEvent(String name) {
            AddressRefUiNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<AddressRefUiNode> createItemRemoveEvent(AddressRefUiNode item) {
            return newItemRemoveEvent(item);
        }

        private AddressRefUiNode createItemNode(String name) {
            AddressRefUiNode node = newAddressRefUiNode(parent, name);
            addressRefUiNodeInjector.injectMembers(node);
            configureAddressRefUiNode(node);
            return node;
        }

    }
}
