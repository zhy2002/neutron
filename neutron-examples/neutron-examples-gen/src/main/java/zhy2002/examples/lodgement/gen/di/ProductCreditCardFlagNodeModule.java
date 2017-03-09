package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductCreditCardFlagNodeModule {

    private final ProductCreditCardFlagNode owner;

    public ProductCreditCardFlagNodeModule(ProductCreditCardFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ProductCreditCardFlagNodeScope @Owner ProductCreditCardFlagNode provideProductCreditCardFlagNode() {
        return owner;
    }

    @Provides @ProductCreditCardFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ProductCreditCardFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ProductCreditCardFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ProductCreditCardFlagNodeScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ProductCreditCardFlagNodeScope
    Map<String, RuleProvider<ProductCreditCardFlagNode>> provideInstanceProviders(
        Provider<ProductFeaturesNodeChildProvider.ProductCreditCardFlagNodeRuleProvider> productCreditCardFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductCreditCardFlagNode>> result = new HashMap<>();
        result.put("productCreditCardFlagNode", productCreditCardFlagNodeRuleProvider.get());
        return result;
    }
}