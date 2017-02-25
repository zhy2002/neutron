package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface SavingsAccountNodeChildFactory {
    SavingsTypeNode createSavingsTypeNode();
    SavingsInstitutionNameNode createSavingsInstitutionNameNode();
    SavingsBalanceNode createSavingsBalanceNode();
    SavingsBsbNoNode createSavingsBsbNoNode();
    SavingsAccountNoNode createSavingsAccountNoNode();
    SavingsAccountNameNode createSavingsAccountNameNode();
    SavingsOwnershipListNode createSavingsOwnershipListNode();
}

@Singleton
public class SavingsAccountNodeChildProvider {
    @Inject
    MembersInjector<SavingsTypeNode> savingsTypeNodeInjector;
    @Inject
    MembersInjector<SavingsInstitutionNameNode> savingsInstitutionNameNodeInjector;
    @Inject
    MembersInjector<SavingsBalanceNode> savingsBalanceNodeInjector;
    @Inject
    MembersInjector<SavingsAccountNoNode> savingsAccountNoNodeInjector;
    @Inject
    MembersInjector<SavingsAccountNameNode> savingsAccountNameNodeInjector;
    @Inject
    MembersInjector<SavingsBsbNoNode> savingsBsbNoNodeInjector;
    @Inject
    MembersInjector<SavingsOwnershipListNode> savingsOwnershipListNodeInjector;

    @Inject
    protected SavingsAccountNodeChildProvider () {}

    protected MembersInjector<SavingsTypeNode> getSavingsTypeNodeInjector() {
        return this.savingsTypeNodeInjector;
    }

    protected MembersInjector<SavingsInstitutionNameNode> getSavingsInstitutionNameNodeInjector() {
        return this.savingsInstitutionNameNodeInjector;
    }

    protected MembersInjector<SavingsBalanceNode> getSavingsBalanceNodeInjector() {
        return this.savingsBalanceNodeInjector;
    }

    protected MembersInjector<SavingsAccountNoNode> getSavingsAccountNoNodeInjector() {
        return this.savingsAccountNoNodeInjector;
    }

    protected MembersInjector<SavingsAccountNameNode> getSavingsAccountNameNodeInjector() {
        return this.savingsAccountNameNodeInjector;
    }

    protected MembersInjector<SavingsBsbNoNode> getSavingsBsbNoNodeInjector() {
        return this.savingsBsbNoNodeInjector;
    }

    protected MembersInjector<SavingsOwnershipListNode> getSavingsOwnershipListNodeInjector() {
        return this.savingsOwnershipListNodeInjector;
    }

    protected SavingsTypeNode newSavingsTypeNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsTypeNode(parent, name);
    }

    protected void configureSavingsTypeNode(SavingsTypeNode node) {
    }

    protected SavingsInstitutionNameNode newSavingsInstitutionNameNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsInstitutionNameNode(parent, name);
    }

    protected void configureSavingsInstitutionNameNode(SavingsInstitutionNameNode node) {
    }

    protected SavingsBalanceNode newSavingsBalanceNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsBalanceNode(parent, name);
    }

    protected void configureSavingsBalanceNode(SavingsBalanceNode node) {
    }

    protected SavingsBsbNoNode newSavingsBsbNoNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsBsbNoNode(parent, name);
    }

    protected void configureSavingsBsbNoNode(SavingsBsbNoNode node) {
    }

    protected SavingsAccountNoNode newSavingsAccountNoNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsAccountNoNode(parent, name);
    }

    protected void configureSavingsAccountNoNode(SavingsAccountNoNode node) {
    }

    protected SavingsAccountNameNode newSavingsAccountNameNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsAccountNameNode(parent, name);
    }

    protected void configureSavingsAccountNameNode(SavingsAccountNameNode node) {
    }

    protected SavingsOwnershipListNode newSavingsOwnershipListNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsOwnershipListNode(parent, name);
    }

    protected void configureSavingsOwnershipListNode(SavingsOwnershipListNode node) {
    }

    SavingsAccountNodeChildFactory createFactory(SavingsAccountNode parent) {
        return new SavingsAccountNodeChildFactoryImpl(parent);
    }

    private class SavingsAccountNodeChildFactoryImpl implements SavingsAccountNodeChildFactory {

        private final SavingsAccountNode parent;
        
        private SavingsAccountNodeChildFactoryImpl(SavingsAccountNode parent) {
            this.parent = parent;
        }

        @Override
        public SavingsTypeNode createSavingsTypeNode() {
            SavingsTypeNode node = newSavingsTypeNode(parent, "savingsTypeNode");
            savingsTypeNodeInjector.injectMembers(node);
            configureSavingsTypeNode(node);
            return node;
        }

        @Override
        public SavingsInstitutionNameNode createSavingsInstitutionNameNode() {
            SavingsInstitutionNameNode node = newSavingsInstitutionNameNode(parent, "savingsInstitutionNameNode");
            savingsInstitutionNameNodeInjector.injectMembers(node);
            configureSavingsInstitutionNameNode(node);
            return node;
        }

        @Override
        public SavingsBalanceNode createSavingsBalanceNode() {
            SavingsBalanceNode node = newSavingsBalanceNode(parent, "savingsBalanceNode");
            savingsBalanceNodeInjector.injectMembers(node);
            configureSavingsBalanceNode(node);
            return node;
        }

        @Override
        public SavingsBsbNoNode createSavingsBsbNoNode() {
            SavingsBsbNoNode node = newSavingsBsbNoNode(parent, "savingsBsbNoNode");
            savingsBsbNoNodeInjector.injectMembers(node);
            configureSavingsBsbNoNode(node);
            return node;
        }

        @Override
        public SavingsAccountNoNode createSavingsAccountNoNode() {
            SavingsAccountNoNode node = newSavingsAccountNoNode(parent, "savingsAccountNoNode");
            savingsAccountNoNodeInjector.injectMembers(node);
            configureSavingsAccountNoNode(node);
            return node;
        }

        @Override
        public SavingsAccountNameNode createSavingsAccountNameNode() {
            SavingsAccountNameNode node = newSavingsAccountNameNode(parent, "savingsAccountNameNode");
            savingsAccountNameNodeInjector.injectMembers(node);
            configureSavingsAccountNameNode(node);
            return node;
        }

        @Override
        public SavingsOwnershipListNode createSavingsOwnershipListNode() {
            SavingsOwnershipListNode node = newSavingsOwnershipListNode(parent, "savingsOwnershipListNode");
            savingsOwnershipListNodeInjector.injectMembers(node);
            configureSavingsOwnershipListNode(node);
            return node;
        }

    }
}
