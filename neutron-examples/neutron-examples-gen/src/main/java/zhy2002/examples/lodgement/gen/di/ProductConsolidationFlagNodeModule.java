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
public class ProductConsolidationFlagNodeModule {

    private final ProductConsolidationFlagNode owner;

    public ProductConsolidationFlagNodeModule(ProductConsolidationFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductConsolidationFlagNode provideProductConsolidationFlagNode() {
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

    @Provides @Named("ProductConsolidationFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductConsolidationFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductConsolidationFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductConsolidationFlagNode> provideTypeRuleProvider(ProductConsolidationFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductConsolidationFlagNode>> provideRuleProviders(
        @Named("ProductConsolidationFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductConsolidationFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}