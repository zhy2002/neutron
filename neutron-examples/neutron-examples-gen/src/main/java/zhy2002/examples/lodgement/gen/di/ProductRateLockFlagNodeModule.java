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

    @Provides @ComponentScope @Owner ProductRateLockFlagNode provideProductRateLockFlagNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
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

    @Provides @ComponentScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductRateLockFlagNode> provideRuleProvider(Provider<ProductRateLockFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductRateLockFlagNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.ProductRateLockFlagNodeRuleProvider> productRateLockFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductRateLockFlagNode>> result = new HashMap<>();
        result.put("productRateLockFlagNode", productRateLockFlagNodeRuleProvider.get());
        return result;
    }
}