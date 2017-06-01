package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class OwnershipNodeChildProvider {


    @ComponentScope
    public static class ApplicantReferenceNodeRuleProvider implements RuleProvider<ApplicantReferenceNode> {

        @Inject
        public ApplicantReferenceNodeRuleProvider() {

        }

        @Override
        public void initializeState(ApplicantReferenceNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class OwnershipPercentageNodeRuleProvider implements RuleProvider<OwnershipPercentageNode> {

        @Inject
        public OwnershipPercentageNodeRuleProvider() {

        }

        @Override
        public void initializeState(OwnershipPercentageNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class AverageFlagNodeRuleProvider implements RuleProvider<AverageFlagNode> {

        @Inject
        public AverageFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(AverageFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
