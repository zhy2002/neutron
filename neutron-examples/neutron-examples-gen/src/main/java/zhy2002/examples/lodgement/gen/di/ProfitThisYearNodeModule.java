package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProfitThisYearNodeModule {

    private final ProfitThisYearNode owner;

    public ProfitThisYearNodeModule(ProfitThisYearNode owner) {
        this.owner = owner;
    }

    @Provides @ProfitThisYearNodeScope @Owner ProfitThisYearNode provideProfitThisYearNode() {
        return owner;
    }

    @Provides @ProfitThisYearNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProfitThisYearNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProfitThisYearNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProfitThisYearNodeScope SelfEmployedNode provideSelfEmployedNode() {
        return owner.getParent();
    }

    @Provides @ProfitThisYearNodeScope
    Map<String, RuleProvider<ProfitThisYearNode>> provideInstanceProviders(
        Provider<SelfEmployedNodeChildProvider.ProfitThisYearNodeRuleProvider> profitThisYearNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProfitThisYearNode>> result = new HashMap<>();
        result.put("profitThisYearNode", profitThisYearNodeRuleProvider.get());
        return result;
    }
}