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
public class ProductCardHolderNodeModule {

    private final ProductCardHolderNode owner;

    public ProductCardHolderNodeModule(ProductCardHolderNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductCardHolderNode provideProductCardHolderNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductCardHolderNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductCardHolderNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductCardHolderNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductCardHolderNode> provideTypeRuleProvider(ProductCardHolderNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProductCardHolderNodeRuleProvider") @IntoMap @StringKey("productPrimaryCardHolderNode")
        RuleProvider<ProductCardHolderNode> provideProductPrimaryCardHolderNodeChildRuleProvider(
            ProductFeaturesNodeChildProvider.ProductPrimaryCardHolderNodeRuleProvider provider
        ) {
            return provider;
        }

        @Provides @Named("ProductCardHolderNodeRuleProvider") @IntoMap @StringKey("productAdditionalCardHolderNode")
        RuleProvider<ProductCardHolderNode> provideProductAdditionalCardHolderNodeChildRuleProvider(
            ProductFeaturesNodeChildProvider.ProductAdditionalCardHolderNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProductCardHolderNode>> provideRuleProviders(
        @Named("ProductCardHolderNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductCardHolderNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}