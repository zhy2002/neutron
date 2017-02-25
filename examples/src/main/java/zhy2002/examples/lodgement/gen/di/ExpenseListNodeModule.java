package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ExpenseListNodeModule {

    private final ExpenseListNode owner;

    public ExpenseListNodeModule(ExpenseListNode owner) {
        this.owner = owner;
    }

    @Provides @ExpenseListNodeScope @Owner ExpenseListNode provideExpenseListNode() {
        return owner;
    }

    @Provides @ExpenseListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ExpenseListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ExpenseListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}