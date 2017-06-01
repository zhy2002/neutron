package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductFeaturesNodeModule {

    private final ProductFeaturesNode owner;

    public ProductFeaturesNodeModule(ProductFeaturesNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductFeaturesNode provideProductFeaturesNode() {
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
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope ProductNode provideProductNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductFeaturesNode> provideRuleProvider(Provider<ProductFeaturesNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductFeaturesNode>> provideInstanceProviderMap(
        Provider<ProductNodeChildProvider.ProductFeaturesNodeRuleProvider> productFeaturesNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductFeaturesNode>> result = new HashMap<>();
        result.put("productFeaturesNode", productFeaturesNodeRuleProvider.get());
        return result;
    }
}