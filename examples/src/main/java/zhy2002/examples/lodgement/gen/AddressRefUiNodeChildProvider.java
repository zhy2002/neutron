package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface AddressRefUiNodeChildFactory {
}

@Singleton
public class AddressRefUiNodeChildProvider {

    @Inject
    protected AddressRefUiNodeChildProvider () {}

    AddressRefUiNodeChildFactory createFactory(AddressRefUiNode parent) {
        return new AddressRefUiNodeChildFactoryImpl(parent);
    }

    private class AddressRefUiNodeChildFactoryImpl implements AddressRefUiNodeChildFactory {

        private final AddressRefUiNode parent;
        
        private AddressRefUiNodeChildFactoryImpl(AddressRefUiNode parent) {
            this.parent = parent;
        }

    }
}
