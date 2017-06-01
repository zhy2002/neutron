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

    @Provides @ComponentScope @Owner CompanyOtherIncomeListNode provideCompanyOtherIncomeListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner BaseOtherIncomeListNode<?> provideBaseOtherIncomeListNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ListUiNode<?,?> provideListUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @ComponentScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

    @Provides @ComponentScope CompanyNode provideCompanyNode() {
        return owner.getParent();
    }

    @Provides @ComponentScope
    RuleProvider<CompanyOtherIncomeListNode> provideRuleProvider(Provider<CompanyOtherIncomeListNodeRuleProvider> provider) {
        return provider.get();
    }

    @Provides @ComponentScope
    Map<String, RuleProvider<CompanyOtherIncomeListNode>> provideInstanceProviderMap(
        Provider<CompanyNodeChildProvider.CompanyOtherIncomeListNodeRuleProvider> companyOtherIncomeListNodeRuleProvider
    ) {
        Map<String, RuleProvider<CompanyOtherIncomeListNode>> result = new HashMap<>();
        result.put("companyOtherIncomeListNode", companyOtherIncomeListNodeRuleProvider.get());
        return result;
    }
}