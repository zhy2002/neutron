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

    @Provides @ComponentScope @Owner ProfitThisYearNode provideProfitThisYearNode() {
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

    @Provides @ComponentScope SelfEmployedNode provideSelfEmployedNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProfitThisYearNode> provideRuleProvider(Provider<ProfitThisYearNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProfitThisYearNode>> provideInstanceProviderMap(
        Provider<SelfEmployedNodeChildProvider.ProfitThisYearNodeRuleProvider> profitThisYearNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProfitThisYearNode>> result = new HashMap<>();
        result.put("profitThisYearNode", profitThisYearNodeRuleProvider.get());
        return result;
    }
}