package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


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

    @Provides @ComponentScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

    @Provides @Named("TotalAssetNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<TotalAssetNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("TotalAssetNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<TotalAssetNode> provideTypeRuleProvider(TotalAssetNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("TotalAssetNodeRuleProvider") @IntoMap @StringKey("totalAssetNode")
        RuleProvider<TotalAssetNode> provideTotalAssetNodeChildRuleProvider(
            FinancialPositionNodeChildProvider.TotalAssetNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<TotalAssetNode>> provideRuleProviders(
        @Named("TotalAssetNodeRuleProvider")  Map<String, Provider<RuleProvider<TotalAssetNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}