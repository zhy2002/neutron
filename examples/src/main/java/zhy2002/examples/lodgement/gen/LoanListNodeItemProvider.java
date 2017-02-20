package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface LoanListNodeItemFactory {
    NodeAddEvent<LoanNode> createItemAddEvent(String name);
    NodeRemoveEvent<LoanNode> createItemRemoveEvent(LoanNode item);
}

@Singleton
public class LoanListNodeItemProvider {
    @Inject
    MembersInjector<LoanNode> loanNodeInjector;

    @Inject
    protected LoanListNodeItemProvider () {}

    protected MembersInjector<LoanNode> getLoanNodeInjector() {
        return this.loanNodeInjector;
    }

    protected LoanNode newLoanNode (
        LoanListNode parent,
        String name
    ) {
        return new LoanNode(parent, name);
    }

    protected void configureLoanNode(LoanNode node) {
    }

    protected NodeAddEvent<LoanNode> newItemAddEvent(LoanNode item) {
        return new LoanNodeAddEvent(item);
    }

    protected NodeRemoveEvent<LoanNode> newItemRemoveEvent(LoanNode item) {
        return new LoanNodeRemoveEvent(item);
    }

    LoanListNodeItemFactory createFactory(LoanListNode parent) {
        return new LoanListNodeItemFactoryImpl(parent);
    }

    private class LoanListNodeItemFactoryImpl implements LoanListNodeItemFactory {

        private final LoanListNode parent;
        
        private LoanListNodeItemFactoryImpl(LoanListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<LoanNode> createItemAddEvent(String name) {
            LoanNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<LoanNode> createItemRemoveEvent(LoanNode item) {
            return newItemRemoveEvent(item);
        }

        private LoanNode createItemNode(String name) {
            LoanNode node = newLoanNode(parent, name);
            loanNodeInjector.injectMembers(node);
            configureLoanNode(node);
            return node;
        }

    }
}
