package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductGroupNodeModule {

    private final ProductGroupNode owner;

    public ProductGroupNodeModule(ProductGroupNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductGroupNode provideProductGroupNode() {
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
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductGroupNode> provideRuleProvider(Provider<ProductGroupNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductGroupNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductGroupNodeRuleProvider> productGroupNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductGroupNode>> result = new HashMap<>();
        result.put("productGroupNode", productGroupNodeRuleProvider.get());
        return result;
    }
}