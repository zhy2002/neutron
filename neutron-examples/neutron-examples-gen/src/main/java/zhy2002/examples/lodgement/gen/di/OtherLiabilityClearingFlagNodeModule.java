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

    @Provides @ComponentScope @Owner OtherLiabilityClearingFlagNode provideOtherLiabilityClearingFlagNode() {
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

    @Provides @ComponentScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OtherLiabilityClearingFlagNode> provideRuleProvider(Provider<OtherLiabilityClearingFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherLiabilityClearingFlagNode>> provideInstanceProviderMap(
        Provider<OtherLiabilityNodeChildProvider.OtherLiabilityClearingFlagNodeRuleProvider> otherLiabilityClearingFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityClearingFlagNode>> result = new HashMap<>();
        result.put("otherLiabilityClearingFlagNode", otherLiabilityClearingFlagNodeRuleProvider.get());
        return result;
    }
}