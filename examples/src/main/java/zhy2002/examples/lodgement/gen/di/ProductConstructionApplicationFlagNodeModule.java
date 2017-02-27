package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductConstructionApplicationFlagNodeModule {

    private final ProductConstructionApplicationFlagNode owner;

    public ProductConstructionApplicationFlagNodeModule(ProductConstructionApplicationFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ProductConstructionApplicationFlagNodeScope @Owner ProductConstructionApplicationFlagNode provideProductConstructionApplicationFlagNode() {
        return owner;
    }

    @Provides @ProductConstructionApplicationFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductConstructionApplicationFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductConstructionApplicationFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}