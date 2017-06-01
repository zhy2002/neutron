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

    @Provides @ComponentScope @Owner ExpenseDescriptionNode provideExpenseDescriptionNode() {
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

    @Provides @ComponentScope ExpenseNode provideExpenseNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ExpenseDescriptionNode> provideRuleProvider(Provider<ExpenseDescriptionNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ExpenseDescriptionNode>> provideInstanceProviderMap(
        Provider<ExpenseNodeChildProvider.ExpenseDescriptionNodeRuleProvider> expenseDescriptionNodeRuleProvider
    ) {
        Map<String, RuleProvider<ExpenseDescriptionNode>> result = new HashMap<>();
        result.put("expenseDescriptionNode", expenseDescriptionNodeRuleProvider.get());
        return result;
    }
}