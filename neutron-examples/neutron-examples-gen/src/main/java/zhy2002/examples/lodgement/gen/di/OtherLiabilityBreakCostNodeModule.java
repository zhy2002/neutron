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

    @Provides @OtherLiabilityBreakCostNodeScope @Owner OtherLiabilityBreakCostNode provideOtherLiabilityBreakCostNode() {
        return owner;
    }

    @Provides @OtherLiabilityBreakCostNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @OtherLiabilityBreakCostNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityBreakCostNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityBreakCostNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityBreakCostNodeScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @OtherLiabilityBreakCostNodeScope
    Map<String, RuleProvider<OtherLiabilityBreakCostNode>> provideInstanceProviders(
        Provider<OtherLiabilityNodeChildProvider.OtherLiabilityBreakCostNodeRuleProvider> otherLiabilityBreakCostNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityBreakCostNode>> result = new HashMap<>();
        result.put("otherLiabilityBreakCostNode", otherLiabilityBreakCostNodeRuleProvider.get());
        return result;
    }
}