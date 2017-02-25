package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CreditCardBreakCostNodeModule {

    private final CreditCardBreakCostNode owner;

    public CreditCardBreakCostNodeModule(CreditCardBreakCostNode owner) {
        this.owner = owner;
    }

    @Provides @CreditCardBreakCostNodeScope @Owner CreditCardBreakCostNode provideCreditCardBreakCostNode() {
        return owner;
    }

    @Provides @CreditCardBreakCostNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @CreditCardBreakCostNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @CreditCardBreakCostNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CreditCardBreakCostNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}