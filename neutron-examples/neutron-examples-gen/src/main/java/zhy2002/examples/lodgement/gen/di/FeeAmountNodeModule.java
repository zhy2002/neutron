package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class FeeAmountNodeModule {

    private final FeeAmountNode owner;

    public FeeAmountNodeModule(FeeAmountNode owner) {
        this.owner = owner;
    }

    @Provides @FeeAmountNodeScope @Owner FeeAmountNode provideFeeAmountNode() {
        return owner;
    }

    @Provides @FeeAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @FeeAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @FeeAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @FeeAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @FeeAmountNodeScope ProductFeeNode provideProductFeeNode() {
        return owner.getParent();
    }

    @Provides @FeeAmountNodeScope
    RuleProvider<FeeAmountNode> provideRuleProvider(Provider<FeeAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @FeeAmountNodeScope
    Map<String, RuleProvider<FeeAmountNode>> provideInstanceProviderMap(
        Provider<ProductFeeNodeChildProvider.FeeAmountNodeRuleProvider> feeAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<FeeAmountNode>> result = new HashMap<>();
        result.put("feeAmountNode", feeAmountNodeRuleProvider.get());
        return result;
    }
}