package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductInterestOnlyTermNodeModule {

    private final ProductInterestOnlyTermNode owner;

    public ProductInterestOnlyTermNodeModule(ProductInterestOnlyTermNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductInterestOnlyTermNode provideProductInterestOnlyTermNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
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
    RuleProvider<ProductInterestOnlyTermNode> provideRuleProvider(Provider<ProductInterestOnlyTermNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductInterestOnlyTermNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductInterestOnlyTermNodeRuleProvider> productInterestOnlyTermNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductInterestOnlyTermNode>> result = new HashMap<>();
        result.put("productInterestOnlyTermNode", productInterestOnlyTermNodeRuleProvider.get());
        return result;
    }
}