package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductConstructionApplicationFlagNodeModule {

    private final ProductConstructionApplicationFlagNode owner;

    public ProductConstructionApplicationFlagNodeModule(ProductConstructionApplicationFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductConstructionApplicationFlagNode provideProductConstructionApplicationFlagNode() {
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

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductConstructionApplicationFlagNode> provideRuleProvider(Provider<ProductConstructionApplicationFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductConstructionApplicationFlagNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductConstructionApplicationFlagNodeRuleProvider> productConstructionApplicationFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductConstructionApplicationFlagNode>> result = new HashMap<>();
        result.put("productConstructionApplicationFlagNode", productConstructionApplicationFlagNodeRuleProvider.get());
        return result;
    }
}