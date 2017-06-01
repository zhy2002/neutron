package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ExpenseMonthlyRepaymentNodeModule {

    private final ExpenseMonthlyRepaymentNode owner;

    public ExpenseMonthlyRepaymentNodeModule(ExpenseMonthlyRepaymentNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ExpenseMonthlyRepaymentNode provideExpenseMonthlyRepaymentNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ExpenseNode provideExpenseNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ExpenseMonthlyRepaymentNode> provideRuleProvider(Provider<ExpenseMonthlyRepaymentNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ExpenseMonthlyRepaymentNode>> provideInstanceProviderMap(
        Provider<ExpenseNodeChildProvider.ExpenseMonthlyRepaymentNodeRuleProvider> expenseMonthlyRepaymentNodeRuleProvider
    ) {
        Map<String, RuleProvider<ExpenseMonthlyRepaymentNode>> result = new HashMap<>();
        result.put("expenseMonthlyRepaymentNode", expenseMonthlyRepaymentNodeRuleProvider.get());
        return result;
    }
}