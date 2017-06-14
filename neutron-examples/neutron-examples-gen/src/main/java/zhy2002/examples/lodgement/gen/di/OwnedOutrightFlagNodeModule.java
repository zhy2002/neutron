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
public class OwnedOutrightFlagNodeModule {

    private final OwnedOutrightFlagNode owner;

    public OwnedOutrightFlagNodeModule(OwnedOutrightFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OwnedOutrightFlagNode provideOwnedOutrightFlagNode() {
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

    @Provides @ComponentScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

    @Provides @Named("OwnedOutrightFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OwnedOutrightFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OwnedOutrightFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OwnedOutrightFlagNode> provideTypeRuleProvider(OwnedOutrightFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OwnedOutrightFlagNode>> provideRuleProviders(
        @Named("OwnedOutrightFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<OwnedOutrightFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}