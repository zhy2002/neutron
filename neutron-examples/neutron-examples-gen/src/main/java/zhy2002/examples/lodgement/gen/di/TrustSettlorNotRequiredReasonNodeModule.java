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
public class TrustSettlorNotRequiredReasonNodeModule {

    private final TrustSettlorNotRequiredReasonNode owner;

    public TrustSettlorNotRequiredReasonNodeModule(TrustSettlorNotRequiredReasonNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TrustSettlorNotRequiredReasonNode provideTrustSettlorNotRequiredReasonNode() {
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

    @Provides @ComponentScope BaseTrustNode<?> provideBaseTrustNode() {
        return owner.getParent();
    }

    @Provides @Named("TrustSettlorNotRequiredReasonNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<TrustSettlorNotRequiredReasonNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("TrustSettlorNotRequiredReasonNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<TrustSettlorNotRequiredReasonNode> provideTypeRuleProvider(TrustSettlorNotRequiredReasonNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<TrustSettlorNotRequiredReasonNode>> provideRuleProviders(
        @Named("TrustSettlorNotRequiredReasonNodeRuleProvider")  Map<String, Provider<RuleProvider<TrustSettlorNotRequiredReasonNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}