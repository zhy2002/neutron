package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductGroupNodeModule {

    private final ProductGroupNode owner;

    public ProductGroupNodeModule(ProductGroupNode owner) {
        this.owner = owner;
    }

    @Provides @ProductGroupNodeScope @Owner ProductGroupNode provideProductGroupNode() {
        return owner;
    }

    @Provides @ProductGroupNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductGroupNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductGroupNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductGroupNodeScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

}