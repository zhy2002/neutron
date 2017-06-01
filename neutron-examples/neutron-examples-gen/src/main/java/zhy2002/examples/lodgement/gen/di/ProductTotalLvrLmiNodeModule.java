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

    @Provides @ComponentScope @Owner ProductTotalLvrLmiNode provideProductTotalLvrLmiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BasePercentageNode<?> provideBasePercentageNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
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
    RuleProvider<ProductTotalLvrLmiNode> provideRuleProvider(Provider<ProductTotalLvrLmiNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductTotalLvrLmiNode>> provideInstanceProviderMap(
        Provider<ProductsNodeChildProvider.ProductTotalLvrLmiNodeRuleProvider> productTotalLvrLmiNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductTotalLvrLmiNode>> result = new HashMap<>();
        result.put("productTotalLvrLmiNode", productTotalLvrLmiNodeRuleProvider.get());
        return result;
    }
}