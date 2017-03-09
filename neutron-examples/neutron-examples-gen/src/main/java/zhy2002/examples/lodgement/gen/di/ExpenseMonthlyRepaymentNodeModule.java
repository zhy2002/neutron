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

    @Provides @ExpenseMonthlyRepaymentNodeScope @Owner ExpenseMonthlyRepaymentNode provideExpenseMonthlyRepaymentNode() {
        return owner;
    }

    @Provides @ExpenseMonthlyRepaymentNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ExpenseMonthlyRepaymentNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ExpenseMonthlyRepaymentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ExpenseMonthlyRepaymentNodeScope ExpenseNode provideExpenseNode() {
        return owner.getParent();
    }

    @Provides @ExpenseMonthlyRepaymentNodeScope
    Map<String, RuleProvider<ExpenseMonthlyRepaymentNode>> provideInstanceProviders(
        Provider<ExpenseNodeChildProvider.ExpenseMonthlyRepaymentNodeRuleProvider> expenseMonthlyRepaymentNodeRuleProvider
    ) {
        Map<String, RuleProvider<ExpenseMonthlyRepaymentNode>> result = new HashMap<>();
        result.put("expenseMonthlyRepaymentNode", expenseMonthlyRepaymentNodeRuleProvider.get());
        return result;
    }
}