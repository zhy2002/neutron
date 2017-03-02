package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductCreditCardFlagNodeModule {

    private final ProductCreditCardFlagNode owner;

    public ProductCreditCardFlagNodeModule(ProductCreditCardFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ProductCreditCardFlagNodeScope @Owner ProductCreditCardFlagNode provideProductCreditCardFlagNode() {
        return owner;
    }

    @Provides @ProductCreditCardFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductCreditCardFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductCreditCardFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}