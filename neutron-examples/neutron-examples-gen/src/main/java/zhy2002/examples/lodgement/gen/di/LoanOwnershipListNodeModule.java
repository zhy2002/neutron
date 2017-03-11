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

    @Provides @LoanOwnershipListNodeScope @Owner LoanOwnershipListNode provideLoanOwnershipListNode() {
        return owner;
    }

    @Provides @LoanOwnershipListNodeScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
        return owner;
    }

    @Provides @LoanOwnershipListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @LoanOwnershipListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @LoanOwnershipListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @LoanOwnershipListNodeScope LoanNode provideLoanNode() {
        return owner.getParent();
    }

    @Provides @LoanOwnershipListNodeScope
    Map<String, RuleProvider<LoanOwnershipListNode>> provideInstanceProviders(
        Provider<LoanNodeChildProvider.OwnershipListNodeRuleProvider> ownershipListNodeRuleProvider
    ) {
        Map<String, RuleProvider<LoanOwnershipListNode>> result = new HashMap<>();
        result.put("ownershipListNode", ownershipListNodeRuleProvider.get());
        return result;
    }
}