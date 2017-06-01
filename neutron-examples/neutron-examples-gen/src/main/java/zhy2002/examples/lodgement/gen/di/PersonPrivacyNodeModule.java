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
public class PersonPrivacyNodeModule {

    private final PersonPrivacyNode owner;

    public PersonPrivacyNodeModule(PersonPrivacyNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonPrivacyNode providePersonPrivacyNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BasePrivacyNode<?> provideBasePrivacyNode() {
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

    @Provides @Named("PersonPrivacyNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PersonPrivacyNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PersonPrivacyNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PersonPrivacyNode> provideTypeRuleProvider(PersonPrivacyNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("PersonPrivacyNodeRuleProvider") @IntoMap @StringKey("personPrivacyNode")
        RuleProvider<PersonPrivacyNode> providePersonPrivacyNodeChildRuleProvider(
            PersonNodeChildProvider.PersonPrivacyNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<PersonPrivacyNode>> provideRuleProviders(
        @Named("PersonPrivacyNodeRuleProvider")  Map<String, Provider<RuleProvider<PersonPrivacyNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}