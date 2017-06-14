package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
import java.util.*;


@Module
public class LoanMonthlyRepaymentNodeModule {

    private final LoanMonthlyRepaymentNode owner;

    public LoanMonthlyRepaymentNodeModule(LoanMonthlyRepaymentNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LoanMonthlyRepaymentNode provideLoanMonthlyRepaymentNode() {
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

    @Provides @Named("LoanMonthlyRepaymentNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<LoanMonthlyRepaymentNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("LoanMonthlyRepaymentNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<LoanMonthlyRepaymentNode> provideTypeRuleProvider(LoanMonthlyRepaymentNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<LoanMonthlyRepaymentNode>> provideRuleProviders(
        @Named("LoanMonthlyRepaymentNodeRuleProvider")  Map<String, Provider<RuleProvider<LoanMonthlyRepaymentNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}