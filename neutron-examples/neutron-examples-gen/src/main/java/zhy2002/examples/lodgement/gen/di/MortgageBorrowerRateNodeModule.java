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

    @Provides @MortgageBorrowerRateNodeScope @Owner MortgageBorrowerRateNode provideMortgageBorrowerRateNode() {
        return owner;
    }

    @Provides @MortgageBorrowerRateNodeScope @Owner BasePercentageNode<?> provideBasePercentageNode() {
        return owner;
    }

    @Provides @MortgageBorrowerRateNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @MortgageBorrowerRateNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageBorrowerRateNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageBorrowerRateNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @MortgageBorrowerRateNodeScope
    Map<String, RuleProvider<MortgageBorrowerRateNode>> provideInstanceProviders(
        Provider<ExistingMortgageNodeChildProvider.MortgageBorrowerRateNodeRuleProvider> mortgageBorrowerRateNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageBorrowerRateNode>> result = new HashMap<>();
        result.put("mortgageBorrowerRateNode", mortgageBorrowerRateNodeRuleProvider.get());
        return result;
    }
}