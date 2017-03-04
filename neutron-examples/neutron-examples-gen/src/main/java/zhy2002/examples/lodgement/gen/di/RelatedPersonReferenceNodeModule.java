package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class RelatedPersonReferenceNodeModule {

    private final RelatedPersonReferenceNode owner;

    public RelatedPersonReferenceNodeModule(RelatedPersonReferenceNode owner) {
        this.owner = owner;
    }

    @Provides @RelatedPersonReferenceNodeScope @Owner RelatedPersonReferenceNode provideRelatedPersonReferenceNode() {
        return owner;
    }

    @Provides @RelatedPersonReferenceNodeScope @Owner ReferenceUiNode<?> provideReferenceUiNode() {
        return owner;
    }

    @Provides @RelatedPersonReferenceNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @RelatedPersonReferenceNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @RelatedPersonReferenceNodeScope SelectRelatedPersonNode provideSelectRelatedPersonNode() {
        return owner.getParent();
    }

}