package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class MortgageClearingFlagNodeModule {

    private final MortgageClearingFlagNode owner;

    public MortgageClearingFlagNodeModule(MortgageClearingFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgageClearingFlagNode provideMortgageClearingFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<MortgageClearingFlagNode> provideRuleProvider(Provider<MortgageClearingFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<MortgageClearingFlagNode>> provideInstanceProviderMap(
        Provider<ExistingMortgageNodeChildProvider.MortgageClearingFlagNodeRuleProvider> mortgageClearingFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageClearingFlagNode>> result = new HashMap<>();
        result.put("mortgageClearingFlagNode", mortgageClearingFlagNodeRuleProvider.get());
        return result;
    }
}