package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface AddressNodeChildFactory {
    AddressLineNode createAddressLineNode();
    SuburbNode createSuburbNode();
    PostcodeNode createPostcodeNode();
    CountryNode createCountryNode();
}

@Singleton
public class AddressNodeChildProvider {
    @Inject
    MembersInjector<AddressLineNode> addressLineNodeInjector;
    @Inject
    MembersInjector<SuburbNode> suburbNodeInjector;
    @Inject
    MembersInjector<PostcodeNode> postcodeNodeInjector;
    @Inject
    MembersInjector<CountryNode> countryNodeInjector;

    @Inject
    protected AddressNodeChildProvider () {}

    protected MembersInjector<AddressLineNode> getAddressLineNodeInjector() {
        return this.addressLineNodeInjector;
    }

    protected MembersInjector<SuburbNode> getSuburbNodeInjector() {
        return this.suburbNodeInjector;
    }

    protected MembersInjector<PostcodeNode> getPostcodeNodeInjector() {
        return this.postcodeNodeInjector;
    }

    protected MembersInjector<CountryNode> getCountryNodeInjector() {
        return this.countryNodeInjector;
    }

    protected AddressLineNode newAddressLineNode(
        AddressNode<?> parent,
        String name
    ) {
        return new AddressLineNode(parent, name);
    }

    protected SuburbNode newSuburbNode(
        AddressNode<?> parent,
        String name
    ) {
        return new SuburbNode(parent, name);
    }

    protected PostcodeNode newPostcodeNode(
        AddressNode<?> parent,
        String name
    ) {
        return new PostcodeNode(parent, name);
    }

    protected CountryNode newCountryNode(
        AddressNode<?> parent,
        String name
    ) {
        return new CountryNode(parent, name);
    }

    AddressNodeChildFactory createFactory(AddressNode<?> parent) {
        return new AddressNodeChildFactoryImpl(parent);
    }

    private class AddressNodeChildFactoryImpl implements AddressNodeChildFactory {

        private final AddressNode<?> parent;
        
        private AddressNodeChildFactoryImpl(AddressNode<?> parent) {
            this.parent = parent;
        }

        @Override
        public AddressLineNode createAddressLineNode() {
            AddressLineNode node = newAddressLineNode(parent, "addressLineNode");
            addressLineNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public SuburbNode createSuburbNode() {
            SuburbNode node = newSuburbNode(parent, "suburbNode");
            suburbNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public PostcodeNode createPostcodeNode() {
            PostcodeNode node = newPostcodeNode(parent, "postcodeNode");
            postcodeNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public CountryNode createCountryNode() {
            CountryNode node = newCountryNode(parent, "countryNode");
            countryNodeInjector.injectMembers(node);
            return node;
        }

    }
}
