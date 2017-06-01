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
public class ProfitPreviousYearNodeModule {

    private final ProfitPreviousYearNode owner;

    public ProfitPreviousYearNodeModule(ProfitPreviousYearNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProfitPreviousYearNode provideProfitPreviousYearNode() {
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

    @Provides @Named("ProfitPreviousYearNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProfitPreviousYearNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProfitPreviousYearNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProfitPreviousYearNode> provideTypeRuleProvider(ProfitPreviousYearNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProfitPreviousYearNodeRuleProvider") @IntoMap @StringKey("profitPreviousYearNode")
        RuleProvider<ProfitPreviousYearNode> provideProfitPreviousYearNodeChildRuleProvider(
            SelfEmployedNodeChildProvider.ProfitPreviousYearNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProfitPreviousYearNode>> provideRuleProviders(
        @Named("ProfitPreviousYearNodeRuleProvider")  Map<String, Provider<RuleProvider<ProfitPreviousYearNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}