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
public class ProductDissatisfactionFlagNodeModule {

    private final ProductDissatisfactionFlagNode owner;

    public ProductDissatisfactionFlagNodeModule(ProductDissatisfactionFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductDissatisfactionFlagNode provideProductDissatisfactionFlagNode() {
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

    @Provides @Named("ProductDissatisfactionFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductDissatisfactionFlagNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductDissatisfactionFlagNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductDissatisfactionFlagNode> provideTypeRuleProvider(ProductDissatisfactionFlagNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductDissatisfactionFlagNode>> provideRuleProviders(
        @Named("ProductDissatisfactionFlagNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductDissatisfactionFlagNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}