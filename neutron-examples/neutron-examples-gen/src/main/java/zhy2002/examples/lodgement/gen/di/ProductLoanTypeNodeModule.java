package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductLoanTypeNodeModule {

    private final ProductLoanTypeNode owner;

    public ProductLoanTypeNodeModule(ProductLoanTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ProductLoanTypeNodeScope @Owner ProductLoanTypeNode provideProductLoanTypeNode() {
        return owner;
    }

    @Provides @ProductLoanTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductLoanTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductLoanTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductLoanTypeNodeScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

}