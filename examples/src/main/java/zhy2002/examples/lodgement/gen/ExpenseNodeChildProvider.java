package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface ExpenseNodeChildFactory {
    ExpenseTypeNode createExpenseTypeNode();
    ExpenseDescriptionNode createExpenseDescriptionNode();
    ExpenseMonthlyRepaymentNode createExpenseMonthlyRepaymentNode();
}

@Singleton
public class ExpenseNodeChildProvider {
    @Inject
    MembersInjector<ExpenseTypeNode> expenseTypeNodeInjector;
    @Inject
    MembersInjector<ExpenseDescriptionNode> expenseDescriptionNodeInjector;
    @Inject
    MembersInjector<ExpenseMonthlyRepaymentNode> expenseMonthlyRepaymentNodeInjector;

    @Inject
    protected ExpenseNodeChildProvider () {}

    protected MembersInjector<ExpenseTypeNode> getExpenseTypeNodeInjector() {
        return this.expenseTypeNodeInjector;
    }

    protected MembersInjector<ExpenseDescriptionNode> getExpenseDescriptionNodeInjector() {
        return this.expenseDescriptionNodeInjector;
    }

    protected MembersInjector<ExpenseMonthlyRepaymentNode> getExpenseMonthlyRepaymentNodeInjector() {
        return this.expenseMonthlyRepaymentNodeInjector;
    }

    protected ExpenseTypeNode newExpenseTypeNode(
        ExpenseNode parent,
        String name
    ) {
        return new ExpenseTypeNode(parent, name);
    }

    protected ExpenseDescriptionNode newExpenseDescriptionNode(
        ExpenseNode parent,
        String name
    ) {
        return new ExpenseDescriptionNode(parent, name);
    }

    protected ExpenseMonthlyRepaymentNode newExpenseMonthlyRepaymentNode(
        ExpenseNode parent,
        String name
    ) {
        return new ExpenseMonthlyRepaymentNode(parent, name);
    }

    ExpenseNodeChildFactory createFactory(ExpenseNode parent) {
        return new ExpenseNodeChildFactoryImpl(parent);
    }

    private class ExpenseNodeChildFactoryImpl implements ExpenseNodeChildFactory {

        private final ExpenseNode parent;
        
        private ExpenseNodeChildFactoryImpl(ExpenseNode parent) {
            this.parent = parent;
        }

        @Override
        public ExpenseTypeNode createExpenseTypeNode() {
            ExpenseTypeNode node = newExpenseTypeNode(parent, "expenseTypeNode");
            expenseTypeNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public ExpenseDescriptionNode createExpenseDescriptionNode() {
            ExpenseDescriptionNode node = newExpenseDescriptionNode(parent, "expenseDescriptionNode");
            expenseDescriptionNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public ExpenseMonthlyRepaymentNode createExpenseMonthlyRepaymentNode() {
            ExpenseMonthlyRepaymentNode node = newExpenseMonthlyRepaymentNode(parent, "expenseMonthlyRepaymentNode");
            expenseMonthlyRepaymentNodeInjector.injectMembers(node);
            return node;
        }

    }
}
