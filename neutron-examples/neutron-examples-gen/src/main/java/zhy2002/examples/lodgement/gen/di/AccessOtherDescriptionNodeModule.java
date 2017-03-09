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

    @Provides @AccessOtherDescriptionNodeScope @Owner AccessOtherDescriptionNode provideAccessOtherDescriptionNode() {
        return owner;
    }

    @Provides @AccessOtherDescriptionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AccessOtherDescriptionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AccessOtherDescriptionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AccessOtherDescriptionNodeScope AccessNode provideAccessNode() {
        return owner.getParent();
    }

    @Provides @AccessOtherDescriptionNodeScope
    Map<String, RuleProvider<AccessOtherDescriptionNode>> provideInstanceProviders(
        Provider<AccessNodeChildProvider.AccessOtherDescriptionNodeRuleProvider> accessOtherDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessOtherDescriptionNode>> result = new HashMap<>();
        result.put("accessOtherDescriptionNode", accessOtherDescriptionNodeRuleProvider.get());
        return result;
    }
}