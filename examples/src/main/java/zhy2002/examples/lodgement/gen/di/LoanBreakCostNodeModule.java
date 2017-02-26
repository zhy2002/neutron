package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class LoanBreakCostNodeModule {

    private final LoanBreakCostNode owner;

    public LoanBreakCostNodeModule(LoanBreakCostNode owner) {
        this.owner = owner;
    }

    @Provides @LoanBreakCostNodeScope @Owner LoanBreakCostNode provideLoanBreakCostNode() {
        return owner;
    }

    @Provides @LoanBreakCostNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @LoanBreakCostNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @LoanBreakCostNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @LoanBreakCostNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}