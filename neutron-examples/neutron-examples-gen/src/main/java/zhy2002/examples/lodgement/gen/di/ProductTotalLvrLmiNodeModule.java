package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import zhy2002.neutron.config.NeutronConstants;
import java.util.*;


@Module
public class ProductTotalLvrLmiNodeModule {

    private final ProductTotalLvrLmiNode owner;

    public ProductTotalLvrLmiNodeModule(ProductTotalLvrLmiNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductTotalLvrLmiNode provideProductTotalLvrLmiNode() {
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

    @Provides @Named("ProductTotalLvrLmiNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductTotalLvrLmiNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductTotalLvrLmiNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductTotalLvrLmiNode> provideTypeRuleProvider(ProductTotalLvrLmiNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductTotalLvrLmiNode>> provideRuleProviders(
        @Named("ProductTotalLvrLmiNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductTotalLvrLmiNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}