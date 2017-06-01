package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgageBreakFeeNodeModule {

    private final MortgageBreakFeeNode owner;

    public MortgageBreakFeeNodeModule(MortgageBreakFeeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgageBreakFeeNode provideMortgageBreakFeeNode() {
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

    @Provides @ComponentScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<MortgageBreakFeeNode> provideRuleProvider(Provider<MortgageBreakFeeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<MortgageBreakFeeNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageBreakFeeNodeRuleProvider> mortgageBreakFeeNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageBreakFeeNode>> result = new HashMap<>();
        result.put("mortgageBreakFeeNode", mortgageBreakFeeNodeRuleProvider.get());
        return result;
    }
}