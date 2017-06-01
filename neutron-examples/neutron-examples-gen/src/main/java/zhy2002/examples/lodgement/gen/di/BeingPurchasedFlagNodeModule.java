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

    @Provides @ComponentScope @Owner BeingPurchasedFlagNode provideBeingPurchasedFlagNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<BeingPurchasedFlagNode> provideRuleProvider(Provider<BeingPurchasedFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<BeingPurchasedFlagNode>> provideInstanceProviderMap(
        Provider<UsageNodeChildProvider.BeingPurchasedFlagNodeRuleProvider> beingPurchasedFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<BeingPurchasedFlagNode>> result = new HashMap<>();
        result.put("beingPurchasedFlagNode", beingPurchasedFlagNodeRuleProvider.get());
        return result;
    }
}