package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class UnemployedNodeChildProvider {


    @ComponentScope
    public static class UnemployedOnBenefitFlagNodeRuleProvider implements RuleProvider<UnemployedOnBenefitFlagNode> {

        @Inject
        public UnemployedOnBenefitFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(UnemployedOnBenefitFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class StudentFlagNodeRuleProvider implements RuleProvider<StudentFlagNode> {

        @Inject
        public StudentFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(StudentFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class StudentTypeNodeRuleProvider implements RuleProvider<StudentTypeNode> {

        @Inject
        public StudentTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(StudentTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class HouseDutiesFlagNodeRuleProvider implements RuleProvider<HouseDutiesFlagNode> {

        @Inject
        public HouseDutiesFlagNodeRuleProvider() {

        }

        @Override
        public void initializeState(HouseDutiesFlagNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class UnemployedSinceNodeRuleProvider implements RuleProvider<UnemployedSinceNode> {

        @Inject
        public UnemployedSinceNodeRuleProvider() {

        }

        @Override
        public void initializeState(UnemployedSinceNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
