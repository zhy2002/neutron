package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class LoanMonthlyRepaymentNodeModule {

    private final LoanMonthlyRepaymentNode owner;

    public LoanMonthlyRepaymentNodeModule(LoanMonthlyRepaymentNode owner) {
        this.owner = owner;
    }

    @Provides @LoanMonthlyRepaymentNodeScope @Owner LoanMonthlyRepaymentNode provideLoanMonthlyRepaymentNode() {
        return owner;
    }

    @Provides @LoanMonthlyRepaymentNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @LoanMonthlyRepaymentNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @LoanMonthlyRepaymentNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LoanMonthlyRepaymentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @LoanMonthlyRepaymentNodeScope LoanNode provideLoanNode() {
        return owner.getParent();
    }

    @Provides @LoanMonthlyRepaymentNodeScope
    RuleProvider<LoanMonthlyRepaymentNode> provideRuleProvider(Provider<LoanMonthlyRepaymentNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @LoanMonthlyRepaymentNodeScope
    Map<String, RuleProvider<LoanMonthlyRepaymentNode>> provideInstanceProviderMap(
        Provider<LoanNodeChildProvider.LoanMonthlyRepaymentNodeRuleProvider> loanMonthlyRepaymentNodeRuleProvider
    ) {
        Map<String, RuleProvider<LoanMonthlyRepaymentNode>> result = new HashMap<>();
        result.put("loanMonthlyRepaymentNode", loanMonthlyRepaymentNodeRuleProvider.get());
        return result;
    }
}