package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductFixedTermNodeModule {

    private final ProductFixedTermNode owner;

    public ProductFixedTermNodeModule(ProductFixedTermNode owner) {
        this.owner = owner;
    }

    @Provides @ProductFixedTermNodeScope @Owner ProductFixedTermNode provideProductFixedTermNode() {
        return owner;
    }

    @Provides @ProductFixedTermNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProductFixedTermNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductFixedTermNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductFixedTermNodeScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ProductFixedTermNodeScope
    Map<String, RuleProvider<ProductFixedTermNode>> provideInstanceProviders(
        Provider<ProductDescriptionNodeChildProvider.ProductFixedTermNodeRuleProvider> productFixedTermNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductFixedTermNode>> result = new HashMap<>();
        result.put("productFixedTermNode", productFixedTermNodeRuleProvider.get());
        return result;
    }
}