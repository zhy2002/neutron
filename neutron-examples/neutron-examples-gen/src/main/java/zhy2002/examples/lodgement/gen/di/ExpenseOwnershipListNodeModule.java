package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ExpenseOwnershipListNodeModule {

    private final ExpenseOwnershipListNode owner;

    public ExpenseOwnershipListNodeModule(ExpenseOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @ExpenseOwnershipListNodeScope @Owner ExpenseOwnershipListNode provideExpenseOwnershipListNode() {
        return owner;
    }

    @Provides @ExpenseOwnershipListNodeScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
        return owner;
    }

    @Provides @ExpenseOwnershipListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ExpenseOwnershipListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ExpenseOwnershipListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ExpenseOwnershipListNodeScope ExpenseNode provideExpenseNode() {
        return owner.getParent();
    }

    @Provides @ExpenseOwnershipListNodeScope
    Map<String, RuleProvider<ExpenseOwnershipListNode>> provideInstanceProviders(
        Provider<ExpenseNodeChildProvider.OwnershipListNodeRuleProvider> ownershipListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ExpenseOwnershipListNode>> result = new HashMap<>();
        result.put("ownershipListNode", ownershipListNodeRuleProvider.get());
        return result;
    }
}