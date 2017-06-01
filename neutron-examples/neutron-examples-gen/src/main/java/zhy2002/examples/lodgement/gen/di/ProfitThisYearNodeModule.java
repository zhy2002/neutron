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
public class ProfitThisYearNodeModule {

    private final ProfitThisYearNode owner;

    public ProfitThisYearNodeModule(ProfitThisYearNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProfitThisYearNode provideProfitThisYearNode() {
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

    @Provides @ComponentScope SelfEmployedNode provideSelfEmployedNode() {
        return owner.getParent();
    }

    @Provides @Named("ProfitThisYearNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProfitThisYearNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProfitThisYearNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProfitThisYearNode> provideTypeRuleProvider(ProfitThisYearNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProfitThisYearNodeRuleProvider") @IntoMap @StringKey("profitThisYearNode")
        RuleProvider<ProfitThisYearNode> provideProfitThisYearNodeChildRuleProvider(
            SelfEmployedNodeChildProvider.ProfitThisYearNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProfitThisYearNode>> provideRuleProviders(
        @Named("ProfitThisYearNodeRuleProvider")  Map<String, Provider<RuleProvider<ProfitThisYearNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}