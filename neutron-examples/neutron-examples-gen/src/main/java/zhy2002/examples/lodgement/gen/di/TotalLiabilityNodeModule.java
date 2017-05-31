package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TotalLiabilityNodeModule {

    private final TotalLiabilityNode owner;

    public TotalLiabilityNodeModule(TotalLiabilityNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TotalLiabilityNode provideTotalLiabilityNode() {
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

    @Provides @ComponentScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<TotalLiabilityNode> provideRuleProvider(Provider<TotalLiabilityNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<TotalLiabilityNode>> provideInstanceProviderMap(
        Provider<FinancialPositionNodeChildProvider.TotalLiabilityNodeRuleProvider> totalLiabilityNodeRuleProvider
    ) {
        Map<String, RuleProvider<TotalLiabilityNode>> result = new HashMap<>();
        result.put("totalLiabilityNode", totalLiabilityNodeRuleProvider.get());
        return result;
    }
}