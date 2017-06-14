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
public class ProductTotalLoanTermNodeModule {

    private final ProductTotalLoanTermNode owner;

    public ProductTotalLoanTermNodeModule(ProductTotalLoanTermNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductTotalLoanTermNode provideProductTotalLoanTermNode() {
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

    @Provides @Named("ProductTotalLoanTermNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductTotalLoanTermNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductTotalLoanTermNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductTotalLoanTermNode> provideTypeRuleProvider(ProductTotalLoanTermNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductTotalLoanTermNode>> provideRuleProviders(
        @Named("ProductTotalLoanTermNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductTotalLoanTermNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}