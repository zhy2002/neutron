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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope AdditionalNode provideAdditionalNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<RelatedPartyListNode> provideRuleProvider(Provider<RelatedPartyListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<RelatedPartyListNode>> provideInstanceProviderMap(
        Provider<AdditionalNodeChildProvider.RelatedPartyListNodeRuleProvider> relatedPartyListNodeRuleProvider
    ) {
        Map<String, RuleProvider<RelatedPartyListNode>> result = new HashMap<>();
        result.put("relatedPartyListNode", relatedPartyListNodeRuleProvider.get());
        return result;
    }
}