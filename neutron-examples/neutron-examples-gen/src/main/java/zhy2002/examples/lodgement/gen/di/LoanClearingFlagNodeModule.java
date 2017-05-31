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

    @Provides @ComponentScope @Owner LoanClearingFlagNode provideLoanClearingFlagNode() {
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

    @Provides @ComponentScope LoanNode provideLoanNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<LoanClearingFlagNode> provideRuleProvider(Provider<LoanClearingFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<LoanClearingFlagNode>> provideInstanceProviderMap(
        Provider<LoanNodeChildProvider.LoanClearingFlagNodeRuleProvider> loanClearingFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<LoanClearingFlagNode>> result = new HashMap<>();
        result.put("loanClearingFlagNode", loanClearingFlagNodeRuleProvider.get());
        return result;
    }
}