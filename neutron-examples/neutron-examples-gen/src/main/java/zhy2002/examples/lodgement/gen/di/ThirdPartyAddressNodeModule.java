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
public class ThirdPartyAddressNodeModule {

    private final ThirdPartyAddressNode owner;

    public ThirdPartyAddressNodeModule(ThirdPartyAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ThirdPartyAddressNode provideThirdPartyAddressNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope RelatedPartyNode provideRelatedPartyNode() {
        return owner.getParent();
    }

    @Provides @Named("ThirdPartyAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ThirdPartyAddressNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ThirdPartyAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ThirdPartyAddressNode> provideTypeRuleProvider(ThirdPartyAddressNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ThirdPartyAddressNodeRuleProvider") @IntoMap @StringKey("thirdPartyAddressNode")
        RuleProvider<ThirdPartyAddressNode> provideThirdPartyAddressNodeChildRuleProvider(
            RelatedPartyNodeChildProvider.ThirdPartyAddressNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ThirdPartyAddressNode>> provideRuleProviders(
        @Named("ThirdPartyAddressNodeRuleProvider")  Map<String, Provider<RuleProvider<ThirdPartyAddressNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}