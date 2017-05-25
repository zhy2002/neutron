package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgageMonthlyRepaymentNodeModule {

    private final MortgageMonthlyRepaymentNode owner;

    public MortgageMonthlyRepaymentNodeModule(MortgageMonthlyRepaymentNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageMonthlyRepaymentNodeScope @Owner MortgageMonthlyRepaymentNode provideMortgageMonthlyRepaymentNode() {
        return owner;
    }

    @Provides @MortgageMonthlyRepaymentNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @MortgageMonthlyRepaymentNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @MortgageMonthlyRepaymentNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageMonthlyRepaymentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageMonthlyRepaymentNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @MortgageMonthlyRepaymentNodeScope
    RuleProvider<MortgageMonthlyRepaymentNode> provideRuleProvider(Provider<MortgageMonthlyRepaymentNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @MortgageMonthlyRepaymentNodeScope
    Map<String, RuleProvider<MortgageMonthlyRepaymentNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageMonthlyRepaymentNodeRuleProvider> mortgageMonthlyRepaymentNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageMonthlyRepaymentNode>> result = new HashMap<>();
        result.put("mortgageMonthlyRepaymentNode", mortgageMonthlyRepaymentNodeRuleProvider.get());
        return result;
    }
}