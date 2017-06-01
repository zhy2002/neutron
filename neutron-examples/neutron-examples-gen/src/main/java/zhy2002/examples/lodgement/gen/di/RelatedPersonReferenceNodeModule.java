package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


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

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope SelectRelatedPersonNode provideSelectRelatedPersonNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<RelatedPersonReferenceNode> provideRuleProvider(Provider<RelatedPersonReferenceNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<RelatedPersonReferenceNode>> provideInstanceProviderMap(
        Provider<SelectRelatedPersonNodeChildProvider.RelatedPersonReferenceNodeRuleProvider> relatedPersonReferenceNodeRuleProvider
    ) {
        Map<String, RuleProvider<RelatedPersonReferenceNode>> result = new HashMap<>();
        result.put("relatedPersonReferenceNode", relatedPersonReferenceNodeRuleProvider.get());
        return result;
    }
}