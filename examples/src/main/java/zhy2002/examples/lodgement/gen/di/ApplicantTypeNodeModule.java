package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ApplicantTypeNodeModule {

    private final ApplicantTypeNode owner;

    public ApplicantTypeNodeModule(ApplicantTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ApplicantTypeNodeScope @Owner ApplicantTypeNode provideApplicantTypeNode() {
        return owner;
    }

    @Provides @ApplicantTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ApplicantTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ApplicantTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}