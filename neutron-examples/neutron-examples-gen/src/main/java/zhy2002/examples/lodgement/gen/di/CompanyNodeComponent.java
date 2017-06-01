package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyNodeModule.class})
public interface CompanyNodeComponent {

    List<RuleProvider<CompanyNode>> provideRuleProviders();

    CompanyGeneralNode createCompanyGeneralNode();
    CompanyContactNode createCompanyContactNode();
    CompanyTrustNode createCompanyTrustNode();
    CompanyPrivacyNode createCompanyPrivacyNode();
    CompanyOtherIncomeListNode createCompanyOtherIncomeListNode();
    CompanyResponsibleLendNode createCompanyResponsibleLendNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyNodeModule(CompanyNodeModule module);

        CompanyNodeComponent build();
    }

}
