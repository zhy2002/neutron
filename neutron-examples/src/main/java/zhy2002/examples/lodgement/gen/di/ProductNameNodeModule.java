package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductNameNodeModule {

    private final ProductNameNode owner;

    public ProductNameNodeModule(ProductNameNode owner) {
        this.owner = owner;
    }

    @Provides @ProductNameNodeScope @Owner ProductNameNode provideProductNameNode() {
        return owner;
    }

    @Provides @ProductNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}