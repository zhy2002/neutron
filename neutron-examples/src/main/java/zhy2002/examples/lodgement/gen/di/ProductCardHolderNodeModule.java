package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductCardHolderNodeModule {

    private final ProductCardHolderNode owner;

    public ProductCardHolderNodeModule(ProductCardHolderNode owner) {
        this.owner = owner;
    }

    @Provides @ProductCardHolderNodeScope @Owner ProductCardHolderNode provideProductCardHolderNode() {
        return owner;
    }

    @Provides @ProductCardHolderNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ProductCardHolderNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductCardHolderNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}