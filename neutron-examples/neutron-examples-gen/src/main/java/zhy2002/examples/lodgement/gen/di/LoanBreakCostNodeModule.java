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
public class LoanBreakCostNodeModule {

    private final LoanBreakCostNode owner;

    public LoanBreakCostNodeModule(LoanBreakCostNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LoanBreakCostNode provideLoanBreakCostNode() {
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

    @Provides @ComponentScope LoanNode provideLoanNode() {
        return owner.getParent();
    }

    @Provides @Named("LoanBreakCostNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<LoanBreakCostNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("LoanBreakCostNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<LoanBreakCostNode> provideTypeRuleProvider(LoanBreakCostNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<LoanBreakCostNode>> provideRuleProviders(
        @Named("LoanBreakCostNodeRuleProvider")  Map<String, Provider<RuleProvider<LoanBreakCostNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}