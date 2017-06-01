package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductsNodeModule {

    private final ProductsNode owner;

    public ProductsNodeModule(ProductsNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductsNode provideProductsNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ApplicationNode provideApplicationNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductsNode> provideRuleProvider(Provider<ProductsNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductsNode>> provideInstanceProviderMap(
        Provider<ApplicationNodeChildProvider.ProductsNodeRuleProvider> productsNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductsNode>> result = new HashMap<>();
        result.put("productsNode", productsNodeRuleProvider.get());
        return result;
    }
}