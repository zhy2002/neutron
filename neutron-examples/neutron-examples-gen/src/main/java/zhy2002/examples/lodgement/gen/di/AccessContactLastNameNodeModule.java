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

    @Provides @AccessContactLastNameNodeScope @Owner AccessContactLastNameNode provideAccessContactLastNameNode() {
        return owner;
    }

    @Provides @AccessContactLastNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AccessContactLastNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AccessContactLastNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @AccessContactLastNameNodeScope AccessNode provideAccessNode() {
        return owner.getParent();
    }

    @Provides @AccessContactLastNameNodeScope
    Map<String, RuleProvider<AccessContactLastNameNode>> provideInstanceProviders(
        Provider<AccessNodeChildProvider.AccessContactLastNameNodeRuleProvider> accessContactLastNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<AccessContactLastNameNode>> result = new HashMap<>();
        result.put("accessContactLastNameNode", accessContactLastNameNodeRuleProvider.get());
        return result;
    }
}