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
public class BrokerAddressNodeModule {

    private final BrokerAddressNode owner;

    public BrokerAddressNodeModule(BrokerAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner BrokerAddressNode provideBrokerAddressNode() {
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

    @Provides @ComponentScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @Named("BrokerAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<BrokerAddressNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("BrokerAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<BrokerAddressNode> provideTypeRuleProvider(BrokerAddressNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("BrokerAddressNodeRuleProvider") @IntoMap @StringKey("brokerAddressNode")
        RuleProvider<BrokerAddressNode> provideBrokerAddressNodeChildRuleProvider(
            SubmissionNodeChildProvider.BrokerAddressNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<BrokerAddressNode>> provideRuleProviders(
        @Named("BrokerAddressNodeRuleProvider")  Map<String, Provider<RuleProvider<BrokerAddressNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}