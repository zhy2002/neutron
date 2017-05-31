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

    @Provides @ComponentScope @Owner ExpenseListNode provideExpenseListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ExpenseListNode> provideRuleProvider(Provider<ExpenseListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ExpenseListNode>> provideInstanceProviderMap(
        Provider<FinancialPositionNodeChildProvider.ExpenseListNodeRuleProvider> expenseListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ExpenseListNode>> result = new HashMap<>();
        result.put("expenseListNode", expenseListNodeRuleProvider.get());
        return result;
    }
}