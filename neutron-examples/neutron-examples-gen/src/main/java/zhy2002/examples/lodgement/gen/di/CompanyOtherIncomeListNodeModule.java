package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
import java.util.*;


@Module
public class CompanyOtherIncomeListNodeModule {

    private final CompanyOtherIncomeListNode owner;

    public CompanyOtherIncomeListNodeModule(CompanyOtherIncomeListNode owner) {
        this.owner = owner;
    }

    @Provides @CompanyOtherIncomeListNodeScope @Owner CompanyOtherIncomeListNode provideCompanyOtherIncomeListNode() {
        return owner;
    }

    @Provides @CompanyOtherIncomeListNodeScope @Owner BaseOtherIncomeListNode<?> provideBaseOtherIncomeListNode() {
        return owner;
    }

    @Provides @CompanyOtherIncomeListNodeScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @CompanyOtherIncomeListNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @CompanyOtherIncomeListNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @CompanyOtherIncomeListNodeScope CompanyNode provideCompanyNode() {
        return owner.getParent();
    }

    @Provides @CompanyOtherIncomeListNodeScope
    Map<String, RuleProvider<CompanyOtherIncomeListNode>> provideInstanceProviders(
        Provider<CompanyNodeChildProvider.CompanyOtherIncomeListNodeRuleProvider> companyOtherIncomeListNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyOtherIncomeListNode>> result = new HashMap<>();
        result.put("companyOtherIncomeListNode", companyOtherIncomeListNodeRuleProvider.get());
        return result;
    }
}