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

    @Provides @ComponentScope @Owner CreditCardLimitAmountNode provideCreditCardLimitAmountNode() {
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

    @Provides @ComponentScope
    RuleProvider<CreditCardLimitAmountNode> provideRuleProvider(Provider<CreditCardLimitAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CreditCardLimitAmountNode>> provideInstanceProviderMap(
        Provider<CreditCardNodeChildProvider.CreditCardLimitAmountNodeRuleProvider> creditCardLimitAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCardLimitAmountNode>> result = new HashMap<>();
        result.put("creditCardLimitAmountNode", creditCardLimitAmountNodeRuleProvider.get());
        return result;
    }
}