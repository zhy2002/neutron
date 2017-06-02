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
public class BrokerTelephoneNodeModule {

    private final BrokerTelephoneNode owner;

    public BrokerTelephoneNodeModule(BrokerTelephoneNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner BrokerTelephoneNode provideBrokerTelephoneNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @Named("BrokerTelephoneNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<BrokerTelephoneNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("BrokerTelephoneNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<BrokerTelephoneNode> provideTypeRuleProvider(BrokerTelephoneNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<BrokerTelephoneNode>> provideRuleProviders(
        @Named("BrokerTelephoneNodeRuleProvider")  Map<String, Provider<RuleProvider<BrokerTelephoneNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}