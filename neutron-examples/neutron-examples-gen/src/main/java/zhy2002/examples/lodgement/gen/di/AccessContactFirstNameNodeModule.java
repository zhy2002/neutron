package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AccessContactFirstNameNodeModule {

    private final AccessContactFirstNameNode owner;

    public AccessContactFirstNameNodeModule(AccessContactFirstNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AccessContactFirstNameNode provideAccessContactFirstNameNode() {
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
    RuleProvider<AccessContactFirstNameNode> provideRuleProvider(Provider<AccessContactFirstNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AccessContactFirstNameNode>> provideInstanceProviderMap(
        Provider<AccessNodeChildProvider.AccessContactFirstNameNodeRuleProvider> accessContactFirstNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessContactFirstNameNode>> result = new HashMap<>();
        result.put("accessContactFirstNameNode", accessContactFirstNameNodeRuleProvider.get());
        return result;
    }
}