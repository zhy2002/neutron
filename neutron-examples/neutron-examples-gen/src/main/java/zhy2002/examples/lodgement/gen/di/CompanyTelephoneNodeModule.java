package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyTelephoneNodeModule {

    private final CompanyTelephoneNode owner;

    public CompanyTelephoneNodeModule(CompanyTelephoneNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyTelephoneNodeScope @Owner CompanyTelephoneNode provideCompanyTelephoneNode() {
        return owner;
    }

    @Provides @CompanyTelephoneNodeScope @Owner TelephoneNode<?> provideTelephoneNode() {
        return owner;
    }

    @Provides @CompanyTelephoneNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyTelephoneNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyTelephoneNodeScope CompanyContactNode provideCompanyContactNode() {
        return owner.getParent();
    }

}