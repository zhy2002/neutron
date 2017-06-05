package zhy2002.examples.lodgement.bankb.gen;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.util.NeutronConstants;
import zhy2002.neutron.config.*;
import javax.inject.Inject;
import java.util.*;


public class BankBApplicationNodeContextConfigurer implements ContextConfigurer<ApplicationNodeContext> {

    @Inject
    protected BankBApplicationNodeContextConfigurer() {}

    @Override
    public int getOrderKey() {
        return NeutronConstants.PROFILE_CONTEXT_CONFIGURER_ORDER;
    }

    @Override
    public void configure(ApplicationNodeContext context) {
        ContextConfiguration configuration = context.getConfiguration();

        NodeConfiguration configApplicationNode = configuration.getConfig(ApplicationNode.class);
        configApplicationNode.setConfigValue("/@nodeLabel", "Bank B");

        NodeConfiguration configPersonListNode = configuration.getConfig(PersonListNode.class);
        configPersonListNode.setConfigValue("personListNode/@nodeLabel", "Person Applicant");

        configuration.getConfig(OtherTitleNode.class).setConfigValue("otherTitleNode/@loadWithParent", false);
        configuration.getConfig(AgeOfDependantsNode.class).setConfigValue("ageOfDependantsNode/@loadWithParent", false);
        configuration.getConfig(NextOfKinNode.class).setConfigValue("nextOfKinNode/@loadWithParent", false);

        NodeConfiguration configCompanyRegisteredNameNode = configuration.getConfig(CompanyRegisteredNameNode.class);
        configCompanyRegisteredNameNode.setConfigValue("companyRegisteredNameNode/@required", true);

        NodeConfiguration configCompanyDescriptionNode = configuration.getConfig(CompanyDescriptionNode.class);
        configCompanyDescriptionNode.setConfigValue("companyDescriptionNode/@required", true);

        NodeConfiguration configCompanyIndustryNode = configuration.getConfig(CompanyIndustryNode.class);
        configCompanyIndustryNode.setConfigValue("companyIndustryNode/@required", true);

        NodeConfiguration configCompanyAcnNode = configuration.getConfig(CompanyAcnNode.class);
        configCompanyAcnNode.setConfigValue("companyAcnNode/@required", true);

        NodeConfiguration configCompanyRegistrationDateNode = configuration.getConfig(CompanyRegistrationDateNode.class);
        configCompanyRegistrationDateNode.setConfigValue("companyRegistrationDateNode/@required", true);

        NodeConfiguration configMortgageInterestOnlyRemainingPeriodNode = configuration.getConfig(MortgageInterestOnlyRemainingPeriodNode.class);
        configMortgageInterestOnlyRemainingPeriodNode.setConfigValue("mortgageInterestOnlyRemainingPeriodNode/@required", true);

        NodeConfiguration configFeeDescriptionNode = configuration.getConfig(FeeDescriptionNode.class);
        configFeeDescriptionNode.setConfigValue("feeDescriptionNode/@required", true);

        NodeConfiguration configGrossYearlySalaryNode = configuration.getConfig(GrossYearlySalaryNode.class);
        configGrossYearlySalaryNode.setConfigValue("grossYearlySalaryNode/@required", true);

        NodeConfiguration configProfitThisYearNode = configuration.getConfig(ProfitThisYearNode.class);
        configProfitThisYearNode.setConfigValue("profitThisYearNode/@required", true);

        NodeConfiguration configProfitPreviousYearNode = configuration.getConfig(ProfitPreviousYearNode.class);
        configProfitPreviousYearNode.setConfigValue("profitPreviousYearNode/@required", true);
    }
}
