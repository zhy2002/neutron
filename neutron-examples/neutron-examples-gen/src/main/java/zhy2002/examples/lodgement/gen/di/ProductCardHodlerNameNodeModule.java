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
public class ProductCardHodlerNameNodeModule {

    private final ProductCardHodlerNameNode owner;

    public ProductCardHodlerNameNodeModule(ProductCardHodlerNameNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductCardHodlerNameNode provideProductCardHodlerNameNode() {
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

    @Provides @ComponentScope ProductCardHolderNode provideProductCardHolderNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductCardHodlerNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductCardHodlerNameNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductCardHodlerNameNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductCardHodlerNameNode> provideTypeRuleProvider(ProductCardHodlerNameNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProductCardHodlerNameNodeRuleProvider") @IntoMap @StringKey("productCardHodlerNameNode")
        RuleProvider<ProductCardHodlerNameNode> provideProductCardHodlerNameNodeChildRuleProvider(
            ProductCardHolderNodeChildProvider.ProductCardHodlerNameNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProductCardHodlerNameNode>> provideRuleProviders(
        @Named("ProductCardHodlerNameNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductCardHodlerNameNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}