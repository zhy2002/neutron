package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class DefenseServiceFlagNodeModule {

    private final DefenseServiceFlagNode owner;

    public DefenseServiceFlagNodeModule(DefenseServiceFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner DefenseServiceFlagNode provideDefenseServiceFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope PropertyNode providePropertyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<DefenseServiceFlagNode> provideRuleProvider(Provider<DefenseServiceFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<DefenseServiceFlagNode>> provideInstanceProviderMap(
        Provider<PropertyNodeChildProvider.DefenseServiceFlagNodeRuleProvider> defenseServiceFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<DefenseServiceFlagNode>> result = new HashMap<>();
        result.put("defenseServiceFlagNode", defenseServiceFlagNodeRuleProvider.get());
        return result;
    }
}