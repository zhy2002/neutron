package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProfitPreviousYearNodeModule {

    private final ProfitPreviousYearNode owner;

    public ProfitPreviousYearNodeModule(ProfitPreviousYearNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProfitPreviousYearNode provideProfitPreviousYearNode() {
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

    @Provides @ComponentScope SelfEmployedNode provideSelfEmployedNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProfitPreviousYearNode> provideRuleProvider(Provider<ProfitPreviousYearNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProfitPreviousYearNode>> provideInstanceProviderMap(
        Provider<SelfEmployedNodeChildProvider.ProfitPreviousYearNodeRuleProvider> profitPreviousYearNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProfitPreviousYearNode>> result = new HashMap<>();
        result.put("profitPreviousYearNode", profitPreviousYearNodeRuleProvider.get());
        return result;
    }
}