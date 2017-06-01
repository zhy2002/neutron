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

    @Provides @ComponentScope @Owner AccessNode provideAccessNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope RealEstateNode provideRealEstateNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AccessNode> provideRuleProvider(Provider<AccessNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AccessNode>> provideInstanceProviderMap(
        Provider<RealEstateNodeChildProvider.AccessNodeRuleProvider> accessNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessNode>> result = new HashMap<>();
        result.put("accessNode", accessNodeRuleProvider.get());
        return result;
    }
}