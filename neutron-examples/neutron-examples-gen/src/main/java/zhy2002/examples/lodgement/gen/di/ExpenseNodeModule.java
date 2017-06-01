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

    @Provides @ComponentScope @Owner ExpenseNode provideExpenseNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope ExpenseListNode provideExpenseListNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ExpenseNode> provideRuleProvider(Provider<ExpenseNodeRuleProvider> provider) {
        return provider.get();
    }

}