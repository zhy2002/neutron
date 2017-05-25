package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductRateLockFlagNodeModule {

    private final ProductRateLockFlagNode owner;

    public ProductRateLockFlagNodeModule(ProductRateLockFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ProductRateLockFlagNodeScope @Owner ProductRateLockFlagNode provideProductRateLockFlagNode() {
        return owner;
    }

    @Provides @ProductRateLockFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductRateLockFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductRateLockFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductRateLockFlagNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ProductRateLockFlagNodeScope
    RuleProvider<ProductRateLockFlagNode> provideRuleProvider(Provider<ProductRateLockFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ProductRateLockFlagNodeScope
    Map<String, RuleProvider<ProductRateLockFlagNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.ProductRateLockFlagNodeRuleProvider> productRateLockFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductRateLockFlagNode>> result = new HashMap<>();
        result.put("productRateLockFlagNode", productRateLockFlagNodeRuleProvider.get());
        return result;
    }
}