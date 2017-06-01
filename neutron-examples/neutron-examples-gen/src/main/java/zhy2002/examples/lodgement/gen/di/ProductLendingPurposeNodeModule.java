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
public class ProductLendingPurposeNodeModule {

    private final ProductLendingPurposeNode owner;

    public ProductLendingPurposeNodeModule(ProductLendingPurposeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductLendingPurposeNode provideProductLendingPurposeNode() {
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

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductLendingPurposeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductLendingPurposeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductLendingPurposeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductLendingPurposeNode> provideTypeRuleProvider(ProductLendingPurposeNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProductLendingPurposeNodeRuleProvider") @IntoMap @StringKey("productLendingPurposeNode")
        RuleProvider<ProductLendingPurposeNode> provideProductLendingPurposeNodeChildRuleProvider(
            ProductDescriptionNodeChildProvider.ProductLendingPurposeNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProductLendingPurposeNode>> provideRuleProviders(
        @Named("ProductLendingPurposeNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductLendingPurposeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}