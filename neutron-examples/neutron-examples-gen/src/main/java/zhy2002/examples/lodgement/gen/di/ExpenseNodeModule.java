package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class ExpenseNodeModule {

    private final ExpenseNode owner;

    public ExpenseNodeModule(ExpenseNode owner) {
        this.owner = owner;
    }

    @Provides @ExpenseNodeScope @Owner ExpenseNode provideExpenseNode() {
        return owner;
    }

    @Provides @ExpenseNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ExpenseNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ExpenseNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ExpenseNodeScope ExpenseListNode provideExpenseListNode() {
        return owner.getParent();
    }

    @Provides @ExpenseNodeScope
    RuleProvider<ExpenseNode> provideRuleProvider(Provider<ExpenseNodeRuleProvider> provider) {
        return provider.get();
    }

}