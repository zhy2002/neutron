package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SavingsBalanceNodeModule {

    private final SavingsBalanceNode owner;

    public SavingsBalanceNodeModule(SavingsBalanceNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsBalanceNodeScope @Owner SavingsBalanceNode provideSavingsBalanceNode() {
        return owner;
    }

    @Provides @SavingsBalanceNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @SavingsBalanceNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @SavingsBalanceNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SavingsBalanceNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SavingsBalanceNodeScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

    @Provides @SavingsBalanceNodeScope
    RuleProvider<SavingsBalanceNode> provideRuleProvider(Provider<SavingsBalanceNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @SavingsBalanceNodeScope
    Map<String, RuleProvider<SavingsBalanceNode>> provideInstanceProviderMap(
        Provider<SavingsAccountNodeChildProvider.SavingsBalanceNodeRuleProvider> savingsBalanceNodeRuleProvider
    ) {
        Map<String, RuleProvider<SavingsBalanceNode>> result = new HashMap<>();
        result.put("savingsBalanceNode", savingsBalanceNodeRuleProvider.get());
        return result;
    }
}