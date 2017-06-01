package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyOtherIncomeListNodeModule.class})
public interface CompanyOtherIncomeListNodeComponent extends BaseOtherIncomeListNodeComponent {

    List<RuleProvider<CompanyOtherIncomeListNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyOtherIncomeListNodeModule(CompanyOtherIncomeListNodeModule module);

        CompanyOtherIncomeListNodeComponent build();
    }

}
