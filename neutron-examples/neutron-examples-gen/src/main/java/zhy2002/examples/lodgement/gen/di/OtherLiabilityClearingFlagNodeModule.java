package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherLiabilityClearingFlagNodeModule {

    private final OtherLiabilityClearingFlagNode owner;

    public OtherLiabilityClearingFlagNodeModule(OtherLiabilityClearingFlagNode owner) {
        this.owner = owner;
    }

    @Provides @OtherLiabilityClearingFlagNodeScope @Owner OtherLiabilityClearingFlagNode provideOtherLiabilityClearingFlagNode() {
        return owner;
    }

    @Provides @OtherLiabilityClearingFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityClearingFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityClearingFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityClearingFlagNodeScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @OtherLiabilityClearingFlagNodeScope
    Map<String, RuleProvider<OtherLiabilityClearingFlagNode>> provideInstanceProviders(
        Provider<OtherLiabilityNodeChildProvider.OtherLiabilityClearingFlagNodeRuleProvider> otherLiabilityClearingFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityClearingFlagNode>> result = new HashMap<>();
        result.put("otherLiabilityClearingFlagNode", otherLiabilityClearingFlagNodeRuleProvider.get());
        return result;
    }
}