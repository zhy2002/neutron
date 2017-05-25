package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductTotalLvrLmiNodeModule {

    private final ProductTotalLvrLmiNode owner;

    public ProductTotalLvrLmiNodeModule(ProductTotalLvrLmiNode owner) {
        this.owner = owner;
    }

    @Provides @ProductTotalLvrLmiNodeScope @Owner ProductTotalLvrLmiNode provideProductTotalLvrLmiNode() {
        return owner;
    }

    @Provides @ProductTotalLvrLmiNodeScope @Owner BasePercentageNode<?> provideBasePercentageNode() {
        return owner;
    }

    @Provides @ProductTotalLvrLmiNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProductTotalLvrLmiNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductTotalLvrLmiNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductTotalLvrLmiNodeScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @ProductTotalLvrLmiNodeScope
    RuleProvider<ProductTotalLvrLmiNode> provideRuleProvider(Provider<ProductTotalLvrLmiNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ProductTotalLvrLmiNodeScope
    Map<String, RuleProvider<ProductTotalLvrLmiNode>> provideInstanceProviderMap(
        Provider<ProductsNodeChildProvider.ProductTotalLvrLmiNodeRuleProvider> productTotalLvrLmiNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductTotalLvrLmiNode>> result = new HashMap<>();
        result.put("productTotalLvrLmiNode", productTotalLvrLmiNodeRuleProvider.get());
        return result;
    }
}