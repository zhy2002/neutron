package zhy2002.examples.register.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class RepeatPasswordNodeModule {

    private final RepeatPasswordNode owner;

    public RepeatPasswordNodeModule(RepeatPasswordNode owner) {
        this.owner = owner;
    }

    @Provides @RepeatPasswordNodeScope @Owner RepeatPasswordNode provideRepeatPasswordNode() {
        return owner;
    }

    @Provides @RepeatPasswordNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @RepeatPasswordNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @RepeatPasswordNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @RepeatPasswordNodeScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @RepeatPasswordNodeScope
    Map<String, RuleProvider<RepeatPasswordNode>> provideInstanceProviders(
        Provider<RegisterNodeChildProvider.RepeatPasswordNodeRuleProvider> repeatPasswordNodeRuleProvider
    ) {
        Map<String, RuleProvider<RepeatPasswordNode>> result = new HashMap<>();
        result.put("repeatPasswordNode", repeatPasswordNodeRuleProvider.get());
        return result;
    }
}