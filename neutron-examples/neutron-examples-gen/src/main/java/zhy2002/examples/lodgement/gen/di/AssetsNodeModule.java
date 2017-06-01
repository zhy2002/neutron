package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AssetsNodeModule {

    private final AssetsNode owner;

    public AssetsNodeModule(AssetsNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AssetsNode provideAssetsNode() {
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

    @Provides @ComponentScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AssetsNode> provideRuleProvider(Provider<AssetsNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AssetsNode>> provideInstanceProviderMap(
        Provider<FinancialPositionNodeChildProvider.AssetsNodeRuleProvider> assetsNodeRuleProvider
    ) {
        Map<String, RuleProvider<AssetsNode>> result = new HashMap<>();
        result.put("assetsNode", assetsNodeRuleProvider.get());
        return result;
    }
}