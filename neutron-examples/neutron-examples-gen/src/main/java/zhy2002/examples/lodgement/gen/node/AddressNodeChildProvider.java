package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


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
    MembersInjector<PostcodeNode> postcodeNodeInjector;
    @Inject
    MembersInjector<SuburbNode> suburbNodeInjector;
    @Inject
    MembersInjector<CountryNode> countryNodeInjector;

    @Inject
    protected AddressNodeChildProvider () {}

    protected MembersInjector<AddressLineNode> getAddressLineNodeInjector() {
        return this.addressLineNodeInjector;
    }

    protected MembersInjector<PostcodeNode> getPostcodeNodeInjector() {
        return this.postcodeNodeInjector;
    }

    protected MembersInjector<SuburbNode> getSuburbNodeInjector() {
        return this.suburbNodeInjector;
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

    protected void configureAddressLineNode(AddressLineNode node) {
    }

    @ComponentScope
    public static class AddressLineNodeRuleProvider implements RuleProvider<AddressLineNode> {

        @Inject
        public AddressLineNodeRuleProvider() {

        }

        @Override
        public void initializeState(AddressLineNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected SuburbNode newSuburbNode(
        AddressNode<?> parent,
        String name
    ) {
        return new SuburbNode(parent, name);
    }

    protected void configureSuburbNode(SuburbNode node) {
    }

    @ComponentScope
    public static class SuburbNodeRuleProvider implements RuleProvider<SuburbNode> {

        @Inject
        public SuburbNodeRuleProvider() {

        }

        @Override
        public void initializeState(SuburbNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PostcodeNode newPostcodeNode(
        AddressNode<?> parent,
        String name
    ) {
        return new PostcodeNode(parent, name);
    }

    protected void configurePostcodeNode(PostcodeNode node) {
    }

    @ComponentScope
    public static class PostcodeNodeRuleProvider implements RuleProvider<PostcodeNode> {

        @Inject
        public PostcodeNodeRuleProvider() {

        }

        @Override
        public void initializeState(PostcodeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CountryNode newCountryNode(
        AddressNode<?> parent,
        String name
    ) {
        return new CountryNode(parent, name);
    }

    protected void configureCountryNode(CountryNode node) {
    }

    @ComponentScope
    public static class CountryNodeRuleProvider implements RuleProvider<CountryNode> {

        @Inject
        public CountryNodeRuleProvider() {

        }

        @Override
        public void initializeState(CountryNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
            configureAddressLineNode(node);
            return node;
        }

        @Override
        public SuburbNode createSuburbNode() {
            SuburbNode node = newSuburbNode(parent, "suburbNode");
            suburbNodeInjector.injectMembers(node);
            configureSuburbNode(node);
            return node;
        }

        @Override
        public PostcodeNode createPostcodeNode() {
            PostcodeNode node = newPostcodeNode(parent, "postcodeNode");
            postcodeNodeInjector.injectMembers(node);
            configurePostcodeNode(node);
            return node;
        }

        @Override
        public CountryNode createCountryNode() {
            CountryNode node = newCountryNode(parent, "countryNode");
            countryNodeInjector.injectMembers(node);
            configureCountryNode(node);
            return node;
        }

    }
}
