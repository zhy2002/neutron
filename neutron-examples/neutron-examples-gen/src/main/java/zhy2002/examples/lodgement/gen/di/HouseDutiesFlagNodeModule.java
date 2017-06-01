package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class HouseDutiesFlagNodeModule {

    private final HouseDutiesFlagNode owner;

    public HouseDutiesFlagNodeModule(HouseDutiesFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner HouseDutiesFlagNode provideHouseDutiesFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
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

    @Provides @ComponentScope UnemployedNode provideUnemployedNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<HouseDutiesFlagNode> provideRuleProvider(Provider<HouseDutiesFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<HouseDutiesFlagNode>> provideInstanceProviderMap(
        Provider<UnemployedNodeChildProvider.HouseDutiesFlagNodeRuleProvider> houseDutiesFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<HouseDutiesFlagNode>> result = new HashMap<>();
        result.put("houseDutiesFlagNode", houseDutiesFlagNodeRuleProvider.get());
        return result;
    }
}