package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyRegistrationDateNodeModule {

    private final CompanyRegistrationDateNode owner;

    public CompanyRegistrationDateNodeModule(CompanyRegistrationDateNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyRegistrationDateNodeScope @Owner CompanyRegistrationDateNode provideCompanyRegistrationDateNode() {
        return owner;
    }

    @Provides @CompanyRegistrationDateNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyRegistrationDateNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyRegistrationDateNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyRegistrationDateNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

}