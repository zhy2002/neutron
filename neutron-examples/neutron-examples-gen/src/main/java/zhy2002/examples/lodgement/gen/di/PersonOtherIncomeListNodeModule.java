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
public class PersonOtherIncomeListNodeModule {

    private final PersonOtherIncomeListNode owner;

    public PersonOtherIncomeListNodeModule(PersonOtherIncomeListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner PersonOtherIncomeListNode providePersonOtherIncomeListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseOtherIncomeListNode<?> provideBaseOtherIncomeListNode() {
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

    @Provides @ComponentScope PersonNode providePersonNode() {
        return owner.getParent();
    }

    @Provides @Named("PersonOtherIncomeListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<PersonOtherIncomeListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("PersonOtherIncomeListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<PersonOtherIncomeListNode> provideTypeRuleProvider(PersonOtherIncomeListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<PersonOtherIncomeListNode>> provideRuleProviders(
        @Named("PersonOtherIncomeListNodeRuleProvider")  Map<String, Provider<RuleProvider<PersonOtherIncomeListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}