package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


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

    @Provides @ComponentScope
    RuleProvider<CreditCardBreakCostNode> provideRuleProvider(Provider<CreditCardBreakCostNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CreditCardBreakCostNode>> provideInstanceProviderMap(
        Provider<CreditCardNodeChildProvider.CreditCardBreakCostNodeRuleProvider> creditCardBreakCostNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCardBreakCostNode>> result = new HashMap<>();
        result.put("creditCardBreakCostNode", creditCardBreakCostNodeRuleProvider.get());
        return result;
    }
}