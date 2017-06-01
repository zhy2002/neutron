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

    @Provides @ComponentScope @Owner RepeatPasswordNode provideRepeatPasswordNode() {
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
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope RegisterNode provideRegisterNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<RepeatPasswordNode> provideRuleProvider(Provider<RepeatPasswordNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<RepeatPasswordNode>> provideInstanceProviderMap(
        Provider<RegisterNodeChildProvider.RepeatPasswordNodeRuleProvider> repeatPasswordNodeRuleProvider
    ) {
        Map<String, RuleProvider<RepeatPasswordNode>> result = new HashMap<>();
        result.put("repeatPasswordNode", repeatPasswordNodeRuleProvider.get());
        return result;
    }
}