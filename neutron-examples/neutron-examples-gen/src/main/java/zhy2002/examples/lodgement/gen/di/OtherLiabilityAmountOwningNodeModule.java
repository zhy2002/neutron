package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherLiabilityAmountOwningNodeModule {

    private final OtherLiabilityAmountOwningNode owner;

    public OtherLiabilityAmountOwningNodeModule(OtherLiabilityAmountOwningNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherLiabilityAmountOwningNode provideOtherLiabilityAmountOwningNode() {
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

    @Provides @ComponentScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OtherLiabilityAmountOwningNode> provideRuleProvider(Provider<OtherLiabilityAmountOwningNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherLiabilityAmountOwningNode>> provideInstanceProviderMap(
        Provider<OtherLiabilityNodeChildProvider.OtherLiabilityAmountOwningNodeRuleProvider> otherLiabilityAmountOwningNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityAmountOwningNode>> result = new HashMap<>();
        result.put("otherLiabilityAmountOwningNode", otherLiabilityAmountOwningNodeRuleProvider.get());
        return result;
    }
}