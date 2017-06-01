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
public class ProductOptOutReasonNodeModule {

    private final ProductOptOutReasonNode owner;

    public ProductOptOutReasonNodeModule(ProductOptOutReasonNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductOptOutReasonNode provideProductOptOutReasonNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner StringUiNode<?> provideStringUiNode() {
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

    @Provides @Named("ProductOptOutReasonNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductOptOutReasonNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductOptOutReasonNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductOptOutReasonNode> provideTypeRuleProvider(ProductOptOutReasonNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProductOptOutReasonNodeRuleProvider") @IntoMap @StringKey("productOptOutReasonNode")
        RuleProvider<ProductOptOutReasonNode> provideProductOptOutReasonNodeChildRuleProvider(
            ProductFeaturesNodeChildProvider.ProductOptOutReasonNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProductOptOutReasonNode>> provideRuleProviders(
        @Named("ProductOptOutReasonNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductOptOutReasonNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}