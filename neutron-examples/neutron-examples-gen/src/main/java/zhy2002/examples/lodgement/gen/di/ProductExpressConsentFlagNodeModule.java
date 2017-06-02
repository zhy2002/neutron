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
public class ProductExpressConsentFlagNodeModule {

    private final ProductExpressConsentFlagNode owner;

    public ProductExpressConsentFlagNodeModule(ProductExpressConsentFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductExpressConsentFlagNode provideProductExpressConsentFlagNode() {
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

    @Provides @ComponentScope ProductFeaturesNode provideProductFeaturesNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductExpressConsentFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductExpressConsentFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductExpressConsentFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductExpressConsentFlagNode> provideTypeRuleProvider(ProductExpressConsentFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductExpressConsentFlagNode>> provideRuleProviders(
        @Named("ProductExpressConsentFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductExpressConsentFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}