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
public class PersonGeneralNodeModule {

    private final PersonGeneralNode owner;

    public PersonGeneralNodeModule(PersonGeneralNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonGeneralNode providePersonGeneralNode() {
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

    @Provides @Named("PersonGeneralNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PersonGeneralNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PersonGeneralNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PersonGeneralNode> provideTypeRuleProvider(PersonGeneralNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("PersonGeneralNodeRuleProvider") @IntoMap @StringKey("personGeneralNode")
        RuleProvider<PersonGeneralNode> providePersonGeneralNodeChildRuleProvider(
            PersonNodeChildProvider.PersonGeneralNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<PersonGeneralNode>> provideRuleProviders(
        @Named("PersonGeneralNodeRuleProvider")  Map<String, Provider<RuleProvider<PersonGeneralNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}