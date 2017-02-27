package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductCardHodlerNameNodeModule {

    private final ProductCardHodlerNameNode owner;

    public ProductCardHodlerNameNodeModule(ProductCardHodlerNameNode owner) {
        this.owner = owner;
    }

    @Provides @ProductCardHodlerNameNodeScope @Owner ProductCardHodlerNameNode provideProductCardHodlerNameNode() {
        return owner;
    }

    @Provides @ProductCardHodlerNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductCardHodlerNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductCardHodlerNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}