package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyPrimaryApplicantFlagNodeModule {

    private final CompanyPrimaryApplicantFlagNode owner;

    public CompanyPrimaryApplicantFlagNodeModule(CompanyPrimaryApplicantFlagNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyPrimaryApplicantFlagNodeScope @Owner CompanyPrimaryApplicantFlagNode provideCompanyPrimaryApplicantFlagNode() {
        return owner;
    }

    @Provides @CompanyPrimaryApplicantFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @CompanyPrimaryApplicantFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyPrimaryApplicantFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyPrimaryApplicantFlagNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

}