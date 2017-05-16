package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgageTermRemainingPeriodNodeModule {

    private final MortgageTermRemainingPeriodNode owner;

    public MortgageTermRemainingPeriodNodeModule(MortgageTermRemainingPeriodNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageTermRemainingPeriodNodeScope @Owner MortgageTermRemainingPeriodNode provideMortgageTermRemainingPeriodNode() {
        return owner;
    }

    @Provides @MortgageTermRemainingPeriodNodeScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @MortgageTermRemainingPeriodNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @MortgageTermRemainingPeriodNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @MortgageTermRemainingPeriodNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageTermRemainingPeriodNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @MortgageTermRemainingPeriodNodeScope
    Map<String, RuleProvider<MortgageTermRemainingPeriodNode>> provideInstanceProviders(
        Provider<ExistingMortgageNodeChildProvider.MortgageTermRemainingPeriodNodeRuleProvider> mortgageTermRemainingPeriodNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageTermRemainingPeriodNode>> result = new HashMap<>();
        result.put("mortgageTermRemainingPeriodNode", mortgageTermRemainingPeriodNodeRuleProvider.get());
        return result;
    }
}