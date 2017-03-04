package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyIndustryNodeModule {

    private final CompanyIndustryNode owner;

    public CompanyIndustryNodeModule(CompanyIndustryNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyIndustryNodeScope @Owner CompanyIndustryNode provideCompanyIndustryNode() {
        return owner;
    }

    @Provides @CompanyIndustryNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @CompanyIndustryNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @CompanyIndustryNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyIndustryNodeScope CompanyGeneralNode provideCompanyGeneralNode() {
        return owner.getParent();
    }

}