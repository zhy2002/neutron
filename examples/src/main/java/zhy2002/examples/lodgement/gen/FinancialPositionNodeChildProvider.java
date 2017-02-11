package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface FinancialPositionNodeChildFactory {
    AssetsNode createAssetsNode();
    LiabilitiesNode createLiabilitiesNode();
    ExpensesNode createExpensesNode();
}

@Singleton
public class FinancialPositionNodeChildProvider {
    @Inject
    MembersInjector<AssetsNode> assetsNodeInjector;
    @Inject
    MembersInjector<LiabilitiesNode> liabilitiesNodeInjector;
    @Inject
    MembersInjector<ExpensesNode> expensesNodeInjector;

    @Inject
    protected FinancialPositionNodeChildProvider () {}

    protected MembersInjector<AssetsNode> getAssetsNodeInjector() {
        return this.assetsNodeInjector;
    }

    protected MembersInjector<LiabilitiesNode> getLiabilitiesNodeInjector() {
        return this.liabilitiesNodeInjector;
    }

    protected MembersInjector<ExpensesNode> getExpensesNodeInjector() {
        return this.expensesNodeInjector;
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

    protected ExpensesNode newExpensesNode(
        FinancialPositionNode parent,
        String name
    ) {
        return new ExpensesNode(parent, name);
    }

    protected void configureExpensesNode(ExpensesNode node) {
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
        public ExpensesNode createExpensesNode() {
            ExpensesNode node = newExpensesNode(parent, "expensesNode");
            expensesNodeInjector.injectMembers(node);
            configureExpensesNode(node);
            return node;
        }

    }
}
