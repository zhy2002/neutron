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
public class ProductLoanPrimaryPurposeNodeModule {

    private final ProductLoanPrimaryPurposeNode owner;

    public ProductLoanPrimaryPurposeNodeModule(ProductLoanPrimaryPurposeNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner ProductLoanPrimaryPurposeNode provideProductLoanPrimaryPurposeNode() {
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

    @Provides @ComponentScope ProductDescriptionNode provideProductDescriptionNode() {
        return owner.getParent();
    }

    @Provides @Named("ProductLoanPrimaryPurposeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<ProductLoanPrimaryPurposeNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("ProductLoanPrimaryPurposeNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<ProductLoanPrimaryPurposeNode> provideTypeRuleProvider(ProductLoanPrimaryPurposeNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<ProductLoanPrimaryPurposeNode>> provideRuleProviders(
        @Named("ProductLoanPrimaryPurposeNodeRuleProvider")  Map<String, Provider<RuleProvider<ProductLoanPrimaryPurposeNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}