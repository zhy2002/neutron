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
public class PersonResponsibleLendNodeModule {

    private final PersonResponsibleLendNode owner;

    public PersonResponsibleLendNodeModule(PersonResponsibleLendNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonResponsibleLendNode providePersonResponsibleLendNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseResponsibleLendNode<?> provideBaseResponsibleLendNode() {
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

    @Provides @Named("PersonResponsibleLendNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PersonResponsibleLendNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PersonResponsibleLendNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PersonResponsibleLendNode> provideTypeRuleProvider(PersonResponsibleLendNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PersonResponsibleLendNode>> provideRuleProviders(
        @Named("PersonResponsibleLendNodeRuleProvider")  Map<String, Provider<RuleProvider<PersonResponsibleLendNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}