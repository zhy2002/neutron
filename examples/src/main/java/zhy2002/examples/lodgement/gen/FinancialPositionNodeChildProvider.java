package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


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
    MembersInjector<AssetsNode> assetsNodeInjector;
    @Inject
    MembersInjector<LiabilitiesNode> liabilitiesNodeInjector;
    @Inject
    MembersInjector<ExpenseListNode> expenseListNodeInjector;
    @Inject
    MembersInjector<TotalAssetNode> totalAssetNodeInjector;
    @Inject
    MembersInjector<TotalLiabilityNode> totalLiabilityNodeInjector;
    @Inject
    MembersInjector<TotalExpenseNode> totalExpenseNodeInjector;

    @Inject
    protected FinancialPositionNodeChildProvider () {}

    protected MembersInjector<AssetsNode> getAssetsNodeInjector() {
        return this.assetsNodeInjector;
    }

    protected MembersInjector<LiabilitiesNode> getLiabilitiesNodeInjector() {
        return this.liabilitiesNodeInjector;
    }

    protected MembersInjector<ExpenseListNode> getExpenseListNodeInjector() {
        return this.expenseListNodeInjector;
    }

    protected MembersInjector<TotalAssetNode> getTotalAssetNodeInjector() {
        return this.totalAssetNodeInjector;
    }

    protected MembersInjector<TotalLiabilityNode> getTotalLiabilityNodeInjector() {
        return this.totalLiabilityNodeInjector;
    }

    protected MembersInjector<TotalExpenseNode> getTotalExpenseNodeInjector() {
        return this.totalExpenseNodeInjector;
    }

    protected AssetsNode newAssetsNode(
        FinancialPositionNode parent,
        String name
    ) {
        return new AssetsNode(parent, name);
    }

    protected void configureAssetsNode(AssetsNode node) {
    }

    protected LiabilitiesNode newLiabilitiesNode(
        FinancialPositionNode parent,
        String name
    ) {
        return new LiabilitiesNode(parent, name);
    }

    protected void configureLiabilitiesNode(LiabilitiesNode node) {
    }

    protected ExpenseListNode newExpenseListNode(
        FinancialPositionNode parent,
        String name
    ) {
        return new ExpenseListNode(parent, name);
    }

    protected void configureExpenseListNode(ExpenseListNode node) {
    }

    protected TotalAssetNode newTotalAssetNode(
        FinancialPositionNode parent,
        String name
    ) {
        return new TotalAssetNode(parent, name);
    }

    protected void configureTotalAssetNode(TotalAssetNode node) {
    }

    protected TotalLiabilityNode newTotalLiabilityNode(
        FinancialPositionNode parent,
        String name
    ) {
        return new TotalLiabilityNode(parent, name);
    }

    protected void configureTotalLiabilityNode(TotalLiabilityNode node) {
    }

    protected TotalExpenseNode newTotalExpenseNode(
        FinancialPositionNode parent,
        String name
    ) {
        return new TotalExpenseNode(parent, name);
    }

    protected void configureTotalExpenseNode(TotalExpenseNode node) {
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
