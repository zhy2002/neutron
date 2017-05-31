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

    @Provides @ComponentScope @Owner SavingsBalanceNode provideSavingsBalanceNode() {
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

    @Provides @ComponentScope SavingsAccountNode provideSavingsAccountNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<SavingsBalanceNode> provideRuleProvider(Provider<SavingsBalanceNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<SavingsBalanceNode>> provideInstanceProviderMap(
        Provider<SavingsAccountNodeChildProvider.SavingsBalanceNodeRuleProvider> savingsBalanceNodeRuleProvider
    ) {
        Map<String, RuleProvider<SavingsBalanceNode>> result = new HashMap<>();
        result.put("savingsBalanceNode", savingsBalanceNodeRuleProvider.get());
        return result;
    }
}