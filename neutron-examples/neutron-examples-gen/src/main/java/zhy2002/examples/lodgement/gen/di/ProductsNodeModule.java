package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductsNodeModule {

    private final ProductsNode owner;

    public ProductsNodeModule(ProductsNode owner) {
        this.owner = owner;
    }

    @Provides @ProductsNodeScope @Owner ProductsNode provideProductsNode() {
        return owner;
    }

    @Provides @ProductsNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ProductsNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductsNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductsNodeScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

}