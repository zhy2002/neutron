package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductCardHolderNodeModule {

    private final ProductCardHolderNode owner;

    public ProductCardHolderNodeModule(ProductCardHolderNode owner) {
        this.owner = owner;
    }

    @Provides @ProductCardHolderNodeScope @Owner ProductCardHolderNode provideProductCardHolderNode() {
        return owner;
    }

    @Provides @ProductCardHolderNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ProductCardHolderNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ProductCardHolderNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductCardHolderNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ProductCardHolderNodeScope
    Map<String, RuleProvider<ProductCardHolderNode>> provideInstanceProviders(
        Provider<ProductFeaturesNodeChildProvider.ProductPrimaryCardHolderNodeRuleProvider> productPrimaryCardHolderNodeRuleProvider
        ,Provider<ProductFeaturesNodeChildProvider.ProductAdditionalCardHolderNodeRuleProvider> productAdditionalCardHolderNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductCardHolderNode>> result = new HashMap<>();
        result.put("productPrimaryCardHolderNode", productPrimaryCardHolderNodeRuleProvider.get());
        result.put("productAdditionalCardHolderNode", productAdditionalCardHolderNodeRuleProvider.get());
        return result;
    }
}