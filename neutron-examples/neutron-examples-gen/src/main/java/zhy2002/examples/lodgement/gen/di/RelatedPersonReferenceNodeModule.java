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
public class RelatedPersonReferenceNodeModule {

    private final RelatedPersonReferenceNode owner;

    public RelatedPersonReferenceNodeModule(RelatedPersonReferenceNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RelatedPersonReferenceNode provideRelatedPersonReferenceNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ReferenceUiNode<?> provideReferenceUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ComponentScope SelectRelatedPersonNode provideSelectRelatedPersonNode() {
        return owner.getParent();
    }

    @Provides @Named("RelatedPersonReferenceNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<RelatedPersonReferenceNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("RelatedPersonReferenceNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<RelatedPersonReferenceNode> provideTypeRuleProvider(RelatedPersonReferenceNodeRuleProvider provider) {
        return provider;
    }

        @Provides @Named("RelatedPersonReferenceNodeRuleProvider") @IntoMap @StringKey("relatedPersonReferenceNode")
        RuleProvider<RelatedPersonReferenceNode> provideRelatedPersonReferenceNodeChildRuleProvider(
            SelectRelatedPersonNodeChildProvider.RelatedPersonReferenceNodeRuleProvider provider
        ) {
            return provider;
        }


    @Provides @ComponentScope
    List<RuleProvider<RelatedPersonReferenceNode>> provideRuleProviders(
        @Named("RelatedPersonReferenceNodeRuleProvider")  Map<String, Provider<RuleProvider<RelatedPersonReferenceNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}