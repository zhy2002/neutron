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
public class PersonTrustNodeModule {

    private final PersonTrustNode owner;

    public PersonTrustNodeModule(PersonTrustNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonTrustNode providePersonTrustNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseTrustNode<?> provideBaseTrustNode() {
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

    @Provides @ComponentScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @Named("PersonTrustNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PersonTrustNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PersonTrustNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PersonTrustNode> provideTypeRuleProvider(PersonTrustNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("PersonTrustNodeRuleProvider") @IntoMap @StringKey("personTrustNode")
        RuleProvider<PersonTrustNode> providePersonTrustNodeChildRuleProvider(
            PersonNodeChildProvider.PersonTrustNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<PersonTrustNode>> provideRuleProviders(
        @Named("PersonTrustNodeRuleProvider")  Map<String, Provider<RuleProvider<PersonTrustNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}