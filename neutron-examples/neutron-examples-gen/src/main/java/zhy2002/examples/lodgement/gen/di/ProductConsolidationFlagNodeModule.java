package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductConsolidationFlagNodeModule {

    private final ProductConsolidationFlagNode owner;

    public ProductConsolidationFlagNodeModule(ProductConsolidationFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductConsolidationFlagNode provideProductConsolidationFlagNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductConsolidationFlagNode> provideRuleProvider(Provider<ProductConsolidationFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductConsolidationFlagNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductConsolidationFlagNodeRuleProvider> productConsolidationFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductConsolidationFlagNode>> result = new HashMap<>();
        result.put("productConsolidationFlagNode", productConsolidationFlagNodeRuleProvider.get());
        return result;
    }
}