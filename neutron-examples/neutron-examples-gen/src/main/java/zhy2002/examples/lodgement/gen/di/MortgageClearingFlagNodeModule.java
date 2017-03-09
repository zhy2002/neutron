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

    @Provides @MortgageClearingFlagNodeScope @Owner MortgageClearingFlagNode provideMortgageClearingFlagNode() {
        return owner;
    }

    @Provides @MortgageClearingFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @MortgageClearingFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageClearingFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @MortgageClearingFlagNodeScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @MortgageClearingFlagNodeScope
    Map<String, RuleProvider<MortgageClearingFlagNode>> provideInstanceProviders(
        Provider<ExistingMortgageNodeChildProvider.MortgageClearingFlagNodeRuleProvider> mortgageClearingFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<MortgageClearingFlagNode>> result = new HashMap<>();
        result.put("mortgageClearingFlagNode", mortgageClearingFlagNodeRuleProvider.get());
        return result;
    }
}