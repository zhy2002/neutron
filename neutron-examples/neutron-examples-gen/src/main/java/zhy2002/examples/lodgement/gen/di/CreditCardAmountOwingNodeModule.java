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
public class CreditCardAmountOwingNodeModule {

    private final CreditCardAmountOwingNode owner;

    public CreditCardAmountOwingNodeModule(CreditCardAmountOwingNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CreditCardAmountOwingNode provideCreditCardAmountOwingNode() {
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

    @Provides @Named("CreditCardAmountOwingNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CreditCardAmountOwingNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CreditCardAmountOwingNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CreditCardAmountOwingNode> provideTypeRuleProvider(CreditCardAmountOwingNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("CreditCardAmountOwingNodeRuleProvider") @IntoMap @StringKey("creditCardAmountOwingNode")
        RuleProvider<CreditCardAmountOwingNode> provideCreditCardAmountOwingNodeChildRuleProvider(
            CreditCardNodeChildProvider.CreditCardAmountOwingNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<CreditCardAmountOwingNode>> provideRuleProviders(
        @Named("CreditCardAmountOwingNodeRuleProvider")  Map<String, Provider<RuleProvider<CreditCardAmountOwingNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}