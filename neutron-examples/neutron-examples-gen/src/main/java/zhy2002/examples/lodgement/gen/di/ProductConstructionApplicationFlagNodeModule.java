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
public class ProductConstructionApplicationFlagNodeModule {

    private final ProductConstructionApplicationFlagNode owner;

    public ProductConstructionApplicationFlagNodeModule(ProductConstructionApplicationFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductConstructionApplicationFlagNode provideProductConstructionApplicationFlagNode() {
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

    @Provides @Named("ProductConstructionApplicationFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductConstructionApplicationFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductConstructionApplicationFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductConstructionApplicationFlagNode> provideTypeRuleProvider(ProductConstructionApplicationFlagNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProductConstructionApplicationFlagNodeRuleProvider") @IntoMap @StringKey("productConstructionApplicationFlagNode")
        RuleProvider<ProductConstructionApplicationFlagNode> provideProductConstructionApplicationFlagNodeChildRuleProvider(
            ProductDescriptionNodeChildProvider.ProductConstructionApplicationFlagNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProductConstructionApplicationFlagNode>> provideRuleProviders(
        @Named("ProductConstructionApplicationFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductConstructionApplicationFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}