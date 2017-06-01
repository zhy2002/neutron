package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class AccessContactLastNameNodeModule {

    private final AccessContactLastNameNode owner;

    public AccessContactLastNameNodeModule(AccessContactLastNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner AccessContactLastNameNode provideAccessContactLastNameNode() {
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
    RuleProvider<AccessContactLastNameNode> provideRuleProvider(Provider<AccessContactLastNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<AccessContactLastNameNode>> provideInstanceProviderMap(
        Provider<AccessNodeChildProvider.AccessContactLastNameNodeRuleProvider> accessContactLastNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessContactLastNameNode>> result = new HashMap<>();
        result.put("accessContactLastNameNode", accessContactLastNameNodeRuleProvider.get());
        return result;
    }
}