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
public class PersonContactNodeModule {

    private final PersonContactNode owner;

    public PersonContactNodeModule(PersonContactNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonContactNode providePersonContactNode() {
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

    @Provides @Named("PersonContactNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PersonContactNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PersonContactNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PersonContactNode> provideTypeRuleProvider(PersonContactNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("PersonContactNodeRuleProvider") @IntoMap @StringKey("personContactNode")
        RuleProvider<PersonContactNode> providePersonContactNodeChildRuleProvider(
            PersonNodeChildProvider.PersonContactNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<PersonContactNode>> provideRuleProviders(
        @Named("PersonContactNodeRuleProvider")  Map<String, Provider<RuleProvider<PersonContactNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}