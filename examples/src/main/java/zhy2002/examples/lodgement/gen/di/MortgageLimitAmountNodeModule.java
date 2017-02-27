package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MortgageLimitAmountNodeModule {

    private final MortgageLimitAmountNode owner;

    public MortgageLimitAmountNodeModule(MortgageLimitAmountNode owner) {
        this.owner = owner;
    }

    @Provides @MortgageLimitAmountNodeScope @Owner MortgageLimitAmountNode provideMortgageLimitAmountNode() {
        return owner;
    }

    @Provides @MortgageLimitAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @MortgageLimitAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @MortgageLimitAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgageLimitAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}