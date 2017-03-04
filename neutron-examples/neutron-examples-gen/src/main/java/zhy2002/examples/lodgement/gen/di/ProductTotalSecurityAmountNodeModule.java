package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductTotalSecurityAmountNodeModule {

    private final ProductTotalSecurityAmountNode owner;

    public ProductTotalSecurityAmountNodeModule(ProductTotalSecurityAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ProductTotalSecurityAmountNodeScope @Owner ProductTotalSecurityAmountNode provideProductTotalSecurityAmountNode() {
        return owner;
    }

    @Provides @ProductTotalSecurityAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @ProductTotalSecurityAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProductTotalSecurityAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductTotalSecurityAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductTotalSecurityAmountNodeScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

}