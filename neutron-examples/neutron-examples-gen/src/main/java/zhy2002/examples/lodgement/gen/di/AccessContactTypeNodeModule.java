package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AccessContactTypeNodeModule {

    private final AccessContactTypeNode owner;

    public AccessContactTypeNodeModule(AccessContactTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AccessContactTypeNode provideAccessContactTypeNode() {
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
    RuleProvider<AccessContactTypeNode> provideRuleProvider(Provider<AccessContactTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AccessContactTypeNode>> provideInstanceProviderMap(
        Provider<AccessNodeChildProvider.AccessContactTypeNodeRuleProvider> accessContactTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessContactTypeNode>> result = new HashMap<>();
        result.put("accessContactTypeNode", accessContactTypeNodeRuleProvider.get());
        return result;
    }
}