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
public class LoanLimitAmountNodeModule {

    private final LoanLimitAmountNode owner;

    public LoanLimitAmountNodeModule(LoanLimitAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LoanLimitAmountNode provideLoanLimitAmountNode() {
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

    @Provides @Named("LoanLimitAmountNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<LoanLimitAmountNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("LoanLimitAmountNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<LoanLimitAmountNode> provideTypeRuleProvider(LoanLimitAmountNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<LoanLimitAmountNode>> provideRuleProviders(
        @Named("LoanLimitAmountNodeRuleProvider")  Map<String, Provider<RuleProvider<LoanLimitAmountNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}