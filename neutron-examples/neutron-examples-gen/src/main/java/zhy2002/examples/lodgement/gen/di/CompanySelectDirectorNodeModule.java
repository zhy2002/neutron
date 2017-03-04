package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanySelectDirectorNodeModule {

    private final CompanySelectDirectorNode owner;

    public CompanySelectDirectorNodeModule(CompanySelectDirectorNode owner) {
        this.owner = owner;
    }

    @Provides @CompanySelectDirectorNodeScope @Owner CompanySelectDirectorNode provideCompanySelectDirectorNode() {
        return owner;
    }

    @Provides @CompanySelectDirectorNodeScope @Owner SelectRelatedPersonListNode<?> provideSelectRelatedPersonListNode() {
        return owner;
    }

    @Provides @CompanySelectDirectorNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @CompanySelectDirectorNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanySelectDirectorNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanySelectDirectorNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

}