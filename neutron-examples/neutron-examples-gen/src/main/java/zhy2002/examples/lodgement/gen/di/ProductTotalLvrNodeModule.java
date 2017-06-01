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
public class ProductTotalLvrNodeModule {

    private final ProductTotalLvrNode owner;

    public ProductTotalLvrNodeModule(ProductTotalLvrNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductTotalLvrNode provideProductTotalLvrNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BasePercentageNode<?> provideBasePercentageNode() {
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

    @Provides @Named("ProductTotalLvrNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductTotalLvrNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductTotalLvrNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductTotalLvrNode> provideTypeRuleProvider(ProductTotalLvrNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProductTotalLvrNodeRuleProvider") @IntoMap @StringKey("productTotalLvrNode")
        RuleProvider<ProductTotalLvrNode> provideProductTotalLvrNodeChildRuleProvider(
            ProductsNodeChildProvider.ProductTotalLvrNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProductTotalLvrNode>> provideRuleProviders(
        @Named("ProductTotalLvrNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductTotalLvrNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}