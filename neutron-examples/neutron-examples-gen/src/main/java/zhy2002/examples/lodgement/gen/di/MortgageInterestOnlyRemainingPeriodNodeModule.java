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

    @Provides @ComponentScope @Owner MortgageInterestOnlyRemainingPeriodNode provideMortgageInterestOnlyRemainingPeriodNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner MonthYearNode<?> provideMonthYearNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<MortgageInterestOnlyRemainingPeriodNode> provideRuleProvider(Provider<MortgageInterestOnlyRemainingPeriodNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<MortgageInterestOnlyRemainingPeriodNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageInterestOnlyRemainingPeriodNodeRuleProvider> mortgageInterestOnlyRemainingPeriodNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageInterestOnlyRemainingPeriodNode>> result = new HashMap<>();
        result.put("mortgageInterestOnlyRemainingPeriodNode", mortgageInterestOnlyRemainingPeriodNodeRuleProvider.get());
        return result;
    }
}