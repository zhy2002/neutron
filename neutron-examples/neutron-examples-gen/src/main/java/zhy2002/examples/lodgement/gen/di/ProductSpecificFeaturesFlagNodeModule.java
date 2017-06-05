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
public class ProductSpecificFeaturesFlagNodeModule {

    private final ProductSpecificFeaturesFlagNode owner;

    public ProductSpecificFeaturesFlagNodeModule(ProductSpecificFeaturesFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductSpecificFeaturesFlagNode provideProductSpecificFeaturesFlagNode() {
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

    @Provides @Named("ProductSpecificFeaturesFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductSpecificFeaturesFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductSpecificFeaturesFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductSpecificFeaturesFlagNode> provideTypeRuleProvider(ProductSpecificFeaturesFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductSpecificFeaturesFlagNode>> provideRuleProviders(
        @Named("ProductSpecificFeaturesFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductSpecificFeaturesFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}