package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyAbnNodeModule {

    private final CompanyAbnNode owner;

    public CompanyAbnNodeModule(CompanyAbnNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyAbnNodeScope @Owner CompanyAbnNode provideCompanyAbnNode() {
        return owner;
    }

    @Provides @CompanyAbnNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyAbnNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyAbnNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyAbnNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

}