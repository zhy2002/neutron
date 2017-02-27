package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyTrustNodeModule {

    private final CompanyTrustNode owner;

    public CompanyTrustNodeModule(CompanyTrustNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyTrustNodeScope @Owner CompanyTrustNode provideCompanyTrustNode() {
        return owner;
    }

    @Provides @CompanyTrustNodeScope @Owner BaseTrustNode<?> provideBaseTrustNode() {
        return owner;
    }

    @Provides @CompanyTrustNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @CompanyTrustNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanyTrustNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}