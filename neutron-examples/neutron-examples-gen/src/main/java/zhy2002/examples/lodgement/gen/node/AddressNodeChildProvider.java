package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class AddressNodeChildProvider {


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

}
