package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ExpenseTypeNodeModule {

    private final ExpenseTypeNode owner;

    public ExpenseTypeNodeModule(ExpenseTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ExpenseTypeNode provideExpenseTypeNode() {
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

    @Provides @ComponentScope ExpenseNode provideExpenseNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ExpenseTypeNode> provideRuleProvider(Provider<ExpenseTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ExpenseTypeNode>> provideInstanceProviderMap(
        Provider<ExpenseNodeChildProvider.ExpenseTypeNodeRuleProvider> expenseTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ExpenseTypeNode>> result = new HashMap<>();
        result.put("expenseTypeNode", expenseTypeNodeRuleProvider.get());
        return result;
    }
}