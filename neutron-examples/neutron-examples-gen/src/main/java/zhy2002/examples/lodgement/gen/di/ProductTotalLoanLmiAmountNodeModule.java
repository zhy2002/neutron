package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductTotalLoanLmiAmountNodeModule {

    private final ProductTotalLoanLmiAmountNode owner;

    public ProductTotalLoanLmiAmountNodeModule(ProductTotalLoanLmiAmountNode owner) {
        this.owner = owner;
    }

    @Provides @ProductTotalLoanLmiAmountNodeScope @Owner ProductTotalLoanLmiAmountNode provideProductTotalLoanLmiAmountNode() {
        return owner;
    }

    @Provides @ProductTotalLoanLmiAmountNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @ProductTotalLoanLmiAmountNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProductTotalLoanLmiAmountNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductTotalLoanLmiAmountNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductTotalLoanLmiAmountNodeScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @ProductTotalLoanLmiAmountNodeScope
    RuleProvider<ProductTotalLoanLmiAmountNode> provideRuleProvider(Provider<ProductTotalLoanLmiAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ProductTotalLoanLmiAmountNodeScope
    Map<String, RuleProvider<ProductTotalLoanLmiAmountNode>> provideInstanceProviderMap(
        Provider<ProductsNodeChildProvider.ProductTotalLoanLmiAmountNodeRuleProvider> productTotalLoanLmiAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductTotalLoanLmiAmountNode>> result = new HashMap<>();
        result.put("productTotalLoanLmiAmountNode", productTotalLoanLmiAmountNodeRuleProvider.get());
        return result;
    }
}