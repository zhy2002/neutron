package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class LoanOwingAmountNodeModule {

    private final LoanOwingAmountNode owner;

    public LoanOwingAmountNodeModule(LoanOwingAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LoanOwingAmountNode provideLoanOwingAmountNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope LoanNode provideLoanNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<LoanOwingAmountNode> provideRuleProvider(Provider<LoanOwingAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<LoanOwingAmountNode>> provideInstanceProviderMap(
        Provider<LoanNodeChildProvider.LoanOwingAmountNodeRuleProvider> loanOwingAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<LoanOwingAmountNode>> result = new HashMap<>();
        result.put("loanOwingAmountNode", loanOwingAmountNodeRuleProvider.get());
        return result;
    }
}