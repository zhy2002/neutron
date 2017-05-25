package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class PlanNodeModule {

    private final PlanNode owner;

    public PlanNodeModule(PlanNode owner) {
        this.owner = owner;
    }

    @Provides @PlanNodeScope @Owner PlanNode providePlanNode() {
        return owner;
    }

    @Provides @PlanNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @PlanNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PlanNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @PlanNodeScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @PlanNodeScope
    RuleProvider<PlanNode> provideRuleProvider(Provider<PlanNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @PlanNodeScope
    Map<String, RuleProvider<PlanNode>> provideInstanceProviderMap(
        Provider<RegisterNodeChildProvider.PlanNodeRuleProvider> planNodeRuleProvider
    ) {
        Map<String, RuleProvider<PlanNode>> result = new HashMap<>();
        result.put("planNode", planNodeRuleProvider.get());
        return result;
    }
}