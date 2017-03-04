package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductCreditCardTypeNodeModule {

    private final ProductCreditCardTypeNode owner;

    public ProductCreditCardTypeNodeModule(ProductCreditCardTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ProductCreditCardTypeNodeScope @Owner ProductCreditCardTypeNode provideProductCreditCardTypeNode() {
        return owner;
    }

    @Provides @ProductCreditCardTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductCreditCardTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductCreditCardTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductCreditCardTypeNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

}