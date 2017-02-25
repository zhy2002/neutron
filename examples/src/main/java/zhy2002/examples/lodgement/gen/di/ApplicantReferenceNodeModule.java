package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ApplicantReferenceNodeModule {

    private final ApplicantReferenceNode owner;

    public ApplicantReferenceNodeModule(ApplicantReferenceNode owner) {
        this.owner = owner;
    }

    @Provides @ApplicantReferenceNodeScope @Owner ApplicantReferenceNode provideApplicantReferenceNode() {
        return owner;
    }

    @Provides @ApplicantReferenceNodeScope @Owner ReferenceUiNode<?> provideReferenceUiNode() {
        return owner;
    }

    @Provides @ApplicantReferenceNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ApplicantReferenceNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}