package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductRequestedAmountNodeModule {

    private final ProductRequestedAmountNode owner;

    public ProductRequestedAmountNodeModule(ProductRequestedAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ProductRequestedAmountNodeScope @Owner ProductRequestedAmountNode provideProductRequestedAmountNode() {
        return owner;
    }

    @Provides @ProductRequestedAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @ProductRequestedAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProductRequestedAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductRequestedAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}