package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherLiabilityMonthlyRepaymentNodeModule {

    private final OtherLiabilityMonthlyRepaymentNode owner;

    public OtherLiabilityMonthlyRepaymentNodeModule(OtherLiabilityMonthlyRepaymentNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherLiabilityMonthlyRepaymentNode provideOtherLiabilityMonthlyRepaymentNode() {
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
    RuleProvider<OtherLiabilityMonthlyRepaymentNode> provideRuleProvider(Provider<OtherLiabilityMonthlyRepaymentNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherLiabilityMonthlyRepaymentNode>> provideInstanceProviderMap(
        Provider<OtherLiabilityNodeChildProvider.OtherLiabilityMonthlyRepaymentNodeRuleProvider> otherLiabilityMonthlyRepaymentNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherLiabilityMonthlyRepaymentNode>> result = new HashMap<>();
        result.put("otherLiabilityMonthlyRepaymentNode", otherLiabilityMonthlyRepaymentNodeRuleProvider.get());
        return result;
    }
}