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
public class AverageFlagNodeModule {

    private final AverageFlagNode owner;

    public AverageFlagNodeModule(AverageFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AverageFlagNode provideAverageFlagNode() {
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

    @Provides @ComponentScope OwnershipNode provideOwnershipNode() {
        return owner.getParent();
    }

    @Provides @Named("AverageFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<AverageFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("AverageFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<AverageFlagNode> provideTypeRuleProvider(AverageFlagNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("AverageFlagNodeRuleProvider") @IntoMap @StringKey("averageFlagNode")
        RuleProvider<AverageFlagNode> provideAverageFlagNodeChildRuleProvider(
            OwnershipNodeChildProvider.AverageFlagNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<AverageFlagNode>> provideRuleProviders(
        @Named("AverageFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<AverageFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}