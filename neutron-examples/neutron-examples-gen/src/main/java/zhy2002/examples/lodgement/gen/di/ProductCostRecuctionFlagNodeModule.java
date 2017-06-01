package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductCostRecuctionFlagNodeModule {

    private final ProductCostRecuctionFlagNode owner;

    public ProductCostRecuctionFlagNodeModule(ProductCostRecuctionFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductCostRecuctionFlagNode provideProductCostRecuctionFlagNode() {
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
    RuleProvider<ProductCostRecuctionFlagNode> provideRuleProvider(Provider<ProductCostRecuctionFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductCostRecuctionFlagNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductCostRecuctionFlagNodeRuleProvider> productCostRecuctionFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductCostRecuctionFlagNode>> result = new HashMap<>();
        result.put("productCostRecuctionFlagNode", productCostRecuctionFlagNodeRuleProvider.get());
        return result;
    }
}