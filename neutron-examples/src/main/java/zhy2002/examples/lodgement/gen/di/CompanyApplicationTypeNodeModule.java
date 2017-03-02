package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyApplicationTypeNodeModule {

    private final CompanyApplicationTypeNode owner;

    public CompanyApplicationTypeNodeModule(CompanyApplicationTypeNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyApplicationTypeNodeScope @Owner CompanyApplicationTypeNode provideCompanyApplicationTypeNode() {
        return owner;
    }

    @Provides @CompanyApplicationTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyApplicationTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyApplicationTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}