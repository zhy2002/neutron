package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ExpenseDescriptionNodeModule {

    private final ExpenseDescriptionNode owner;

    public ExpenseDescriptionNodeModule(ExpenseDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @ExpenseDescriptionNodeScope @Owner ExpenseDescriptionNode provideExpenseDescriptionNode() {
        return owner;
    }

    @Provides @ExpenseDescriptionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ExpenseDescriptionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ExpenseDescriptionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ExpenseDescriptionNodeScope ExpenseNode provideExpenseNode() {
        return owner.getParent();
    }

    @Provides @ExpenseDescriptionNodeScope
    Map<String, RuleProvider<ExpenseDescriptionNode>> provideInstanceProviders(
        Provider<ExpenseNodeChildProvider.ExpenseDescriptionNodeRuleProvider> expenseDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<ExpenseDescriptionNode>> result = new HashMap<>();
        result.put("expenseDescriptionNode", expenseDescriptionNodeRuleProvider.get());
        return result;
    }
}