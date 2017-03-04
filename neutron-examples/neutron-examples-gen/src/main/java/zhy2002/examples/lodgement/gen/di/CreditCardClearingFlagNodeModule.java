package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CreditCardClearingFlagNodeModule {

    private final CreditCardClearingFlagNode owner;

    public CreditCardClearingFlagNodeModule(CreditCardClearingFlagNode owner) {
        this.owner = owner;
    }

    @Provides @CreditCardClearingFlagNodeScope @Owner CreditCardClearingFlagNode provideCreditCardClearingFlagNode() {
        return owner;
    }

    @Provides @CreditCardClearingFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @CreditCardClearingFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CreditCardClearingFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CreditCardClearingFlagNodeScope CreditCardNode provideCreditCardNode() {
        return owner.getParent();
    }

}