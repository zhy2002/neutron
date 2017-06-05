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
public class ProductRepaymentFrequencyNodeModule {

    private final ProductRepaymentFrequencyNode owner;

    public ProductRepaymentFrequencyNodeModule(ProductRepaymentFrequencyNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductRepaymentFrequencyNode provideProductRepaymentFrequencyNode() {
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

    @Provides @Named("ProductRepaymentFrequencyNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductRepaymentFrequencyNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductRepaymentFrequencyNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductRepaymentFrequencyNode> provideTypeRuleProvider(ProductRepaymentFrequencyNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductRepaymentFrequencyNode>> provideRuleProviders(
        @Named("ProductRepaymentFrequencyNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductRepaymentFrequencyNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}