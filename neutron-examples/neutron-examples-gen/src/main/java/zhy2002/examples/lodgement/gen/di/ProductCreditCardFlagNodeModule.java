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
public class ProductCreditCardFlagNodeModule {

    private final ProductCreditCardFlagNode owner;

    public ProductCreditCardFlagNodeModule(ProductCreditCardFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductCreditCardFlagNode provideProductCreditCardFlagNode() {
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

    @Provides @Named("ProductCreditCardFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductCreditCardFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductCreditCardFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductCreditCardFlagNode> provideTypeRuleProvider(ProductCreditCardFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductCreditCardFlagNode>> provideRuleProviders(
        @Named("ProductCreditCardFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductCreditCardFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}