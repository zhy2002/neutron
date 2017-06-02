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
public class OtherLiabilityAmountOwningNodeModule {

    private final OtherLiabilityAmountOwningNode owner;

    public OtherLiabilityAmountOwningNodeModule(OtherLiabilityAmountOwningNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherLiabilityAmountOwningNode provideOtherLiabilityAmountOwningNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
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

    @Provides @Named("OtherLiabilityAmountOwningNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherLiabilityAmountOwningNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherLiabilityAmountOwningNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherLiabilityAmountOwningNode> provideTypeRuleProvider(OtherLiabilityAmountOwningNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherLiabilityAmountOwningNode>> provideRuleProviders(
        @Named("OtherLiabilityAmountOwningNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherLiabilityAmountOwningNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}