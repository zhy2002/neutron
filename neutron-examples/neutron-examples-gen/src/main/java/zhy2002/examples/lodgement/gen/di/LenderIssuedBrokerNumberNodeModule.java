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
public class LenderIssuedBrokerNumberNodeModule {

    private final LenderIssuedBrokerNumberNode owner;

    public LenderIssuedBrokerNumberNodeModule(LenderIssuedBrokerNumberNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LenderIssuedBrokerNumberNode provideLenderIssuedBrokerNumberNode() {
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

    @Provides @Named("LenderIssuedBrokerNumberNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<LenderIssuedBrokerNumberNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("LenderIssuedBrokerNumberNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<LenderIssuedBrokerNumberNode> provideTypeRuleProvider(LenderIssuedBrokerNumberNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("LenderIssuedBrokerNumberNodeRuleProvider") @IntoMap @StringKey("lenderIssuedBrokerNumberNode")
        RuleProvider<LenderIssuedBrokerNumberNode> provideLenderIssuedBrokerNumberNodeChildRuleProvider(
            SubmissionNodeChildProvider.LenderIssuedBrokerNumberNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<LenderIssuedBrokerNumberNode>> provideRuleProviders(
        @Named("LenderIssuedBrokerNumberNodeRuleProvider")  Map<String, Provider<RuleProvider<LenderIssuedBrokerNumberNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}