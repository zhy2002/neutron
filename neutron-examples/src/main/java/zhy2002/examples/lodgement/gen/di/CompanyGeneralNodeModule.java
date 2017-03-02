package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyGeneralNodeModule {

    private final CompanyGeneralNode owner;

    public CompanyGeneralNodeModule(CompanyGeneralNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyGeneralNodeScope @Owner CompanyGeneralNode provideCompanyGeneralNode() {
        return owner;
    }

    @Provides @CompanyGeneralNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @CompanyGeneralNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanyGeneralNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}