package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class ExpenseNodeChildProvider {


    @ComponentScope
    public static class ExpenseTypeNodeRuleProvider implements RuleProvider<ExpenseTypeNode> {

        @Inject
        public ExpenseTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(ExpenseTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ExpenseDescriptionNodeRuleProvider implements RuleProvider<ExpenseDescriptionNode> {

        @Inject
        public ExpenseDescriptionNodeRuleProvider() {

        }

        @Override
        public void initializeState(ExpenseDescriptionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ExpenseMonthlyRepaymentNodeRuleProvider implements RuleProvider<ExpenseMonthlyRepaymentNode> {

        @Inject
        public ExpenseMonthlyRepaymentNodeRuleProvider() {

        }

        @Override
        public void initializeState(ExpenseMonthlyRepaymentNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class OwnershipListNodeRuleProvider implements RuleProvider<ExpenseOwnershipListNode> {

        @Inject
        public OwnershipListNodeRuleProvider() {

        }

        @Override
        public void initializeState(ExpenseOwnershipListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
