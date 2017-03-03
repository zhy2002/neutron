package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanyOtherIncomeListNodeScope
@Subcomponent(modules = {CompanyOtherIncomeListNodeModule.class})
public interface CompanyOtherIncomeListNodeComponent {

    CompanyOtherIncomeListNodeRuleProvider getCompanyOtherIncomeListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyOtherIncomeListNodeModule(CompanyOtherIncomeListNodeModule module);

        CompanyOtherIncomeListNodeComponent build();
    }
}
