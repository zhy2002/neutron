package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class EmploymentNodeChildProvider {


    @ComponentScope
    public static class EmploymentTypeNodeRuleProvider implements RuleProvider<EmploymentTypeNode> {

        @Inject
        public EmploymentTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmploymentTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PayeEmployedNodeRuleProvider implements RuleProvider<PayeEmployedNode> {

        @Inject
        public PayeEmployedNodeRuleProvider() {

        }

        @Override
        public void initializeState(PayeEmployedNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class SelfEmployedNodeRuleProvider implements RuleProvider<SelfEmployedNode> {

        @Inject
        public SelfEmployedNodeRuleProvider() {

        }

        @Override
        public void initializeState(SelfEmployedNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class UnemployedNodeRuleProvider implements RuleProvider<UnemployedNode> {

        @Inject
        public UnemployedNodeRuleProvider() {

        }

        @Override
        public void initializeState(UnemployedNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class RetiredEmploymentNodeRuleProvider implements RuleProvider<RetiredEmploymentNode> {

        @Inject
        public RetiredEmploymentNodeRuleProvider() {

        }

        @Override
        public void initializeState(RetiredEmploymentNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
