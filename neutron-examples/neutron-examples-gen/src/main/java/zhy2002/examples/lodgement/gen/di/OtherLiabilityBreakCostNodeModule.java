package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherLiabilityBreakCostNodeModule {

    private final OtherLiabilityBreakCostNode owner;

    public OtherLiabilityBreakCostNodeModule(OtherLiabilityBreakCostNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherLiabilityBreakCostNode provideOtherLiabilityBreakCostNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
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

    @Provides @ComponentScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OtherLiabilityBreakCostNode> provideRuleProvider(Provider<OtherLiabilityBreakCostNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherLiabilityBreakCostNode>> provideInstanceProviderMap(
        Provider<OtherLiabilityNodeChildProvider.OtherLiabilityBreakCostNodeRuleProvider> otherLiabilityBreakCostNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityBreakCostNode>> result = new HashMap<>();
        result.put("otherLiabilityBreakCostNode", otherLiabilityBreakCostNodeRuleProvider.get());
        return result;
    }
}