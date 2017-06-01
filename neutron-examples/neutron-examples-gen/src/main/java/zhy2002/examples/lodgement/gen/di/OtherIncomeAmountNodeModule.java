package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class OtherIncomeAmountNodeModule {

    private final OtherIncomeAmountNode owner;

    public OtherIncomeAmountNodeModule(OtherIncomeAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner OtherIncomeAmountNode provideOtherIncomeAmountNode() {
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

    @Provides @ComponentScope OtherIncomeNode provideOtherIncomeNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<OtherIncomeAmountNode> provideRuleProvider(Provider<OtherIncomeAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<OtherIncomeAmountNode>> provideInstanceProviderMap(
        Provider<OtherIncomeNodeChildProvider.OtherIncomeAmountNodeRuleProvider> otherIncomeAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherIncomeAmountNode>> result = new HashMap<>();
        result.put("otherIncomeAmountNode", otherIncomeAmountNodeRuleProvider.get());
        return result;
    }
}