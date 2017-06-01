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

    @Provides @ComponentScope @Owner ProductTotalLoanAmountNode provideProductTotalLoanAmountNode() {
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
        return owner.getContext().getNodeIdentity().getName();
    }

    @Provides @ComponentScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductTotalLoanAmountNode> provideRuleProvider(Provider<ProductTotalLoanAmountNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductTotalLoanAmountNode>> provideInstanceProviderMap(
        Provider<ProductsNodeChildProvider.ProductTotalLoanAmountNodeRuleProvider> productTotalLoanAmountNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductTotalLoanAmountNode>> result = new HashMap<>();
        result.put("productTotalLoanAmountNode", productTotalLoanAmountNodeRuleProvider.get());
        return result;
    }
}