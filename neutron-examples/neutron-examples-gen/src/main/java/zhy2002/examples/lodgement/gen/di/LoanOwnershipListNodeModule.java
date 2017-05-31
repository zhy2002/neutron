package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class LoanOwnershipListNodeModule {

    private final LoanOwnershipListNode owner;

    public LoanOwnershipListNodeModule(LoanOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner LoanOwnershipListNode provideLoanOwnershipListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
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

    @Provides @ComponentScope LoanNode provideLoanNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<LoanOwnershipListNode> provideRuleProvider(Provider<LoanOwnershipListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<LoanOwnershipListNode>> provideInstanceProviderMap(
        Provider<LoanNodeChildProvider.OwnershipListNodeRuleProvider> ownershipListNodeRuleProvider
    ) {
        Map<String, RuleProvider<LoanOwnershipListNode>> result = new HashMap<>();
        result.put("ownershipListNode", ownershipListNodeRuleProvider.get());
        return result;
    }
}