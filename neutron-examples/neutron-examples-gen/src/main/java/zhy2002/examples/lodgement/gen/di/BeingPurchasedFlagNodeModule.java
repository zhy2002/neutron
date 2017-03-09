package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class BeingPurchasedFlagNodeModule {

    private final BeingPurchasedFlagNode owner;

    public BeingPurchasedFlagNodeModule(BeingPurchasedFlagNode owner) {
        this.owner = owner;
    }

    @Provides @BeingPurchasedFlagNodeScope @Owner BeingPurchasedFlagNode provideBeingPurchasedFlagNode() {
        return owner;
    }

    @Provides @BeingPurchasedFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @BeingPurchasedFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @BeingPurchasedFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @BeingPurchasedFlagNodeScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

    @Provides @BeingPurchasedFlagNodeScope
    Map<String, RuleProvider<BeingPurchasedFlagNode>> provideInstanceProviders(
        Provider<UsageNodeChildProvider.BeingPurchasedFlagNodeRuleProvider> beingPurchasedFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<BeingPurchasedFlagNode>> result = new HashMap<>();
        result.put("beingPurchasedFlagNode", beingPurchasedFlagNodeRuleProvider.get());
        return result;
    }
}