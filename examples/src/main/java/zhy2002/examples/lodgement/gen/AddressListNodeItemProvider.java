package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface AddressListNodeItemFactory {
    AddressRefUiNode createAddressRefUiNode(String name);
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

    AddressListNodeItemFactory createFactory(AddressListNode parent) {
        return new AddressListNodeItemFactoryImpl(parent);
    }

    private class AddressListNodeItemFactoryImpl implements AddressListNodeItemFactory {

        private final AddressListNode parent;
        
        private AddressListNodeItemFactoryImpl(AddressListNode parent) {
            this.parent = parent;
        }

        @Override
        public AddressRefUiNode createAddressRefUiNode(String name) {
            AddressRefUiNode node = newAddressRefUiNode(parent, name);
            addressRefUiNodeInjector.injectMembers(node);
            return node;
        }

    }
}
