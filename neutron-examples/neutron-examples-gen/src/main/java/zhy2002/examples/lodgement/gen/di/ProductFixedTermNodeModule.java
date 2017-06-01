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
public class ProductFixedTermNodeModule {

    private final ProductFixedTermNode owner;

    public ProductFixedTermNodeModule(ProductFixedTermNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductFixedTermNode provideProductFixedTermNode() {
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

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductFixedTermNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductFixedTermNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductFixedTermNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductFixedTermNode> provideTypeRuleProvider(ProductFixedTermNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProductFixedTermNodeRuleProvider") @IntoMap @StringKey("productFixedTermNode")
        RuleProvider<ProductFixedTermNode> provideProductFixedTermNodeChildRuleProvider(
            ProductDescriptionNodeChildProvider.ProductFixedTermNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProductFixedTermNode>> provideRuleProviders(
        @Named("ProductFixedTermNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductFixedTermNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}