package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductTotalSecurityAmountNodeModule {

    private final ProductTotalSecurityAmountNode owner;

    public ProductTotalSecurityAmountNodeModule(ProductTotalSecurityAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ProductTotalSecurityAmountNodeScope @Owner ProductTotalSecurityAmountNode provideProductTotalSecurityAmountNode() {
        return owner;
    }

    @Provides @ProductTotalSecurityAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @ProductTotalSecurityAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProductTotalSecurityAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductTotalSecurityAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductTotalSecurityAmountNodeScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @ProductTotalSecurityAmountNodeScope
    RuleProvider<ProductTotalSecurityAmountNode> provideRuleProvider(Provider<ProductTotalSecurityAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ProductTotalSecurityAmountNodeScope
    Map<String, RuleProvider<ProductTotalSecurityAmountNode>> provideInstanceProviderMap(
        Provider<ProductsNodeChildProvider.ProductTotalSecurityAmountNodeRuleProvider> productTotalSecurityAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductTotalSecurityAmountNode>> result = new HashMap<>();
        result.put("productTotalSecurityAmountNode", productTotalSecurityAmountNodeRuleProvider.get());
        return result;
    }
}