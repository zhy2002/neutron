package zhy2002.examples.lodgement.bankb.gen;

import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.config.*;
import javax.inject.Inject;
import java.util.*;
import java.math.BigDecimal;


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
        configApplicationNode.setConfigValue(".*/@nodeLabel", "Bank B");

        NodeConfiguration configPersonListNode = configuration.getConfig(PersonListNode.class);
        configPersonListNode.setConfigValue(".*/@nodeLabel", "Person Applicant");

        configuration.getConfig(OtherTitleNode.class).setConfigValue("otherTitleNode/@loadWithParent", false);
        configuration.getConfig(AgeOfDependantsNode.class).setConfigValue("ageOfDependantsNode/@loadWithParent", false);
        configuration.getConfig(NextOfKinNode.class).setConfigValue("nextOfKinNode/@loadWithParent", false);

        NodeConfiguration configCompanyRegisteredNameNode = configuration.getConfig(CompanyRegisteredNameNode.class);
        configCompanyRegisteredNameNode.setConfigValue(".*/@required", true);

        NodeConfiguration configCompanyDescriptionNode = configuration.getConfig(CompanyDescriptionNode.class);
        configCompanyDescriptionNode.setConfigValue(".*/@required", true);

        NodeConfiguration configCompanyIndustryNode = configuration.getConfig(CompanyIndustryNode.class);
        configCompanyIndustryNode.setConfigValue(".*/@required", true);

        NodeConfiguration configCompanyAcnNode = configuration.getConfig(CompanyAcnNode.class);
        configCompanyAcnNode.setConfigValue(".*/@required", true);

        NodeConfiguration configCompanyRegistrationDateNode = configuration.getConfig(CompanyRegistrationDateNode.class);
        configCompanyRegistrationDateNode.setConfigValue(".*/@required", true);

        NodeConfiguration configMortgageInterestOnlyRemainingPeriodNode = configuration.getConfig(MortgageInterestOnlyRemainingPeriodNode.class);
        configMortgageInterestOnlyRemainingPeriodNode.setConfigValue(".*/@required", true);

        NodeConfiguration configProductInterestOnlyTermNode = configuration.getConfig(ProductInterestOnlyTermNode.class);
        configProductInterestOnlyTermNode.setConfigValue(".*/@required", true);
        configProductInterestOnlyTermNode.setConfigValue(".*/@minValue", new BigDecimal("1"));

        NodeConfiguration configProductFixedTermNode = configuration.getConfig(ProductFixedTermNode.class);
        configProductFixedTermNode.setConfigValue(".*/@required", true);
        configProductFixedTermNode.setConfigValue(".*/@minValue", new BigDecimal("1"));
        configProductFixedTermNode.setConfigValue(".*/@maxValue", new BigDecimal("5"));

        NodeConfiguration configProductPackageNameNode = configuration.getConfig(ProductPackageNameNode.class);
        configProductPackageNameNode.setConfigValue(".*/@options", ApplicationNodeConstants.NAB_PACKAGE_TYPES);

        NodeConfiguration configProductRepaymentFrequencyNode = configuration.getConfig(ProductRepaymentFrequencyNode.class);
        configProductRepaymentFrequencyNode.setConfigValue(".*/@options", ApplicationNodeConstants.REPAYMENT_FREQUENCY);

        NodeConfiguration configTransactionAccountOptOutReasonNode = configuration.getConfig(TransactionAccountOptOutReasonNode.class);
        configTransactionAccountOptOutReasonNode.setConfigValue(".*/@options", ApplicationNodeConstants.OPT_OUT_REASON);

        NodeConfiguration configCreditCardOptOutReasonNode = configuration.getConfig(CreditCardOptOutReasonNode.class);
        configCreditCardOptOutReasonNode.setConfigValue(".*/@options", ApplicationNodeConstants.OPT_OUT_REASON);

        NodeConfiguration configFeeDescriptionNode = configuration.getConfig(FeeDescriptionNode.class);
        configFeeDescriptionNode.setConfigValue(".*/@required", true);

        NodeConfiguration configBaseMobileNumberNode = configuration.getConfig(BaseMobileNumberNode.class);
        configBaseMobileNumberNode.setConfigValue(".*/@pattern", "^(\\+\\d{1,3}[- ]?)?\\d{10}$");
        configBaseMobileNumberNode.setConfigValue(".*/@patternMessage", "Invalid mobile number.");

        NodeConfiguration configBaseCurrencyNode = configuration.getConfig(BaseCurrencyNode.class);
        configBaseCurrencyNode.setConfigValue(".*/@minValue", new BigDecimal("0.01"));

        NodeConfiguration configBasePercentageNode = configuration.getConfig(BasePercentageNode.class);
        configBasePercentageNode.setConfigValue(".*/@minValue", new BigDecimal("0"));
        configBasePercentageNode.setConfigValue(".*/@maxValue", new BigDecimal("100"));

        NodeConfiguration configGrossYearlySalaryNode = configuration.getConfig(GrossYearlySalaryNode.class);
        configGrossYearlySalaryNode.setConfigValue(".*/@required", true);

        NodeConfiguration configProfitThisYearNode = configuration.getConfig(ProfitThisYearNode.class);
        configProfitThisYearNode.setConfigValue(".*/@required", true);

        NodeConfiguration configProfitPreviousYearNode = configuration.getConfig(ProfitPreviousYearNode.class);
        configProfitPreviousYearNode.setConfigValue(".*/@required", true);

        NodeConfiguration configEmploymentStatusNode = configuration.getConfig(EmploymentStatusNode.class);
        configEmploymentStatusNode.setConfigValue(".*/@options", ApplicationNodeConstants.EMPLOYMENT_STATUS);
        configEmploymentStatusNode.setConfigValue(".*/@required", true);

        NodeConfiguration configOccupationNode = configuration.getConfig(OccupationNode.class);
        configOccupationNode.setConfigValue(".*/@required", true);

        NodeConfiguration configEmployerNameNode = configuration.getConfig(EmployerNameNode.class);
        configEmployerNameNode.setConfigValue(".*/@required", true);

        NodeConfiguration configEmployerAddressNode = configuration.getConfig(EmployerAddressNode.class);
        configEmployerAddressNode.setConfigValue(".*/@required", true);

        NodeConfiguration configEmployerPhoneNode = configuration.getConfig(EmployerPhoneNode.class);
        configEmployerPhoneNode.setConfigValue(".*/@required", true);

        NodeConfiguration configEmploymentStartedNode = configuration.getConfig(EmploymentStartedNode.class);
        configEmploymentStartedNode.setConfigValue(".*/@required", true);

        NodeConfiguration configUnemployedOnBenefitFlagNode = configuration.getConfig(UnemployedOnBenefitFlagNode.class);
        configUnemployedOnBenefitFlagNode.setConfigValue(".*/@required", true);

        NodeConfiguration configStudentFlagNode = configuration.getConfig(StudentFlagNode.class);
        configStudentFlagNode.setConfigValue(".*/@required", true);

        NodeConfiguration configStudentTypeNode = configuration.getConfig(StudentTypeNode.class);
        configStudentTypeNode.setConfigValue(".*/@options", ApplicationNodeConstants.STUDENT_TYPE);

        NodeConfiguration configHouseDutiesFlagNode = configuration.getConfig(HouseDutiesFlagNode.class);
        configHouseDutiesFlagNode.setConfigValue(".*/@required", true);

        NodeConfiguration configUnemployedSinceNode = configuration.getConfig(UnemployedSinceNode.class);
        configUnemployedSinceNode.setConfigValue(".*/@required", true);

        NodeConfiguration configRetiredOnBenefitFlagNode = configuration.getConfig(RetiredOnBenefitFlagNode.class);
        configRetiredOnBenefitFlagNode.setConfigValue(".*/@required", true);

        NodeConfiguration configRetiredSinceNode = configuration.getConfig(RetiredSinceNode.class);
        configRetiredSinceNode.setConfigValue(".*/@required", true);

        NodeConfiguration configYesNoOptionNode = configuration.getConfig(YesNoOptionNode.class);
        configYesNoOptionNode.setConfigValue(".*/@options", ApplicationNodeConstants.YES_NO_TYPE);

        NodeConfiguration configBaseCountryNode = configuration.getConfig(BaseCountryNode.class);
        configBaseCountryNode.setConfigValue(".*/@options", ApplicationNodeConstants.COUNTRY_TYPE);

        NodeConfiguration configOwnershipPercentageNode = configuration.getConfig(OwnershipPercentageNode.class);
        configOwnershipPercentageNode.setConfigValue(".*/@value", new BigDecimal("0"));

        NodeConfiguration configResponsibleSignificantChangeFlagNode = configuration.getConfig(ResponsibleSignificantChangeFlagNode.class);
        configResponsibleSignificantChangeFlagNode.setConfigValue(".*/@required", true);

        NodeConfiguration configResponsibleTypeOfChangeNode = configuration.getConfig(ResponsibleTypeOfChangeNode.class);
        configResponsibleTypeOfChangeNode.setConfigValue(".*/@options", ApplicationNodeConstants.RESPONSIBLE_CHANGE_TYPE);

        NodeConfiguration configResponsibleMitigationMethodNode = configuration.getConfig(ResponsibleMitigationMethodNode.class);
        configResponsibleMitigationMethodNode.setConfigValue(".*/@options", ApplicationNodeConstants.RESPONSIBLE_MITIGATION_TYPE);

        NodeConfiguration configResponsibleRepaymentDifficultyNode = configuration.getConfig(ResponsibleRepaymentDifficultyNode.class);
        configResponsibleRepaymentDifficultyNode.setConfigValue(".*/@required", true);

        NodeConfiguration configBaseOtherIncomeListNode = configuration.getConfig(BaseOtherIncomeListNode.class);
        configBaseOtherIncomeListNode.setConfigValue(".*/@nodeLabel", "Other Incomes");

        NodeConfiguration configOtherIncomeTypeNode = configuration.getConfig(OtherIncomeTypeNode.class);
        configOtherIncomeTypeNode.setConfigValue(".*/@required", true);

        NodeConfiguration configOtherIncomeAddBackTypeNode = configuration.getConfig(OtherIncomeAddBackTypeNode.class);
        configOtherIncomeAddBackTypeNode.setConfigValue(".*/@options", ApplicationNodeConstants.OTHER_INCOME_ADD_BACK_TYPE);

        NodeConfiguration configOtherIncomeAmountNode = configuration.getConfig(OtherIncomeAmountNode.class);
        configOtherIncomeAmountNode.setConfigValue(".*/@required", true);
        configOtherIncomeAmountNode.setConfigValue(".*/@minValue", new BigDecimal("0.01"));

        NodeConfiguration configLegalActionNode = configuration.getConfig(LegalActionNode.class);
        configLegalActionNode.setConfigValue(".*/@value", "No");

        NodeConfiguration configTrustCountryNode = configuration.getConfig(TrustCountryNode.class);
        configTrustCountryNode.setConfigValue(".*/@required", true);

        NodeConfiguration configBaseApplicantTypeNode = configuration.getConfig(BaseApplicantTypeNode.class);
        configBaseApplicantTypeNode.setConfigValue(".*/@options", ApplicationNodeConstants.APPLICANT_TYPE);
        configBaseApplicantTypeNode.setConfigValue(".*/@required", true);
        configBaseApplicantTypeNode.setConfigValue(".*/@value", "A");
    }
}
