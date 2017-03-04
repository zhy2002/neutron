package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyContactFirstNameNodeModule {

    private final CompanyContactFirstNameNode owner;

    public CompanyContactFirstNameNodeModule(CompanyContactFirstNameNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyContactFirstNameNodeScope @Owner CompanyContactFirstNameNode provideCompanyContactFirstNameNode() {
        return owner;
    }

    @Provides @CompanyContactFirstNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyContactFirstNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyContactFirstNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyContactFirstNameNodeScope CompanyContactNode provideCompanyContactNode() {
        return owner.getParent();
    }

}