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

    @Provides @ComponentScope @Owner ProductCustomerContributionListNode provideProductCustomerContributionListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductCustomerContributionListNode> provideRuleProvider(Provider<ProductCustomerContributionListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductCustomerContributionListNode>> provideInstanceProviderMap(
        Provider<ProductsNodeChildProvider.ProductCustomerContributionListNodeRuleProvider> productCustomerContributionListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductCustomerContributionListNode>> result = new HashMap<>();
        result.put("productCustomerContributionListNode", productCustomerContributionListNodeRuleProvider.get());
        return result;
    }
}