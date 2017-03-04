package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class TotalLiabilityNodeModule {

    private final TotalLiabilityNode owner;

    public TotalLiabilityNodeModule(TotalLiabilityNode owner) {
        this.owner = owner;
    }

    @Provides @TotalLiabilityNodeScope @Owner TotalLiabilityNode provideTotalLiabilityNode() {
        return owner;
    }

    @Provides @TotalLiabilityNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @TotalLiabilityNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @TotalLiabilityNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TotalLiabilityNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @TotalLiabilityNodeScope FinancialPositionNode provideFinancialPositionNode() {
        return owner.getParent();
    }

}