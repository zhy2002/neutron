package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


interface ExpenseNodeChildFactory {
    ExpenseTypeNode createExpenseTypeNode();
    ExpenseDescriptionNode createExpenseDescriptionNode();
    ExpenseMonthlyRepaymentNode createExpenseMonthlyRepaymentNode();
    ExpenseOwnershipListNode createOwnershipListNode();
}

@Singleton
public class ExpenseNodeChildProvider {
    @Inject
    MembersInjector<ExpenseOwnershipListNode> expenseOwnershipListNodeInjector;
    @Inject
    MembersInjector<ExpenseDescriptionNode> expenseDescriptionNodeInjector;
    @Inject
    MembersInjector<ExpenseTypeNode> expenseTypeNodeInjector;
    @Inject
    MembersInjector<ExpenseMonthlyRepaymentNode> expenseMonthlyRepaymentNodeInjector;

    @Inject
    protected ExpenseNodeChildProvider () {}

    protected MembersInjector<ExpenseOwnershipListNode> getExpenseOwnershipListNodeInjector() {
        return this.expenseOwnershipListNodeInjector;
    }

    protected MembersInjector<ExpenseDescriptionNode> getExpenseDescriptionNodeInjector() {
        return this.expenseDescriptionNodeInjector;
    }

    protected MembersInjector<ExpenseTypeNode> getExpenseTypeNodeInjector() {
        return this.expenseTypeNodeInjector;
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

    protected void configureExpenseTypeNode(ExpenseTypeNode node) {
    }

    @ComponentScope
    public static class ExpenseTypeNodeRuleProvider implements RuleProvider<ExpenseTypeNode> {

        @Inject
        public ExpenseTypeNodeRuleProvider() {

        }

        @Override
        public void initializeState(ExpenseTypeNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ExpenseDescriptionNode newExpenseDescriptionNode(
        ExpenseNode parent,
        String name
    ) {
        return new ExpenseDescriptionNode(parent, name);
    }

    protected void configureExpenseDescriptionNode(ExpenseDescriptionNode node) {
    }

    @ComponentScope
    public static class ExpenseDescriptionNodeRuleProvider implements RuleProvider<ExpenseDescriptionNode> {

        @Inject
        public ExpenseDescriptionNodeRuleProvider() {

        }

        @Override
        public void initializeState(ExpenseDescriptionNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ExpenseMonthlyRepaymentNode newExpenseMonthlyRepaymentNode(
        ExpenseNode parent,
        String name
    ) {
        return new ExpenseMonthlyRepaymentNode(parent, name);
    }

    protected void configureExpenseMonthlyRepaymentNode(ExpenseMonthlyRepaymentNode node) {
    }

    @ComponentScope
    public static class ExpenseMonthlyRepaymentNodeRuleProvider implements RuleProvider<ExpenseMonthlyRepaymentNode> {

        @Inject
        public ExpenseMonthlyRepaymentNodeRuleProvider() {

        }

        @Override
        public void initializeState(ExpenseMonthlyRepaymentNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected ExpenseOwnershipListNode newOwnershipListNode(
        ExpenseNode parent,
        String name
    ) {
        return new ExpenseOwnershipListNode(parent, name);
    }

    protected void configureOwnershipListNode(ExpenseOwnershipListNode node) {
    }

    @ComponentScope
    public static class OwnershipListNodeRuleProvider implements RuleProvider<ExpenseOwnershipListNode> {

        @Inject
        public OwnershipListNodeRuleProvider() {

        }

        @Override
        public void initializeState(ExpenseOwnershipListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
            configureExpenseTypeNode(node);
            return node;
        }

        @Override
        public ExpenseDescriptionNode createExpenseDescriptionNode() {
            ExpenseDescriptionNode node = newExpenseDescriptionNode(parent, "expenseDescriptionNode");
            expenseDescriptionNodeInjector.injectMembers(node);
            configureExpenseDescriptionNode(node);
            return node;
        }

        @Override
        public ExpenseMonthlyRepaymentNode createExpenseMonthlyRepaymentNode() {
            ExpenseMonthlyRepaymentNode node = newExpenseMonthlyRepaymentNode(parent, "expenseMonthlyRepaymentNode");
            expenseMonthlyRepaymentNodeInjector.injectMembers(node);
            configureExpenseMonthlyRepaymentNode(node);
            return node;
        }

        @Override
        public ExpenseOwnershipListNode createOwnershipListNode() {
            ExpenseOwnershipListNode node = newOwnershipListNode(parent, "ownershipListNode");
            expenseOwnershipListNodeInjector.injectMembers(node);
            configureOwnershipListNode(node);
            return node;
        }

    }
}
