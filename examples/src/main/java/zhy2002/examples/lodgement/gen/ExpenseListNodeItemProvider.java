package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface ExpenseListNodeItemFactory {
    NodeAddEvent<ExpenseNode> createItemAddEvent(String name);
    NodeRemoveEvent<ExpenseNode> createItemRemoveEvent(ExpenseNode item);
}

@Singleton
public class ExpenseListNodeItemProvider {
    @Inject
    MembersInjector<ExpenseNode> expenseNodeInjector;

    @Inject
    protected ExpenseListNodeItemProvider () {}

    protected MembersInjector<ExpenseNode> getExpenseNodeInjector() {
        return this.expenseNodeInjector;
    }

    protected ExpenseNode newExpenseNode (
        ExpenseListNode parent,
        String name
    ) {
        return new ExpenseNode(parent, name);
    }

    protected void configureExpenseNode(ExpenseNode node) {
    }

    protected NodeAddEvent<ExpenseNode> newItemAddEvent(ExpenseNode item) {
        return new ExpenseNodeAddEvent(item);
    }

    protected NodeRemoveEvent<ExpenseNode> newItemRemoveEvent(ExpenseNode item) {
        return new ExpenseNodeRemoveEvent(item);
    }

    ExpenseListNodeItemFactory createFactory(ExpenseListNode parent) {
        return new ExpenseListNodeItemFactoryImpl(parent);
    }

    private class ExpenseListNodeItemFactoryImpl implements ExpenseListNodeItemFactory {

        private final ExpenseListNode parent;
        
        private ExpenseListNodeItemFactoryImpl(ExpenseListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<ExpenseNode> createItemAddEvent(String name) {
            ExpenseNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<ExpenseNode> createItemRemoveEvent(ExpenseNode item) {
            return newItemRemoveEvent(item);
        }

        private ExpenseNode createItemNode(String name) {
            ExpenseNode node = newExpenseNode(parent, name);
            expenseNodeInjector.injectMembers(node);
            configureExpenseNode(node);
            return node;
        }

    }
}
