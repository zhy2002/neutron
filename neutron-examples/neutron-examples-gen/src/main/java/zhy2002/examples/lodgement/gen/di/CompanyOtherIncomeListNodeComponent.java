package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyOtherIncomeListNodeScope
@Subcomponent(modules = {CompanyOtherIncomeListNodeModule.class})
public interface CompanyOtherIncomeListNodeComponent {

    CompanyOtherIncomeListNodeRuleProvider getCompanyOtherIncomeListNodeRuleProvider();
    Map<String, RuleProvider<CompanyOtherIncomeListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyOtherIncomeListNodeModule(CompanyOtherIncomeListNodeModule module);

        CompanyOtherIncomeListNodeComponent build();
    }
}
