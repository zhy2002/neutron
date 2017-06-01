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
public class CreditCardOwnershipListNodeModule {

    private final CreditCardOwnershipListNode owner;

    public CreditCardOwnershipListNodeModule(CreditCardOwnershipListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner CreditCardOwnershipListNode provideCreditCardOwnershipListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner OwnershipListNode<?> provideOwnershipListNode() {
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

    @Provides @ComponentScope CreditCardNode provideCreditCardNode() {
        return owner.getParent();
    }

    @Provides @Named("CreditCardOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<CreditCardOwnershipListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("CreditCardOwnershipListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<CreditCardOwnershipListNode> provideTypeRuleProvider(CreditCardOwnershipListNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("CreditCardOwnershipListNodeRuleProvider") @IntoMap @StringKey("ownershipListNode")
        RuleProvider<CreditCardOwnershipListNode> provideOwnershipListNodeChildRuleProvider(
            CreditCardNodeChildProvider.OwnershipListNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<CreditCardOwnershipListNode>> provideRuleProviders(
        @Named("CreditCardOwnershipListNodeRuleProvider")  Map<String, Provider<RuleProvider<CreditCardOwnershipListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}