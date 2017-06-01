package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductDissatisfactionFlagNodeModule {

    private final ProductDissatisfactionFlagNode owner;

    public ProductDissatisfactionFlagNodeModule(ProductDissatisfactionFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductDissatisfactionFlagNode provideProductDissatisfactionFlagNode() {
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
    RuleProvider<ProductDissatisfactionFlagNode> provideRuleProvider(Provider<ProductDissatisfactionFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductDissatisfactionFlagNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductDissatisfactionFlagNodeRuleProvider> productDissatisfactionFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductDissatisfactionFlagNode>> result = new HashMap<>();
        result.put("productDissatisfactionFlagNode", productDissatisfactionFlagNodeRuleProvider.get());
        return result;
    }
}