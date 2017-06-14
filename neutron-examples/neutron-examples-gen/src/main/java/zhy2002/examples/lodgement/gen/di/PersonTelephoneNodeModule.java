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
public class PersonTelephoneNodeModule {

    private final PersonTelephoneNode owner;

    public PersonTelephoneNodeModule(PersonTelephoneNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonTelephoneNode providePersonTelephoneNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

    @Provides @Named("PersonTelephoneNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PersonTelephoneNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PersonTelephoneNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PersonTelephoneNode> provideTypeRuleProvider(PersonTelephoneNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PersonTelephoneNode>> provideRuleProviders(
        @Named("PersonTelephoneNodeRuleProvider")  Map<String, Provider<RuleProvider<PersonTelephoneNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}