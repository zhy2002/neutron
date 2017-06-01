package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgageLimitAmountNodeModule {

    private final MortgageLimitAmountNode owner;

    public MortgageLimitAmountNodeModule(MortgageLimitAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgageLimitAmountNode provideMortgageLimitAmountNode() {
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

    @Provides @ComponentScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<MortgageLimitAmountNode> provideRuleProvider(Provider<MortgageLimitAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<MortgageLimitAmountNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageLimitAmountNodeRuleProvider> mortgageLimitAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageLimitAmountNode>> result = new HashMap<>();
        result.put("mortgageLimitAmountNode", mortgageLimitAmountNodeRuleProvider.get());
        return result;
    }
}