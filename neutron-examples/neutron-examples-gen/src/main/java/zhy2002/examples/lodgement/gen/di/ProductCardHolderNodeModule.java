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

    @Provides @ComponentScope @Owner ProductCardHolderNode provideProductCardHolderNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
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

    @Provides @ComponentScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductCardHolderNode> provideRuleProvider(Provider<ProductCardHolderNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductCardHolderNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.ProductPrimaryCardHolderNodeRuleProvider> productPrimaryCardHolderNodeRuleProvider
        ,Provider<ProductFeaturesNodeChildProvider.ProductAdditionalCardHolderNodeRuleProvider> productAdditionalCardHolderNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductCardHolderNode>> result = new HashMap<>();
        result.put("productPrimaryCardHolderNode", productPrimaryCardHolderNodeRuleProvider.get());
        result.put("productAdditionalCardHolderNode", productAdditionalCardHolderNodeRuleProvider.get());
        return result;
    }
}