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
public class CreditCardListNodeModule {

    private final CreditCardListNode owner;

    public CreditCardListNodeModule(CreditCardListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CreditCardListNode provideCreditCardListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope LiabilitiesNode provideLiabilitiesNode() {
        return owner.getParent();
    }

    @Provides @Named("CreditCardListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CreditCardListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CreditCardListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CreditCardListNode> provideTypeRuleProvider(CreditCardListNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("CreditCardListNodeRuleProvider") @IntoMap @StringKey("creditCardListNode")
        RuleProvider<CreditCardListNode> provideCreditCardListNodeChildRuleProvider(
            LiabilitiesNodeChildProvider.CreditCardListNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<CreditCardListNode>> provideRuleProviders(
        @Named("CreditCardListNodeRuleProvider")  Map<String, Provider<RuleProvider<CreditCardListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}