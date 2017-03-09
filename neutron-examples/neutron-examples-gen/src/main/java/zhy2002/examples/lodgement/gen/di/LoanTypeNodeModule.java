package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class LoanTypeNodeModule {

    private final LoanTypeNode owner;

    public LoanTypeNodeModule(LoanTypeNode owner) {
        this.owner = owner;
    }

    @Provides @LoanTypeNodeScope @Owner LoanTypeNode provideLoanTypeNode() {
        return owner;
    }

    @Provides @LoanTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @LoanTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LoanTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @LoanTypeNodeScope LoanNode provideLoanNode() {
        return owner.getParent();
    }

    @Provides @LoanTypeNodeScope
    Map<String, RuleProvider<LoanTypeNode>> provideInstanceProviders(
        Provider<LoanNodeChildProvider.LoanTypeNodeRuleProvider> loanTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<LoanTypeNode>> result = new HashMap<>();
        result.put("loanTypeNode", loanTypeNodeRuleProvider.get());
        return result;
    }
}