package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgqageUnpaidBalanceNodeModule {

    private final MortgqageUnpaidBalanceNode owner;

    public MortgqageUnpaidBalanceNodeModule(MortgqageUnpaidBalanceNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgqageUnpaidBalanceNode provideMortgqageUnpaidBalanceNode() {
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

    @Provides @ComponentScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<MortgqageUnpaidBalanceNode> provideRuleProvider(Provider<MortgqageUnpaidBalanceNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<MortgqageUnpaidBalanceNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgqageUnpaidBalanceNodeRuleProvider> mortgqageUnpaidBalanceNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgqageUnpaidBalanceNode>> result = new HashMap<>();
        result.put("mortgqageUnpaidBalanceNode", mortgqageUnpaidBalanceNodeRuleProvider.get());
        return result;
    }
}