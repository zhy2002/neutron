package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductLendingPurposeNodeModule {

    private final ProductLendingPurposeNode owner;

    public ProductLendingPurposeNodeModule(ProductLendingPurposeNode owner) {
        this.owner = owner;
    }

    @Provides @ProductLendingPurposeNodeScope @Owner ProductLendingPurposeNode provideProductLendingPurposeNode() {
        return owner;
    }

    @Provides @ProductLendingPurposeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductLendingPurposeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductLendingPurposeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}