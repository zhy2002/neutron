package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherLiabilityLimitAmountNodeModule {

    private final OtherLiabilityLimitAmountNode owner;

    public OtherLiabilityLimitAmountNodeModule(OtherLiabilityLimitAmountNode owner) {
        this.owner = owner;
    }

    @Provides @OtherLiabilityLimitAmountNodeScope @Owner OtherLiabilityLimitAmountNode provideOtherLiabilityLimitAmountNode() {
        return owner;
    }

    @Provides @OtherLiabilityLimitAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @OtherLiabilityLimitAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityLimitAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityLimitAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherLiabilityLimitAmountNodeScope OtherLiabilityNode provideOtherLiabilityNode() {
        return owner.getParent();
    }

    @Provides @OtherLiabilityLimitAmountNodeScope
    RuleProvider<OtherLiabilityLimitAmountNode> provideRuleProvider(Provider<OtherLiabilityLimitAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @OtherLiabilityLimitAmountNodeScope
    Map<String, RuleProvider<OtherLiabilityLimitAmountNode>> provideInstanceProviderMap(
        Provider<OtherLiabilityNodeChildProvider.OtherLiabilityLimitAmountNodeRuleProvider> otherLiabilityLimitAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityLimitAmountNode>> result = new HashMap<>();
        result.put("otherLiabilityLimitAmountNode", otherLiabilityLimitAmountNodeRuleProvider.get());
        return result;
    }
}