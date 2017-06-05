package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
import java.util.*;


@Module
public class ThirdPartyDisclosureFlagNodeModule {

    private final ThirdPartyDisclosureFlagNode owner;

    public ThirdPartyDisclosureFlagNodeModule(ThirdPartyDisclosureFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ThirdPartyDisclosureFlagNode provideThirdPartyDisclosureFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner.getParent();
    }

    @Provides @Named("ThirdPartyDisclosureFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ThirdPartyDisclosureFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ThirdPartyDisclosureFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ThirdPartyDisclosureFlagNode> provideTypeRuleProvider(ThirdPartyDisclosureFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ThirdPartyDisclosureFlagNode>> provideRuleProviders(
        @Named("ThirdPartyDisclosureFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<ThirdPartyDisclosureFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}