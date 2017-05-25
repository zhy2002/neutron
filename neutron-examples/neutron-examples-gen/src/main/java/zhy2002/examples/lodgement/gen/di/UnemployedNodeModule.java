package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class UnemployedNodeModule {

    private final UnemployedNode owner;

    public UnemployedNodeModule(UnemployedNode owner) {
        this.owner = owner;
    }

    @Provides @UnemployedNodeScope @Owner UnemployedNode provideUnemployedNode() {
        return owner;
    }

    @Provides @UnemployedNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @UnemployedNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @UnemployedNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @UnemployedNodeScope EmploymentNode<?> provideEmploymentNode() {
        return owner.getParent();
    }

    @Provides @UnemployedNodeScope
    RuleProvider<UnemployedNode> provideRuleProvider(Provider<UnemployedNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @UnemployedNodeScope
    Map<String, RuleProvider<UnemployedNode>> provideInstanceProviderMap(
        Provider<EmploymentNodeChildProvider.UnemployedNodeRuleProvider> unemployedNodeRuleProvider
    ) {
        Map<String, RuleProvider<UnemployedNode>> result = new HashMap<>();
        result.put("unemployedNode", unemployedNodeRuleProvider.get());
        return result;
    }
}