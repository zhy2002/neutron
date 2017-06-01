package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductLoanTypeNodeModule {

    private final ProductLoanTypeNode owner;

    public ProductLoanTypeNodeModule(ProductLoanTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductLoanTypeNode provideProductLoanTypeNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductLoanTypeNode> provideRuleProvider(Provider<ProductLoanTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductLoanTypeNode>> provideInstanceProviderMap(
        Provider<ProductsNodeChildProvider.ProductLoanTypeNodeRuleProvider> productLoanTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductLoanTypeNode>> result = new HashMap<>();
        result.put("productLoanTypeNode", productLoanTypeNodeRuleProvider.get());
        return result;
    }
}