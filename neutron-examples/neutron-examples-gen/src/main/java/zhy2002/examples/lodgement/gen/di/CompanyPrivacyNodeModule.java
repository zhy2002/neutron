package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyPrivacyNodeModule {

    private final CompanyPrivacyNode owner;

    public CompanyPrivacyNodeModule(CompanyPrivacyNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyPrivacyNodeScope @Owner CompanyPrivacyNode provideCompanyPrivacyNode() {
        return owner;
    }

    @Provides @CompanyPrivacyNodeScope @Owner BasePrivacyNode<?> provideBasePrivacyNode() {
        return owner;
    }

    @Provides @CompanyPrivacyNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @CompanyPrivacyNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanyPrivacyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}