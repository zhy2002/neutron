package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class RetiredEmploymentNodeChildProvider {


    @ComponentScope
    public static class RetiredOnBenefitFlagNodeRuleProvider implements RuleProvider<RetiredOnBenefitFlagNode> {

        @Inject
        public RetiredOnBenefitFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(RetiredOnBenefitFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class RetiredSinceNodeRuleProvider implements RuleProvider<RetiredSinceNode> {

        @Inject
        public RetiredSinceNodeRuleProvider() {

        }

        @Override
        public void initializeState(RetiredSinceNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
