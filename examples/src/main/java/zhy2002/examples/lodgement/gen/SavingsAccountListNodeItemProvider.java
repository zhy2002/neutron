package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface SavingsAccountListNodeItemFactory {
    SavingsAccountNode createSavingsAccountNode(String name);
}

@Singleton
public class SavingsAccountListNodeItemProvider {
    @Inject
    MembersInjector<SavingsAccountNode> savingsAccountNodeInjector;

    @Inject
    protected SavingsAccountListNodeItemProvider () {}

    protected MembersInjector<SavingsAccountNode> getSavingsAccountNodeInjector() {
        return this.savingsAccountNodeInjector;
    }

    protected SavingsAccountNode newSavingsAccountNode (
        SavingsAccountListNode parent,
        String name
    ) {
        return new SavingsAccountNode(parent, name);
    }

    protected void configureSavingsAccountNode(SavingsAccountNode node) {
    }

    SavingsAccountListNodeItemFactory createFactory(SavingsAccountListNode parent) {
        return new SavingsAccountListNodeItemFactoryImpl(parent);
    }

    private class SavingsAccountListNodeItemFactoryImpl implements SavingsAccountListNodeItemFactory {

        private final SavingsAccountListNode parent;
        
        private SavingsAccountListNodeItemFactoryImpl(SavingsAccountListNode parent) {
            this.parent = parent;
        }

        @Override
        public SavingsAccountNode createSavingsAccountNode(String name) {
            SavingsAccountNode node = newSavingsAccountNode(parent, name);
            savingsAccountNodeInjector.injectMembers(node);
            configureSavingsAccountNode(node);
            return node;
        }

    }
}
