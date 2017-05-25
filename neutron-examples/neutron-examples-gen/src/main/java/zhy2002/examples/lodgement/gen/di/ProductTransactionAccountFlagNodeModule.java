package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductTransactionAccountFlagNodeModule {

    private final ProductTransactionAccountFlagNode owner;

    public ProductTransactionAccountFlagNodeModule(ProductTransactionAccountFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ProductTransactionAccountFlagNodeScope @Owner ProductTransactionAccountFlagNode provideProductTransactionAccountFlagNode() {
        return owner;
    }

    @Provides @ProductTransactionAccountFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductTransactionAccountFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductTransactionAccountFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductTransactionAccountFlagNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ProductTransactionAccountFlagNodeScope
    RuleProvider<ProductTransactionAccountFlagNode> provideRuleProvider(Provider<ProductTransactionAccountFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ProductTransactionAccountFlagNodeScope
    Map<String, RuleProvider<ProductTransactionAccountFlagNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.ProductTransactionAccountFlagNodeRuleProvider> productTransactionAccountFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductTransactionAccountFlagNode>> result = new HashMap<>();
        result.put("productTransactionAccountFlagNode", productTransactionAccountFlagNodeRuleProvider.get());
        return result;
    }
}