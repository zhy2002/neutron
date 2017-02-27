package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class CompanyOtherIncomeListNodeModule {

    private final CompanyOtherIncomeListNode owner;

    public CompanyOtherIncomeListNodeModule(CompanyOtherIncomeListNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyOtherIncomeListNodeScope @Owner CompanyOtherIncomeListNode provideCompanyOtherIncomeListNode() {
        return owner;
    }

    @Provides @CompanyOtherIncomeListNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @CompanyOtherIncomeListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanyOtherIncomeListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}