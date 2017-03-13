package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductCustomerContributionListNodeModule {

    private final ProductCustomerContributionListNode owner;

    public ProductCustomerContributionListNodeModule(ProductCustomerContributionListNode owner) {
        this.owner = owner;
    }

    @Provides @ProductCustomerContributionListNodeScope @Owner ProductCustomerContributionListNode provideProductCustomerContributionListNode() {
        return owner;
    }

    @Provides @ProductCustomerContributionListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ProductCustomerContributionListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductCustomerContributionListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductCustomerContributionListNodeScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @ProductCustomerContributionListNodeScope
    Map<String, RuleProvider<ProductCustomerContributionListNode>> provideInstanceProviders(
        Provider<ProductsNodeChildProvider.ProductCustomerContributionListNodeRuleProvider> productCustomerContributionListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductCustomerContributionListNode>> result = new HashMap<>();
        result.put("productCustomerContributionListNode", productCustomerContributionListNodeRuleProvider.get());
        return result;
    }
}