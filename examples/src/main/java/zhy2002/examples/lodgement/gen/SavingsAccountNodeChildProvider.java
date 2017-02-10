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
    MembersInjector<SavingsBsbNoNode> savingsBsbNoNodeInjector;
    @Inject
    MembersInjector<SavingsAccountNoNode> savingsAccountNoNodeInjector;
    @Inject
    MembersInjector<SavingsAccountNameNode> savingsAccountNameNodeInjector;

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

    protected MembersInjector<SavingsBsbNoNode> getSavingsBsbNoNodeInjector() {
        return this.savingsBsbNoNodeInjector;
    }

    protected MembersInjector<SavingsAccountNoNode> getSavingsAccountNoNodeInjector() {
        return this.savingsAccountNoNodeInjector;
    }

    protected MembersInjector<SavingsAccountNameNode> getSavingsAccountNameNodeInjector() {
        return this.savingsAccountNameNodeInjector;
    }

    protected SavingsTypeNode newSavingsTypeNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsTypeNode(parent, name);
    }

    protected SavingsInstitutionNameNode newSavingsInstitutionNameNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsInstitutionNameNode(parent, name);
    }

    protected SavingsBalanceNode newSavingsBalanceNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsBalanceNode(parent, name);
    }

    protected SavingsBsbNoNode newSavingsBsbNoNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsBsbNoNode(parent, name);
    }

    protected SavingsAccountNoNode newSavingsAccountNoNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsAccountNoNode(parent, name);
    }

    protected SavingsAccountNameNode newSavingsAccountNameNode(
        SavingsAccountNode parent,
        String name
    ) {
        return new SavingsAccountNameNode(parent, name);
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
            return node;
        }

        @Override
        public SavingsInstitutionNameNode createSavingsInstitutionNameNode() {
            SavingsInstitutionNameNode node = newSavingsInstitutionNameNode(parent, "savingsInstitutionNameNode");
            savingsInstitutionNameNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public SavingsBalanceNode createSavingsBalanceNode() {
            SavingsBalanceNode node = newSavingsBalanceNode(parent, "savingsBalanceNode");
            savingsBalanceNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public SavingsBsbNoNode createSavingsBsbNoNode() {
            SavingsBsbNoNode node = newSavingsBsbNoNode(parent, "savingsBsbNoNode");
            savingsBsbNoNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public SavingsAccountNoNode createSavingsAccountNoNode() {
            SavingsAccountNoNode node = newSavingsAccountNoNode(parent, "savingsAccountNoNode");
            savingsAccountNoNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public SavingsAccountNameNode createSavingsAccountNameNode() {
            SavingsAccountNameNode node = newSavingsAccountNameNode(parent, "savingsAccountNameNode");
            savingsAccountNameNodeInjector.injectMembers(node);
            return node;
        }

    }
}
