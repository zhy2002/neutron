package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class LoanBreakCostNodeModule {

    private final LoanBreakCostNode owner;

    public LoanBreakCostNodeModule(LoanBreakCostNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LoanBreakCostNode provideLoanBreakCostNode() {
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
    RuleProvider<LoanBreakCostNode> provideRuleProvider(Provider<LoanBreakCostNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<LoanBreakCostNode>> provideInstanceProviderMap(
        Provider<LoanNodeChildProvider.LoanBreakCostNodeRuleProvider> loanBreakCostNodeRuleProvider
    ) {
        Map<String, RuleProvider<LoanBreakCostNode>> result = new HashMap<>();
        result.put("loanBreakCostNode", loanBreakCostNodeRuleProvider.get());
        return result;
    }
}