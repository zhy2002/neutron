package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ExpenseTypeNodeModule {

    private final ExpenseTypeNode owner;

    public ExpenseTypeNodeModule(ExpenseTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ExpenseTypeNodeScope @Owner ExpenseTypeNode provideExpenseTypeNode() {
        return owner;
    }

    @Provides @ExpenseTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ExpenseTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ExpenseTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}