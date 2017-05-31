package zhy2002.examples.register.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.register.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


interface PhoneInfoNodeChildFactory {
    CountryCodeNode createCountryCodeNode();
    AreaCodeNode createAreaCodeNode();
    PhoneNumberNode createPhoneNumberNode();
}

@Singleton
public class PhoneInfoNodeChildProvider {
    @Inject
    MembersInjector<PhoneNumberNode> phoneNumberNodeInjector;
    @Inject
    MembersInjector<PhoneInfoFieldNode> phoneInfoFieldNodeInjector;
    @Inject
    MembersInjector<CountryCodeNode> countryCodeNodeInjector;
    @Inject
    MembersInjector<AreaCodeNode> areaCodeNodeInjector;

    @Inject
    protected PhoneInfoNodeChildProvider () {}

    protected MembersInjector<PhoneNumberNode> getPhoneNumberNodeInjector() {
        return this.phoneNumberNodeInjector;
    }

    protected MembersInjector<PhoneInfoFieldNode> getPhoneInfoFieldNodeInjector() {
        return this.phoneInfoFieldNodeInjector;
    }

    protected MembersInjector<CountryCodeNode> getCountryCodeNodeInjector() {
        return this.countryCodeNodeInjector;
    }

    protected MembersInjector<AreaCodeNode> getAreaCodeNodeInjector() {
        return this.areaCodeNodeInjector;
    }

    protected CountryCodeNode newCountryCodeNode(
        PhoneInfoNode parent,
        String name
    ) {
        return new CountryCodeNode(parent, name);
    }

    protected void configureCountryCodeNode(CountryCodeNode node) {
    }

    @ComponentScope
    public static class CountryCodeNodeRuleProvider implements RuleProvider<CountryCodeNode> {

        @Inject
        public CountryCodeNodeRuleProvider() {

        }

        @Override
        public void initializeState(CountryCodeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected AreaCodeNode newAreaCodeNode(
        PhoneInfoNode parent,
        String name
    ) {
        return new AreaCodeNode(parent, name);
    }

    protected void configureAreaCodeNode(AreaCodeNode node) {
    }

    @ComponentScope
    public static class AreaCodeNodeRuleProvider implements RuleProvider<AreaCodeNode> {

        @Inject
        public AreaCodeNodeRuleProvider() {

        }

        @Override
        public void initializeState(AreaCodeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PhoneNumberNode newPhoneNumberNode(
        PhoneInfoNode parent,
        String name
    ) {
        return new PhoneNumberNode(parent, name);
    }

    protected void configurePhoneNumberNode(PhoneNumberNode node) {
    }

    @ComponentScope
    public static class PhoneNumberNodeRuleProvider implements RuleProvider<PhoneNumberNode> {

        @Inject
        public PhoneNumberNodeRuleProvider() {

        }

        @Override
        public void initializeState(PhoneNumberNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
            configureCountryCodeNode(node);
            return node;
        }

        @Override
        public AreaCodeNode createAreaCodeNode() {
            AreaCodeNode node = newAreaCodeNode(parent, "areaCodeNode");
            areaCodeNodeInjector.injectMembers(node);
            configureAreaCodeNode(node);
            return node;
        }

        @Override
        public PhoneNumberNode createPhoneNumberNode() {
            PhoneNumberNode node = newPhoneNumberNode(parent, "phoneNumberNode");
            phoneNumberNodeInjector.injectMembers(node);
            configurePhoneNumberNode(node);
            return node;
        }

    }
}
