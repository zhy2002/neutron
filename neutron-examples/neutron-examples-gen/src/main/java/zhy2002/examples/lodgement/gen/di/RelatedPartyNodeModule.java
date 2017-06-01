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
public class RelatedPartyNodeModule {

    private final RelatedPartyNode owner;

    public RelatedPartyNodeModule(RelatedPartyNode owner) {
        this.owner = owner;
    }

    @Provides @ComponentScope @Owner RelatedPartyNode provideRelatedPartyNode() {
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

    @Provides @ComponentScope RelatedPartyListNode provideRelatedPartyListNode() {
        return owner.getParent();
    }

    @Provides @Named("RelatedPartyNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<RelatedPartyNode> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("RelatedPartyNodeRuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<RelatedPartyNode> provideTypeRuleProvider(RelatedPartyNodeRuleProvider provider) {
        return provider;
    }


    @Provides @ComponentScope
    List<RuleProvider<RelatedPartyNode>> provideRuleProviders(
        @Named("RelatedPartyNodeRuleProvider")  Map<String, Provider<RuleProvider<RelatedPartyNode>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName()};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}