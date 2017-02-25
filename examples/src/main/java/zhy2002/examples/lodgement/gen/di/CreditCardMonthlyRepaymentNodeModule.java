package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CreditCardMonthlyRepaymentNodeModule {

    private final CreditCardMonthlyRepaymentNode owner;

    public CreditCardMonthlyRepaymentNodeModule(CreditCardMonthlyRepaymentNode owner) {
        this.owner = owner;
    }

    @Provides @CreditCardMonthlyRepaymentNodeScope @Owner CreditCardMonthlyRepaymentNode provideCreditCardMonthlyRepaymentNode() {
        return owner;
    }

    @Provides @CreditCardMonthlyRepaymentNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @CreditCardMonthlyRepaymentNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @CreditCardMonthlyRepaymentNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CreditCardMonthlyRepaymentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}