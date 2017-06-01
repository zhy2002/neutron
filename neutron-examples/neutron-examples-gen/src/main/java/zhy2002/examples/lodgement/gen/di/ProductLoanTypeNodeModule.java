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
public class ProductLoanTypeNodeModule {

    private final ProductLoanTypeNode owner;

    public ProductLoanTypeNodeModule(ProductLoanTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductLoanTypeNode provideProductLoanTypeNode() {
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

    @Provides @ComponentScope ProductsNode provideProductsNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductLoanTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductLoanTypeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductLoanTypeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductLoanTypeNode> provideTypeRuleProvider(ProductLoanTypeNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProductLoanTypeNodeRuleProvider") @IntoMap @StringKey("productLoanTypeNode")
        RuleProvider<ProductLoanTypeNode> provideProductLoanTypeNodeChildRuleProvider(
            ProductsNodeChildProvider.ProductLoanTypeNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProductLoanTypeNode>> provideRuleProviders(
        @Named("ProductLoanTypeNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductLoanTypeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}