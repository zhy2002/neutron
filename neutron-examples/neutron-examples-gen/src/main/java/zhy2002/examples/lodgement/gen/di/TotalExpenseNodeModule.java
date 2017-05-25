package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class TotalExpenseNodeModule {

    private final TotalExpenseNode owner;

    public TotalExpenseNodeModule(TotalExpenseNode owner) {
        this.owner = owner;
    }

    @Provides @TotalExpenseNodeScope @Owner TotalExpenseNode provideTotalExpenseNode() {
        return owner;
    }

    @Provides @TotalExpenseNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @TotalExpenseNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @TotalExpenseNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TotalExpenseNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TotalExpenseNodeScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

    @Provides @TotalExpenseNodeScope
    RuleProvider<TotalExpenseNode> provideRuleProvider(Provider<TotalExpenseNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @TotalExpenseNodeScope
    Map<String, RuleProvider<TotalExpenseNode>> provideInstanceProviderMap(
        Provider<FinancialPositionNodeChildProvider.TotalExpenseNodeRuleProvider> totalExpenseNodeRuleProvider
    ) {
        Map<String, RuleProvider<TotalExpenseNode>> result = new HashMap<>();
        result.put("totalExpenseNode", totalExpenseNodeRuleProvider.get());
        return result;
    }
}