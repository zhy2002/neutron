package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductDescriptionNodeModule {

    private final ProductDescriptionNode owner;

    public ProductDescriptionNodeModule(ProductDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @ProductDescriptionNodeScope @Owner ProductDescriptionNode provideProductDescriptionNode() {
        return owner;
    }

    @Provides @ProductDescriptionNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ProductDescriptionNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductDescriptionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductDescriptionNodeScope ProductNode provideProductNode() {
        return owner.getParent();
    }

}