package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CreditCardLimitAmountNodeModule {

    private final CreditCardLimitAmountNode owner;

    public CreditCardLimitAmountNodeModule(CreditCardLimitAmountNode owner) {
        this.owner = owner;
    }

    @Provides @CreditCardLimitAmountNodeScope @Owner CreditCardLimitAmountNode provideCreditCardLimitAmountNode() {
        return owner;
    }

    @Provides @CreditCardLimitAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @CreditCardLimitAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @CreditCardLimitAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CreditCardLimitAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CreditCardLimitAmountNodeScope CreditCardNode provideCreditCardNode() {
        return owner.getParent();
    }

    @Provides @CreditCardLimitAmountNodeScope
    Map<String, RuleProvider<CreditCardLimitAmountNode>> provideInstanceProviders(
        Provider<CreditCardNodeChildProvider.CreditCardLimitAmountNodeRuleProvider> creditCardLimitAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCardLimitAmountNode>> result = new HashMap<>();
        result.put("creditCardLimitAmountNode", creditCardLimitAmountNodeRuleProvider.get());
        return result;
    }
}