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
public class RelatedPartyListNodeModule {

    private final RelatedPartyListNode owner;

    public RelatedPartyListNodeModule(RelatedPartyListNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RelatedPartyListNode provideRelatedPartyListNode() {
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

    @Provides @ComponentScope AdditionalNode provideAdditionalNode() {
        return owner.getParent();
    }

    @Provides @Named("RelatedPartyListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<RelatedPartyListNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("RelatedPartyListNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<RelatedPartyListNode> provideTypeRuleProvider(RelatedPartyListNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<RelatedPartyListNode>> provideRuleProviders(
        @Named("RelatedPartyListNodeRuleProvider")  Map<String, Provider<RuleProvider<RelatedPartyListNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}