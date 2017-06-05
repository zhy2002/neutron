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
public class BrokerFirstNameNodeModule {

    private final BrokerFirstNameNode owner;

    public BrokerFirstNameNodeModule(BrokerFirstNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner BrokerFirstNameNode provideBrokerFirstNameNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner NameNode<?> provideNameNode() {
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

    @Provides @Named("BrokerFirstNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<BrokerFirstNameNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("BrokerFirstNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<BrokerFirstNameNode> provideTypeRuleProvider(BrokerFirstNameNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<BrokerFirstNameNode>> provideRuleProviders(
        @Named("BrokerFirstNameNodeRuleProvider")  Map<String, Provider<RuleProvider<BrokerFirstNameNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}