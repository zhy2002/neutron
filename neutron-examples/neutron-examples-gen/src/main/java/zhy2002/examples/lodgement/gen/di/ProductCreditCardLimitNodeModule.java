package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.neutron.util.NeutronConstants;


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

    @Provides @Named("ProductCreditCardLimitNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductCreditCardLimitNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductCreditCardLimitNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductCreditCardLimitNode> provideTypeRuleProvider(ProductCreditCardLimitNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProductCreditCardLimitNodeRuleProvider") @IntoMap @StringKey("productCreditCardLimitNode")
        RuleProvider<ProductCreditCardLimitNode> provideProductCreditCardLimitNodeChildRuleProvider(
            ProductFeaturesNodeChildProvider.ProductCreditCardLimitNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProductCreditCardLimitNode>> provideRuleProviders(
        @Named("ProductCreditCardLimitNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductCreditCardLimitNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}