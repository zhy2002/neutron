package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AccessNodeModule {

    private final AccessNode owner;

    public AccessNodeModule(AccessNode owner) {
        this.owner = owner;
    }

    @Provides @AccessNodeScope @Owner AccessNode provideAccessNode() {
        return owner;
    }

    @Provides @AccessNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @AccessNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @AccessNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AccessNodeScope RealEstateNode provideRealEstateNode() {
        return owner.getParent();
    }

    @Provides @AccessNodeScope
    RuleProvider<AccessNode> provideRuleProvider(Provider<AccessNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @AccessNodeScope
    Map<String, RuleProvider<AccessNode>> provideInstanceProviderMap(
        Provider<RealEstateNodeChildProvider.AccessNodeRuleProvider> accessNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessNode>> result = new HashMap<>();
        result.put("accessNode", accessNodeRuleProvider.get());
        return result;
    }
}