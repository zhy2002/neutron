package zhy2002.examples.register.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.register.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class PhoneInfoNodeChildProvider {


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

}
