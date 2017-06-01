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

    @Provides @ComponentScope @Owner MortgageTermRemainingPeriodNode provideMortgageTermRemainingPeriodNode() {
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
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<MortgageTermRemainingPeriodNode> provideRuleProvider(Provider<MortgageTermRemainingPeriodNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<MortgageTermRemainingPeriodNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageTermRemainingPeriodNodeRuleProvider> mortgageTermRemainingPeriodNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageTermRemainingPeriodNode>> result = new HashMap<>();
        result.put("mortgageTermRemainingPeriodNode", mortgageTermRemainingPeriodNodeRuleProvider.get());
        return result;
    }
}