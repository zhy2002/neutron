package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductFeesNodeModule {

    private final ProductFeesNode owner;

    public ProductFeesNodeModule(ProductFeesNode owner) {
        this.owner = owner;
    }

    @Provides @ProductFeesNodeScope @Owner ProductFeesNode provideProductFeesNode() {
        return owner;
    }

    @Provides @ProductFeesNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ProductFeesNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductFeesNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductFeesNodeScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

}