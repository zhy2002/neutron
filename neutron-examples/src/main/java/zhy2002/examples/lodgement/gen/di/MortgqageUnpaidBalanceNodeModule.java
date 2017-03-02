package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class MortgqageUnpaidBalanceNodeModule {

    private final MortgqageUnpaidBalanceNode owner;

    public MortgqageUnpaidBalanceNodeModule(MortgqageUnpaidBalanceNode owner) {
        this.owner = owner;
    }

    @Provides @MortgqageUnpaidBalanceNodeScope @Owner MortgqageUnpaidBalanceNode provideMortgqageUnpaidBalanceNode() {
        return owner;
    }

    @Provides @MortgqageUnpaidBalanceNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @MortgqageUnpaidBalanceNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @MortgqageUnpaidBalanceNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @MortgqageUnpaidBalanceNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}