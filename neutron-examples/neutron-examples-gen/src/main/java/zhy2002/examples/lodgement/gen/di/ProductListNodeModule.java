package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductListNodeModule {

    private final ProductListNode owner;

    public ProductListNodeModule(ProductListNode owner) {
        this.owner = owner;
    }

    @Provides @ProductListNodeScope @Owner ProductListNode provideProductListNode() {
        return owner;
    }

    @Provides @ProductListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ProductListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductListNodeScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @ProductListNodeScope
    RuleProvider<ProductListNode> provideRuleProvider(Provider<ProductListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ProductListNodeScope
    Map<String, RuleProvider<ProductListNode>> provideInstanceProviderMap(
        Provider<ProductsNodeChildProvider.ProductListNodeRuleProvider> productListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductListNode>> result = new HashMap<>();
        result.put("productListNode", productListNodeRuleProvider.get());
        return result;
    }
}