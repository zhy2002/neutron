package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ExpenseMonthlyRepaymentNodeModule {

    private final ExpenseMonthlyRepaymentNode owner;

    public ExpenseMonthlyRepaymentNodeModule(ExpenseMonthlyRepaymentNode owner) {
        this.owner = owner;
    }

    @Provides @ExpenseMonthlyRepaymentNodeScope @Owner ExpenseMonthlyRepaymentNode provideExpenseMonthlyRepaymentNode() {
        return owner;
    }

    @Provides @ExpenseMonthlyRepaymentNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ExpenseMonthlyRepaymentNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ExpenseMonthlyRepaymentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}