package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgageBreakFeeNodeModule {

    private final MortgageBreakFeeNode owner;

    public MortgageBreakFeeNodeModule(MortgageBreakFeeNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageBreakFeeNodeScope @Owner MortgageBreakFeeNode provideMortgageBreakFeeNode() {
        return owner;
    }

    @Provides @MortgageBreakFeeNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @MortgageBreakFeeNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @MortgageBreakFeeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageBreakFeeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageBreakFeeNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @MortgageBreakFeeNodeScope
    Map<String, RuleProvider<MortgageBreakFeeNode>> provideInstanceProviders(
        Provider<ExistingMortgageNodeChildProvider.MortgageBreakFeeNodeRuleProvider> mortgageBreakFeeNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageBreakFeeNode>> result = new HashMap<>();
        result.put("mortgageBreakFeeNode", mortgageBreakFeeNodeRuleProvider.get());
        return result;
    }
}