package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class LoanLimitAmountNodeModule {

    private final LoanLimitAmountNode owner;

    public LoanLimitAmountNodeModule(LoanLimitAmountNode owner) {
        this.owner = owner;
    }

    @Provides @LoanLimitAmountNodeScope @Owner LoanLimitAmountNode provideLoanLimitAmountNode() {
        return owner;
    }

    @Provides @LoanLimitAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @LoanLimitAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @LoanLimitAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LoanLimitAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}