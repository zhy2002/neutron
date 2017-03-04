package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductTotalLoanTermNodeModule {

    private final ProductTotalLoanTermNode owner;

    public ProductTotalLoanTermNodeModule(ProductTotalLoanTermNode owner) {
        this.owner = owner;
    }

    @Provides @ProductTotalLoanTermNodeScope @Owner ProductTotalLoanTermNode provideProductTotalLoanTermNode() {
        return owner;
    }

    @Provides @ProductTotalLoanTermNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProductTotalLoanTermNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductTotalLoanTermNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductTotalLoanTermNodeScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

}