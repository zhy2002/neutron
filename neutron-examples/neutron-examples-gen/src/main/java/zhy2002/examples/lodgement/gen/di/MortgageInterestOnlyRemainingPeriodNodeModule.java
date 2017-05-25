package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgageInterestOnlyRemainingPeriodNodeModule {

    private final MortgageInterestOnlyRemainingPeriodNode owner;

    public MortgageInterestOnlyRemainingPeriodNodeModule(MortgageInterestOnlyRemainingPeriodNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageInterestOnlyRemainingPeriodNodeScope @Owner MortgageInterestOnlyRemainingPeriodNode provideMortgageInterestOnlyRemainingPeriodNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyRemainingPeriodNodeScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyRemainingPeriodNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyRemainingPeriodNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyRemainingPeriodNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageInterestOnlyRemainingPeriodNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @MortgageInterestOnlyRemainingPeriodNodeScope
    RuleProvider<MortgageInterestOnlyRemainingPeriodNode> provideRuleProvider(Provider<MortgageInterestOnlyRemainingPeriodNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @MortgageInterestOnlyRemainingPeriodNodeScope
    Map<String, RuleProvider<MortgageInterestOnlyRemainingPeriodNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageInterestOnlyRemainingPeriodNodeRuleProvider> mortgageInterestOnlyRemainingPeriodNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageInterestOnlyRemainingPeriodNode>> result = new HashMap<>();
        result.put("mortgageInterestOnlyRemainingPeriodNode", mortgageInterestOnlyRemainingPeriodNodeRuleProvider.get());
        return result;
    }
}