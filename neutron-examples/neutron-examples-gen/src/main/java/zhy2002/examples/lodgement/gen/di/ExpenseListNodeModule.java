package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ExpenseListNodeModule {

    private final ExpenseListNode owner;

    public ExpenseListNodeModule(ExpenseListNode owner) {
        this.owner = owner;
    }

    @Provides @ExpenseListNodeScope @Owner ExpenseListNode provideExpenseListNode() {
        return owner;
    }

    @Provides @ExpenseListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ExpenseListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ExpenseListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ExpenseListNodeScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

    @Provides @ExpenseListNodeScope
    Map<String, RuleProvider<ExpenseListNode>> provideInstanceProviders(
        Provider<FinancialPositionNodeChildProvider.ExpenseListNodeRuleProvider> expenseListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ExpenseListNode>> result = new HashMap<>();
        result.put("expenseListNode", expenseListNodeRuleProvider.get());
        return result;
    }
}