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
public class ProductCustomerContributionListNodeModule {

    private final ProductCustomerContributionListNode owner;

    public ProductCustomerContributionListNodeModule(ProductCustomerContributionListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductCustomerContributionListNode provideProductCustomerContributionListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductCustomerContributionListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductCustomerContributionListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductCustomerContributionListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductCustomerContributionListNode> provideTypeRuleProvider(ProductCustomerContributionListNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProductCustomerContributionListNodeRuleProvider") @IntoMap @StringKey("productCustomerContributionListNode")
        RuleProvider<ProductCustomerContributionListNode> provideProductCustomerContributionListNodeChildRuleProvider(
            ProductsNodeChildProvider.ProductCustomerContributionListNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProductCustomerContributionListNode>> provideRuleProviders(
        @Named("ProductCustomerContributionListNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductCustomerContributionListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}