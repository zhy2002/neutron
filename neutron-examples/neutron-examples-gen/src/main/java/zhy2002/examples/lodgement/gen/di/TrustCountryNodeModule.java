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
public class TrustCountryNodeModule {

    private final TrustCountryNode owner;

    public TrustCountryNodeModule(TrustCountryNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustCountryNode provideTrustCountryNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCountryNode<?> provideBaseCountryNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @Named("TrustCountryNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<TrustCountryNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("TrustCountryNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<TrustCountryNode> provideTypeRuleProvider(TrustCountryNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("TrustCountryNodeRuleProvider") @IntoMap @StringKey("trustCountryNode")
        RuleProvider<TrustCountryNode> provideTrustCountryNodeChildRuleProvider(
            BaseTrustNodeChildProvider.TrustCountryNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<TrustCountryNode>> provideRuleProviders(
        @Named("TrustCountryNodeRuleProvider")  Map<String, Provider<RuleProvider<TrustCountryNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}