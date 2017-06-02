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
public class ExpenseMonthlyRepaymentNodeModule {

    private final ExpenseMonthlyRepaymentNode owner;

    public ExpenseMonthlyRepaymentNodeModule(ExpenseMonthlyRepaymentNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ExpenseMonthlyRepaymentNode provideExpenseMonthlyRepaymentNode() {
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

    @Provides @ComponentScope ExpenseNode provideExpenseNode() {
        return owner.getParent();
    }

    @Provides @Named("ExpenseMonthlyRepaymentNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ExpenseMonthlyRepaymentNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ExpenseMonthlyRepaymentNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ExpenseMonthlyRepaymentNode> provideTypeRuleProvider(ExpenseMonthlyRepaymentNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ExpenseMonthlyRepaymentNode>> provideRuleProviders(
        @Named("ExpenseMonthlyRepaymentNodeRuleProvider")  Map<String, Provider<RuleProvider<ExpenseMonthlyRepaymentNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}