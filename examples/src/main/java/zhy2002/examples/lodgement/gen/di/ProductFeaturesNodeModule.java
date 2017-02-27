package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductFeaturesNodeModule {

    private final ProductFeaturesNode owner;

    public ProductFeaturesNodeModule(ProductFeaturesNode owner) {
        this.owner = owner;
    }

    @Provides @ProductFeaturesNodeScope @Owner ProductFeaturesNode provideProductFeaturesNode() {
        return owner;
    }

    @Provides @ProductFeaturesNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ProductFeaturesNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductFeaturesNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}