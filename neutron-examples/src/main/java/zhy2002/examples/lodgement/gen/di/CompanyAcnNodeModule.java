package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyAcnNodeModule {

    private final CompanyAcnNode owner;

    public CompanyAcnNodeModule(CompanyAcnNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyAcnNodeScope @Owner CompanyAcnNode provideCompanyAcnNode() {
        return owner;
    }

    @Provides @CompanyAcnNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyAcnNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyAcnNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}