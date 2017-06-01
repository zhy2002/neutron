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

    @Provides @ComponentScope @Owner LoanTypeNode provideLoanTypeNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope LoanNode provideLoanNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<LoanTypeNode> provideRuleProvider(Provider<LoanTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<LoanTypeNode>> provideInstanceProviderMap(
        Provider<LoanNodeChildProvider.LoanTypeNodeRuleProvider> loanTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<LoanTypeNode>> result = new HashMap<>();
        result.put("loanTypeNode", loanTypeNodeRuleProvider.get());
        return result;
    }
}