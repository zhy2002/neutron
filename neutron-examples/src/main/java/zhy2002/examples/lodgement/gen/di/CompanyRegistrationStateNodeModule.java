package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyRegistrationStateNodeModule {

    private final CompanyRegistrationStateNode owner;

    public CompanyRegistrationStateNodeModule(CompanyRegistrationStateNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyRegistrationStateNodeScope @Owner CompanyRegistrationStateNode provideCompanyRegistrationStateNode() {
        return owner;
    }

    @Provides @CompanyRegistrationStateNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyRegistrationStateNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyRegistrationStateNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}