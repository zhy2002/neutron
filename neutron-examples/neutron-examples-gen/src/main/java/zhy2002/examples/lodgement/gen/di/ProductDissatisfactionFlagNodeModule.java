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

    @Provides @ProductDissatisfactionFlagNodeScope @Owner ProductDissatisfactionFlagNode provideProductDissatisfactionFlagNode() {
        return owner;
    }

    @Provides @ProductDissatisfactionFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductDissatisfactionFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductDissatisfactionFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductDissatisfactionFlagNodeScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ProductDissatisfactionFlagNodeScope
    Map<String, RuleProvider<ProductDissatisfactionFlagNode>> provideInstanceProviders(
        Provider<ProductDescriptionNodeChildProvider.ProductDissatisfactionFlagNodeRuleProvider> productDissatisfactionFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductDissatisfactionFlagNode>> result = new HashMap<>();
        result.put("productDissatisfactionFlagNode", productDissatisfactionFlagNodeRuleProvider.get());
        return result;
    }
}