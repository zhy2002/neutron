package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgageBorrowerRateNodeModule {

    private final MortgageBorrowerRateNode owner;

    public MortgageBorrowerRateNodeModule(MortgageBorrowerRateNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgageBorrowerRateNode provideMortgageBorrowerRateNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BasePercentageNode<?> provideBasePercentageNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<MortgageBorrowerRateNode> provideRuleProvider(Provider<MortgageBorrowerRateNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<MortgageBorrowerRateNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageBorrowerRateNodeRuleProvider> mortgageBorrowerRateNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageBorrowerRateNode>> result = new HashMap<>();
        result.put("mortgageBorrowerRateNode", mortgageBorrowerRateNodeRuleProvider.get());
        return result;
    }
}