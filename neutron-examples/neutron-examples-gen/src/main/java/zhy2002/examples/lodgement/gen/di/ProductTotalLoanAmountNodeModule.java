package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductTotalLoanAmountNodeModule {

    private final ProductTotalLoanAmountNode owner;

    public ProductTotalLoanAmountNodeModule(ProductTotalLoanAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ProductTotalLoanAmountNodeScope @Owner ProductTotalLoanAmountNode provideProductTotalLoanAmountNode() {
        return owner;
    }

    @Provides @ProductTotalLoanAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @ProductTotalLoanAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProductTotalLoanAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductTotalLoanAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductTotalLoanAmountNodeScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @ProductTotalLoanAmountNodeScope
    Map<String, RuleProvider<ProductTotalLoanAmountNode>> provideInstanceProviders(
        Provider<ProductsNodeChildProvider.ProductTotalLoanAmountNodeRuleProvider> productTotalLoanAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductTotalLoanAmountNode>> result = new HashMap<>();
        result.put("productTotalLoanAmountNode", productTotalLoanAmountNodeRuleProvider.get());
        return result;
    }
}