package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

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

}