package zhy2002.examples.register.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface PhoneInfoNodeChildFactory {
    CountryCodeNode createCountryCodeNode();
    AreaCodeNode createAreaCodeNode();
    PhoneNumberNode createPhoneNumberNode();
}

@Singleton
public class PhoneInfoNodeChildProvider {
    @Inject
    MembersInjector<PhoneInfoFieldNode> phoneInfoFieldNodeInjector;
    @Inject
    MembersInjector<CountryCodeNode> countryCodeNodeInjector;
    @Inject
    MembersInjector<AreaCodeNode> areaCodeNodeInjector;
    @Inject
    MembersInjector<PhoneNumberNode> phoneNumberNodeInjector;

    @Inject
    protected PhoneInfoNodeChildProvider () {}

    protected MembersInjector<PhoneInfoFieldNode> getPhoneInfoFieldNodeInjector() {
        return this.phoneInfoFieldNodeInjector;
    }

    protected MembersInjector<CountryCodeNode> getCountryCodeNodeInjector() {
        return this.countryCodeNodeInjector;
    }

    protected MembersInjector<AreaCodeNode> getAreaCodeNodeInjector() {
        return this.areaCodeNodeInjector;
    }

    protected MembersInjector<PhoneNumberNode> getPhoneNumberNodeInjector() {
        return this.phoneNumberNodeInjector;
    }

    protected CountryCodeNode newCountryCodeNode(
        PhoneInfoNode parent,
        String name
    ) {
        return new CountryCodeNode(parent, name);
    }

    protected AreaCodeNode newAreaCodeNode(
        PhoneInfoNode parent,
        String name
    ) {
        return new AreaCodeNode(parent, name);
    }

    protected PhoneNumberNode newPhoneNumberNode(
        PhoneInfoNode parent,
        String name
    ) {
        return new PhoneNumberNode(parent, name);
    }

    PhoneInfoNodeChildFactory createFactory(PhoneInfoNode parent) {
        return new PhoneInfoNodeChildFactoryImpl(parent);
    }

    private class PhoneInfoNodeChildFactoryImpl implements PhoneInfoNodeChildFactory {

        private final PhoneInfoNode parent;
        
        private PhoneInfoNodeChildFactoryImpl(PhoneInfoNode parent) {
            this.parent = parent;
        }

        @Override
        public CountryCodeNode createCountryCodeNode() {
            CountryCodeNode node = newCountryCodeNode(parent, "countryCodeNode");
            countryCodeNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public AreaCodeNode createAreaCodeNode() {
            AreaCodeNode node = newAreaCodeNode(parent, "areaCodeNode");
            areaCodeNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public PhoneNumberNode createPhoneNumberNode() {
            PhoneNumberNode node = newPhoneNumberNode(parent, "phoneNumberNode");
            phoneNumberNodeInjector.injectMembers(node);
            return node;
        }

    }
}
