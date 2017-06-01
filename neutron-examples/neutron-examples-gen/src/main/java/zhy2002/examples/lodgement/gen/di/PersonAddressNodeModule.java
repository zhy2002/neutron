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
public class PersonAddressNodeModule {

    private final PersonAddressNode owner;

    public PersonAddressNodeModule(PersonAddressNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonAddressNode providePersonAddressNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner AddressNode<?> provideAddressNode() {
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

    @Provides @ComponentScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

    @Provides @Named("PersonAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PersonAddressNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PersonAddressNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PersonAddressNode> provideTypeRuleProvider(PersonAddressNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("PersonAddressNodeRuleProvider") @IntoMap @StringKey("currentAddressNode")
        RuleProvider<PersonAddressNode> provideCurrentAddressNodeChildRuleProvider(
            PersonContactNodeChildProvider.CurrentAddressNodeRuleProvider provider
        ) {
            return provider;
        }

        @Provides @Named("PersonAddressNodeRuleProvider") @IntoMap @StringKey("postalAddressNode")
        RuleProvider<PersonAddressNode> providePostalAddressNodeChildRuleProvider(
            PersonContactNodeChildProvider.PostalAddressNodeRuleProvider provider
        ) {
            return provider;
        }

        @Provides @Named("PersonAddressNodeRuleProvider") @IntoMap @StringKey("previousAddressNode")
        RuleProvider<PersonAddressNode> providePreviousAddressNodeChildRuleProvider(
            PersonContactNodeChildProvider.PreviousAddressNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<PersonAddressNode>> provideRuleProviders(
        @Named("PersonAddressNodeRuleProvider")  Map<String, Provider<RuleProvider<PersonAddressNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}