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
public class PersonEmailNodeModule {

    private final PersonEmailNode owner;

    public PersonEmailNodeModule(PersonEmailNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonEmailNode providePersonEmailNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner EmailNode<?> provideEmailNode() {
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

    @Provides @ComponentScope PersonContactNode providePersonContactNode() {
        return owner.getParent();
    }

    @Provides @Named("PersonEmailNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PersonEmailNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PersonEmailNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PersonEmailNode> provideTypeRuleProvider(PersonEmailNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PersonEmailNode>> provideRuleProviders(
        @Named("PersonEmailNodeRuleProvider")  Map<String, Provider<RuleProvider<PersonEmailNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}