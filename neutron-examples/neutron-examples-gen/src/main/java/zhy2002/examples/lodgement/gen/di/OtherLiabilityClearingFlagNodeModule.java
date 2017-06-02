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
public class OtherLiabilityClearingFlagNodeModule {

    private final OtherLiabilityClearingFlagNode owner;

    public OtherLiabilityClearingFlagNodeModule(OtherLiabilityClearingFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherLiabilityClearingFlagNode provideOtherLiabilityClearingFlagNode() {
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

    @Provides @ComponentScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @Named("OtherLiabilityClearingFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherLiabilityClearingFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherLiabilityClearingFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherLiabilityClearingFlagNode> provideTypeRuleProvider(OtherLiabilityClearingFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherLiabilityClearingFlagNode>> provideRuleProviders(
        @Named("OtherLiabilityClearingFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherLiabilityClearingFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}