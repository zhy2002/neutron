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

    @Provides @CreditCardBreakCostNodeScope @Owner CreditCardBreakCostNode provideCreditCardBreakCostNode() {
        return owner;
    }

    @Provides @CreditCardBreakCostNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @CreditCardBreakCostNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @CreditCardBreakCostNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CreditCardBreakCostNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CreditCardBreakCostNodeScope CreditCardNode provideCreditCardNode() {
        return owner.getParent();
    }

    @Provides @CreditCardBreakCostNodeScope
    Map<String, RuleProvider<CreditCardBreakCostNode>> provideInstanceProviders(
        Provider<CreditCardNodeChildProvider.CreditCardBreakCostNodeRuleProvider> creditCardBreakCostNodeRuleProvider
    ) {
        Map<String, RuleProvider<CreditCardBreakCostNode>> result = new HashMap<>();
        result.put("creditCardBreakCostNode", creditCardBreakCostNodeRuleProvider.get());
        return result;
    }
}