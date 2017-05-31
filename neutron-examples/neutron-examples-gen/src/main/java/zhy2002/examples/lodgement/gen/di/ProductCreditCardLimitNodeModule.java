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

    @Provides @ComponentScope @Owner ProductCreditCardLimitNode provideProductCreditCardLimitNode() {
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

    @Provides @ComponentScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductCreditCardLimitNode> provideRuleProvider(Provider<ProductCreditCardLimitNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductCreditCardLimitNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.ProductCreditCardLimitNodeRuleProvider> productCreditCardLimitNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductCreditCardLimitNode>> result = new HashMap<>();
        result.put("productCreditCardLimitNode", productCreditCardLimitNodeRuleProvider.get());
        return result;
    }
}