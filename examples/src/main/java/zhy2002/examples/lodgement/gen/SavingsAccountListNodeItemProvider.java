package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface SavingsAccountListNodeItemFactory {
    NodeAddEvent<SavingsAccountNode> createItemAddEvent(String name);
    NodeRemoveEvent<SavingsAccountNode> createItemRemoveEvent(SavingsAccountNode item);
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

    protected NodeAddEvent<SavingsAccountNode> newItemAddEvent(SavingsAccountNode item) {
        return new SavingsAccountNodeAddEvent(item);
    }

    protected NodeRemoveEvent<SavingsAccountNode> newItemRemoveEvent(SavingsAccountNode item) {
        return new SavingsAccountNodeRemoveEvent(item);
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
        public final NodeAddEvent<SavingsAccountNode> createItemAddEvent(String name) {
            SavingsAccountNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<SavingsAccountNode> createItemRemoveEvent(SavingsAccountNode item) {
            return newItemRemoveEvent(item);
        }

        private SavingsAccountNode createItemNode(String name) {
            SavingsAccountNode node = newSavingsAccountNode(parent, name);
            savingsAccountNodeInjector.injectMembers(node);
            configureSavingsAccountNode(node);
            return node;
        }

    }
}
