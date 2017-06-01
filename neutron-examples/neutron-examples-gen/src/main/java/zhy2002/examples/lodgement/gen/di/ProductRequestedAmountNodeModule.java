package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductRequestedAmountNodeModule {

    private final ProductRequestedAmountNode owner;

    public ProductRequestedAmountNodeModule(ProductRequestedAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductRequestedAmountNode provideProductRequestedAmountNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductRequestedAmountNode> provideRuleProvider(Provider<ProductRequestedAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductRequestedAmountNode>> provideInstanceProviderMap(
        Provider<ProductDescriptionNodeChildProvider.ProductRequestedAmountNodeRuleProvider> productRequestedAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductRequestedAmountNode>> result = new HashMap<>();
        result.put("productRequestedAmountNode", productRequestedAmountNodeRuleProvider.get());
        return result;
    }
}