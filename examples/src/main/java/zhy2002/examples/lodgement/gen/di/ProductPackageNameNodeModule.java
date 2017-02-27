package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductPackageNameNodeModule {

    private final ProductPackageNameNode owner;

    public ProductPackageNameNodeModule(ProductPackageNameNode owner) {
        this.owner = owner;
    }

    @Provides @ProductPackageNameNodeScope @Owner ProductPackageNameNode provideProductPackageNameNode() {
        return owner;
    }

    @Provides @ProductPackageNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductPackageNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductPackageNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}