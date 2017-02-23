package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
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

    @Provides @ExpenseNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}