package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CreditCardMonthlyRepaymentNodeModule {

    private final CreditCardMonthlyRepaymentNode owner;

    public CreditCardMonthlyRepaymentNodeModule(CreditCardMonthlyRepaymentNode owner) {
        this.owner = owner;
    }

    @Provides @CreditCardMonthlyRepaymentNodeScope @Owner CreditCardMonthlyRepaymentNode provideCreditCardMonthlyRepaymentNode() {
        return owner;
    }

    @Provides @CreditCardMonthlyRepaymentNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @CreditCardMonthlyRepaymentNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @CreditCardMonthlyRepaymentNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CreditCardMonthlyRepaymentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CreditCardMonthlyRepaymentNodeScope CreditCardNode provideCreditCardNode() {
        return owner.getParent();
    }

    @Provides @CreditCardMonthlyRepaymentNodeScope
    RuleProvider<CreditCardMonthlyRepaymentNode> provideRuleProvider(Provider<CreditCardMonthlyRepaymentNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @CreditCardMonthlyRepaymentNodeScope
    Map<String, RuleProvider<CreditCardMonthlyRepaymentNode>> provideInstanceProviderMap(
        Provider<CreditCardNodeChildProvider.CreditCardMonthlyRepaymentNodeRuleProvider> creditCardMonthlyRepaymentNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCardMonthlyRepaymentNode>> result = new HashMap<>();
        result.put("creditCardMonthlyRepaymentNode", creditCardMonthlyRepaymentNodeRuleProvider.get());
        return result;
    }
}