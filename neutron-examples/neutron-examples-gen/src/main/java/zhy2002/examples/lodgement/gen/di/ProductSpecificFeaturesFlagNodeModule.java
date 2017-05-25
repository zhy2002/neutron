package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductSpecificFeaturesFlagNodeModule {

    private final ProductSpecificFeaturesFlagNode owner;

    public ProductSpecificFeaturesFlagNodeModule(ProductSpecificFeaturesFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ProductSpecificFeaturesFlagNodeScope @Owner ProductSpecificFeaturesFlagNode provideProductSpecificFeaturesFlagNode() {
        return owner;
    }

    @Provides @ProductSpecificFeaturesFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductSpecificFeaturesFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductSpecificFeaturesFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductSpecificFeaturesFlagNodeScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ProductSpecificFeaturesFlagNodeScope
    RuleProvider<ProductSpecificFeaturesFlagNode> provideRuleProvider(Provider<ProductSpecificFeaturesFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ProductSpecificFeaturesFlagNodeScope
    Map<String, RuleProvider<ProductSpecificFeaturesFlagNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductSpecificFeaturesFlagNodeRuleProvider> productSpecificFeaturesFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductSpecificFeaturesFlagNode>> result = new HashMap<>();
        result.put("productSpecificFeaturesFlagNode", productSpecificFeaturesFlagNodeRuleProvider.get());
        return result;
    }
}