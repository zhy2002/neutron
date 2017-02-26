package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

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

}