package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyApplicantTypeNodeModule {

    private final CompanyApplicantTypeNode owner;

    public CompanyApplicantTypeNodeModule(CompanyApplicantTypeNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyApplicantTypeNodeScope @Owner CompanyApplicantTypeNode provideCompanyApplicantTypeNode() {
        return owner;
    }

    @Provides @CompanyApplicantTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyApplicantTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyApplicantTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}