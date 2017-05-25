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

    @Provides @OtherIncomeAmountNodeScope @Owner OtherIncomeAmountNode provideOtherIncomeAmountNode() {
        return owner;
    }

    @Provides @OtherIncomeAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @OtherIncomeAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @OtherIncomeAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OtherIncomeAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OtherIncomeAmountNodeScope OtherIncomeNode provideOtherIncomeNode() {
        return owner.getParent();
    }

    @Provides @OtherIncomeAmountNodeScope
    RuleProvider<OtherIncomeAmountNode> provideRuleProvider(Provider<OtherIncomeAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @OtherIncomeAmountNodeScope
    Map<String, RuleProvider<OtherIncomeAmountNode>> provideInstanceProviderMap(
        Provider<OtherIncomeNodeChildProvider.OtherIncomeAmountNodeRuleProvider> otherIncomeAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<OtherIncomeAmountNode>> result = new HashMap<>();
        result.put("otherIncomeAmountNode", otherIncomeAmountNodeRuleProvider.get());
        return result;
    }
}