package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductCardHodlerNameNodeModule {

    private final ProductCardHodlerNameNode owner;

    public ProductCardHodlerNameNodeModule(ProductCardHodlerNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductCardHodlerNameNode provideProductCardHodlerNameNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ProductCardHolderNode provideProductCardHolderNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductCardHodlerNameNode> provideRuleProvider(Provider<ProductCardHodlerNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductCardHodlerNameNode>> provideInstanceProviderMap(
        Provider<ProductCardHolderNodeChildProvider.ProductCardHodlerNameNodeRuleProvider> productCardHodlerNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductCardHodlerNameNode>> result = new HashMap<>();
        result.put("productCardHodlerNameNode", productCardHodlerNameNodeRuleProvider.get());
        return result;
    }
}