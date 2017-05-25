package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductPackageNameNodeModule {

    private final ProductPackageNameNode owner;

    public ProductPackageNameNodeModule(ProductPackageNameNode owner) {
        this.owner = owner;
    }

    @Provides @ProductPackageNameNodeScope @Owner ProductPackageNameNode provideProductPackageNameNode() {
        return owner;
    }

    @Provides @ProductPackageNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ProductPackageNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductPackageNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductPackageNameNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ProductPackageNameNodeScope
    RuleProvider<ProductPackageNameNode> provideRuleProvider(Provider<ProductPackageNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ProductPackageNameNodeScope
    Map<String, RuleProvider<ProductPackageNameNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.ProductPackageNameNodeRuleProvider> productPackageNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductPackageNameNode>> result = new HashMap<>();
        result.put("productPackageNameNode", productPackageNameNodeRuleProvider.get());
        return result;
    }
}