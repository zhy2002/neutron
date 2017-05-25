package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductExpressConsentFlagNodeModule {

    private final ProductExpressConsentFlagNode owner;

    public ProductExpressConsentFlagNodeModule(ProductExpressConsentFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ProductExpressConsentFlagNodeScope @Owner ProductExpressConsentFlagNode provideProductExpressConsentFlagNode() {
        return owner;
    }

    @Provides @ProductExpressConsentFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductExpressConsentFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductExpressConsentFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductExpressConsentFlagNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ProductExpressConsentFlagNodeScope
    RuleProvider<ProductExpressConsentFlagNode> provideRuleProvider(Provider<ProductExpressConsentFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ProductExpressConsentFlagNodeScope
    Map<String, RuleProvider<ProductExpressConsentFlagNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.ProductExpressConsentFlagNodeRuleProvider> productExpressConsentFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductExpressConsentFlagNode>> result = new HashMap<>();
        result.put("productExpressConsentFlagNode", productExpressConsentFlagNodeRuleProvider.get());
        return result;
    }
}