package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AccessOtherDescriptionNodeModule {

    private final AccessOtherDescriptionNode owner;

    public AccessOtherDescriptionNodeModule(AccessOtherDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AccessOtherDescriptionNode provideAccessOtherDescriptionNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope AccessNode provideAccessNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<AccessOtherDescriptionNode> provideRuleProvider(Provider<AccessOtherDescriptionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AccessOtherDescriptionNode>> provideInstanceProviderMap(
        Provider<AccessNodeChildProvider.AccessOtherDescriptionNodeRuleProvider> accessOtherDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessOtherDescriptionNode>> result = new HashMap<>();
        result.put("accessOtherDescriptionNode", accessOtherDescriptionNodeRuleProvider.get());
        return result;
    }
}