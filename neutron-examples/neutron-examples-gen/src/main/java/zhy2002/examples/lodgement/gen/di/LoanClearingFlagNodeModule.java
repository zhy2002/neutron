package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class LoanClearingFlagNodeModule {

    private final LoanClearingFlagNode owner;

    public LoanClearingFlagNodeModule(LoanClearingFlagNode owner) {
        this.owner = owner;
    }

    @Provides @LoanClearingFlagNodeScope @Owner LoanClearingFlagNode provideLoanClearingFlagNode() {
        return owner;
    }

    @Provides @LoanClearingFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @LoanClearingFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LoanClearingFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @LoanClearingFlagNodeScope LoanNode provideLoanNode() {
        return owner.getParent();
    }

    @Provides @LoanClearingFlagNodeScope
    Map<String, RuleProvider<LoanClearingFlagNode>> provideInstanceProviders(
        Provider<LoanNodeChildProvider.LoanClearingFlagNodeRuleProvider> loanClearingFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<LoanClearingFlagNode>> result = new HashMap<>();
        result.put("loanClearingFlagNode", loanClearingFlagNodeRuleProvider.get());
        return result;
    }
}