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
public class ProductFeaturesNodeModule {

    private final ProductFeaturesNode owner;

    public ProductFeaturesNodeModule(ProductFeaturesNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductFeaturesNode provideProductFeaturesNode() {
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

    @Provides @ComponentScope ProductNode provideProductNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductFeaturesNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductFeaturesNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductFeaturesNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductFeaturesNode> provideTypeRuleProvider(ProductFeaturesNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductFeaturesNode>> provideRuleProviders(
        @Named("ProductFeaturesNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductFeaturesNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}