package zhy2002.examples.lodgement.banka.gen.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.rule.*;

@Module(includes = {ManifestModule.class})
public abstract class BankAProfileModule {

    @Binds
    abstract ApplicationNodeRuleProvider provideApplicationNodeRuleProvider(BankAApplicationNodeRuleProvider impl);
    @Binds
    abstract PersonListNodeRuleProvider providePersonListNodeRuleProvider(BankAPersonListNodeRuleProvider impl);
    @Binds
    abstract TitleNodeRuleProvider provideTitleNodeRuleProvider(BankATitleNodeRuleProvider impl);
    @Binds
    abstract FirstNameNodeRuleProvider provideFirstNameNodeRuleProvider(BankAFirstNameNodeRuleProvider impl);
    @Binds
    abstract LastNameNodeRuleProvider provideLastNameNodeRuleProvider(BankALastNameNodeRuleProvider impl);
    @Binds
    abstract GenderNodeRuleProvider provideGenderNodeRuleProvider(BankAGenderNodeRuleProvider impl);
    @Binds
    abstract DateOfBirthNodeRuleProvider provideDateOfBirthNodeRuleProvider(BankADateOfBirthNodeRuleProvider impl);
    @Binds
    abstract PrimaryApplicantFlagNodeRuleProvider providePrimaryApplicantFlagNodeRuleProvider(BankAPrimaryApplicantFlagNodeRuleProvider impl);
    @Binds
    abstract DriversLicenseNodeRuleProvider provideDriversLicenseNodeRuleProvider(BankADriversLicenseNodeRuleProvider impl);
    @Binds
    abstract ApplicationTypeNodeRuleProvider provideApplicationTypeNodeRuleProvider(BankAApplicationTypeNodeRuleProvider impl);
    @Binds
    abstract MaritalStatusNodeRuleProvider provideMaritalStatusNodeRuleProvider(BankAMaritalStatusNodeRuleProvider impl);
    @Binds
    abstract FirstHomeBuyerFlagNodeRuleProvider provideFirstHomeBuyerFlagNodeRuleProvider(BankAFirstHomeBuyerFlagNodeRuleProvider impl);
    @Binds
    abstract HousingStatusNodeRuleProvider provideHousingStatusNodeRuleProvider(BankAHousingStatusNodeRuleProvider impl);
    @Binds
    abstract PersonContactNodeRuleProvider providePersonContactNodeRuleProvider(BankAPersonContactNodeRuleProvider impl);
    @Binds
    abstract PersonTelephoneNodeRuleProvider providePersonTelephoneNodeRuleProvider(BankAPersonTelephoneNodeRuleProvider impl);
    @Binds
    abstract PersonEmailNodeRuleProvider providePersonEmailNodeRuleProvider(BankAPersonEmailNodeRuleProvider impl);
    @Binds
    abstract MovedToCurrentAddressNodeRuleProvider provideMovedToCurrentAddressNodeRuleProvider(BankAMovedToCurrentAddressNodeRuleProvider impl);
    @Binds
    abstract MovedFromPreviousAddressNodeRuleProvider provideMovedFromPreviousAddressNodeRuleProvider(BankAMovedFromPreviousAddressNodeRuleProvider impl);
    @Binds
    abstract CurrentEmploymentListNodeRuleProvider provideCurrentEmploymentListNodeRuleProvider(BankACurrentEmploymentListNodeRuleProvider impl);
    @Binds
    abstract CurrentEmploymentNodeRuleProvider provideCurrentEmploymentNodeRuleProvider(BankACurrentEmploymentNodeRuleProvider impl);
    @Binds
    abstract PreviousEmploymentListNodeRuleProvider providePreviousEmploymentListNodeRuleProvider(BankAPreviousEmploymentListNodeRuleProvider impl);
    @Binds
    abstract PreviousEmploymentNodeRuleProvider providePreviousEmploymentNodeRuleProvider(BankAPreviousEmploymentNodeRuleProvider impl);
    @Binds
    abstract CompanyApplicationTypeNodeRuleProvider provideCompanyApplicationTypeNodeRuleProvider(BankACompanyApplicationTypeNodeRuleProvider impl);
    @Binds
    abstract CompanyRegisteredNameNodeRuleProvider provideCompanyRegisteredNameNodeRuleProvider(BankACompanyRegisteredNameNodeRuleProvider impl);
    @Binds
    abstract CompanyDescriptionNodeRuleProvider provideCompanyDescriptionNodeRuleProvider(BankACompanyDescriptionNodeRuleProvider impl);
    @Binds
    abstract CompanyIndustryNodeRuleProvider provideCompanyIndustryNodeRuleProvider(BankACompanyIndustryNodeRuleProvider impl);
    @Binds
    abstract CompanyAcnNodeRuleProvider provideCompanyAcnNodeRuleProvider(BankACompanyAcnNodeRuleProvider impl);
    @Binds
    abstract CompanyRegistrationDateNodeRuleProvider provideCompanyRegistrationDateNodeRuleProvider(BankACompanyRegistrationDateNodeRuleProvider impl);
    @Binds
    abstract CompanyRegistrationStateNodeRuleProvider provideCompanyRegistrationStateNodeRuleProvider(BankACompanyRegistrationStateNodeRuleProvider impl);
    @Binds
    abstract FinancialPositionNodeRuleProvider provideFinancialPositionNodeRuleProvider(BankAFinancialPositionNodeRuleProvider impl);
    @Binds
    abstract SavingsTypeNodeRuleProvider provideSavingsTypeNodeRuleProvider(BankASavingsTypeNodeRuleProvider impl);
    @Binds
    abstract SavingsBalanceNodeRuleProvider provideSavingsBalanceNodeRuleProvider(BankASavingsBalanceNodeRuleProvider impl);
    @Binds
    abstract SavingsAccountNameNodeRuleProvider provideSavingsAccountNameNodeRuleProvider(BankASavingsAccountNameNodeRuleProvider impl);
    @Binds
    abstract VehicleModelNodeRuleProvider provideVehicleModelNodeRuleProvider(BankAVehicleModelNodeRuleProvider impl);
    @Binds
    abstract VehicleYearNodeRuleProvider provideVehicleYearNodeRuleProvider(BankAVehicleYearNodeRuleProvider impl);
    @Binds
    abstract VehicleMarketValueNodeRuleProvider provideVehicleMarketValueNodeRuleProvider(BankAVehicleMarketValueNodeRuleProvider impl);
    @Binds
    abstract OtherAssetTypeNodeRuleProvider provideOtherAssetTypeNodeRuleProvider(BankAOtherAssetTypeNodeRuleProvider impl);
    @Binds
    abstract OtherAssetMarketValueNodeRuleProvider provideOtherAssetMarketValueNodeRuleProvider(BankAOtherAssetMarketValueNodeRuleProvider impl);
    @Binds
    abstract CreditCardTypeNodeRuleProvider provideCreditCardTypeNodeRuleProvider(BankACreditCardTypeNodeRuleProvider impl);
    @Binds
    abstract CreditCardAmountOwingNodeRuleProvider provideCreditCardAmountOwingNodeRuleProvider(BankACreditCardAmountOwingNodeRuleProvider impl);
    @Binds
    abstract CreditCardLimitAmountNodeRuleProvider provideCreditCardLimitAmountNodeRuleProvider(BankACreditCardLimitAmountNodeRuleProvider impl);
    @Binds
    abstract CreditCardMonthlyRepaymentNodeRuleProvider provideCreditCardMonthlyRepaymentNodeRuleProvider(BankACreditCardMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract CreditCardClearingFlagNodeRuleProvider provideCreditCardClearingFlagNodeRuleProvider(BankACreditCardClearingFlagNodeRuleProvider impl);
    @Binds
    abstract CreditCardBreakCostNodeRuleProvider provideCreditCardBreakCostNodeRuleProvider(BankACreditCardBreakCostNodeRuleProvider impl);
    @Binds
    abstract CreditCardOwnershipListNodeRuleProvider provideCreditCardOwnershipListNodeRuleProvider(BankACreditCardOwnershipListNodeRuleProvider impl);
    @Binds
    abstract LoanTypeNodeRuleProvider provideLoanTypeNodeRuleProvider(BankALoanTypeNodeRuleProvider impl);
    @Binds
    abstract LoanOwingAmountNodeRuleProvider provideLoanOwingAmountNodeRuleProvider(BankALoanOwingAmountNodeRuleProvider impl);
    @Binds
    abstract LoanLimitAmountNodeRuleProvider provideLoanLimitAmountNodeRuleProvider(BankALoanLimitAmountNodeRuleProvider impl);
    @Binds
    abstract LoanMonthlyRepaymentNodeRuleProvider provideLoanMonthlyRepaymentNodeRuleProvider(BankALoanMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract LoanClearingFlagNodeRuleProvider provideLoanClearingFlagNodeRuleProvider(BankALoanClearingFlagNodeRuleProvider impl);
    @Binds
    abstract LoanBreakCostNodeRuleProvider provideLoanBreakCostNodeRuleProvider(BankALoanBreakCostNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityTypeNodeRuleProvider provideOtherLiabilityTypeNodeRuleProvider(BankAOtherLiabilityTypeNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityLimitAmountNodeRuleProvider provideOtherLiabilityLimitAmountNodeRuleProvider(BankAOtherLiabilityLimitAmountNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityAmountOwningNodeRuleProvider provideOtherLiabilityAmountOwningNodeRuleProvider(BankAOtherLiabilityAmountOwningNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityMonthlyRepaymentNodeRuleProvider provideOtherLiabilityMonthlyRepaymentNodeRuleProvider(BankAOtherLiabilityMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityClearingFlagNodeRuleProvider provideOtherLiabilityClearingFlagNodeRuleProvider(BankAOtherLiabilityClearingFlagNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityBreakCostNodeRuleProvider provideOtherLiabilityBreakCostNodeRuleProvider(BankAOtherLiabilityBreakCostNodeRuleProvider impl);
    @Binds
    abstract ExpenseTypeNodeRuleProvider provideExpenseTypeNodeRuleProvider(BankAExpenseTypeNodeRuleProvider impl);
    @Binds
    abstract ExpenseMonthlyRepaymentNodeRuleProvider provideExpenseMonthlyRepaymentNodeRuleProvider(BankAExpenseMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract TotalAssetNodeRuleProvider provideTotalAssetNodeRuleProvider(BankATotalAssetNodeRuleProvider impl);
    @Binds
    abstract TotalLiabilityNodeRuleProvider provideTotalLiabilityNodeRuleProvider(BankATotalLiabilityNodeRuleProvider impl);
    @Binds
    abstract TotalExpenseNodeRuleProvider provideTotalExpenseNodeRuleProvider(BankATotalExpenseNodeRuleProvider impl);
    @Binds
    abstract RealEstateListNodeRuleProvider provideRealEstateListNodeRuleProvider(BankARealEstateListNodeRuleProvider impl);
    @Binds
    abstract RealEstateNodeRuleProvider provideRealEstateNodeRuleProvider(BankARealEstateNodeRuleProvider impl);
    @Binds
    abstract UsedAsSecurityFlagNodeRuleProvider provideUsedAsSecurityFlagNodeRuleProvider(BankAUsedAsSecurityFlagNodeRuleProvider impl);
    @Binds
    abstract BeingPurchasedFlagNodeRuleProvider provideBeingPurchasedFlagNodeRuleProvider(BankABeingPurchasedFlagNodeRuleProvider impl);
    @Binds
    abstract OwnedOutrightFlagNodeRuleProvider provideOwnedOutrightFlagNodeRuleProvider(BankAOwnedOutrightFlagNodeRuleProvider impl);
    @Binds
    abstract PrimarySecurityFlagNodeRuleProvider providePrimarySecurityFlagNodeRuleProvider(BankAPrimarySecurityFlagNodeRuleProvider impl);
    @Binds
    abstract ApprovalInPrincipleFlagNodeRuleProvider provideApprovalInPrincipleFlagNodeRuleProvider(BankAApprovalInPrincipleFlagNodeRuleProvider impl);
    @Binds
    abstract MortgqageUnpaidBalanceNodeRuleProvider provideMortgqageUnpaidBalanceNodeRuleProvider(BankAMortgqageUnpaidBalanceNodeRuleProvider impl);
    @Binds
    abstract MortgageLimitAmountNodeRuleProvider provideMortgageLimitAmountNodeRuleProvider(BankAMortgageLimitAmountNodeRuleProvider impl);
    @Binds
    abstract MortgageMonthlyRepaymentNodeRuleProvider provideMortgageMonthlyRepaymentNodeRuleProvider(BankAMortgageMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract MortgageBorrowerRateNodeRuleProvider provideMortgageBorrowerRateNodeRuleProvider(BankAMortgageBorrowerRateNodeRuleProvider impl);
    @Binds
    abstract MortgageLoanTypeNodeRuleProvider provideMortgageLoanTypeNodeRuleProvider(BankAMortgageLoanTypeNodeRuleProvider impl);
    @Binds
    abstract MortgageLoanTermExpiryDateNodeRuleProvider provideMortgageLoanTermExpiryDateNodeRuleProvider(BankAMortgageLoanTermExpiryDateNodeRuleProvider impl);
    @Binds
    abstract MortgageInterestOnlyExpiryDateNodeRuleProvider provideMortgageInterestOnlyExpiryDateNodeRuleProvider(BankAMortgageInterestOnlyExpiryDateNodeRuleProvider impl);
    @Binds
    abstract MortgageClearingFlagNodeRuleProvider provideMortgageClearingFlagNodeRuleProvider(BankAMortgageClearingFlagNodeRuleProvider impl);
    @Binds
    abstract MortgageChargePositionNodeRuleProvider provideMortgageChargePositionNodeRuleProvider(BankAMortgageChargePositionNodeRuleProvider impl);
    @Binds
    abstract MortgageTermRemainingPeriodNodeRuleProvider provideMortgageTermRemainingPeriodNodeRuleProvider(BankAMortgageTermRemainingPeriodNodeRuleProvider impl);
    @Binds
    abstract MortgageInterestOnlyRemainingPeriodNodeRuleProvider provideMortgageInterestOnlyRemainingPeriodNodeRuleProvider(BankAMortgageInterestOnlyRemainingPeriodNodeRuleProvider impl);
    @Binds
    abstract RentedFlagNodeRuleProvider provideRentedFlagNodeRuleProvider(BankARentedFlagNodeRuleProvider impl);
    @Binds
    abstract EstimatedMarketValueNodeRuleProvider provideEstimatedMarketValueNodeRuleProvider(BankAEstimatedMarketValueNodeRuleProvider impl);
    @Binds
    abstract PropertyTypeNodeRuleProvider providePropertyTypeNodeRuleProvider(BankAPropertyTypeNodeRuleProvider impl);
    @Binds
    abstract PropertySubTypeNodeRuleProvider providePropertySubTypeNodeRuleProvider(BankAPropertySubTypeNodeRuleProvider impl);
    @Binds
    abstract PropertyPurseNodeRuleProvider providePropertyPurseNodeRuleProvider(BankAPropertyPurseNodeRuleProvider impl);
    @Binds
    abstract AccessContactTypeNodeRuleProvider provideAccessContactTypeNodeRuleProvider(BankAAccessContactTypeNodeRuleProvider impl);
    @Binds
    abstract AccessContactTitleNodeRuleProvider provideAccessContactTitleNodeRuleProvider(BankAAccessContactTitleNodeRuleProvider impl);
    @Binds
    abstract AccessTelephoneNodeRuleProvider provideAccessTelephoneNodeRuleProvider(BankAAccessTelephoneNodeRuleProvider impl);
    @Binds
    abstract ProductNodeRuleProvider provideProductNodeRuleProvider(BankAProductNodeRuleProvider impl);
    @Binds
    abstract ProductGroupNodeRuleProvider provideProductGroupNodeRuleProvider(BankAProductGroupNodeRuleProvider impl);
    @Binds
    abstract ProductNameNodeRuleProvider provideProductNameNodeRuleProvider(BankAProductNameNodeRuleProvider impl);
    @Binds
    abstract ProductLoanPrimaryPurposeNodeRuleProvider provideProductLoanPrimaryPurposeNodeRuleProvider(BankAProductLoanPrimaryPurposeNodeRuleProvider impl);
    @Binds
    abstract ProductLendingPurposeNodeRuleProvider provideProductLendingPurposeNodeRuleProvider(BankAProductLendingPurposeNodeRuleProvider impl);
    @Binds
    abstract ProductPaymentTypeNodeRuleProvider provideProductPaymentTypeNodeRuleProvider(BankAProductPaymentTypeNodeRuleProvider impl);
    @Binds
    abstract ContributionTypeNodeRuleProvider provideContributionTypeNodeRuleProvider(BankAContributionTypeNodeRuleProvider impl);
    @Binds
    abstract ContributionDescriptionNodeRuleProvider provideContributionDescriptionNodeRuleProvider(BankAContributionDescriptionNodeRuleProvider impl);
    @Binds
    abstract ContributionAmountNodeRuleProvider provideContributionAmountNodeRuleProvider(BankAContributionAmountNodeRuleProvider impl);
    @Binds
    abstract FeeTypeNodeRuleProvider provideFeeTypeNodeRuleProvider(BankAFeeTypeNodeRuleProvider impl);
    @Binds
    abstract FeeDescriptionNodeRuleProvider provideFeeDescriptionNodeRuleProvider(BankAFeeDescriptionNodeRuleProvider impl);
    @Binds
    abstract FeePayFromNodeRuleProvider provideFeePayFromNodeRuleProvider(BankAFeePayFromNodeRuleProvider impl);
    @Binds
    abstract FeeAmountNodeRuleProvider provideFeeAmountNodeRuleProvider(BankAFeeAmountNodeRuleProvider impl);
    @Binds
    abstract RelatedPartyNodeRuleProvider provideRelatedPartyNodeRuleProvider(BankARelatedPartyNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyTypeNodeRuleProvider provideThirdPartyTypeNodeRuleProvider(BankAThirdPartyTypeNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyDescriptionNodeRuleProvider provideThirdPartyDescriptionNodeRuleProvider(BankAThirdPartyDescriptionNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyTitleNodeRuleProvider provideThirdPartyTitleNodeRuleProvider(BankAThirdPartyTitleNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyFirstNameNodeRuleProvider provideThirdPartyFirstNameNodeRuleProvider(BankAThirdPartyFirstNameNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyLastNameNodeRuleProvider provideThirdPartyLastNameNodeRuleProvider(BankAThirdPartyLastNameNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyWorkPhoneNodeRuleProvider provideThirdPartyWorkPhoneNodeRuleProvider(BankAThirdPartyWorkPhoneNodeRuleProvider impl);
    @Binds
    abstract BrokerFirstNameNodeRuleProvider provideBrokerFirstNameNodeRuleProvider(BankABrokerFirstNameNodeRuleProvider impl);
    @Binds
    abstract BrokerLastNameNodeRuleProvider provideBrokerLastNameNodeRuleProvider(BankABrokerLastNameNodeRuleProvider impl);
    @Binds
    abstract BrokerCompanyNodeRuleProvider provideBrokerCompanyNodeRuleProvider(BankABrokerCompanyNodeRuleProvider impl);
    @Binds
    abstract BrokerTelephoneNodeRuleProvider provideBrokerTelephoneNodeRuleProvider(BankABrokerTelephoneNodeRuleProvider impl);
    @Binds
    abstract BrokerEmailNodeRuleProvider provideBrokerEmailNodeRuleProvider(BankABrokerEmailNodeRuleProvider impl);
    @Binds
    abstract LenderIssuedBrokerNumberNodeRuleProvider provideLenderIssuedBrokerNumberNodeRuleProvider(BankALenderIssuedBrokerNumberNodeRuleProvider impl);
    @Binds
    abstract TelephoneNodeRuleProvider provideTelephoneNodeRuleProvider(BankATelephoneNodeRuleProvider impl);
    @Binds
    abstract AddressLineNodeRuleProvider provideAddressLineNodeRuleProvider(BankAAddressLineNodeRuleProvider impl);
    @Binds
    abstract SuburbNodeRuleProvider provideSuburbNodeRuleProvider(BankASuburbNodeRuleProvider impl);
    @Binds
    abstract PostcodeNodeRuleProvider providePostcodeNodeRuleProvider(BankAPostcodeNodeRuleProvider impl);
    @Binds
    abstract CountryNodeRuleProvider provideCountryNodeRuleProvider(BankACountryNodeRuleProvider impl);
    @Binds
    abstract MonthYearNodeRuleProvider provideMonthYearNodeRuleProvider(BankAMonthYearNodeRuleProvider impl);
    @Binds
    abstract MonthNodeRuleProvider provideMonthNodeRuleProvider(BankAMonthNodeRuleProvider impl);
    @Binds
    abstract YearNodeRuleProvider provideYearNodeRuleProvider(BankAYearNodeRuleProvider impl);
    @Binds
    abstract EmailNodeRuleProvider provideEmailNodeRuleProvider(BankAEmailNodeRuleProvider impl);
    @Binds
    abstract NameNodeRuleProvider provideNameNodeRuleProvider(BankANameNodeRuleProvider impl);
    @Binds
    abstract BaseMobileNumberNodeRuleProvider provideBaseMobileNumberNodeRuleProvider(BankABaseMobileNumberNodeRuleProvider impl);
    @Binds
    abstract BaseCurrencyNodeRuleProvider provideBaseCurrencyNodeRuleProvider(BankABaseCurrencyNodeRuleProvider impl);
    @Binds
    abstract BasePercentageNodeRuleProvider provideBasePercentageNodeRuleProvider(BankABasePercentageNodeRuleProvider impl);
    @Binds
    abstract EmploymentTypeNodeRuleProvider provideEmploymentTypeNodeRuleProvider(BankAEmploymentTypeNodeRuleProvider impl);
    @Binds
    abstract GrossYearlySalaryNodeRuleProvider provideGrossYearlySalaryNodeRuleProvider(BankAGrossYearlySalaryNodeRuleProvider impl);
    @Binds
    abstract ProfitThisYearNodeRuleProvider provideProfitThisYearNodeRuleProvider(BankAProfitThisYearNodeRuleProvider impl);
    @Binds
    abstract ProfitPreviousYearNodeRuleProvider provideProfitPreviousYearNodeRuleProvider(BankAProfitPreviousYearNodeRuleProvider impl);
    @Binds
    abstract EmployedNodeRuleProvider provideEmployedNodeRuleProvider(BankAEmployedNodeRuleProvider impl);
    @Binds
    abstract EmploymentStatusNodeRuleProvider provideEmploymentStatusNodeRuleProvider(BankAEmploymentStatusNodeRuleProvider impl);
    @Binds
    abstract OccupationNodeRuleProvider provideOccupationNodeRuleProvider(BankAOccupationNodeRuleProvider impl);
    @Binds
    abstract EmployerNameNodeRuleProvider provideEmployerNameNodeRuleProvider(BankAEmployerNameNodeRuleProvider impl);
    @Binds
    abstract EmployerAddressNodeRuleProvider provideEmployerAddressNodeRuleProvider(BankAEmployerAddressNodeRuleProvider impl);
    @Binds
    abstract EmployerPhoneNodeRuleProvider provideEmployerPhoneNodeRuleProvider(BankAEmployerPhoneNodeRuleProvider impl);
    @Binds
    abstract EmploymentStartedNodeRuleProvider provideEmploymentStartedNodeRuleProvider(BankAEmploymentStartedNodeRuleProvider impl);
    @Binds
    abstract EmploymentEndedNodeRuleProvider provideEmploymentEndedNodeRuleProvider(BankAEmploymentEndedNodeRuleProvider impl);
    @Binds
    abstract UnemployedOnBenefitFlagNodeRuleProvider provideUnemployedOnBenefitFlagNodeRuleProvider(BankAUnemployedOnBenefitFlagNodeRuleProvider impl);
    @Binds
    abstract StudentFlagNodeRuleProvider provideStudentFlagNodeRuleProvider(BankAStudentFlagNodeRuleProvider impl);
    @Binds
    abstract StudentTypeNodeRuleProvider provideStudentTypeNodeRuleProvider(BankAStudentTypeNodeRuleProvider impl);
    @Binds
    abstract HouseDutiesFlagNodeRuleProvider provideHouseDutiesFlagNodeRuleProvider(BankAHouseDutiesFlagNodeRuleProvider impl);
    @Binds
    abstract UnemployedSinceNodeRuleProvider provideUnemployedSinceNodeRuleProvider(BankAUnemployedSinceNodeRuleProvider impl);
    @Binds
    abstract RetiredOnBenefitFlagNodeRuleProvider provideRetiredOnBenefitFlagNodeRuleProvider(BankARetiredOnBenefitFlagNodeRuleProvider impl);
    @Binds
    abstract RetiredSinceNodeRuleProvider provideRetiredSinceNodeRuleProvider(BankARetiredSinceNodeRuleProvider impl);
    @Binds
    abstract YesNoOptionNodeRuleProvider provideYesNoOptionNodeRuleProvider(BankAYesNoOptionNodeRuleProvider impl);
    @Binds
    abstract BaseCountryNodeRuleProvider provideBaseCountryNodeRuleProvider(BankABaseCountryNodeRuleProvider impl);
    @Binds
    abstract DobNodeRuleProvider provideDobNodeRuleProvider(BankADobNodeRuleProvider impl);
    @Binds
    abstract SelectRelatedPersonListNodeRuleProvider provideSelectRelatedPersonListNodeRuleProvider(BankASelectRelatedPersonListNodeRuleProvider impl);
    @Binds
    abstract SelectAccountHolderListNodeRuleProvider provideSelectAccountHolderListNodeRuleProvider(BankASelectAccountHolderListNodeRuleProvider impl);
    @Binds
    abstract OwnershipListNodeRuleProvider provideOwnershipListNodeRuleProvider(BankAOwnershipListNodeRuleProvider impl);
    @Binds
    abstract OwnershipPercentageNodeRuleProvider provideOwnershipPercentageNodeRuleProvider(BankAOwnershipPercentageNodeRuleProvider impl);
    @Binds
    abstract ResponsibleSignificantChangeFlagNodeRuleProvider provideResponsibleSignificantChangeFlagNodeRuleProvider(BankAResponsibleSignificantChangeFlagNodeRuleProvider impl);
    @Binds
    abstract ResponsibleTypeOfChangeNodeRuleProvider provideResponsibleTypeOfChangeNodeRuleProvider(BankAResponsibleTypeOfChangeNodeRuleProvider impl);
    @Binds
    abstract ResponsibleMitigationMethodNodeRuleProvider provideResponsibleMitigationMethodNodeRuleProvider(BankAResponsibleMitigationMethodNodeRuleProvider impl);
    @Binds
    abstract ResponsibleRepaymentDifficultyNodeRuleProvider provideResponsibleRepaymentDifficultyNodeRuleProvider(BankAResponsibleRepaymentDifficultyNodeRuleProvider impl);
    @Binds
    abstract BaseOtherIncomeListNodeRuleProvider provideBaseOtherIncomeListNodeRuleProvider(BankABaseOtherIncomeListNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeTypeNodeRuleProvider provideOtherIncomeTypeNodeRuleProvider(BankAOtherIncomeTypeNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeAddBackTypeNodeRuleProvider provideOtherIncomeAddBackTypeNodeRuleProvider(BankAOtherIncomeAddBackTypeNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeAmountNodeRuleProvider provideOtherIncomeAmountNodeRuleProvider(BankAOtherIncomeAmountNodeRuleProvider impl);
    @Binds
    abstract CreditCheckFlagNodeRuleProvider provideCreditCheckFlagNodeRuleProvider(BankACreditCheckFlagNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyDisclosureFlagNodeRuleProvider provideThirdPartyDisclosureFlagNodeRuleProvider(BankAThirdPartyDisclosureFlagNodeRuleProvider impl);
    @Binds
    abstract LegalActionNodeRuleProvider provideLegalActionNodeRuleProvider(BankALegalActionNodeRuleProvider impl);
    @Binds
    abstract TrustTypeNodeRuleProvider provideTrustTypeNodeRuleProvider(BankATrustTypeNodeRuleProvider impl);
    @Binds
    abstract TrustCountryNodeRuleProvider provideTrustCountryNodeRuleProvider(BankATrustCountryNodeRuleProvider impl);
    @Binds
    abstract BaseApplicantTypeNodeRuleProvider provideBaseApplicantTypeNodeRuleProvider(BankABaseApplicantTypeNodeRuleProvider impl);

}