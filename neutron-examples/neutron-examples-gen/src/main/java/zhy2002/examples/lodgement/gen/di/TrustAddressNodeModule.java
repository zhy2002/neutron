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
public class TrustAddressNodeModule {

    private final TrustAddressNode owner;

    public TrustAddressNodeModule(TrustAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustAddressNode provideTrustAddressNode() {
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

    @Provides @ComponentScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @Named("TrustAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<TrustAddressNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("TrustAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<TrustAddressNode> provideTypeRuleProvider(TrustAddressNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<TrustAddressNode>> provideRuleProviders(
        @Named("TrustAddressNodeRuleProvider")  Map<String, Provider<RuleProvider<TrustAddressNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}