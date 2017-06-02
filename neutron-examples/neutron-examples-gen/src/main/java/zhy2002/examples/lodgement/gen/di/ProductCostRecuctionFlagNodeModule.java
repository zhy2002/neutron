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
public class ProductCostRecuctionFlagNodeModule {

    private final ProductCostRecuctionFlagNode owner;

    public ProductCostRecuctionFlagNodeModule(ProductCostRecuctionFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductCostRecuctionFlagNode provideProductCostRecuctionFlagNode() {
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

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductCostRecuctionFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductCostRecuctionFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductCostRecuctionFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductCostRecuctionFlagNode> provideTypeRuleProvider(ProductCostRecuctionFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductCostRecuctionFlagNode>> provideRuleProviders(
        @Named("ProductCostRecuctionFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductCostRecuctionFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}