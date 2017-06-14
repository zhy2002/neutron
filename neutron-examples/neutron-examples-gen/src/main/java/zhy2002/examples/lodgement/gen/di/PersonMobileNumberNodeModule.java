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
public class PersonMobileNumberNodeModule {

    private final PersonMobileNumberNode owner;

    public PersonMobileNumberNodeModule(PersonMobileNumberNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonMobileNumberNode providePersonMobileNumberNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseMobileNumberNode<?> provideBaseMobileNumberNode() {
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

    @Provides @Named("PersonMobileNumberNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PersonMobileNumberNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PersonMobileNumberNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PersonMobileNumberNode> provideTypeRuleProvider(PersonMobileNumberNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PersonMobileNumberNode>> provideRuleProviders(
        @Named("PersonMobileNumberNodeRuleProvider")  Map<String, Provider<RuleProvider<PersonMobileNumberNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}