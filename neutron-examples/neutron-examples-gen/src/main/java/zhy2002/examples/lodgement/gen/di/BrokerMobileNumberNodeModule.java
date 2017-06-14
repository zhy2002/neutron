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
public class BrokerMobileNumberNodeModule {

    private final BrokerMobileNumberNode owner;

    public BrokerMobileNumberNodeModule(BrokerMobileNumberNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner BrokerMobileNumberNode provideBrokerMobileNumberNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseMobileNumberNode<?> provideBaseMobileNumberNode() {
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

    @Provides @Named("BrokerMobileNumberNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<BrokerMobileNumberNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("BrokerMobileNumberNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<BrokerMobileNumberNode> provideTypeRuleProvider(BrokerMobileNumberNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<BrokerMobileNumberNode>> provideRuleProviders(
        @Named("BrokerMobileNumberNodeRuleProvider")  Map<String, Provider<RuleProvider<BrokerMobileNumberNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}