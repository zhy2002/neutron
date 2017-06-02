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
public class Product100PercentOffsetFlagNodeModule {

    private final Product100PercentOffsetFlagNode owner;

    public Product100PercentOffsetFlagNodeModule(Product100PercentOffsetFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner Product100PercentOffsetFlagNode provideProduct100PercentOffsetFlagNode() {
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

    @Provides @Named("Product100PercentOffsetFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<Product100PercentOffsetFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("Product100PercentOffsetFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<Product100PercentOffsetFlagNode> provideTypeRuleProvider(Product100PercentOffsetFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<Product100PercentOffsetFlagNode>> provideRuleProviders(
        @Named("Product100PercentOffsetFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<Product100PercentOffsetFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}