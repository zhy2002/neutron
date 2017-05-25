package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductLendingPurposeNodeModule {

    private final ProductLendingPurposeNode owner;

    public ProductLendingPurposeNodeModule(ProductLendingPurposeNode owner) {
        this.owner = owner;
    }

    @Provides @ProductLendingPurposeNodeScope @Owner ProductLendingPurposeNode provideProductLendingPurposeNode() {
        return owner;
    }

    @Provides @ProductLendingPurposeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductLendingPurposeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductLendingPurposeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductLendingPurposeNodeScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ProductLendingPurposeNodeScope
    RuleProvider<ProductLendingPurposeNode> provideRuleProvider(Provider<ProductLendingPurposeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ProductLendingPurposeNodeScope
    Map<String, RuleProvider<ProductLendingPurposeNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductLendingPurposeNodeRuleProvider> productLendingPurposeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductLendingPurposeNode>> result = new HashMap<>();
        result.put("productLendingPurposeNode", productLendingPurposeNodeRuleProvider.get());
        return result;
    }
}