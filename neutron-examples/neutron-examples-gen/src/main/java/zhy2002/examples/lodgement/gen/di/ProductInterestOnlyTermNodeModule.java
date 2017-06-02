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
public class ProductInterestOnlyTermNodeModule {

    private final ProductInterestOnlyTermNode owner;

    public ProductInterestOnlyTermNodeModule(ProductInterestOnlyTermNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductInterestOnlyTermNode provideProductInterestOnlyTermNode() {
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

    @Provides @Named("ProductInterestOnlyTermNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductInterestOnlyTermNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductInterestOnlyTermNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductInterestOnlyTermNode> provideTypeRuleProvider(ProductInterestOnlyTermNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductInterestOnlyTermNode>> provideRuleProviders(
        @Named("ProductInterestOnlyTermNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductInterestOnlyTermNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}