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

    @Provides @ComponentScope @Owner ProductCreditCardFlagNode provideProductCreditCardFlagNode() {
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

    @Provides @ComponentScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<ProductCreditCardFlagNode> provideRuleProvider(Provider<ProductCreditCardFlagNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<ProductCreditCardFlagNode>> provideInstanceProviderMap(
        Provider<ProductFeaturesNodeChildProvider.ProductCreditCardFlagNodeRuleProvider> productCreditCardFlagNodeRuleProvider
    ) {
        Map<String, RuleProvider<ProductCreditCardFlagNode>> result = new HashMap<>();
        result.put("productCreditCardFlagNode", productCreditCardFlagNodeRuleProvider.get());
        return result;
    }
}