package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OwningUserNodeModule {

    private final OwningUserNode owner;

    public OwningUserNodeModule(OwningUserNode owner) {
        this.owner = owner;
    }

    @Provides @OwningUserNodeScope @Owner OwningUserNode provideOwningUserNode() {
        return owner;
    }

    @Provides @OwningUserNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @OwningUserNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OwningUserNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OwningUserNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @OwningUserNodeScope
    Map<String, RuleProvider<OwningUserNode>> provideInstanceProviders(
        Provider<ApplicationNodeChildProvider.OwningUserNodeRuleProvider> owningUserNodeRuleProvider
    ) {
        Map<String, RuleProvider<OwningUserNode>> result = new HashMap<>();
        result.put("owningUserNode", owningUserNodeRuleProvider.get());
        return result;
    }
}