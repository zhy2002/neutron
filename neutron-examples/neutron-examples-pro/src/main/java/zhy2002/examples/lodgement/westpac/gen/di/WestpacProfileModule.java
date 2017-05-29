package zhy2002.examples.lodgement.westpac.gen.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.rule.*;

@Module(includes = {ManifestModule.class})
public abstract class WestpacProfileModule {

    @Binds
    abstract ApplicationNodeRuleProvider provideApplicationNodeRuleProvider(WestpacApplicationNodeRuleProvider impl);
    @Binds
    abstract PersonListNodeRuleProvider providePersonListNodeRuleProvider(WestpacPersonListNodeRuleProvider impl);
    @Binds
    abstract TitleNodeRuleProvider provideTitleNodeRuleProvider(WestpacTitleNodeRuleProvider impl);
    @Binds
    abstract FirstNameNodeRuleProvider provideFirstNameNodeRuleProvider(WestpacFirstNameNodeRuleProvider impl);
    @Binds
    abstract LastNameNodeRuleProvider provideLastNameNodeRuleProvider(WestpacLastNameNodeRuleProvider impl);
    @Binds
    abstract GenderNodeRuleProvider provideGenderNodeRuleProvider(WestpacGenderNodeRuleProvider impl);
    @Binds
    abstract DateOfBirthNodeRuleProvider provideDateOfBirthNodeRuleProvider(WestpacDateOfBirthNodeRuleProvider impl);
    @Binds
    abstract PrimaryApplicantFlagNodeRuleProvider providePrimaryApplicantFlagNodeRuleProvider(WestpacPrimaryApplicantFlagNodeRuleProvider impl);
    @Binds
    abstract DriversLicenseNodeRuleProvider provideDriversLicenseNodeRuleProvider(WestpacDriversLicenseNodeRuleProvider impl);
    @Binds
    abstract ApplicationTypeNodeRuleProvider provideApplicationTypeNodeRuleProvider(WestpacApplicationTypeNodeRuleProvider impl);
    @Binds
    abstract MaritalStatusNodeRuleProvider provideMaritalStatusNodeRuleProvider(WestpacMaritalStatusNodeRuleProvider impl);
    @Binds
    abstract FirstHomeBuyerFlagNodeRuleProvider provideFirstHomeBuyerFlagNodeRuleProvider(WestpacFirstHomeBuyerFlagNodeRuleProvider impl);
    @Binds
    abstract HousingStatusNodeRuleProvider provideHousingStatusNodeRuleProvider(WestpacHousingStatusNodeRuleProvider impl);
    @Binds
    abstract PersonContactNodeRuleProvider providePersonContactNodeRuleProvider(WestpacPersonContactNodeRuleProvider impl);
    @Binds
    abstract PersonTelephoneNodeRuleProvider providePersonTelephoneNodeRuleProvider(WestpacPersonTelephoneNodeRuleProvider impl);
    @Binds
    abstract PersonEmailNodeRuleProvider providePersonEmailNodeRuleProvider(WestpacPersonEmailNodeRuleProvider impl);
    @Binds
    abstract MovedToCurrentAddressNodeRuleProvider provideMovedToCurrentAddressNodeRuleProvider(WestpacMovedToCurrentAddressNodeRuleProvider impl);
    @Binds
    abstract MovedFromPreviousAddressNodeRuleProvider provideMovedFromPreviousAddressNodeRuleProvider(WestpacMovedFromPreviousAddressNodeRuleProvider impl);
    @Binds
    abstract CurrentEmploymentListNodeRuleProvider provideCurrentEmploymentListNodeRuleProvider(WestpacCurrentEmploymentListNodeRuleProvider impl);
    @Binds
    abstract CurrentEmploymentNodeRuleProvider provideCurrentEmploymentNodeRuleProvider(WestpacCurrentEmploymentNodeRuleProvider impl);
    @Binds
    abstract PreviousEmploymentListNodeRuleProvider providePreviousEmploymentListNodeRuleProvider(WestpacPreviousEmploymentListNodeRuleProvider impl);
    @Binds
    abstract PreviousEmploymentNodeRuleProvider providePreviousEmploymentNodeRuleProvider(WestpacPreviousEmploymentNodeRuleProvider impl);
    @Binds
    abstract CompanyApplicationTypeNodeRuleProvider provideCompanyApplicationTypeNodeRuleProvider(WestpacCompanyApplicationTypeNodeRuleProvider impl);
    @Binds
    abstract CompanyRegisteredNameNodeRuleProvider provideCompanyRegisteredNameNodeRuleProvider(WestpacCompanyRegisteredNameNodeRuleProvider impl);
    @Binds
    abstract CompanyDescriptionNodeRuleProvider provideCompanyDescriptionNodeRuleProvider(WestpacCompanyDescriptionNodeRuleProvider impl);
    @Binds
    abstract CompanyIndustryNodeRuleProvider provideCompanyIndustryNodeRuleProvider(WestpacCompanyIndustryNodeRuleProvider impl);
    @Binds
    abstract CompanyAcnNodeRuleProvider provideCompanyAcnNodeRuleProvider(WestpacCompanyAcnNodeRuleProvider impl);
    @Binds
    abstract CompanyRegistrationDateNodeRuleProvider provideCompanyRegistrationDateNodeRuleProvider(WestpacCompanyRegistrationDateNodeRuleProvider impl);
    @Binds
    abstract CompanyRegistrationStateNodeRuleProvider provideCompanyRegistrationStateNodeRuleProvider(WestpacCompanyRegistrationStateNodeRuleProvider impl);
    @Binds
    abstract FinancialPositionNodeRuleProvider provideFinancialPositionNodeRuleProvider(WestpacFinancialPositionNodeRuleProvider impl);
    @Binds
    abstract SavingsTypeNodeRuleProvider provideSavingsTypeNodeRuleProvider(WestpacSavingsTypeNodeRuleProvider impl);
    @Binds
    abstract SavingsBalanceNodeRuleProvider provideSavingsBalanceNodeRuleProvider(WestpacSavingsBalanceNodeRuleProvider impl);
    @Binds
    abstract SavingsAccountNameNodeRuleProvider provideSavingsAccountNameNodeRuleProvider(WestpacSavingsAccountNameNodeRuleProvider impl);
    @Binds
    abstract VehicleModelNodeRuleProvider provideVehicleModelNodeRuleProvider(WestpacVehicleModelNodeRuleProvider impl);
    @Binds
    abstract VehicleYearNodeRuleProvider provideVehicleYearNodeRuleProvider(WestpacVehicleYearNodeRuleProvider impl);
    @Binds
    abstract VehicleMarketValueNodeRuleProvider provideVehicleMarketValueNodeRuleProvider(WestpacVehicleMarketValueNodeRuleProvider impl);
    @Binds
    abstract OtherAssetTypeNodeRuleProvider provideOtherAssetTypeNodeRuleProvider(WestpacOtherAssetTypeNodeRuleProvider impl);
    @Binds
    abstract OtherAssetMarketValueNodeRuleProvider provideOtherAssetMarketValueNodeRuleProvider(WestpacOtherAssetMarketValueNodeRuleProvider impl);
    @Binds
    abstract CreditCardTypeNodeRuleProvider provideCreditCardTypeNodeRuleProvider(WestpacCreditCardTypeNodeRuleProvider impl);
    @Binds
    abstract CreditCardAmountOwingNodeRuleProvider provideCreditCardAmountOwingNodeRuleProvider(WestpacCreditCardAmountOwingNodeRuleProvider impl);
    @Binds
    abstract CreditCardLimitAmountNodeRuleProvider provideCreditCardLimitAmountNodeRuleProvider(WestpacCreditCardLimitAmountNodeRuleProvider impl);
    @Binds
    abstract CreditCardMonthlyRepaymentNodeRuleProvider provideCreditCardMonthlyRepaymentNodeRuleProvider(WestpacCreditCardMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract CreditCardClearingFlagNodeRuleProvider provideCreditCardClearingFlagNodeRuleProvider(WestpacCreditCardClearingFlagNodeRuleProvider impl);
    @Binds
    abstract CreditCardBreakCostNodeRuleProvider provideCreditCardBreakCostNodeRuleProvider(WestpacCreditCardBreakCostNodeRuleProvider impl);
    @Binds
    abstract CreditCardOwnershipListNodeRuleProvider provideCreditCardOwnershipListNodeRuleProvider(WestpacCreditCardOwnershipListNodeRuleProvider impl);
    @Binds
    abstract LoanTypeNodeRuleProvider provideLoanTypeNodeRuleProvider(WestpacLoanTypeNodeRuleProvider impl);
    @Binds
    abstract LoanOwingAmountNodeRuleProvider provideLoanOwingAmountNodeRuleProvider(WestpacLoanOwingAmountNodeRuleProvider impl);
    @Binds
    abstract LoanLimitAmountNodeRuleProvider provideLoanLimitAmountNodeRuleProvider(WestpacLoanLimitAmountNodeRuleProvider impl);
    @Binds
    abstract LoanMonthlyRepaymentNodeRuleProvider provideLoanMonthlyRepaymentNodeRuleProvider(WestpacLoanMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract LoanClearingFlagNodeRuleProvider provideLoanClearingFlagNodeRuleProvider(WestpacLoanClearingFlagNodeRuleProvider impl);
    @Binds
    abstract LoanBreakCostNodeRuleProvider provideLoanBreakCostNodeRuleProvider(WestpacLoanBreakCostNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityTypeNodeRuleProvider provideOtherLiabilityTypeNodeRuleProvider(WestpacOtherLiabilityTypeNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityLimitAmountNodeRuleProvider provideOtherLiabilityLimitAmountNodeRuleProvider(WestpacOtherLiabilityLimitAmountNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityAmountOwningNodeRuleProvider provideOtherLiabilityAmountOwningNodeRuleProvider(WestpacOtherLiabilityAmountOwningNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityMonthlyRepaymentNodeRuleProvider provideOtherLiabilityMonthlyRepaymentNodeRuleProvider(WestpacOtherLiabilityMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityClearingFlagNodeRuleProvider provideOtherLiabilityClearingFlagNodeRuleProvider(WestpacOtherLiabilityClearingFlagNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityBreakCostNodeRuleProvider provideOtherLiabilityBreakCostNodeRuleProvider(WestpacOtherLiabilityBreakCostNodeRuleProvider impl);
    @Binds
    abstract ExpenseTypeNodeRuleProvider provideExpenseTypeNodeRuleProvider(WestpacExpenseTypeNodeRuleProvider impl);
    @Binds
    abstract ExpenseMonthlyRepaymentNodeRuleProvider provideExpenseMonthlyRepaymentNodeRuleProvider(WestpacExpenseMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract TotalAssetNodeRuleProvider provideTotalAssetNodeRuleProvider(WestpacTotalAssetNodeRuleProvider impl);
    @Binds
    abstract TotalLiabilityNodeRuleProvider provideTotalLiabilityNodeRuleProvider(WestpacTotalLiabilityNodeRuleProvider impl);
    @Binds
    abstract TotalExpenseNodeRuleProvider provideTotalExpenseNodeRuleProvider(WestpacTotalExpenseNodeRuleProvider impl);
    @Binds
    abstract RealEstateListNodeRuleProvider provideRealEstateListNodeRuleProvider(WestpacRealEstateListNodeRuleProvider impl);
    @Binds
    abstract RealEstateNodeRuleProvider provideRealEstateNodeRuleProvider(WestpacRealEstateNodeRuleProvider impl);
    @Binds
    abstract UsedAsSecurityFlagNodeRuleProvider provideUsedAsSecurityFlagNodeRuleProvider(WestpacUsedAsSecurityFlagNodeRuleProvider impl);
    @Binds
    abstract BeingPurchasedFlagNodeRuleProvider provideBeingPurchasedFlagNodeRuleProvider(WestpacBeingPurchasedFlagNodeRuleProvider impl);
    @Binds
    abstract OwnedOutrightFlagNodeRuleProvider provideOwnedOutrightFlagNodeRuleProvider(WestpacOwnedOutrightFlagNodeRuleProvider impl);
    @Binds
    abstract PrimarySecurityFlagNodeRuleProvider providePrimarySecurityFlagNodeRuleProvider(WestpacPrimarySecurityFlagNodeRuleProvider impl);
    @Binds
    abstract ApprovalInPrincipleFlagNodeRuleProvider provideApprovalInPrincipleFlagNodeRuleProvider(WestpacApprovalInPrincipleFlagNodeRuleProvider impl);
    @Binds
    abstract MortgqageUnpaidBalanceNodeRuleProvider provideMortgqageUnpaidBalanceNodeRuleProvider(WestpacMortgqageUnpaidBalanceNodeRuleProvider impl);
    @Binds
    abstract MortgageLimitAmountNodeRuleProvider provideMortgageLimitAmountNodeRuleProvider(WestpacMortgageLimitAmountNodeRuleProvider impl);
    @Binds
    abstract MortgageMonthlyRepaymentNodeRuleProvider provideMortgageMonthlyRepaymentNodeRuleProvider(WestpacMortgageMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract MortgageBorrowerRateNodeRuleProvider provideMortgageBorrowerRateNodeRuleProvider(WestpacMortgageBorrowerRateNodeRuleProvider impl);
    @Binds
    abstract MortgageLoanTypeNodeRuleProvider provideMortgageLoanTypeNodeRuleProvider(WestpacMortgageLoanTypeNodeRuleProvider impl);
    @Binds
    abstract MortgageLoanTermExpiryDateNodeRuleProvider provideMortgageLoanTermExpiryDateNodeRuleProvider(WestpacMortgageLoanTermExpiryDateNodeRuleProvider impl);
    @Binds
    abstract MortgageInterestOnlyExpiryDateNodeRuleProvider provideMortgageInterestOnlyExpiryDateNodeRuleProvider(WestpacMortgageInterestOnlyExpiryDateNodeRuleProvider impl);
    @Binds
    abstract MortgageClearingFlagNodeRuleProvider provideMortgageClearingFlagNodeRuleProvider(WestpacMortgageClearingFlagNodeRuleProvider impl);
    @Binds
    abstract MortgageChargePositionNodeRuleProvider provideMortgageChargePositionNodeRuleProvider(WestpacMortgageChargePositionNodeRuleProvider impl);
    @Binds
    abstract MortgageTermRemainingPeriodNodeRuleProvider provideMortgageTermRemainingPeriodNodeRuleProvider(WestpacMortgageTermRemainingPeriodNodeRuleProvider impl);
    @Binds
    abstract MortgageInterestOnlyRemainingPeriodNodeRuleProvider provideMortgageInterestOnlyRemainingPeriodNodeRuleProvider(WestpacMortgageInterestOnlyRemainingPeriodNodeRuleProvider impl);
    @Binds
    abstract RentedFlagNodeRuleProvider provideRentedFlagNodeRuleProvider(WestpacRentedFlagNodeRuleProvider impl);
    @Binds
    abstract EstimatedMarketValueNodeRuleProvider provideEstimatedMarketValueNodeRuleProvider(WestpacEstimatedMarketValueNodeRuleProvider impl);
    @Binds
    abstract PropertyTypeNodeRuleProvider providePropertyTypeNodeRuleProvider(WestpacPropertyTypeNodeRuleProvider impl);
    @Binds
    abstract PropertySubTypeNodeRuleProvider providePropertySubTypeNodeRuleProvider(WestpacPropertySubTypeNodeRuleProvider impl);
    @Binds
    abstract PropertyPurseNodeRuleProvider providePropertyPurseNodeRuleProvider(WestpacPropertyPurseNodeRuleProvider impl);
    @Binds
    abstract AccessContactTypeNodeRuleProvider provideAccessContactTypeNodeRuleProvider(WestpacAccessContactTypeNodeRuleProvider impl);
    @Binds
    abstract AccessContactTitleNodeRuleProvider provideAccessContactTitleNodeRuleProvider(WestpacAccessContactTitleNodeRuleProvider impl);
    @Binds
    abstract AccessTelephoneNodeRuleProvider provideAccessTelephoneNodeRuleProvider(WestpacAccessTelephoneNodeRuleProvider impl);
    @Binds
    abstract ProductNodeRuleProvider provideProductNodeRuleProvider(WestpacProductNodeRuleProvider impl);
    @Binds
    abstract ProductGroupNodeRuleProvider provideProductGroupNodeRuleProvider(WestpacProductGroupNodeRuleProvider impl);
    @Binds
    abstract ProductNameNodeRuleProvider provideProductNameNodeRuleProvider(WestpacProductNameNodeRuleProvider impl);
    @Binds
    abstract ProductLoanPrimaryPurposeNodeRuleProvider provideProductLoanPrimaryPurposeNodeRuleProvider(WestpacProductLoanPrimaryPurposeNodeRuleProvider impl);
    @Binds
    abstract ProductLendingPurposeNodeRuleProvider provideProductLendingPurposeNodeRuleProvider(WestpacProductLendingPurposeNodeRuleProvider impl);
    @Binds
    abstract ProductPaymentTypeNodeRuleProvider provideProductPaymentTypeNodeRuleProvider(WestpacProductPaymentTypeNodeRuleProvider impl);
    @Binds
    abstract ContributionTypeNodeRuleProvider provideContributionTypeNodeRuleProvider(WestpacContributionTypeNodeRuleProvider impl);
    @Binds
    abstract ContributionDescriptionNodeRuleProvider provideContributionDescriptionNodeRuleProvider(WestpacContributionDescriptionNodeRuleProvider impl);
    @Binds
    abstract ContributionAmountNodeRuleProvider provideContributionAmountNodeRuleProvider(WestpacContributionAmountNodeRuleProvider impl);
    @Binds
    abstract FeeTypeNodeRuleProvider provideFeeTypeNodeRuleProvider(WestpacFeeTypeNodeRuleProvider impl);
    @Binds
    abstract FeeDescriptionNodeRuleProvider provideFeeDescriptionNodeRuleProvider(WestpacFeeDescriptionNodeRuleProvider impl);
    @Binds
    abstract FeePayFromNodeRuleProvider provideFeePayFromNodeRuleProvider(WestpacFeePayFromNodeRuleProvider impl);
    @Binds
    abstract FeeAmountNodeRuleProvider provideFeeAmountNodeRuleProvider(WestpacFeeAmountNodeRuleProvider impl);
    @Binds
    abstract RelatedPartyNodeRuleProvider provideRelatedPartyNodeRuleProvider(WestpacRelatedPartyNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyTypeNodeRuleProvider provideThirdPartyTypeNodeRuleProvider(WestpacThirdPartyTypeNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyDescriptionNodeRuleProvider provideThirdPartyDescriptionNodeRuleProvider(WestpacThirdPartyDescriptionNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyTitleNodeRuleProvider provideThirdPartyTitleNodeRuleProvider(WestpacThirdPartyTitleNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyFirstNameNodeRuleProvider provideThirdPartyFirstNameNodeRuleProvider(WestpacThirdPartyFirstNameNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyLastNameNodeRuleProvider provideThirdPartyLastNameNodeRuleProvider(WestpacThirdPartyLastNameNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyWorkPhoneNodeRuleProvider provideThirdPartyWorkPhoneNodeRuleProvider(WestpacThirdPartyWorkPhoneNodeRuleProvider impl);
    @Binds
    abstract BrokerFirstNameNodeRuleProvider provideBrokerFirstNameNodeRuleProvider(WestpacBrokerFirstNameNodeRuleProvider impl);
    @Binds
    abstract BrokerLastNameNodeRuleProvider provideBrokerLastNameNodeRuleProvider(WestpacBrokerLastNameNodeRuleProvider impl);
    @Binds
    abstract BrokerCompanyNodeRuleProvider provideBrokerCompanyNodeRuleProvider(WestpacBrokerCompanyNodeRuleProvider impl);
    @Binds
    abstract BrokerTelephoneNodeRuleProvider provideBrokerTelephoneNodeRuleProvider(WestpacBrokerTelephoneNodeRuleProvider impl);
    @Binds
    abstract BrokerEmailNodeRuleProvider provideBrokerEmailNodeRuleProvider(WestpacBrokerEmailNodeRuleProvider impl);
    @Binds
    abstract LenderIssuedBrokerNumberNodeRuleProvider provideLenderIssuedBrokerNumberNodeRuleProvider(WestpacLenderIssuedBrokerNumberNodeRuleProvider impl);
    @Binds
    abstract TelephoneNodeRuleProvider provideTelephoneNodeRuleProvider(WestpacTelephoneNodeRuleProvider impl);
    @Binds
    abstract AddressLineNodeRuleProvider provideAddressLineNodeRuleProvider(WestpacAddressLineNodeRuleProvider impl);
    @Binds
    abstract SuburbNodeRuleProvider provideSuburbNodeRuleProvider(WestpacSuburbNodeRuleProvider impl);
    @Binds
    abstract PostcodeNodeRuleProvider providePostcodeNodeRuleProvider(WestpacPostcodeNodeRuleProvider impl);
    @Binds
    abstract CountryNodeRuleProvider provideCountryNodeRuleProvider(WestpacCountryNodeRuleProvider impl);
    @Binds
    abstract MonthYearNodeRuleProvider provideMonthYearNodeRuleProvider(WestpacMonthYearNodeRuleProvider impl);
    @Binds
    abstract MonthNodeRuleProvider provideMonthNodeRuleProvider(WestpacMonthNodeRuleProvider impl);
    @Binds
    abstract YearNodeRuleProvider provideYearNodeRuleProvider(WestpacYearNodeRuleProvider impl);
    @Binds
    abstract EmailNodeRuleProvider provideEmailNodeRuleProvider(WestpacEmailNodeRuleProvider impl);
    @Binds
    abstract NameNodeRuleProvider provideNameNodeRuleProvider(WestpacNameNodeRuleProvider impl);
    @Binds
    abstract BaseMobileNumberNodeRuleProvider provideBaseMobileNumberNodeRuleProvider(WestpacBaseMobileNumberNodeRuleProvider impl);
    @Binds
    abstract BaseCurrencyNodeRuleProvider provideBaseCurrencyNodeRuleProvider(WestpacBaseCurrencyNodeRuleProvider impl);
    @Binds
    abstract BasePercentageNodeRuleProvider provideBasePercentageNodeRuleProvider(WestpacBasePercentageNodeRuleProvider impl);
    @Binds
    abstract EmploymentTypeNodeRuleProvider provideEmploymentTypeNodeRuleProvider(WestpacEmploymentTypeNodeRuleProvider impl);
    @Binds
    abstract GrossYearlySalaryNodeRuleProvider provideGrossYearlySalaryNodeRuleProvider(WestpacGrossYearlySalaryNodeRuleProvider impl);
    @Binds
    abstract ProfitThisYearNodeRuleProvider provideProfitThisYearNodeRuleProvider(WestpacProfitThisYearNodeRuleProvider impl);
    @Binds
    abstract ProfitPreviousYearNodeRuleProvider provideProfitPreviousYearNodeRuleProvider(WestpacProfitPreviousYearNodeRuleProvider impl);
    @Binds
    abstract EmployedNodeRuleProvider provideEmployedNodeRuleProvider(WestpacEmployedNodeRuleProvider impl);
    @Binds
    abstract EmploymentStatusNodeRuleProvider provideEmploymentStatusNodeRuleProvider(WestpacEmploymentStatusNodeRuleProvider impl);
    @Binds
    abstract OccupationNodeRuleProvider provideOccupationNodeRuleProvider(WestpacOccupationNodeRuleProvider impl);
    @Binds
    abstract EmployerNameNodeRuleProvider provideEmployerNameNodeRuleProvider(WestpacEmployerNameNodeRuleProvider impl);
    @Binds
    abstract EmployerAddressNodeRuleProvider provideEmployerAddressNodeRuleProvider(WestpacEmployerAddressNodeRuleProvider impl);
    @Binds
    abstract EmployerPhoneNodeRuleProvider provideEmployerPhoneNodeRuleProvider(WestpacEmployerPhoneNodeRuleProvider impl);
    @Binds
    abstract EmploymentStartedNodeRuleProvider provideEmploymentStartedNodeRuleProvider(WestpacEmploymentStartedNodeRuleProvider impl);
    @Binds
    abstract EmploymentEndedNodeRuleProvider provideEmploymentEndedNodeRuleProvider(WestpacEmploymentEndedNodeRuleProvider impl);
    @Binds
    abstract UnemployedOnBenefitFlagNodeRuleProvider provideUnemployedOnBenefitFlagNodeRuleProvider(WestpacUnemployedOnBenefitFlagNodeRuleProvider impl);
    @Binds
    abstract StudentFlagNodeRuleProvider provideStudentFlagNodeRuleProvider(WestpacStudentFlagNodeRuleProvider impl);
    @Binds
    abstract StudentTypeNodeRuleProvider provideStudentTypeNodeRuleProvider(WestpacStudentTypeNodeRuleProvider impl);
    @Binds
    abstract HouseDutiesFlagNodeRuleProvider provideHouseDutiesFlagNodeRuleProvider(WestpacHouseDutiesFlagNodeRuleProvider impl);
    @Binds
    abstract UnemployedSinceNodeRuleProvider provideUnemployedSinceNodeRuleProvider(WestpacUnemployedSinceNodeRuleProvider impl);
    @Binds
    abstract RetiredOnBenefitFlagNodeRuleProvider provideRetiredOnBenefitFlagNodeRuleProvider(WestpacRetiredOnBenefitFlagNodeRuleProvider impl);
    @Binds
    abstract RetiredSinceNodeRuleProvider provideRetiredSinceNodeRuleProvider(WestpacRetiredSinceNodeRuleProvider impl);
    @Binds
    abstract YesNoOptionNodeRuleProvider provideYesNoOptionNodeRuleProvider(WestpacYesNoOptionNodeRuleProvider impl);
    @Binds
    abstract BaseCountryNodeRuleProvider provideBaseCountryNodeRuleProvider(WestpacBaseCountryNodeRuleProvider impl);
    @Binds
    abstract DobNodeRuleProvider provideDobNodeRuleProvider(WestpacDobNodeRuleProvider impl);
    @Binds
    abstract SelectRelatedPersonListNodeRuleProvider provideSelectRelatedPersonListNodeRuleProvider(WestpacSelectRelatedPersonListNodeRuleProvider impl);
    @Binds
    abstract SelectAccountHolderListNodeRuleProvider provideSelectAccountHolderListNodeRuleProvider(WestpacSelectAccountHolderListNodeRuleProvider impl);
    @Binds
    abstract OwnershipListNodeRuleProvider provideOwnershipListNodeRuleProvider(WestpacOwnershipListNodeRuleProvider impl);
    @Binds
    abstract OwnershipPercentageNodeRuleProvider provideOwnershipPercentageNodeRuleProvider(WestpacOwnershipPercentageNodeRuleProvider impl);
    @Binds
    abstract ResponsibleSignificantChangeFlagNodeRuleProvider provideResponsibleSignificantChangeFlagNodeRuleProvider(WestpacResponsibleSignificantChangeFlagNodeRuleProvider impl);
    @Binds
    abstract ResponsibleTypeOfChangeNodeRuleProvider provideResponsibleTypeOfChangeNodeRuleProvider(WestpacResponsibleTypeOfChangeNodeRuleProvider impl);
    @Binds
    abstract ResponsibleMitigationMethodNodeRuleProvider provideResponsibleMitigationMethodNodeRuleProvider(WestpacResponsibleMitigationMethodNodeRuleProvider impl);
    @Binds
    abstract ResponsibleRepaymentDifficultyNodeRuleProvider provideResponsibleRepaymentDifficultyNodeRuleProvider(WestpacResponsibleRepaymentDifficultyNodeRuleProvider impl);
    @Binds
    abstract BaseOtherIncomeListNodeRuleProvider provideBaseOtherIncomeListNodeRuleProvider(WestpacBaseOtherIncomeListNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeTypeNodeRuleProvider provideOtherIncomeTypeNodeRuleProvider(WestpacOtherIncomeTypeNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeAddBackTypeNodeRuleProvider provideOtherIncomeAddBackTypeNodeRuleProvider(WestpacOtherIncomeAddBackTypeNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeAmountNodeRuleProvider provideOtherIncomeAmountNodeRuleProvider(WestpacOtherIncomeAmountNodeRuleProvider impl);
    @Binds
    abstract CreditCheckFlagNodeRuleProvider provideCreditCheckFlagNodeRuleProvider(WestpacCreditCheckFlagNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyDisclosureFlagNodeRuleProvider provideThirdPartyDisclosureFlagNodeRuleProvider(WestpacThirdPartyDisclosureFlagNodeRuleProvider impl);
    @Binds
    abstract LegalActionNodeRuleProvider provideLegalActionNodeRuleProvider(WestpacLegalActionNodeRuleProvider impl);
    @Binds
    abstract TrustTypeNodeRuleProvider provideTrustTypeNodeRuleProvider(WestpacTrustTypeNodeRuleProvider impl);
    @Binds
    abstract TrustCountryNodeRuleProvider provideTrustCountryNodeRuleProvider(WestpacTrustCountryNodeRuleProvider impl);
    @Binds
    abstract BaseApplicantTypeNodeRuleProvider provideBaseApplicantTypeNodeRuleProvider(WestpacBaseApplicantTypeNodeRuleProvider impl);

}
