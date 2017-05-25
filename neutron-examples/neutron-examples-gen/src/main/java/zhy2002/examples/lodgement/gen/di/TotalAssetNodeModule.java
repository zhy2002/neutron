package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TotalAssetNodeModule {

    private final TotalAssetNode owner;

    public TotalAssetNodeModule(TotalAssetNode owner) {
        this.owner = owner;
    }

    @Provides @TotalAssetNodeScope @Owner TotalAssetNode provideTotalAssetNode() {
        return owner;
    }

    @Provides @TotalAssetNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @TotalAssetNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @TotalAssetNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TotalAssetNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TotalAssetNodeScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

    @Provides @TotalAssetNodeScope
    RuleProvider<TotalAssetNode> provideRuleProvider(Provider<TotalAssetNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @TotalAssetNodeScope
    Map<String, RuleProvider<TotalAssetNode>> provideInstanceProviderMap(
        Provider<FinancialPositionNodeChildProvider.TotalAssetNodeRuleProvider> totalAssetNodeRuleProvider
    ) {
        Map<String, RuleProvider<TotalAssetNode>> result = new HashMap<>();
        result.put("totalAssetNode", totalAssetNodeRuleProvider.get());
        return result;
    }
}