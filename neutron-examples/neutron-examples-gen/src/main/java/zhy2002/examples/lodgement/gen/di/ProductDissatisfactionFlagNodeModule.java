package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductDissatisfactionFlagNodeModule {

    private final ProductDissatisfactionFlagNode owner;

    public ProductDissatisfactionFlagNodeModule(ProductDissatisfactionFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ProductDissatisfactionFlagNodeScope @Owner ProductDissatisfactionFlagNode provideProductDissatisfactionFlagNode() {
        return owner;
    }

    @Provides @ProductDissatisfactionFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductDissatisfactionFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductDissatisfactionFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}