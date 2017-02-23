package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class LoanMonthlyRepaymentNodeModule {

    private final LoanMonthlyRepaymentNode owner;

    public LoanMonthlyRepaymentNodeModule(LoanMonthlyRepaymentNode owner) {
        this.owner = owner;
    }

    @Provides @LoanMonthlyRepaymentNodeScope @Owner LoanMonthlyRepaymentNode provideLoanMonthlyRepaymentNode() {
        return owner;
    }

    @Provides @LoanMonthlyRepaymentNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @LoanMonthlyRepaymentNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @LoanMonthlyRepaymentNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LoanMonthlyRepaymentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}