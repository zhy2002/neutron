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

    @Provides @AssetsNodeScope @Owner AssetsNode provideAssetsNode() {
        return owner;
    }

    @Provides @AssetsNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @AssetsNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @AssetsNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AssetsNodeScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

    @Provides @AssetsNodeScope
    RuleProvider<AssetsNode> provideRuleProvider(Provider<AssetsNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @AssetsNodeScope
    Map<String, RuleProvider<AssetsNode>> provideInstanceProviderMap(
        Provider<FinancialPositionNodeChildProvider.AssetsNodeRuleProvider> assetsNodeRuleProvider
    ) {
        Map<String, RuleProvider<AssetsNode>> result = new HashMap<>();
        result.put("assetsNode", assetsNodeRuleProvider.get());
        return result;
    }
}