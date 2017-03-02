package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class TotalExpenseNodeModule {

    private final TotalExpenseNode owner;

    public TotalExpenseNodeModule(TotalExpenseNode owner) {
        this.owner = owner;
    }

    @Provides @TotalExpenseNodeScope @Owner TotalExpenseNode provideTotalExpenseNode() {
        return owner;
    }

    @Provides @TotalExpenseNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @TotalExpenseNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @TotalExpenseNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TotalExpenseNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}