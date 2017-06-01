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

    @Provides @ComponentScope @Owner OtherLiabilityLimitAmountNode provideOtherLiabilityLimitAmountNode() {
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
    RuleProvider<OtherLiabilityLimitAmountNode> provideRuleProvider(Provider<OtherLiabilityLimitAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherLiabilityLimitAmountNode>> provideInstanceProviderMap(
        Provider<OtherLiabilityNodeChildProvider.OtherLiabilityLimitAmountNodeRuleProvider> otherLiabilityLimitAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityLimitAmountNode>> result = new HashMap<>();
        result.put("otherLiabilityLimitAmountNode", otherLiabilityLimitAmountNodeRuleProvider.get());
        return result;
    }
}