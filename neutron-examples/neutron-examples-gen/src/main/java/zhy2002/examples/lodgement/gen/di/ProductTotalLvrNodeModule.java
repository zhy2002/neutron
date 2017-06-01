package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductTotalLvrNodeModule {

    private final ProductTotalLvrNode owner;

    public ProductTotalLvrNodeModule(ProductTotalLvrNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductTotalLvrNode provideProductTotalLvrNode() {
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
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductTotalLvrNode> provideRuleProvider(Provider<ProductTotalLvrNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductTotalLvrNode>> provideInstanceProviderMap(
        Provider<ProductsNodeChildProvider.ProductTotalLvrNodeRuleProvider> productTotalLvrNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductTotalLvrNode>> result = new HashMap<>();
        result.put("productTotalLvrNode", productTotalLvrNodeRuleProvider.get());
        return result;
    }
}