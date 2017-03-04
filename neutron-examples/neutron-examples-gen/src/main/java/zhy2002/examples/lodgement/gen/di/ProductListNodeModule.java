package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductListNodeModule {

    private final ProductListNode owner;

    public ProductListNodeModule(ProductListNode owner) {
        this.owner = owner;
    }

    @Provides @ProductListNodeScope @Owner ProductListNode provideProductListNode() {
        return owner;
    }

    @Provides @ProductListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ProductListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductListNodeScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

}