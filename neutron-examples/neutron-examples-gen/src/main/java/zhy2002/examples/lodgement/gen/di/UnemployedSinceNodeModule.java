package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class UnemployedSinceNodeModule {

    private final UnemployedSinceNode owner;

    public UnemployedSinceNodeModule(UnemployedSinceNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner UnemployedSinceNode provideUnemployedSinceNode() {
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

    @Provides @ComponentScope UnemployedNode provideUnemployedNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<UnemployedSinceNode> provideRuleProvider(Provider<UnemployedSinceNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<UnemployedSinceNode>> provideInstanceProviderMap(
        Provider<UnemployedNodeChildProvider.UnemployedSinceNodeRuleProvider> unemployedSinceNodeRuleProvider
    ) {
        Map<String, RuleProvider<UnemployedSinceNode>> result = new HashMap<>();
        result.put("unemployedSinceNode", unemployedSinceNodeRuleProvider.get());
        return result;
    }
}