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

    @Provides @ComponentScope @Owner LoanMonthlyRepaymentNode provideLoanMonthlyRepaymentNode() {
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

    @Provides @ComponentScope LoanNode provideLoanNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<LoanMonthlyRepaymentNode> provideRuleProvider(Provider<LoanMonthlyRepaymentNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<LoanMonthlyRepaymentNode>> provideInstanceProviderMap(
        Provider<LoanNodeChildProvider.LoanMonthlyRepaymentNodeRuleProvider> loanMonthlyRepaymentNodeRuleProvider
    ) {
        Map<String, RuleProvider<LoanMonthlyRepaymentNode>> result = new HashMap<>();
        result.put("loanMonthlyRepaymentNode", loanMonthlyRepaymentNodeRuleProvider.get());
        return result;
    }
}