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
public class ProductDescriptionNodeModule {

    private final ProductDescriptionNode owner;

    public ProductDescriptionNodeModule(ProductDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductDescriptionNode provideProductDescriptionNode() {
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

    @Provides @Named("ProductDescriptionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductDescriptionNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductDescriptionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductDescriptionNode> provideTypeRuleProvider(ProductDescriptionNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("ProductDescriptionNodeRuleProvider") @IntoMap @StringKey("productDescriptionNode")
        RuleProvider<ProductDescriptionNode> provideProductDescriptionNodeChildRuleProvider(
            ProductNodeChildProvider.ProductDescriptionNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<ProductDescriptionNode>> provideRuleProviders(
        @Named("ProductDescriptionNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductDescriptionNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}