package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class UsageNodeModule {

    private final UsageNode owner;

    public UsageNodeModule(UsageNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner UsageNode provideUsageNode() {
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

    @Provides @ComponentScope RealEstateNode provideRealEstateNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<UsageNode> provideRuleProvider(Provider<UsageNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<UsageNode>> provideInstanceProviderMap(
        Provider<RealEstateNodeChildProvider.UsageNodeRuleProvider> usageNodeRuleProvider
    ) {
        Map<String, RuleProvider<UsageNode>> result = new HashMap<>();
        result.put("usageNode", usageNodeRuleProvider.get());
        return result;
    }
}