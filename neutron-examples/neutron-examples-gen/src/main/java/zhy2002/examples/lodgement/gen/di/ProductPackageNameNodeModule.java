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

    @Provides @ComponentScope @Owner ProductPackageNameNode provideProductPackageNameNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductPackageNameNode> provideRuleProvider(Provider<ProductPackageNameNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductPackageNameNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.ProductPackageNameNodeRuleProvider> productPackageNameNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductPackageNameNode>> result = new HashMap<>();
        result.put("productPackageNameNode", productPackageNameNodeRuleProvider.get());
        return result;
    }
}