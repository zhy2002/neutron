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

    @Provides @ComponentScope @Owner TotalAssetNode provideTotalAssetNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<TotalAssetNode> provideRuleProvider(Provider<TotalAssetNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<TotalAssetNode>> provideInstanceProviderMap(
        Provider<FinancialPositionNodeChildProvider.TotalAssetNodeRuleProvider> totalAssetNodeRuleProvider
    ) {
        Map<String, RuleProvider<TotalAssetNode>> result = new HashMap<>();
        result.put("totalAssetNode", totalAssetNodeRuleProvider.get());
        return result;
    }
}