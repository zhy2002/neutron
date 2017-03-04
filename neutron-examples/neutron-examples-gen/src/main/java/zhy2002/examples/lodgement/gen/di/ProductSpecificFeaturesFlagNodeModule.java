package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductSpecificFeaturesFlagNodeModule {

    private final ProductSpecificFeaturesFlagNode owner;

    public ProductSpecificFeaturesFlagNodeModule(ProductSpecificFeaturesFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ProductSpecificFeaturesFlagNodeScope @Owner ProductSpecificFeaturesFlagNode provideProductSpecificFeaturesFlagNode() {
        return owner;
    }

    @Provides @ProductSpecificFeaturesFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductSpecificFeaturesFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductSpecificFeaturesFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductSpecificFeaturesFlagNodeScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

}