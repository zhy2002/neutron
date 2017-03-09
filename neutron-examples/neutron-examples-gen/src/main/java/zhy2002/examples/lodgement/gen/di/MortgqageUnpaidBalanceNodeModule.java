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

    @Provides @MortgqageUnpaidBalanceNodeScope @Owner MortgqageUnpaidBalanceNode provideMortgqageUnpaidBalanceNode() {
        return owner;
    }

    @Provides @MortgqageUnpaidBalanceNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @MortgqageUnpaidBalanceNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @MortgqageUnpaidBalanceNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgqageUnpaidBalanceNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgqageUnpaidBalanceNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @MortgqageUnpaidBalanceNodeScope
    Map<String, RuleProvider<MortgqageUnpaidBalanceNode>> provideInstanceProviders(
        Provider<ExistingMortgageNodeChildProvider.MortgqageUnpaidBalanceNodeRuleProvider> mortgqageUnpaidBalanceNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgqageUnpaidBalanceNode>> result = new HashMap<>();
        result.put("mortgqageUnpaidBalanceNode", mortgqageUnpaidBalanceNodeRuleProvider.get());
        return result;
    }
}