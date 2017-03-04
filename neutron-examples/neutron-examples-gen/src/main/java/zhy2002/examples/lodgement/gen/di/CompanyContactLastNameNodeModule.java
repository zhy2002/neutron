package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyContactLastNameNodeModule {

    private final CompanyContactLastNameNode owner;

    public CompanyContactLastNameNodeModule(CompanyContactLastNameNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyContactLastNameNodeScope @Owner CompanyContactLastNameNode provideCompanyContactLastNameNode() {
        return owner;
    }

    @Provides @CompanyContactLastNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyContactLastNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyContactLastNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyContactLastNameNodeScope CompanyContactNode provideCompanyContactNode() {
        return owner.getParent();
    }

}