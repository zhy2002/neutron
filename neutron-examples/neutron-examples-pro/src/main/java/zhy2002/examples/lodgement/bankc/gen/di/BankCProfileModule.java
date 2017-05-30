package zhy2002.examples.lodgement.bankc.gen.di;
/* template name: profile_module.ftl */
import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.bankc.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.rule.*;

@Module(includes = {ManifestModule.class})
public abstract class BankCProfileModule {

    @Binds
    abstract ApplicationNodeRuleProvider provideApplicationNodeRuleProvider(BankCApplicationNodeRuleProvider impl);

    @Binds
    abstract PersonListNodeRuleProvider providePersonListNodeRuleProvider(BankCPersonListNodeRuleProvider impl);

    @Binds
    abstract TitleNodeRuleProvider provideTitleNodeRuleProvider(BankCTitleNodeRuleProvider impl);

    @Binds
    abstract FirstNameNodeRuleProvider provideFirstNameNodeRuleProvider(BankCFirstNameNodeRuleProvider impl);

    @Binds
    abstract LastNameNodeRuleProvider provideLastNameNodeRuleProvider(BankCLastNameNodeRuleProvider impl);

    @Binds
    abstract GenderNodeRuleProvider provideGenderNodeRuleProvider(BankCGenderNodeRuleProvider impl);

    @Binds
    abstract DateOfBirthNodeRuleProvider provideDateOfBirthNodeRuleProvider(BankCDateOfBirthNodeRuleProvider impl);

    @Binds
    abstract PrimaryApplicantFlagNodeRuleProvider providePrimaryApplicantFlagNodeRuleProvider(BankCPrimaryApplicantFlagNodeRuleProvider impl);

    @Binds
    abstract DriversLicenseNodeRuleProvider provideDriversLicenseNodeRuleProvider(BankCDriversLicenseNodeRuleProvider impl);

    @Binds
    abstract ApplicationTypeNodeRuleProvider provideApplicationTypeNodeRuleProvider(BankCApplicationTypeNodeRuleProvider impl);

    @Binds
    abstract MaritalStatusNodeRuleProvider provideMaritalStatusNodeRuleProvider(BankCMaritalStatusNodeRuleProvider impl);

    @Binds
    abstract FirstHomeBuyerFlagNodeRuleProvider provideFirstHomeBuyerFlagNodeRuleProvider(BankCFirstHomeBuyerFlagNodeRuleProvider impl);

    @Binds
    abstract HousingStatusNodeRuleProvider provideHousingStatusNodeRuleProvider(BankCHousingStatusNodeRuleProvider impl);

    @Binds
    abstract PersonContactNodeRuleProvider providePersonContactNodeRuleProvider(BankCPersonContactNodeRuleProvider impl);

    @Binds
    abstract PersonContactNodeChildProvider.CurrentAddressNodeRuleProvider provideBankCcurrentAddressNodeRuleProvider(
        BankCPersonContactNodeChildProvider.CurrentAddressNodeRuleProvider impl
    );

    @Binds
    abstract PersonTelephoneNodeRuleProvider providePersonTelephoneNodeRuleProvider(BankCPersonTelephoneNodeRuleProvider impl);

    @Binds
    abstract PersonEmailNodeRuleProvider providePersonEmailNodeRuleProvider(BankCPersonEmailNodeRuleProvider impl);

    @Binds
    abstract MovedToCurrentAddressNodeRuleProvider provideMovedToCurrentAddressNodeRuleProvider(BankCMovedToCurrentAddressNodeRuleProvider impl);

    @Binds
    abstract MovedFromPreviousAddressNodeRuleProvider provideMovedFromPreviousAddressNodeRuleProvider(BankCMovedFromPreviousAddressNodeRuleProvider impl);

    @Binds
    abstract CurrentEmploymentListNodeRuleProvider provideCurrentEmploymentListNodeRuleProvider(BankCCurrentEmploymentListNodeRuleProvider impl);

    @Binds
    abstract CurrentEmploymentNodeRuleProvider provideCurrentEmploymentNodeRuleProvider(BankCCurrentEmploymentNodeRuleProvider impl);

    @Binds
    abstract PreviousEmploymentListNodeRuleProvider providePreviousEmploymentListNodeRuleProvider(BankCPreviousEmploymentListNodeRuleProvider impl);

    @Binds
    abstract PreviousEmploymentNodeRuleProvider providePreviousEmploymentNodeRuleProvider(BankCPreviousEmploymentNodeRuleProvider impl);

    @Binds
    abstract CompanyApplicationTypeNodeRuleProvider provideCompanyApplicationTypeNodeRuleProvider(BankCCompanyApplicationTypeNodeRuleProvider impl);

    @Binds
    abstract CompanyRegisteredNameNodeRuleProvider provideCompanyRegisteredNameNodeRuleProvider(BankCCompanyRegisteredNameNodeRuleProvider impl);

    @Binds
    abstract CompanyDescriptionNodeRuleProvider provideCompanyDescriptionNodeRuleProvider(BankCCompanyDescriptionNodeRuleProvider impl);

    @Binds
    abstract CompanyIndustryNodeRuleProvider provideCompanyIndustryNodeRuleProvider(BankCCompanyIndustryNodeRuleProvider impl);

    @Binds
    abstract CompanyAcnNodeRuleProvider provideCompanyAcnNodeRuleProvider(BankCCompanyAcnNodeRuleProvider impl);

    @Binds
    abstract CompanyRegistrationDateNodeRuleProvider provideCompanyRegistrationDateNodeRuleProvider(BankCCompanyRegistrationDateNodeRuleProvider impl);

    @Binds
    abstract CompanyRegistrationStateNodeRuleProvider provideCompanyRegistrationStateNodeRuleProvider(BankCCompanyRegistrationStateNodeRuleProvider impl);

    @Binds
    abstract FinancialPositionNodeRuleProvider provideFinancialPositionNodeRuleProvider(BankCFinancialPositionNodeRuleProvider impl);

    @Binds
    abstract SavingsTypeNodeRuleProvider provideSavingsTypeNodeRuleProvider(BankCSavingsTypeNodeRuleProvider impl);

    @Binds
    abstract SavingsBalanceNodeRuleProvider provideSavingsBalanceNodeRuleProvider(BankCSavingsBalanceNodeRuleProvider impl);

    @Binds
    abstract SavingsAccountNameNodeRuleProvider provideSavingsAccountNameNodeRuleProvider(BankCSavingsAccountNameNodeRuleProvider impl);

    @Binds
    abstract VehicleModelNodeRuleProvider provideVehicleModelNodeRuleProvider(BankCVehicleModelNodeRuleProvider impl);

    @Binds
    abstract VehicleYearNodeRuleProvider provideVehicleYearNodeRuleProvider(BankCVehicleYearNodeRuleProvider impl);

    @Binds
    abstract VehicleMarketValueNodeRuleProvider provideVehicleMarketValueNodeRuleProvider(BankCVehicleMarketValueNodeRuleProvider impl);

    @Binds
    abstract OtherAssetTypeNodeRuleProvider provideOtherAssetTypeNodeRuleProvider(BankCOtherAssetTypeNodeRuleProvider impl);

    @Binds
    abstract OtherAssetMarketValueNodeRuleProvider provideOtherAssetMarketValueNodeRuleProvider(BankCOtherAssetMarketValueNodeRuleProvider impl);

    @Binds
    abstract CreditCardTypeNodeRuleProvider provideCreditCardTypeNodeRuleProvider(BankCCreditCardTypeNodeRuleProvider impl);

    @Binds
    abstract CreditCardAmountOwingNodeRuleProvider provideCreditCardAmountOwingNodeRuleProvider(BankCCreditCardAmountOwingNodeRuleProvider impl);

    @Binds
    abstract CreditCardLimitAmountNodeRuleProvider provideCreditCardLimitAmountNodeRuleProvider(BankCCreditCardLimitAmountNodeRuleProvider impl);

    @Binds
    abstract CreditCardMonthlyRepaymentNodeRuleProvider provideCreditCardMonthlyRepaymentNodeRuleProvider(BankCCreditCardMonthlyRepaymentNodeRuleProvider impl);

    @Binds
    abstract CreditCardClearingFlagNodeRuleProvider provideCreditCardClearingFlagNodeRuleProvider(BankCCreditCardClearingFlagNodeRuleProvider impl);

    @Binds
    abstract CreditCardBreakCostNodeRuleProvider provideCreditCardBreakCostNodeRuleProvider(BankCCreditCardBreakCostNodeRuleProvider impl);

    @Binds
    abstract CreditCardOwnershipListNodeRuleProvider provideCreditCardOwnershipListNodeRuleProvider(BankCCreditCardOwnershipListNodeRuleProvider impl);

    @Binds
    abstract LoanTypeNodeRuleProvider provideLoanTypeNodeRuleProvider(BankCLoanTypeNodeRuleProvider impl);

    @Binds
    abstract LoanOwingAmountNodeRuleProvider provideLoanOwingAmountNodeRuleProvider(BankCLoanOwingAmountNodeRuleProvider impl);

    @Binds
    abstract LoanLimitAmountNodeRuleProvider provideLoanLimitAmountNodeRuleProvider(BankCLoanLimitAmountNodeRuleProvider impl);

    @Binds
    abstract LoanMonthlyRepaymentNodeRuleProvider provideLoanMonthlyRepaymentNodeRuleProvider(BankCLoanMonthlyRepaymentNodeRuleProvider impl);

    @Binds
    abstract LoanClearingFlagNodeRuleProvider provideLoanClearingFlagNodeRuleProvider(BankCLoanClearingFlagNodeRuleProvider impl);

    @Binds
    abstract LoanBreakCostNodeRuleProvider provideLoanBreakCostNodeRuleProvider(BankCLoanBreakCostNodeRuleProvider impl);

    @Binds
    abstract OtherLiabilityTypeNodeRuleProvider provideOtherLiabilityTypeNodeRuleProvider(BankCOtherLiabilityTypeNodeRuleProvider impl);

    @Binds
    abstract OtherLiabilityLimitAmountNodeRuleProvider provideOtherLiabilityLimitAmountNodeRuleProvider(BankCOtherLiabilityLimitAmountNodeRuleProvider impl);

    @Binds
    abstract OtherLiabilityAmountOwningNodeRuleProvider provideOtherLiabilityAmountOwningNodeRuleProvider(BankCOtherLiabilityAmountOwningNodeRuleProvider impl);

    @Binds
    abstract OtherLiabilityMonthlyRepaymentNodeRuleProvider provideOtherLiabilityMonthlyRepaymentNodeRuleProvider(BankCOtherLiabilityMonthlyRepaymentNodeRuleProvider impl);

    @Binds
    abstract OtherLiabilityClearingFlagNodeRuleProvider provideOtherLiabilityClearingFlagNodeRuleProvider(BankCOtherLiabilityClearingFlagNodeRuleProvider impl);

    @Binds
    abstract OtherLiabilityBreakCostNodeRuleProvider provideOtherLiabilityBreakCostNodeRuleProvider(BankCOtherLiabilityBreakCostNodeRuleProvider impl);

    @Binds
    abstract ExpenseTypeNodeRuleProvider provideExpenseTypeNodeRuleProvider(BankCExpenseTypeNodeRuleProvider impl);

    @Binds
    abstract ExpenseMonthlyRepaymentNodeRuleProvider provideExpenseMonthlyRepaymentNodeRuleProvider(BankCExpenseMonthlyRepaymentNodeRuleProvider impl);

    @Binds
    abstract TotalAssetNodeRuleProvider provideTotalAssetNodeRuleProvider(BankCTotalAssetNodeRuleProvider impl);

    @Binds
    abstract TotalLiabilityNodeRuleProvider provideTotalLiabilityNodeRuleProvider(BankCTotalLiabilityNodeRuleProvider impl);

    @Binds
    abstract TotalExpenseNodeRuleProvider provideTotalExpenseNodeRuleProvider(BankCTotalExpenseNodeRuleProvider impl);

    @Binds
    abstract RealEstateListNodeRuleProvider provideRealEstateListNodeRuleProvider(BankCRealEstateListNodeRuleProvider impl);

    @Binds
    abstract RealEstateNodeRuleProvider provideRealEstateNodeRuleProvider(BankCRealEstateNodeRuleProvider impl);

    @Binds
    abstract UsedAsSecurityFlagNodeRuleProvider provideUsedAsSecurityFlagNodeRuleProvider(BankCUsedAsSecurityFlagNodeRuleProvider impl);

    @Binds
    abstract BeingPurchasedFlagNodeRuleProvider provideBeingPurchasedFlagNodeRuleProvider(BankCBeingPurchasedFlagNodeRuleProvider impl);

    @Binds
    abstract OwnedOutrightFlagNodeRuleProvider provideOwnedOutrightFlagNodeRuleProvider(BankCOwnedOutrightFlagNodeRuleProvider impl);

    @Binds
    abstract PrimarySecurityFlagNodeRuleProvider providePrimarySecurityFlagNodeRuleProvider(BankCPrimarySecurityFlagNodeRuleProvider impl);

    @Binds
    abstract ApprovalInPrincipleFlagNodeRuleProvider provideApprovalInPrincipleFlagNodeRuleProvider(BankCApprovalInPrincipleFlagNodeRuleProvider impl);

    @Binds
    abstract MortgqageUnpaidBalanceNodeRuleProvider provideMortgqageUnpaidBalanceNodeRuleProvider(BankCMortgqageUnpaidBalanceNodeRuleProvider impl);

    @Binds
    abstract MortgageLimitAmountNodeRuleProvider provideMortgageLimitAmountNodeRuleProvider(BankCMortgageLimitAmountNodeRuleProvider impl);

    @Binds
    abstract MortgageMonthlyRepaymentNodeRuleProvider provideMortgageMonthlyRepaymentNodeRuleProvider(BankCMortgageMonthlyRepaymentNodeRuleProvider impl);

    @Binds
    abstract MortgageBorrowerRateNodeRuleProvider provideMortgageBorrowerRateNodeRuleProvider(BankCMortgageBorrowerRateNodeRuleProvider impl);

    @Binds
    abstract MortgageLoanTypeNodeRuleProvider provideMortgageLoanTypeNodeRuleProvider(BankCMortgageLoanTypeNodeRuleProvider impl);

    @Binds
    abstract MortgageLoanTermExpiryDateNodeRuleProvider provideMortgageLoanTermExpiryDateNodeRuleProvider(BankCMortgageLoanTermExpiryDateNodeRuleProvider impl);

    @Binds
    abstract MortgageInterestOnlyExpiryDateNodeRuleProvider provideMortgageInterestOnlyExpiryDateNodeRuleProvider(BankCMortgageInterestOnlyExpiryDateNodeRuleProvider impl);

    @Binds
    abstract MortgageClearingFlagNodeRuleProvider provideMortgageClearingFlagNodeRuleProvider(BankCMortgageClearingFlagNodeRuleProvider impl);

    @Binds
    abstract MortgageChargePositionNodeRuleProvider provideMortgageChargePositionNodeRuleProvider(BankCMortgageChargePositionNodeRuleProvider impl);

    @Binds
    abstract MortgageTermRemainingPeriodNodeRuleProvider provideMortgageTermRemainingPeriodNodeRuleProvider(BankCMortgageTermRemainingPeriodNodeRuleProvider impl);

    @Binds
    abstract MortgageInterestOnlyRemainingPeriodNodeRuleProvider provideMortgageInterestOnlyRemainingPeriodNodeRuleProvider(BankCMortgageInterestOnlyRemainingPeriodNodeRuleProvider impl);

    @Binds
    abstract RentedFlagNodeRuleProvider provideRentedFlagNodeRuleProvider(BankCRentedFlagNodeRuleProvider impl);

    @Binds
    abstract EstimatedMarketValueNodeRuleProvider provideEstimatedMarketValueNodeRuleProvider(BankCEstimatedMarketValueNodeRuleProvider impl);

    @Binds
    abstract PropertyTypeNodeRuleProvider providePropertyTypeNodeRuleProvider(BankCPropertyTypeNodeRuleProvider impl);

    @Binds
    abstract PropertySubTypeNodeRuleProvider providePropertySubTypeNodeRuleProvider(BankCPropertySubTypeNodeRuleProvider impl);

    @Binds
    abstract PropertyPurseNodeRuleProvider providePropertyPurseNodeRuleProvider(BankCPropertyPurseNodeRuleProvider impl);

    @Binds
    abstract AccessContactTypeNodeRuleProvider provideAccessContactTypeNodeRuleProvider(BankCAccessContactTypeNodeRuleProvider impl);

    @Binds
    abstract AccessContactTitleNodeRuleProvider provideAccessContactTitleNodeRuleProvider(BankCAccessContactTitleNodeRuleProvider impl);

    @Binds
    abstract AccessTelephoneNodeRuleProvider provideAccessTelephoneNodeRuleProvider(BankCAccessTelephoneNodeRuleProvider impl);

    @Binds
    abstract ProductNodeRuleProvider provideProductNodeRuleProvider(BankCProductNodeRuleProvider impl);

    @Binds
    abstract ProductGroupNodeRuleProvider provideProductGroupNodeRuleProvider(BankCProductGroupNodeRuleProvider impl);

    @Binds
    abstract ProductNameNodeRuleProvider provideProductNameNodeRuleProvider(BankCProductNameNodeRuleProvider impl);

    @Binds
    abstract ProductLoanPrimaryPurposeNodeRuleProvider provideProductLoanPrimaryPurposeNodeRuleProvider(BankCProductLoanPrimaryPurposeNodeRuleProvider impl);

    @Binds
    abstract ProductLendingPurposeNodeRuleProvider provideProductLendingPurposeNodeRuleProvider(BankCProductLendingPurposeNodeRuleProvider impl);

    @Binds
    abstract ProductPaymentTypeNodeRuleProvider provideProductPaymentTypeNodeRuleProvider(BankCProductPaymentTypeNodeRuleProvider impl);

    @Binds
    abstract ContributionTypeNodeRuleProvider provideContributionTypeNodeRuleProvider(BankCContributionTypeNodeRuleProvider impl);

    @Binds
    abstract ContributionDescriptionNodeRuleProvider provideContributionDescriptionNodeRuleProvider(BankCContributionDescriptionNodeRuleProvider impl);

    @Binds
    abstract ContributionAmountNodeRuleProvider provideContributionAmountNodeRuleProvider(BankCContributionAmountNodeRuleProvider impl);

    @Binds
    abstract FeeTypeNodeRuleProvider provideFeeTypeNodeRuleProvider(BankCFeeTypeNodeRuleProvider impl);

    @Binds
    abstract FeeDescriptionNodeRuleProvider provideFeeDescriptionNodeRuleProvider(BankCFeeDescriptionNodeRuleProvider impl);

    @Binds
    abstract FeePayFromNodeRuleProvider provideFeePayFromNodeRuleProvider(BankCFeePayFromNodeRuleProvider impl);

    @Binds
    abstract FeeAmountNodeRuleProvider provideFeeAmountNodeRuleProvider(BankCFeeAmountNodeRuleProvider impl);

    @Binds
    abstract RelatedPartyNodeRuleProvider provideRelatedPartyNodeRuleProvider(BankCRelatedPartyNodeRuleProvider impl);

    @Binds
    abstract ThirdPartyTypeNodeRuleProvider provideThirdPartyTypeNodeRuleProvider(BankCThirdPartyTypeNodeRuleProvider impl);

    @Binds
    abstract ThirdPartyDescriptionNodeRuleProvider provideThirdPartyDescriptionNodeRuleProvider(BankCThirdPartyDescriptionNodeRuleProvider impl);

    @Binds
    abstract ThirdPartyTitleNodeRuleProvider provideThirdPartyTitleNodeRuleProvider(BankCThirdPartyTitleNodeRuleProvider impl);

    @Binds
    abstract ThirdPartyFirstNameNodeRuleProvider provideThirdPartyFirstNameNodeRuleProvider(BankCThirdPartyFirstNameNodeRuleProvider impl);

    @Binds
    abstract ThirdPartyLastNameNodeRuleProvider provideThirdPartyLastNameNodeRuleProvider(BankCThirdPartyLastNameNodeRuleProvider impl);

    @Binds
    abstract ThirdPartyWorkPhoneNodeRuleProvider provideThirdPartyWorkPhoneNodeRuleProvider(BankCThirdPartyWorkPhoneNodeRuleProvider impl);

    @Binds
    abstract BrokerFirstNameNodeRuleProvider provideBrokerFirstNameNodeRuleProvider(BankCBrokerFirstNameNodeRuleProvider impl);

    @Binds
    abstract BrokerLastNameNodeRuleProvider provideBrokerLastNameNodeRuleProvider(BankCBrokerLastNameNodeRuleProvider impl);

    @Binds
    abstract BrokerCompanyNodeRuleProvider provideBrokerCompanyNodeRuleProvider(BankCBrokerCompanyNodeRuleProvider impl);

    @Binds
    abstract BrokerTelephoneNodeRuleProvider provideBrokerTelephoneNodeRuleProvider(BankCBrokerTelephoneNodeRuleProvider impl);

    @Binds
    abstract BrokerEmailNodeRuleProvider provideBrokerEmailNodeRuleProvider(BankCBrokerEmailNodeRuleProvider impl);

    @Binds
    abstract LenderIssuedBrokerNumberNodeRuleProvider provideLenderIssuedBrokerNumberNodeRuleProvider(BankCLenderIssuedBrokerNumberNodeRuleProvider impl);

    @Binds
    abstract TelephoneNodeRuleProvider provideTelephoneNodeRuleProvider(BankCTelephoneNodeRuleProvider impl);

    @Binds
    abstract AddressLineNodeRuleProvider provideAddressLineNodeRuleProvider(BankCAddressLineNodeRuleProvider impl);

    @Binds
    abstract SuburbNodeRuleProvider provideSuburbNodeRuleProvider(BankCSuburbNodeRuleProvider impl);

    @Binds
    abstract PostcodeNodeRuleProvider providePostcodeNodeRuleProvider(BankCPostcodeNodeRuleProvider impl);

    @Binds
    abstract CountryNodeRuleProvider provideCountryNodeRuleProvider(BankCCountryNodeRuleProvider impl);

    @Binds
    abstract MonthYearNodeRuleProvider provideMonthYearNodeRuleProvider(BankCMonthYearNodeRuleProvider impl);

    @Binds
    abstract MonthNodeRuleProvider provideMonthNodeRuleProvider(BankCMonthNodeRuleProvider impl);

    @Binds
    abstract YearNodeRuleProvider provideYearNodeRuleProvider(BankCYearNodeRuleProvider impl);

    @Binds
    abstract EmailNodeRuleProvider provideEmailNodeRuleProvider(BankCEmailNodeRuleProvider impl);

    @Binds
    abstract NameNodeRuleProvider provideNameNodeRuleProvider(BankCNameNodeRuleProvider impl);

    @Binds
    abstract BaseMobileNumberNodeRuleProvider provideBaseMobileNumberNodeRuleProvider(BankCBaseMobileNumberNodeRuleProvider impl);

    @Binds
    abstract BaseCurrencyNodeRuleProvider provideBaseCurrencyNodeRuleProvider(BankCBaseCurrencyNodeRuleProvider impl);

    @Binds
    abstract BasePercentageNodeRuleProvider provideBasePercentageNodeRuleProvider(BankCBasePercentageNodeRuleProvider impl);

    @Binds
    abstract EmploymentTypeNodeRuleProvider provideEmploymentTypeNodeRuleProvider(BankCEmploymentTypeNodeRuleProvider impl);

    @Binds
    abstract GrossYearlySalaryNodeRuleProvider provideGrossYearlySalaryNodeRuleProvider(BankCGrossYearlySalaryNodeRuleProvider impl);

    @Binds
    abstract ProfitThisYearNodeRuleProvider provideProfitThisYearNodeRuleProvider(BankCProfitThisYearNodeRuleProvider impl);

    @Binds
    abstract ProfitPreviousYearNodeRuleProvider provideProfitPreviousYearNodeRuleProvider(BankCProfitPreviousYearNodeRuleProvider impl);

    @Binds
    abstract EmployedNodeRuleProvider provideEmployedNodeRuleProvider(BankCEmployedNodeRuleProvider impl);

    @Binds
    abstract EmploymentStatusNodeRuleProvider provideEmploymentStatusNodeRuleProvider(BankCEmploymentStatusNodeRuleProvider impl);

    @Binds
    abstract OccupationNodeRuleProvider provideOccupationNodeRuleProvider(BankCOccupationNodeRuleProvider impl);

    @Binds
    abstract EmployerNameNodeRuleProvider provideEmployerNameNodeRuleProvider(BankCEmployerNameNodeRuleProvider impl);

    @Binds
    abstract EmployerAddressNodeRuleProvider provideEmployerAddressNodeRuleProvider(BankCEmployerAddressNodeRuleProvider impl);

    @Binds
    abstract EmployerPhoneNodeRuleProvider provideEmployerPhoneNodeRuleProvider(BankCEmployerPhoneNodeRuleProvider impl);

    @Binds
    abstract EmploymentStartedNodeRuleProvider provideEmploymentStartedNodeRuleProvider(BankCEmploymentStartedNodeRuleProvider impl);

    @Binds
    abstract EmploymentEndedNodeRuleProvider provideEmploymentEndedNodeRuleProvider(BankCEmploymentEndedNodeRuleProvider impl);

    @Binds
    abstract UnemployedOnBenefitFlagNodeRuleProvider provideUnemployedOnBenefitFlagNodeRuleProvider(BankCUnemployedOnBenefitFlagNodeRuleProvider impl);

    @Binds
    abstract StudentFlagNodeRuleProvider provideStudentFlagNodeRuleProvider(BankCStudentFlagNodeRuleProvider impl);

    @Binds
    abstract StudentTypeNodeRuleProvider provideStudentTypeNodeRuleProvider(BankCStudentTypeNodeRuleProvider impl);

    @Binds
    abstract HouseDutiesFlagNodeRuleProvider provideHouseDutiesFlagNodeRuleProvider(BankCHouseDutiesFlagNodeRuleProvider impl);

    @Binds
    abstract UnemployedSinceNodeRuleProvider provideUnemployedSinceNodeRuleProvider(BankCUnemployedSinceNodeRuleProvider impl);

    @Binds
    abstract RetiredOnBenefitFlagNodeRuleProvider provideRetiredOnBenefitFlagNodeRuleProvider(BankCRetiredOnBenefitFlagNodeRuleProvider impl);

    @Binds
    abstract RetiredSinceNodeRuleProvider provideRetiredSinceNodeRuleProvider(BankCRetiredSinceNodeRuleProvider impl);

    @Binds
    abstract YesNoOptionNodeRuleProvider provideYesNoOptionNodeRuleProvider(BankCYesNoOptionNodeRuleProvider impl);

    @Binds
    abstract BaseCountryNodeRuleProvider provideBaseCountryNodeRuleProvider(BankCBaseCountryNodeRuleProvider impl);

    @Binds
    abstract DobNodeRuleProvider provideDobNodeRuleProvider(BankCDobNodeRuleProvider impl);

    @Binds
    abstract SelectRelatedPersonListNodeRuleProvider provideSelectRelatedPersonListNodeRuleProvider(BankCSelectRelatedPersonListNodeRuleProvider impl);

    @Binds
    abstract SelectAccountHolderListNodeRuleProvider provideSelectAccountHolderListNodeRuleProvider(BankCSelectAccountHolderListNodeRuleProvider impl);

    @Binds
    abstract OwnershipListNodeRuleProvider provideOwnershipListNodeRuleProvider(BankCOwnershipListNodeRuleProvider impl);

    @Binds
    abstract OwnershipPercentageNodeRuleProvider provideOwnershipPercentageNodeRuleProvider(BankCOwnershipPercentageNodeRuleProvider impl);

    @Binds
    abstract ResponsibleSignificantChangeFlagNodeRuleProvider provideResponsibleSignificantChangeFlagNodeRuleProvider(BankCResponsibleSignificantChangeFlagNodeRuleProvider impl);

    @Binds
    abstract ResponsibleTypeOfChangeNodeRuleProvider provideResponsibleTypeOfChangeNodeRuleProvider(BankCResponsibleTypeOfChangeNodeRuleProvider impl);

    @Binds
    abstract ResponsibleMitigationMethodNodeRuleProvider provideResponsibleMitigationMethodNodeRuleProvider(BankCResponsibleMitigationMethodNodeRuleProvider impl);

    @Binds
    abstract ResponsibleRepaymentDifficultyNodeRuleProvider provideResponsibleRepaymentDifficultyNodeRuleProvider(BankCResponsibleRepaymentDifficultyNodeRuleProvider impl);

    @Binds
    abstract BaseOtherIncomeListNodeRuleProvider provideBaseOtherIncomeListNodeRuleProvider(BankCBaseOtherIncomeListNodeRuleProvider impl);

    @Binds
    abstract OtherIncomeTypeNodeRuleProvider provideOtherIncomeTypeNodeRuleProvider(BankCOtherIncomeTypeNodeRuleProvider impl);

    @Binds
    abstract OtherIncomeAddBackTypeNodeRuleProvider provideOtherIncomeAddBackTypeNodeRuleProvider(BankCOtherIncomeAddBackTypeNodeRuleProvider impl);

    @Binds
    abstract OtherIncomeAmountNodeRuleProvider provideOtherIncomeAmountNodeRuleProvider(BankCOtherIncomeAmountNodeRuleProvider impl);

    @Binds
    abstract CreditCheckFlagNodeRuleProvider provideCreditCheckFlagNodeRuleProvider(BankCCreditCheckFlagNodeRuleProvider impl);

    @Binds
    abstract ThirdPartyDisclosureFlagNodeRuleProvider provideThirdPartyDisclosureFlagNodeRuleProvider(BankCThirdPartyDisclosureFlagNodeRuleProvider impl);

    @Binds
    abstract LegalActionNodeRuleProvider provideLegalActionNodeRuleProvider(BankCLegalActionNodeRuleProvider impl);

    @Binds
    abstract TrustTypeNodeRuleProvider provideTrustTypeNodeRuleProvider(BankCTrustTypeNodeRuleProvider impl);

    @Binds
    abstract TrustCountryNodeRuleProvider provideTrustCountryNodeRuleProvider(BankCTrustCountryNodeRuleProvider impl);

    @Binds
    abstract BaseApplicantTypeNodeRuleProvider provideBaseApplicantTypeNodeRuleProvider(BankCBaseApplicantTypeNodeRuleProvider impl);

}
