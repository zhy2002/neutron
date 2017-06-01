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

    @Provides @ComponentScope
    RuleProvider<RelatedPartyNode> provideRuleProvider(Provider<RelatedPartyNodeRuleProvider> provider) {
        return provider.get();
    }

}