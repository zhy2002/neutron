package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyDescriptionNodeModule {

    private final CompanyDescriptionNode owner;

    public CompanyDescriptionNodeModule(CompanyDescriptionNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyDescriptionNodeScope @Owner CompanyDescriptionNode provideCompanyDescriptionNode() {
        return owner;
    }

    @Provides @CompanyDescriptionNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyDescriptionNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyDescriptionNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}