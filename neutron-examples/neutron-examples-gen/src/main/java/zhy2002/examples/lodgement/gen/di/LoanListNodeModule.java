package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class LoanListNodeModule {

    private final LoanListNode owner;

    public LoanListNodeModule(LoanListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LoanListNode provideLoanListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope LiabilitiesNode provideLiabilitiesNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<LoanListNode> provideRuleProvider(Provider<LoanListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<LoanListNode>> provideInstanceProviderMap(
        Provider<LiabilitiesNodeChildProvider.LoanListNodeRuleProvider> loanListNodeRuleProvider
    ) {
        Map<String, RuleProvider<LoanListNode>> result = new HashMap<>();
        result.put("loanListNode", loanListNodeRuleProvider.get());
        return result;
    }
}