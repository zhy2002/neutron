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

    @Provides @ComponentScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductTotalSecurityAmountNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductTotalSecurityAmountNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductTotalSecurityAmountNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductTotalSecurityAmountNode> provideTypeRuleProvider(ProductTotalSecurityAmountNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProductTotalSecurityAmountNodeRuleProvider") @IntoMap @StringKey("productTotalSecurityAmountNode")
        RuleProvider<ProductTotalSecurityAmountNode> provideProductTotalSecurityAmountNodeChildRuleProvider(
            ProductsNodeChildProvider.ProductTotalSecurityAmountNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProductTotalSecurityAmountNode>> provideRuleProviders(
        @Named("ProductTotalSecurityAmountNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductTotalSecurityAmountNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}