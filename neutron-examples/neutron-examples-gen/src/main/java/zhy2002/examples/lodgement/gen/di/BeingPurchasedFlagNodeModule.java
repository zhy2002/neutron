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
public class BeingPurchasedFlagNodeModule {

    private final BeingPurchasedFlagNode owner;

    public BeingPurchasedFlagNodeModule(BeingPurchasedFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner BeingPurchasedFlagNode provideBeingPurchasedFlagNode() {
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

    @Provides @Named("BeingPurchasedFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<BeingPurchasedFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("BeingPurchasedFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<BeingPurchasedFlagNode> provideTypeRuleProvider(BeingPurchasedFlagNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("BeingPurchasedFlagNodeRuleProvider") @IntoMap @StringKey("beingPurchasedFlagNode")
        RuleProvider<BeingPurchasedFlagNode> provideBeingPurchasedFlagNodeChildRuleProvider(
            UsageNodeChildProvider.BeingPurchasedFlagNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<BeingPurchasedFlagNode>> provideRuleProviders(
        @Named("BeingPurchasedFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<BeingPurchasedFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}