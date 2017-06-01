package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class SelfEmployedNodeChildProvider {


    @ComponentScope
    public static class BusinessTypeNodeRuleProvider implements RuleProvider<BusinessTypeNode> {

        @Inject
        public BusinessTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(BusinessTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ProfitThisYearNodeRuleProvider implements RuleProvider<ProfitThisYearNode> {

        @Inject
        public ProfitThisYearNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProfitThisYearNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ProfitPreviousYearNodeRuleProvider implements RuleProvider<ProfitPreviousYearNode> {

        @Inject
        public ProfitPreviousYearNodeRuleProvider() {

        }

        @Override
        public void initializeState(ProfitPreviousYearNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
