package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MortgageMonthlyRepaymentNodeModule {

    private final MortgageMonthlyRepaymentNode owner;

    public MortgageMonthlyRepaymentNodeModule(MortgageMonthlyRepaymentNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageMonthlyRepaymentNodeScope @Owner MortgageMonthlyRepaymentNode provideMortgageMonthlyRepaymentNode() {
        return owner;
    }

    @Provides @MortgageMonthlyRepaymentNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @MortgageMonthlyRepaymentNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @MortgageMonthlyRepaymentNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageMonthlyRepaymentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}