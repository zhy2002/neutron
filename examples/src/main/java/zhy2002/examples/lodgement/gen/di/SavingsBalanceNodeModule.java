package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class SavingsBalanceNodeModule {

    private final SavingsBalanceNode owner;

    public SavingsBalanceNodeModule(SavingsBalanceNode owner) {
        this.owner = owner;
    }

    @Provides @SavingsBalanceNodeScope @Owner SavingsBalanceNode provideSavingsBalanceNode() {
        return owner;
    }

    @Provides @SavingsBalanceNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @SavingsBalanceNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @SavingsBalanceNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @SavingsBalanceNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}