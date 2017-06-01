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

    @Provides @ComponentScope @Owner OwningUserNode provideOwningUserNode() {
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

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OwningUserNode> provideRuleProvider(Provider<OwningUserNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OwningUserNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.OwningUserNodeRuleProvider> owningUserNodeRuleProvider
    ) {
        Map<String, RuleProvider<OwningUserNode>> result = new HashMap<>();
        result.put("owningUserNode", owningUserNodeRuleProvider.get());
        return result;
    }
}