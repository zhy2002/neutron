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
public class ProductTransactionAccountFlagNodeModule {

    private final ProductTransactionAccountFlagNode owner;

    public ProductTransactionAccountFlagNodeModule(ProductTransactionAccountFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductTransactionAccountFlagNode provideProductTransactionAccountFlagNode() {
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

    @Provides @Named("ProductTransactionAccountFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductTransactionAccountFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductTransactionAccountFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductTransactionAccountFlagNode> provideTypeRuleProvider(ProductTransactionAccountFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductTransactionAccountFlagNode>> provideRuleProviders(
        @Named("ProductTransactionAccountFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductTransactionAccountFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}