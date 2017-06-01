package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class FinancialPositionNodeChildProvider {


    @ComponentScope
    public static class AssetsNodeRuleProvider implements RuleProvider<AssetsNode> {

        @Inject
        public AssetsNodeRuleProvider() {

        }

        @Override
        public void initializeState(AssetsNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class LiabilitiesNodeRuleProvider implements RuleProvider<LiabilitiesNode> {

        @Inject
        public LiabilitiesNodeRuleProvider() {

        }

        @Override
        public void initializeState(LiabilitiesNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class ExpenseListNodeRuleProvider implements RuleProvider<ExpenseListNode> {

        @Inject
        public ExpenseListNodeRuleProvider() {

        }

        @Override
        public void initializeState(ExpenseListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class TotalAssetNodeRuleProvider implements RuleProvider<TotalAssetNode> {

        @Inject
        public TotalAssetNodeRuleProvider() {

        }

        @Override
        public void initializeState(TotalAssetNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class TotalLiabilityNodeRuleProvider implements RuleProvider<TotalLiabilityNode> {

        @Inject
        public TotalLiabilityNodeRuleProvider() {

        }

        @Override
        public void initializeState(TotalLiabilityNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class TotalExpenseNodeRuleProvider implements RuleProvider<TotalExpenseNode> {

        @Inject
        public TotalExpenseNodeRuleProvider() {

        }

        @Override
        public void initializeState(TotalExpenseNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}
