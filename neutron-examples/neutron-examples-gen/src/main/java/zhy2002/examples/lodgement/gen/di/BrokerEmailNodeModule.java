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
public class BrokerEmailNodeModule {

    private final BrokerEmailNode owner;

    public BrokerEmailNodeModule(BrokerEmailNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner BrokerEmailNode provideBrokerEmailNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner EmailNode<?> provideEmailNode() {
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

    @Provides @ComponentScope SubmissionNode provideSubmissionNode() {
        return owner.getParent();
    }

    @Provides @Named("BrokerEmailNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<BrokerEmailNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("BrokerEmailNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<BrokerEmailNode> provideTypeRuleProvider(BrokerEmailNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("BrokerEmailNodeRuleProvider") @IntoMap @StringKey("brokerEmailNode")
        RuleProvider<BrokerEmailNode> provideBrokerEmailNodeChildRuleProvider(
            SubmissionNodeChildProvider.BrokerEmailNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<BrokerEmailNode>> provideRuleProviders(
        @Named("BrokerEmailNodeRuleProvider")  Map<String, Provider<RuleProvider<BrokerEmailNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}