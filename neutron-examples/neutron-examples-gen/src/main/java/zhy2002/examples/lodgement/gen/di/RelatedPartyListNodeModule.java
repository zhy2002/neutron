package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class RelatedPartyListNodeModule {

    private final RelatedPartyListNode owner;

    public RelatedPartyListNodeModule(RelatedPartyListNode owner) {
        this.owner = owner;
    }

    @Provides @RelatedPartyListNodeScope @Owner RelatedPartyListNode provideRelatedPartyListNode() {
        return owner;
    }

    @Provides @RelatedPartyListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @RelatedPartyListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @RelatedPartyListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @RelatedPartyListNodeScope AdditionalNode provideAdditionalNode() {
        return owner.getParent();
    }

    @Provides @RelatedPartyListNodeScope
    RuleProvider<RelatedPartyListNode> provideRuleProvider(Provider<RelatedPartyListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @RelatedPartyListNodeScope
    Map<String, RuleProvider<RelatedPartyListNode>> provideInstanceProviderMap(
        Provider<AdditionalNodeChildProvider.RelatedPartyListNodeRuleProvider> relatedPartyListNodeRuleProvider
    ) {
        Map<String, RuleProvider<RelatedPartyListNode>> result = new HashMap<>();
        result.put("relatedPartyListNode", relatedPartyListNodeRuleProvider.get());
        return result;
    }
}