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
public class CreditCardBreakCostNodeModule {

    private final CreditCardBreakCostNode owner;

    public CreditCardBreakCostNodeModule(CreditCardBreakCostNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CreditCardBreakCostNode provideCreditCardBreakCostNode() {
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

    @Provides @ComponentScope CreditCardNode provideCreditCardNode() {
        return owner.getParent();
    }

    @Provides @Named("CreditCardBreakCostNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CreditCardBreakCostNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CreditCardBreakCostNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CreditCardBreakCostNode> provideTypeRuleProvider(CreditCardBreakCostNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<CreditCardBreakCostNode>> provideRuleProviders(
        @Named("CreditCardBreakCostNodeRuleProvider")  Map<String, Provider<RuleProvider<CreditCardBreakCostNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}