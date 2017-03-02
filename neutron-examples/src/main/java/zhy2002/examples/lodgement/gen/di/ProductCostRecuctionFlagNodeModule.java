package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductCostRecuctionFlagNodeModule {

    private final ProductCostRecuctionFlagNode owner;

    public ProductCostRecuctionFlagNodeModule(ProductCostRecuctionFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ProductCostRecuctionFlagNodeScope @Owner ProductCostRecuctionFlagNode provideProductCostRecuctionFlagNode() {
        return owner;
    }

    @Provides @ProductCostRecuctionFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductCostRecuctionFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductCostRecuctionFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}