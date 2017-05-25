package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductOptOutReasonNodeModule {

    private final ProductOptOutReasonNode owner;

    public ProductOptOutReasonNodeModule(ProductOptOutReasonNode owner) {
        this.owner = owner;
    }

    @Provides @ProductOptOutReasonNodeScope @Owner ProductOptOutReasonNode provideProductOptOutReasonNode() {
        return owner;
    }

    @Provides @ProductOptOutReasonNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductOptOutReasonNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductOptOutReasonNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductOptOutReasonNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ProductOptOutReasonNodeScope
    RuleProvider<ProductOptOutReasonNode> provideRuleProvider(Provider<ProductOptOutReasonNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ProductOptOutReasonNodeScope
    Map<String, RuleProvider<ProductOptOutReasonNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.ProductOptOutReasonNodeRuleProvider> productOptOutReasonNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductOptOutReasonNode>> result = new HashMap<>();
        result.put("productOptOutReasonNode", productOptOutReasonNodeRuleProvider.get());
        return result;
    }
}