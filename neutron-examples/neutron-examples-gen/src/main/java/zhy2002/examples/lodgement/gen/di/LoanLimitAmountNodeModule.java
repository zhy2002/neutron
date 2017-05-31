package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class LoanLimitAmountNodeModule {

    private final LoanLimitAmountNode owner;

    public LoanLimitAmountNodeModule(LoanLimitAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LoanLimitAmountNode provideLoanLimitAmountNode() {
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
    RuleProvider<LoanLimitAmountNode> provideRuleProvider(Provider<LoanLimitAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<LoanLimitAmountNode>> provideInstanceProviderMap(
        Provider<LoanNodeChildProvider.LoanLimitAmountNodeRuleProvider> loanLimitAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<LoanLimitAmountNode>> result = new HashMap<>();
        result.put("loanLimitAmountNode", loanLimitAmountNodeRuleProvider.get());
        return result;
    }
}