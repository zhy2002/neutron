package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductFeeListNodeModule {

    private final ProductFeeListNode owner;

    public ProductFeeListNodeModule(ProductFeeListNode owner) {
        this.owner = owner;
    }

    @Provides @ProductFeeListNodeScope @Owner ProductFeeListNode provideProductFeeListNode() {
        return owner;
    }

    @Provides @ProductFeeListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ProductFeeListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductFeeListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductFeeListNodeScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @ProductFeeListNodeScope
    Map<String, RuleProvider<ProductFeeListNode>> provideInstanceProviders(
        Provider<ProductsNodeChildProvider.ProductFeeListNodeRuleProvider> productFeeListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductFeeListNode>> result = new HashMap<>();
        result.put("productFeeListNode", productFeeListNodeRuleProvider.get());
        return result;
    }
}