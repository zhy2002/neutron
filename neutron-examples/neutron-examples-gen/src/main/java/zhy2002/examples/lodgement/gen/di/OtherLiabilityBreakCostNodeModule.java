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
public class OtherLiabilityBreakCostNodeModule {

    private final OtherLiabilityBreakCostNode owner;

    public OtherLiabilityBreakCostNodeModule(OtherLiabilityBreakCostNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherLiabilityBreakCostNode provideOtherLiabilityBreakCostNode() {
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

    @Provides @Named("OtherLiabilityBreakCostNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<OtherLiabilityBreakCostNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("OtherLiabilityBreakCostNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<OtherLiabilityBreakCostNode> provideTypeRuleProvider(OtherLiabilityBreakCostNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<OtherLiabilityBreakCostNode>> provideRuleProviders(
        @Named("OtherLiabilityBreakCostNodeRuleProvider")  Map<String, Provider<RuleProvider<OtherLiabilityBreakCostNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}