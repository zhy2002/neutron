package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AccessContactTitleNodeModule {

    private final AccessContactTitleNode owner;

    public AccessContactTitleNodeModule(AccessContactTitleNode owner) {
        this.owner = owner;
    }

    @Provides @AccessContactTitleNodeScope @Owner AccessContactTitleNode provideAccessContactTitleNode() {
        return owner;
    }

    @Provides @AccessContactTitleNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AccessContactTitleNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AccessContactTitleNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AccessContactTitleNodeScope AccessNode provideAccessNode() {
        return owner.getParent();
    }

    @Provides @AccessContactTitleNodeScope
    RuleProvider<AccessContactTitleNode> provideRuleProvider(Provider<AccessContactTitleNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @AccessContactTitleNodeScope
    Map<String, RuleProvider<AccessContactTitleNode>> provideInstanceProviderMap(
        Provider<AccessNodeChildProvider.AccessContactTitleNodeRuleProvider> accessContactTitleNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessContactTitleNode>> result = new HashMap<>();
        result.put("accessContactTitleNode", accessContactTitleNodeRuleProvider.get());
        return result;
    }
}