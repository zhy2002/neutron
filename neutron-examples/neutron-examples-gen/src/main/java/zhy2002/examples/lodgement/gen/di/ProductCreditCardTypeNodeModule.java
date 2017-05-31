package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class ProductCreditCardTypeNodeModule {

    private final ProductCreditCardTypeNode owner;

    public ProductCreditCardTypeNodeModule(ProductCreditCardTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductCreditCardTypeNode provideProductCreditCardTypeNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
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
    RuleProvider<ProductCreditCardTypeNode> provideRuleProvider(Provider<ProductCreditCardTypeNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductCreditCardTypeNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.ProductCreditCardTypeNodeRuleProvider> productCreditCardTypeNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductCreditCardTypeNode>> result = new HashMap<>();
        result.put("productCreditCardTypeNode", productCreditCardTypeNodeRuleProvider.get());
        return result;
    }
}