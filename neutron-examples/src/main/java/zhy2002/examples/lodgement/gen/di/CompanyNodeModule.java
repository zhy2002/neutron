package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyNodeModule {

    private final CompanyNode owner;

    public CompanyNodeModule(CompanyNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyNodeScope @Owner CompanyNode provideCompanyNode() {
        return owner;
    }

    @Provides @CompanyNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @CompanyNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanyNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}