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
public class LoanOwingAmountNodeModule {

    private final LoanOwingAmountNode owner;

    public LoanOwingAmountNodeModule(LoanOwingAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LoanOwingAmountNode provideLoanOwingAmountNode() {
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

    @Provides @Named("LoanOwingAmountNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<LoanOwingAmountNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("LoanOwingAmountNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<LoanOwingAmountNode> provideTypeRuleProvider(LoanOwingAmountNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("LoanOwingAmountNodeRuleProvider") @IntoMap @StringKey("loanOwingAmountNode")
        RuleProvider<LoanOwingAmountNode> provideLoanOwingAmountNodeChildRuleProvider(
            LoanNodeChildProvider.LoanOwingAmountNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<LoanOwingAmountNode>> provideRuleProviders(
        @Named("LoanOwingAmountNodeRuleProvider")  Map<String, Provider<RuleProvider<LoanOwingAmountNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}