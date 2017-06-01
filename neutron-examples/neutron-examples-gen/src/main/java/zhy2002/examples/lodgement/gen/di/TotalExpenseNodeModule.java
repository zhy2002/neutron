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
public class TotalExpenseNodeModule {

    private final TotalExpenseNode owner;

    public TotalExpenseNodeModule(TotalExpenseNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner TotalExpenseNode provideTotalExpenseNode() {
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

    @Provides @ComponentScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

    @Provides @Named("TotalExpenseNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<TotalExpenseNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("TotalExpenseNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<TotalExpenseNode> provideTypeRuleProvider(TotalExpenseNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("TotalExpenseNodeRuleProvider") @IntoMap @StringKey("totalExpenseNode")
        RuleProvider<TotalExpenseNode> provideTotalExpenseNodeChildRuleProvider(
            FinancialPositionNodeChildProvider.TotalExpenseNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<TotalExpenseNode>> provideRuleProviders(
        @Named("TotalExpenseNodeRuleProvider")  Map<String, Provider<RuleProvider<TotalExpenseNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}