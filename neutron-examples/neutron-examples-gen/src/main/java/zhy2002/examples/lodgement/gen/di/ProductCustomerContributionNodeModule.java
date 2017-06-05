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
public class ProductCustomerContributionNodeModule {

    private final ProductCustomerContributionNode owner;

    public ProductCustomerContributionNodeModule(ProductCustomerContributionNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductCustomerContributionNode provideProductCustomerContributionNode() {
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

    @Provides @ComponentScope ProductCustomerContributionListNode provideProductCustomerContributionListNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductCustomerContributionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductCustomerContributionNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductCustomerContributionNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductCustomerContributionNode> provideTypeRuleProvider(ProductCustomerContributionNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductCustomerContributionNode>> provideRuleProviders(
        @Named("ProductCustomerContributionNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductCustomerContributionNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}