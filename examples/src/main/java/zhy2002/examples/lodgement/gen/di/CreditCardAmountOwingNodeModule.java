package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CreditCardAmountOwingNodeModule {

    private final CreditCardAmountOwingNode owner;

    public CreditCardAmountOwingNodeModule(CreditCardAmountOwingNode owner) {
        this.owner = owner;
    }

    @Provides @CreditCardAmountOwingNodeScope @Owner CreditCardAmountOwingNode provideCreditCardAmountOwingNode() {
        return owner;
    }

    @Provides @CreditCardAmountOwingNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @CreditCardAmountOwingNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @CreditCardAmountOwingNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CreditCardAmountOwingNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}