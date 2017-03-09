package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductCreditCardLimitNodeModule {

    private final ProductCreditCardLimitNode owner;

    public ProductCreditCardLimitNodeModule(ProductCreditCardLimitNode owner) {
        this.owner = owner;
    }

    @Provides @ProductCreditCardLimitNodeScope @Owner ProductCreditCardLimitNode provideProductCreditCardLimitNode() {
        return owner;
    }

    @Provides @ProductCreditCardLimitNodeScope @Owner BaseCurrencyNode<?> provideBaseCurrencyNode() {
        return owner;
    }

    @Provides @ProductCreditCardLimitNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @ProductCreditCardLimitNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductCreditCardLimitNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductCreditCardLimitNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ProductCreditCardLimitNodeScope
    Map<String, RuleProvider<ProductCreditCardLimitNode>> provideInstanceProviders(
        Provider<ProductFeaturesNodeChildProvider.ProductCreditCardLimitNodeRuleProvider> productCreditCardLimitNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductCreditCardLimitNode>> result = new HashMap<>();
        result.put("productCreditCardLimitNode", productCreditCardLimitNodeRuleProvider.get());
        return result;
    }
}