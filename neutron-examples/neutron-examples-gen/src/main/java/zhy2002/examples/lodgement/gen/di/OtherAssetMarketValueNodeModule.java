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
public class OtherAssetMarketValueNodeModule {

    private final OtherAssetMarketValueNode owner;

    public OtherAssetMarketValueNodeModule(OtherAssetMarketValueNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherAssetMarketValueNode provideOtherAssetMarketValueNode() {
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

    @Provides @ComponentScope OtherAssetNode provideOtherAssetNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherAssetMarketValueNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherAssetMarketValueNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherAssetMarketValueNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherAssetMarketValueNode> provideTypeRuleProvider(OtherAssetMarketValueNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherAssetMarketValueNode>> provideRuleProviders(
        @Named("OtherAssetMarketValueNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherAssetMarketValueNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}