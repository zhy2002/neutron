package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductTotalSecurityAmountNodeModule {

    private final ProductTotalSecurityAmountNode owner;

    public ProductTotalSecurityAmountNodeModule(ProductTotalSecurityAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductTotalSecurityAmountNode provideProductTotalSecurityAmountNode() {
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

    @Provides @ComponentScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductTotalSecurityAmountNode> provideRuleProvider(Provider<ProductTotalSecurityAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductTotalSecurityAmountNode>> provideInstanceProviderMap(
        Provider<ProductsNodeChildProvider.ProductTotalSecurityAmountNodeRuleProvider> productTotalSecurityAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductTotalSecurityAmountNode>> result = new HashMap<>();
        result.put("productTotalSecurityAmountNode", productTotalSecurityAmountNodeRuleProvider.get());
        return result;
    }
}