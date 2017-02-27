package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface CreditHistoryListNodeItemFactory {
    NodeAddEvent<CreditHistoryNode> createItemAddEvent(String name);
    NodeRemoveEvent<CreditHistoryNode> createItemRemoveEvent(CreditHistoryNode item);
}

@Singleton
public class CreditHistoryListNodeItemProvider {
    @Inject
    MembersInjector<CreditHistoryNode> creditHistoryNodeInjector;

    @Inject
    protected CreditHistoryListNodeItemProvider () {}

    protected MembersInjector<CreditHistoryNode> getCreditHistoryNodeInjector() {
        return this.creditHistoryNodeInjector;
    }

    protected CreditHistoryNode newCreditHistoryNode (
        CreditHistoryListNode parent,
        String name
    ) {
        return new CreditHistoryNode(parent, name);
    }

    protected void configureCreditHistoryNode(CreditHistoryNode node) {
    }

    protected NodeAddEvent<CreditHistoryNode> newItemAddEvent(CreditHistoryNode item) {
        return new CreditHistoryNodeAddEvent(item);
    }

    protected NodeRemoveEvent<CreditHistoryNode> newItemRemoveEvent(CreditHistoryNode item) {
        return new CreditHistoryNodeRemoveEvent(item);
    }

    CreditHistoryListNodeItemFactory createFactory(CreditHistoryListNode parent) {
        return new CreditHistoryListNodeItemFactoryImpl(parent);
    }

    private class CreditHistoryListNodeItemFactoryImpl implements CreditHistoryListNodeItemFactory {

        private final CreditHistoryListNode parent;
        
        private CreditHistoryListNodeItemFactoryImpl(CreditHistoryListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<CreditHistoryNode> createItemAddEvent(String name) {
            CreditHistoryNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<CreditHistoryNode> createItemRemoveEvent(CreditHistoryNode item) {
            return newItemRemoveEvent(item);
        }

        private CreditHistoryNode createItemNode(String name) {
            CreditHistoryNode node = newCreditHistoryNode(parent, name);
            creditHistoryNodeInjector.injectMembers(node);
            configureCreditHistoryNode(node);
            return node;
        }

    }
}
