package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class SelfEmployedNodeModule {

    private final SelfEmployedNode owner;

    public SelfEmployedNodeModule(SelfEmployedNode owner) {
        this.owner = owner;
    }

    @Provides @SelfEmployedNodeScope @Owner SelfEmployedNode provideSelfEmployedNode() {
        return owner;
    }

    @Provides @SelfEmployedNodeScope @Owner EmployedNode provideEmployedNode() {
        return owner;
    }

    @Provides @SelfEmployedNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @SelfEmployedNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @SelfEmployedNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @SelfEmployedNodeScope EmploymentNode<?> provideEmploymentNode() {
        return owner.getParent();
    }

    @Provides @SelfEmployedNodeScope
    RuleProvider<SelfEmployedNode> provideRuleProvider(Provider<SelfEmployedNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @SelfEmployedNodeScope
    Map<String, RuleProvider<SelfEmployedNode>> provideInstanceProviderMap(
        Provider<EmploymentNodeChildProvider.SelfEmployedNodeRuleProvider> selfEmployedNodeRuleProvider
    ) {
        Map<String, RuleProvider<SelfEmployedNode>> result = new HashMap<>();
        result.put("selfEmployedNode", selfEmployedNodeRuleProvider.get());
        return result;
    }
}