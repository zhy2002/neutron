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

    @Provides @HouseDutiesFlagNodeScope @Owner HouseDutiesFlagNode provideHouseDutiesFlagNode() {
        return owner;
    }

    @Provides @HouseDutiesFlagNodeScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
        return owner;
    }

    @Provides @HouseDutiesFlagNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @HouseDutiesFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @HouseDutiesFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @HouseDutiesFlagNodeScope UnemployedNode provideUnemployedNode() {
        return owner.getParent();
    }

    @Provides @HouseDutiesFlagNodeScope
    Map<String, RuleProvider<HouseDutiesFlagNode>> provideInstanceProviders(
        Provider<UnemployedNodeChildProvider.HouseDutiesFlagNodeRuleProvider> houseDutiesFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<HouseDutiesFlagNode>> result = new HashMap<>();
        result.put("houseDutiesFlagNode", houseDutiesFlagNodeRuleProvider.get());
        return result;
    }
}