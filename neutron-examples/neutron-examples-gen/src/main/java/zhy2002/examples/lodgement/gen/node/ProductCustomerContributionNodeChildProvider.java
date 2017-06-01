package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class ProductCustomerContributionNodeChildProvider {


    @ComponentScope
    public static class ContributionTypeNodeRuleProvider implements RuleProvider<ContributionTypeNode> {

        @Inject
        public ContributionTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(ContributionTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ContributionDescriptionNodeRuleProvider implements RuleProvider<ContributionDescriptionNode> {

        @Inject
        public ContributionDescriptionNodeRuleProvider() {

        }

        @Override
        public void initializeState(ContributionDescriptionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ContributionAmountNodeRuleProvider implements RuleProvider<ContributionAmountNode> {

        @Inject
        public ContributionAmountNodeRuleProvider() {

        }

        @Override
        public void initializeState(ContributionAmountNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
