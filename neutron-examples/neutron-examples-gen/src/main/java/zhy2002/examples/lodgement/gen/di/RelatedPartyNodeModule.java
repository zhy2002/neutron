package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;


@Module
public class RelatedPartyNodeModule {

    private final RelatedPartyNode owner;

    public RelatedPartyNodeModule(RelatedPartyNode owner) {
        this.owner = owner;
    }

    @Provides @RelatedPartyNodeScope @Owner RelatedPartyNode provideRelatedPartyNode() {
        return owner;
    }

    @Provides @RelatedPartyNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @RelatedPartyNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @RelatedPartyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @RelatedPartyNodeScope RelatedPartyListNode provideRelatedPartyListNode() {
        return owner.getParent();
    }

    @Provides @RelatedPartyNodeScope
    RuleProvider<RelatedPartyNode> provideRuleProvider(Provider<RelatedPartyNodeRuleProvider> provider) {
        return provider.get();
    }

}