package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class LoanOwingAmountNodeModule {

    private final LoanOwingAmountNode owner;

    public LoanOwingAmountNodeModule(LoanOwingAmountNode owner) {
        this.owner = owner;
    }

    @Provides @LoanOwingAmountNodeScope @Owner LoanOwingAmountNode provideLoanOwingAmountNode() {
        return owner;
    }

    @Provides @LoanOwingAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @LoanOwingAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @LoanOwingAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LoanOwingAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}