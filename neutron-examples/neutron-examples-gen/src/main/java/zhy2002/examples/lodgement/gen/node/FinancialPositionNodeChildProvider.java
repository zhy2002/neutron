package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface FinancialPositionNodeChildFactory {
    AssetsNode createAssetsNode();
    LiabilitiesNode createLiabilitiesNode();
    ExpenseListNode createExpenseListNode();
    TotalAssetNode createTotalAssetNode();
    TotalLiabilityNode createTotalLiabilityNode();
    TotalExpenseNode createTotalExpenseNode();
}

@Singleton
public class FinancialPositionNodeChildProvider {
    @Inject
    MembersInjector<TotalLiabilityNode> totalLiabilityNodeInjector;
    @Inject
    MembersInjector<TotalAssetNode> totalAssetNodeInjector;
    @Inject
    MembersInjector<TotalExpenseNode> totalExpenseNodeInjector;
    @Inject
    MembersInjector<ExpenseListNode> expenseListNodeInjector;
    @Inject
    MembersInjector<LiabilitiesNode> liabilitiesNodeInjector;
    @Inject
    MembersInjector<AssetsNode> assetsNodeInjector;

    @Inject
    protected FinancialPositionNodeChildProvider () {}

    protected MembersInjector<TotalLiabilityNode> getTotalLiabilityNodeInjector() {
        return this.totalLiabilityNodeInjector;
    }

    protected MembersInjector<TotalAssetNode> getTotalAssetNodeInjector() {
        return this.totalAssetNodeInjector;
    }

    protected MembersInjector<TotalExpenseNode> getTotalExpenseNodeInjector() {
        return this.totalExpenseNodeInjector;
    }

    protected MembersInjector<ExpenseListNode> getExpenseListNodeInjector() {
        return this.expenseListNodeInjector;
    }

    protected MembersInjector<LiabilitiesNode> getLiabilitiesNodeInjector() {
        return this.liabilitiesNodeInjector;
    }

    protected MembersInjector<AssetsNode> getAssetsNodeInjector() {
        return this.assetsNodeInjector;
    }

    protected AssetsNode newAssetsNode(
        FinancialPositionNode parent,
        String name
    ) {
        return new AssetsNode(parent, name);
    }

    protected void configureAssetsNode(AssetsNode node) {
    }

    @AssetsNodeScope
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

    protected LiabilitiesNode newLiabilitiesNode(
        FinancialPositionNode parent,
        String name
    ) {
        return new LiabilitiesNode(parent, name);
    }

    protected void configureLiabilitiesNode(LiabilitiesNode node) {
    }

    @LiabilitiesNodeScope
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

    protected ExpenseListNode newExpenseListNode(
        FinancialPositionNode parent,
        String name
    ) {
        return new ExpenseListNode(parent, name);
    }

    protected void configureExpenseListNode(ExpenseListNode node) {
    }

    @ExpenseListNodeScope
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

    protected TotalAssetNode newTotalAssetNode(
        FinancialPositionNode parent,
        String name
    ) {
        return new TotalAssetNode(parent, name);
    }

    protected void configureTotalAssetNode(TotalAssetNode node) {
    }

    @TotalAssetNodeScope
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

    protected TotalLiabilityNode newTotalLiabilityNode(
        FinancialPositionNode parent,
        String name
    ) {
        return new TotalLiabilityNode(parent, name);
    }

    protected void configureTotalLiabilityNode(TotalLiabilityNode node) {
    }

    @TotalLiabilityNodeScope
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

    protected TotalExpenseNode newTotalExpenseNode(
        FinancialPositionNode parent,
        String name
    ) {
        return new TotalExpenseNode(parent, name);
    }

    protected void configureTotalExpenseNode(TotalExpenseNode node) {
    }

    @TotalExpenseNodeScope
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

    FinancialPositionNodeChildFactory createFactory(FinancialPositionNode parent) {
        return new FinancialPositionNodeChildFactoryImpl(parent);
    }

    private class FinancialPositionNodeChildFactoryImpl implements FinancialPositionNodeChildFactory {

        private final FinancialPositionNode parent;
        
        private FinancialPositionNodeChildFactoryImpl(FinancialPositionNode parent) {
            this.parent = parent;
        }

        @Override
        public AssetsNode createAssetsNode() {
            AssetsNode node = newAssetsNode(parent, "assetsNode");
            assetsNodeInjector.injectMembers(node);
            configureAssetsNode(node);
            return node;
        }

        @Override
        public LiabilitiesNode createLiabilitiesNode() {
            LiabilitiesNode node = newLiabilitiesNode(parent, "liabilitiesNode");
            liabilitiesNodeInjector.injectMembers(node);
            configureLiabilitiesNode(node);
            return node;
        }

        @Override
        public ExpenseListNode createExpenseListNode() {
            ExpenseListNode node = newExpenseListNode(parent, "expenseListNode");
            expenseListNodeInjector.injectMembers(node);
            configureExpenseListNode(node);
            return node;
        }

        @Override
        public TotalAssetNode createTotalAssetNode() {
            TotalAssetNode node = newTotalAssetNode(parent, "totalAssetNode");
            totalAssetNodeInjector.injectMembers(node);
            configureTotalAssetNode(node);
            return node;
        }

        @Override
        public TotalLiabilityNode createTotalLiabilityNode() {
            TotalLiabilityNode node = newTotalLiabilityNode(parent, "totalLiabilityNode");
            totalLiabilityNodeInjector.injectMembers(node);
            configureTotalLiabilityNode(node);
            return node;
        }

        @Override
        public TotalExpenseNode createTotalExpenseNode() {
            TotalExpenseNode node = newTotalExpenseNode(parent, "totalExpenseNode");
            totalExpenseNodeInjector.injectMembers(node);
            configureTotalExpenseNode(node);
            return node;
        }

    }
}
