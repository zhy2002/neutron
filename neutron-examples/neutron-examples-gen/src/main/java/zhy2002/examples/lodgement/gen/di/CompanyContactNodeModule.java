package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyContactNodeModule {

    private final CompanyContactNode owner;

    public CompanyContactNodeModule(CompanyContactNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyContactNodeScope @Owner CompanyContactNode provideCompanyContactNode() {
        return owner;
    }

    @Provides @CompanyContactNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @CompanyContactNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanyContactNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyContactNodeScope CompanyNode provideCompanyNode() {
        return owner.getParent();
    }

}