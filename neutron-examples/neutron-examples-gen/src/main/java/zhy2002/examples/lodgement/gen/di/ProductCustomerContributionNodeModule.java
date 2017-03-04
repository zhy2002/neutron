package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ProductCustomerContributionNodeModule {

    private final ProductCustomerContributionNode owner;

    public ProductCustomerContributionNodeModule(ProductCustomerContributionNode owner) {
        this.owner = owner;
    }

    @Provides @ProductCustomerContributionNodeScope @Owner ProductCustomerContributionNode provideProductCustomerContributionNode() {
        return owner;
    }

    @Provides @ProductCustomerContributionNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ProductCustomerContributionNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductCustomerContributionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductCustomerContributionNodeScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

}