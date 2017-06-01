package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyGeneralNodeModule.class})
public interface CompanyGeneralNodeComponent {

    List<RuleProvider<CompanyGeneralNode>> provideRuleProviders();

    CompanyApplicantTypeNode createCompanyApplicantTypeNode();
    CompanyPrimaryApplicantFlagNode createCompanyPrimaryApplicantFlagNode();
    CompanyApplicationTypeNode createCompanyApplicationTypeNode();
    CompanyRegisteredNameNode createCompanyRegisteredNameNode();
    CompanyTypeNode createCompanyTypeNode();
    CompanyDescriptionNode createCompanyDescriptionNode();
    CompanyIndustryNode createCompanyIndustryNode();
    CompanyAbnNode createCompanyAbnNode();
    CompanyAcnNode createCompanyAcnNode();
    CompanyAbrnNode createCompanyAbrnNode();
    CompanyRegistrationDateNode createCompanyRegistrationDateNode();
    CompanyRegistrationStateNode createCompanyRegistrationStateNode();
    CompanySelectDirectorNode createCompanySelectDirectorNode();
    CompanySelectBeneficialOwnerNode createCompanySelectBeneficialOwnerNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyGeneralNodeModule(CompanyGeneralNodeModule module);

        CompanyGeneralNodeComponent build();
    }

}
