package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


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

    @Provides @ComponentScope
    RuleProvider<CreditCardAmountOwingNode> provideRuleProvider(Provider<CreditCardAmountOwingNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CreditCardAmountOwingNode>> provideInstanceProviderMap(
        Provider<CreditCardNodeChildProvider.CreditCardAmountOwingNodeRuleProvider> creditCardAmountOwingNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCardAmountOwingNode>> result = new HashMap<>();
        result.put("creditCardAmountOwingNode", creditCardAmountOwingNodeRuleProvider.get());
        return result;
    }
}