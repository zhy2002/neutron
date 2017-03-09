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

    @Provides @AccessContactTypeNodeScope @Owner AccessContactTypeNode provideAccessContactTypeNode() {
        return owner;
    }

    @Provides @AccessContactTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AccessContactTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AccessContactTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AccessContactTypeNodeScope AccessNode provideAccessNode() {
        return owner.getParent();
    }

    @Provides @AccessContactTypeNodeScope
    Map<String, RuleProvider<AccessContactTypeNode>> provideInstanceProviders(
        Provider<AccessNodeChildProvider.AccessContactTypeNodeRuleProvider> accessContactTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessContactTypeNode>> result = new HashMap<>();
        result.put("accessContactTypeNode", accessContactTypeNodeRuleProvider.get());
        return result;
    }
}