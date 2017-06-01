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

    @Provides @ComponentScope @Owner ProductFeeListNode provideProductFeeListNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductFeeListNode> provideRuleProvider(Provider<ProductFeeListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductFeeListNode>> provideInstanceProviderMap(
        Provider<ProductsNodeChildProvider.ProductFeeListNodeRuleProvider> productFeeListNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductFeeListNode>> result = new HashMap<>();
        result.put("productFeeListNode", productFeeListNodeRuleProvider.get());
        return result;
    }
}