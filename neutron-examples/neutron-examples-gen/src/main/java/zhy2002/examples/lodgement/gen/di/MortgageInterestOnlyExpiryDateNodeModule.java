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
public class MortgageInterestOnlyExpiryDateNodeModule {

    private final MortgageInterestOnlyExpiryDateNode owner;

    public MortgageInterestOnlyExpiryDateNodeModule(MortgageInterestOnlyExpiryDateNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner MortgageInterestOnlyExpiryDateNode provideMortgageInterestOnlyExpiryDateNode() {
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

    @Provides @ComponentScope ExistingMortgageNode provideExistingMortgageNode() {
        return owner.getParent();
    }

    @Provides @Named("MortgageInterestOnlyExpiryDateNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<MortgageInterestOnlyExpiryDateNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("MortgageInterestOnlyExpiryDateNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<MortgageInterestOnlyExpiryDateNode> provideTypeRuleProvider(MortgageInterestOnlyExpiryDateNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<MortgageInterestOnlyExpiryDateNode>> provideRuleProviders(
        @Named("MortgageInterestOnlyExpiryDateNodeRuleProvider")  Map<String, Provider<RuleProvider<MortgageInterestOnlyExpiryDateNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}