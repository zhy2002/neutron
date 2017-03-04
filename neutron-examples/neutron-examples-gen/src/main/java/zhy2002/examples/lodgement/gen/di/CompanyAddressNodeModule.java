package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyAddressNodeModule {

    private final CompanyAddressNode owner;

    public CompanyAddressNodeModule(CompanyAddressNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyAddressNodeScope @Owner CompanyAddressNode provideCompanyAddressNode() {
        return owner;
    }

    @Provides @CompanyAddressNodeScope @Owner AddressNode<?> provideAddressNode() {
        return owner;
    }

    @Provides @CompanyAddressNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @CompanyAddressNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanyAddressNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyAddressNodeScope CompanyContactNode provideCompanyContactNode() {
        return owner.getParent();
    }

}