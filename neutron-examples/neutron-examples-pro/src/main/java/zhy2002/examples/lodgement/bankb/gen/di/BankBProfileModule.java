package zhy2002.examples.lodgement.bankb.gen.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.rule.*;

@Module(includes = {ManifestModule.class})
public abstract class BankBProfileModule {

    @Binds
    abstract ApplicationNodeRuleProvider provideApplicationNodeRuleProvider(BankBApplicationNodeRuleProvider impl);
    @Binds
    abstract PersonListNodeRuleProvider providePersonListNodeRuleProvider(BankBPersonListNodeRuleProvider impl);
    @Binds
    abstract TitleNodeRuleProvider provideTitleNodeRuleProvider(BankBTitleNodeRuleProvider impl);
    @Binds
    abstract FirstNameNodeRuleProvider provideFirstNameNodeRuleProvider(BankBFirstNameNodeRuleProvider impl);
    @Binds
    abstract LastNameNodeRuleProvider provideLastNameNodeRuleProvider(BankBLastNameNodeRuleProvider impl);
    @Binds
    abstract GenderNodeRuleProvider provideGenderNodeRuleProvider(BankBGenderNodeRuleProvider impl);
    @Binds
    abstract DateOfBirthNodeRuleProvider provideDateOfBirthNodeRuleProvider(BankBDateOfBirthNodeRuleProvider impl);
    @Binds
    abstract PrimaryApplicantFlagNodeRuleProvider providePrimaryApplicantFlagNodeRuleProvider(BankBPrimaryApplicantFlagNodeRuleProvider impl);
    @Binds
    abstract DriversLicenseNodeRuleProvider provideDriversLicenseNodeRuleProvider(BankBDriversLicenseNodeRuleProvider impl);
    @Binds
    abstract ApplicationTypeNodeRuleProvider provideApplicationTypeNodeRuleProvider(BankBApplicationTypeNodeRuleProvider impl);
    @Binds
    abstract MaritalStatusNodeRuleProvider provideMaritalStatusNodeRuleProvider(BankBMaritalStatusNodeRuleProvider impl);
    @Binds
    abstract FirstHomeBuyerFlagNodeRuleProvider provideFirstHomeBuyerFlagNodeRuleProvider(BankBFirstHomeBuyerFlagNodeRuleProvider impl);
    @Binds
    abstract HousingStatusNodeRuleProvider provideHousingStatusNodeRuleProvider(BankBHousingStatusNodeRuleProvider impl);
    @Binds
    abstract PersonContactNodeRuleProvider providePersonContactNodeRuleProvider(BankBPersonContactNodeRuleProvider impl);
    @Binds
    abstract PersonTelephoneNodeRuleProvider providePersonTelephoneNodeRuleProvider(BankBPersonTelephoneNodeRuleProvider impl);
    @Binds
    abstract PersonEmailNodeRuleProvider providePersonEmailNodeRuleProvider(BankBPersonEmailNodeRuleProvider impl);
    @Binds
    abstract MovedToCurrentAddressNodeRuleProvider provideMovedToCurrentAddressNodeRuleProvider(BankBMovedToCurrentAddressNodeRuleProvider impl);
    @Binds
    abstract MovedFromPreviousAddressNodeRuleProvider provideMovedFromPreviousAddressNodeRuleProvider(BankBMovedFromPreviousAddressNodeRuleProvider impl);
    @Binds
    abstract CurrentEmploymentListNodeRuleProvider provideCurrentEmploymentListNodeRuleProvider(BankBCurrentEmploymentListNodeRuleProvider impl);
    @Binds
    abstract CurrentEmploymentNodeRuleProvider provideCurrentEmploymentNodeRuleProvider(BankBCurrentEmploymentNodeRuleProvider impl);
    @Binds
    abstract PreviousEmploymentListNodeRuleProvider providePreviousEmploymentListNodeRuleProvider(BankBPreviousEmploymentListNodeRuleProvider impl);
    @Binds
    abstract PreviousEmploymentNodeRuleProvider providePreviousEmploymentNodeRuleProvider(BankBPreviousEmploymentNodeRuleProvider impl);
    @Binds
    abstract CompanyApplicationTypeNodeRuleProvider provideCompanyApplicationTypeNodeRuleProvider(BankBCompanyApplicationTypeNodeRuleProvider impl);
    @Binds
    abstract CompanyRegisteredNameNodeRuleProvider provideCompanyRegisteredNameNodeRuleProvider(BankBCompanyRegisteredNameNodeRuleProvider impl);
    @Binds
    abstract CompanyDescriptionNodeRuleProvider provideCompanyDescriptionNodeRuleProvider(BankBCompanyDescriptionNodeRuleProvider impl);
    @Binds
    abstract CompanyIndustryNodeRuleProvider provideCompanyIndustryNodeRuleProvider(BankBCompanyIndustryNodeRuleProvider impl);
    @Binds
    abstract CompanyAcnNodeRuleProvider provideCompanyAcnNodeRuleProvider(BankBCompanyAcnNodeRuleProvider impl);
    @Binds
    abstract CompanyRegistrationDateNodeRuleProvider provideCompanyRegistrationDateNodeRuleProvider(BankBCompanyRegistrationDateNodeRuleProvider impl);
    @Binds
    abstract CompanyRegistrationStateNodeRuleProvider provideCompanyRegistrationStateNodeRuleProvider(BankBCompanyRegistrationStateNodeRuleProvider impl);
    @Binds
    abstract FinancialPositionNodeRuleProvider provideFinancialPositionNodeRuleProvider(BankBFinancialPositionNodeRuleProvider impl);
    @Binds
    abstract SavingsTypeNodeRuleProvider provideSavingsTypeNodeRuleProvider(BankBSavingsTypeNodeRuleProvider impl);
    @Binds
    abstract SavingsBalanceNodeRuleProvider provideSavingsBalanceNodeRuleProvider(BankBSavingsBalanceNodeRuleProvider impl);
    @Binds
    abstract SavingsAccountNameNodeRuleProvider provideSavingsAccountNameNodeRuleProvider(BankBSavingsAccountNameNodeRuleProvider impl);
    @Binds
    abstract VehicleModelNodeRuleProvider provideVehicleModelNodeRuleProvider(BankBVehicleModelNodeRuleProvider impl);
    @Binds
    abstract VehicleYearNodeRuleProvider provideVehicleYearNodeRuleProvider(BankBVehicleYearNodeRuleProvider impl);
    @Binds
    abstract VehicleMarketValueNodeRuleProvider provideVehicleMarketValueNodeRuleProvider(BankBVehicleMarketValueNodeRuleProvider impl);
    @Binds
    abstract OtherAssetTypeNodeRuleProvider provideOtherAssetTypeNodeRuleProvider(BankBOtherAssetTypeNodeRuleProvider impl);
    @Binds
    abstract OtherAssetMarketValueNodeRuleProvider provideOtherAssetMarketValueNodeRuleProvider(BankBOtherAssetMarketValueNodeRuleProvider impl);
    @Binds
    abstract CreditCardTypeNodeRuleProvider provideCreditCardTypeNodeRuleProvider(BankBCreditCardTypeNodeRuleProvider impl);
    @Binds
    abstract CreditCardAmountOwingNodeRuleProvider provideCreditCardAmountOwingNodeRuleProvider(BankBCreditCardAmountOwingNodeRuleProvider impl);
    @Binds
    abstract CreditCardLimitAmountNodeRuleProvider provideCreditCardLimitAmountNodeRuleProvider(BankBCreditCardLimitAmountNodeRuleProvider impl);
    @Binds
    abstract CreditCardMonthlyRepaymentNodeRuleProvider provideCreditCardMonthlyRepaymentNodeRuleProvider(BankBCreditCardMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract CreditCardClearingFlagNodeRuleProvider provideCreditCardClearingFlagNodeRuleProvider(BankBCreditCardClearingFlagNodeRuleProvider impl);
    @Binds
    abstract CreditCardBreakCostNodeRuleProvider provideCreditCardBreakCostNodeRuleProvider(BankBCreditCardBreakCostNodeRuleProvider impl);
    @Binds
    abstract CreditCardOwnershipListNodeRuleProvider provideCreditCardOwnershipListNodeRuleProvider(BankBCreditCardOwnershipListNodeRuleProvider impl);
    @Binds
    abstract LoanTypeNodeRuleProvider provideLoanTypeNodeRuleProvider(BankBLoanTypeNodeRuleProvider impl);
    @Binds
    abstract LoanOwingAmountNodeRuleProvider provideLoanOwingAmountNodeRuleProvider(BankBLoanOwingAmountNodeRuleProvider impl);
    @Binds
    abstract LoanLimitAmountNodeRuleProvider provideLoanLimitAmountNodeRuleProvider(BankBLoanLimitAmountNodeRuleProvider impl);
    @Binds
    abstract LoanMonthlyRepaymentNodeRuleProvider provideLoanMonthlyRepaymentNodeRuleProvider(BankBLoanMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract LoanClearingFlagNodeRuleProvider provideLoanClearingFlagNodeRuleProvider(BankBLoanClearingFlagNodeRuleProvider impl);
    @Binds
    abstract LoanBreakCostNodeRuleProvider provideLoanBreakCostNodeRuleProvider(BankBLoanBreakCostNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityTypeNodeRuleProvider provideOtherLiabilityTypeNodeRuleProvider(BankBOtherLiabilityTypeNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityLimitAmountNodeRuleProvider provideOtherLiabilityLimitAmountNodeRuleProvider(BankBOtherLiabilityLimitAmountNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityAmountOwningNodeRuleProvider provideOtherLiabilityAmountOwningNodeRuleProvider(BankBOtherLiabilityAmountOwningNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityMonthlyRepaymentNodeRuleProvider provideOtherLiabilityMonthlyRepaymentNodeRuleProvider(BankBOtherLiabilityMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityClearingFlagNodeRuleProvider provideOtherLiabilityClearingFlagNodeRuleProvider(BankBOtherLiabilityClearingFlagNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityBreakCostNodeRuleProvider provideOtherLiabilityBreakCostNodeRuleProvider(BankBOtherLiabilityBreakCostNodeRuleProvider impl);
    @Binds
    abstract ExpenseTypeNodeRuleProvider provideExpenseTypeNodeRuleProvider(BankBExpenseTypeNodeRuleProvider impl);
    @Binds
    abstract ExpenseMonthlyRepaymentNodeRuleProvider provideExpenseMonthlyRepaymentNodeRuleProvider(BankBExpenseMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract TotalAssetNodeRuleProvider provideTotalAssetNodeRuleProvider(BankBTotalAssetNodeRuleProvider impl);
    @Binds
    abstract TotalLiabilityNodeRuleProvider provideTotalLiabilityNodeRuleProvider(BankBTotalLiabilityNodeRuleProvider impl);
    @Binds
    abstract TotalExpenseNodeRuleProvider provideTotalExpenseNodeRuleProvider(BankBTotalExpenseNodeRuleProvider impl);
    @Binds
    abstract RealEstateListNodeRuleProvider provideRealEstateListNodeRuleProvider(BankBRealEstateListNodeRuleProvider impl);
    @Binds
    abstract RealEstateNodeRuleProvider provideRealEstateNodeRuleProvider(BankBRealEstateNodeRuleProvider impl);
    @Binds
    abstract UsedAsSecurityFlagNodeRuleProvider provideUsedAsSecurityFlagNodeRuleProvider(BankBUsedAsSecurityFlagNodeRuleProvider impl);
    @Binds
    abstract BeingPurchasedFlagNodeRuleProvider provideBeingPurchasedFlagNodeRuleProvider(BankBBeingPurchasedFlagNodeRuleProvider impl);
    @Binds
    abstract OwnedOutrightFlagNodeRuleProvider provideOwnedOutrightFlagNodeRuleProvider(BankBOwnedOutrightFlagNodeRuleProvider impl);
    @Binds
    abstract PrimarySecurityFlagNodeRuleProvider providePrimarySecurityFlagNodeRuleProvider(BankBPrimarySecurityFlagNodeRuleProvider impl);
    @Binds
    abstract ApprovalInPrincipleFlagNodeRuleProvider provideApprovalInPrincipleFlagNodeRuleProvider(BankBApprovalInPrincipleFlagNodeRuleProvider impl);
    @Binds
    abstract MortgqageUnpaidBalanceNodeRuleProvider provideMortgqageUnpaidBalanceNodeRuleProvider(BankBMortgqageUnpaidBalanceNodeRuleProvider impl);
    @Binds
    abstract MortgageLimitAmountNodeRuleProvider provideMortgageLimitAmountNodeRuleProvider(BankBMortgageLimitAmountNodeRuleProvider impl);
    @Binds
    abstract MortgageMonthlyRepaymentNodeRuleProvider provideMortgageMonthlyRepaymentNodeRuleProvider(BankBMortgageMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract MortgageBorrowerRateNodeRuleProvider provideMortgageBorrowerRateNodeRuleProvider(BankBMortgageBorrowerRateNodeRuleProvider impl);
    @Binds
    abstract MortgageLoanTypeNodeRuleProvider provideMortgageLoanTypeNodeRuleProvider(BankBMortgageLoanTypeNodeRuleProvider impl);
    @Binds
    abstract MortgageLoanTermExpiryDateNodeRuleProvider provideMortgageLoanTermExpiryDateNodeRuleProvider(BankBMortgageLoanTermExpiryDateNodeRuleProvider impl);
    @Binds
    abstract MortgageInterestOnlyExpiryDateNodeRuleProvider provideMortgageInterestOnlyExpiryDateNodeRuleProvider(BankBMortgageInterestOnlyExpiryDateNodeRuleProvider impl);
    @Binds
    abstract MortgageClearingFlagNodeRuleProvider provideMortgageClearingFlagNodeRuleProvider(BankBMortgageClearingFlagNodeRuleProvider impl);
    @Binds
    abstract MortgageChargePositionNodeRuleProvider provideMortgageChargePositionNodeRuleProvider(BankBMortgageChargePositionNodeRuleProvider impl);
    @Binds
    abstract MortgageTermRemainingPeriodNodeRuleProvider provideMortgageTermRemainingPeriodNodeRuleProvider(BankBMortgageTermRemainingPeriodNodeRuleProvider impl);
    @Binds
    abstract MortgageInterestOnlyRemainingPeriodNodeRuleProvider provideMortgageInterestOnlyRemainingPeriodNodeRuleProvider(BankBMortgageInterestOnlyRemainingPeriodNodeRuleProvider impl);
    @Binds
    abstract RentedFlagNodeRuleProvider provideRentedFlagNodeRuleProvider(BankBRentedFlagNodeRuleProvider impl);
    @Binds
    abstract EstimatedMarketValueNodeRuleProvider provideEstimatedMarketValueNodeRuleProvider(BankBEstimatedMarketValueNodeRuleProvider impl);
    @Binds
    abstract PropertyTypeNodeRuleProvider providePropertyTypeNodeRuleProvider(BankBPropertyTypeNodeRuleProvider impl);
    @Binds
    abstract PropertySubTypeNodeRuleProvider providePropertySubTypeNodeRuleProvider(BankBPropertySubTypeNodeRuleProvider impl);
    @Binds
    abstract PropertyPurseNodeRuleProvider providePropertyPurseNodeRuleProvider(BankBPropertyPurseNodeRuleProvider impl);
    @Binds
    abstract AccessContactTypeNodeRuleProvider provideAccessContactTypeNodeRuleProvider(BankBAccessContactTypeNodeRuleProvider impl);
    @Binds
    abstract AccessContactTitleNodeRuleProvider provideAccessContactTitleNodeRuleProvider(BankBAccessContactTitleNodeRuleProvider impl);
    @Binds
    abstract AccessTelephoneNodeRuleProvider provideAccessTelephoneNodeRuleProvider(BankBAccessTelephoneNodeRuleProvider impl);
    @Binds
    abstract ProductNodeRuleProvider provideProductNodeRuleProvider(BankBProductNodeRuleProvider impl);
    @Binds
    abstract ProductGroupNodeRuleProvider provideProductGroupNodeRuleProvider(BankBProductGroupNodeRuleProvider impl);
    @Binds
    abstract ProductNameNodeRuleProvider provideProductNameNodeRuleProvider(BankBProductNameNodeRuleProvider impl);
    @Binds
    abstract ProductLoanPrimaryPurposeNodeRuleProvider provideProductLoanPrimaryPurposeNodeRuleProvider(BankBProductLoanPrimaryPurposeNodeRuleProvider impl);
    @Binds
    abstract ProductLendingPurposeNodeRuleProvider provideProductLendingPurposeNodeRuleProvider(BankBProductLendingPurposeNodeRuleProvider impl);
    @Binds
    abstract ProductPaymentTypeNodeRuleProvider provideProductPaymentTypeNodeRuleProvider(BankBProductPaymentTypeNodeRuleProvider impl);
    @Binds
    abstract ContributionTypeNodeRuleProvider provideContributionTypeNodeRuleProvider(BankBContributionTypeNodeRuleProvider impl);
    @Binds
    abstract ContributionDescriptionNodeRuleProvider provideContributionDescriptionNodeRuleProvider(BankBContributionDescriptionNodeRuleProvider impl);
    @Binds
    abstract ContributionAmountNodeRuleProvider provideContributionAmountNodeRuleProvider(BankBContributionAmountNodeRuleProvider impl);
    @Binds
    abstract FeeTypeNodeRuleProvider provideFeeTypeNodeRuleProvider(BankBFeeTypeNodeRuleProvider impl);
    @Binds
    abstract FeeDescriptionNodeRuleProvider provideFeeDescriptionNodeRuleProvider(BankBFeeDescriptionNodeRuleProvider impl);
    @Binds
    abstract FeePayFromNodeRuleProvider provideFeePayFromNodeRuleProvider(BankBFeePayFromNodeRuleProvider impl);
    @Binds
    abstract FeeAmountNodeRuleProvider provideFeeAmountNodeRuleProvider(BankBFeeAmountNodeRuleProvider impl);
    @Binds
    abstract RelatedPartyNodeRuleProvider provideRelatedPartyNodeRuleProvider(BankBRelatedPartyNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyTypeNodeRuleProvider provideThirdPartyTypeNodeRuleProvider(BankBThirdPartyTypeNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyDescriptionNodeRuleProvider provideThirdPartyDescriptionNodeRuleProvider(BankBThirdPartyDescriptionNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyTitleNodeRuleProvider provideThirdPartyTitleNodeRuleProvider(BankBThirdPartyTitleNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyFirstNameNodeRuleProvider provideThirdPartyFirstNameNodeRuleProvider(BankBThirdPartyFirstNameNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyLastNameNodeRuleProvider provideThirdPartyLastNameNodeRuleProvider(BankBThirdPartyLastNameNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyWorkPhoneNodeRuleProvider provideThirdPartyWorkPhoneNodeRuleProvider(BankBThirdPartyWorkPhoneNodeRuleProvider impl);
    @Binds
    abstract BrokerFirstNameNodeRuleProvider provideBrokerFirstNameNodeRuleProvider(BankBBrokerFirstNameNodeRuleProvider impl);
    @Binds
    abstract BrokerLastNameNodeRuleProvider provideBrokerLastNameNodeRuleProvider(BankBBrokerLastNameNodeRuleProvider impl);
    @Binds
    abstract BrokerCompanyNodeRuleProvider provideBrokerCompanyNodeRuleProvider(BankBBrokerCompanyNodeRuleProvider impl);
    @Binds
    abstract BrokerTelephoneNodeRuleProvider provideBrokerTelephoneNodeRuleProvider(BankBBrokerTelephoneNodeRuleProvider impl);
    @Binds
    abstract BrokerEmailNodeRuleProvider provideBrokerEmailNodeRuleProvider(BankBBrokerEmailNodeRuleProvider impl);
    @Binds
    abstract LenderIssuedBrokerNumberNodeRuleProvider provideLenderIssuedBrokerNumberNodeRuleProvider(BankBLenderIssuedBrokerNumberNodeRuleProvider impl);
    @Binds
    abstract TelephoneNodeRuleProvider provideTelephoneNodeRuleProvider(BankBTelephoneNodeRuleProvider impl);
    @Binds
    abstract AddressLineNodeRuleProvider provideAddressLineNodeRuleProvider(BankBAddressLineNodeRuleProvider impl);
    @Binds
    abstract SuburbNodeRuleProvider provideSuburbNodeRuleProvider(BankBSuburbNodeRuleProvider impl);
    @Binds
    abstract PostcodeNodeRuleProvider providePostcodeNodeRuleProvider(BankBPostcodeNodeRuleProvider impl);
    @Binds
    abstract CountryNodeRuleProvider provideCountryNodeRuleProvider(BankBCountryNodeRuleProvider impl);
    @Binds
    abstract MonthYearNodeRuleProvider provideMonthYearNodeRuleProvider(BankBMonthYearNodeRuleProvider impl);
    @Binds
    abstract MonthNodeRuleProvider provideMonthNodeRuleProvider(BankBMonthNodeRuleProvider impl);
    @Binds
    abstract YearNodeRuleProvider provideYearNodeRuleProvider(BankBYearNodeRuleProvider impl);
    @Binds
    abstract EmailNodeRuleProvider provideEmailNodeRuleProvider(BankBEmailNodeRuleProvider impl);
    @Binds
    abstract NameNodeRuleProvider provideNameNodeRuleProvider(BankBNameNodeRuleProvider impl);
    @Binds
    abstract BaseMobileNumberNodeRuleProvider provideBaseMobileNumberNodeRuleProvider(BankBBaseMobileNumberNodeRuleProvider impl);
    @Binds
    abstract BaseCurrencyNodeRuleProvider provideBaseCurrencyNodeRuleProvider(BankBBaseCurrencyNodeRuleProvider impl);
    @Binds
    abstract BasePercentageNodeRuleProvider provideBasePercentageNodeRuleProvider(BankBBasePercentageNodeRuleProvider impl);
    @Binds
    abstract EmploymentTypeNodeRuleProvider provideEmploymentTypeNodeRuleProvider(BankBEmploymentTypeNodeRuleProvider impl);
    @Binds
    abstract GrossYearlySalaryNodeRuleProvider provideGrossYearlySalaryNodeRuleProvider(BankBGrossYearlySalaryNodeRuleProvider impl);
    @Binds
    abstract ProfitThisYearNodeRuleProvider provideProfitThisYearNodeRuleProvider(BankBProfitThisYearNodeRuleProvider impl);
    @Binds
    abstract ProfitPreviousYearNodeRuleProvider provideProfitPreviousYearNodeRuleProvider(BankBProfitPreviousYearNodeRuleProvider impl);
    @Binds
    abstract EmployedNodeRuleProvider provideEmployedNodeRuleProvider(BankBEmployedNodeRuleProvider impl);
    @Binds
    abstract EmploymentStatusNodeRuleProvider provideEmploymentStatusNodeRuleProvider(BankBEmploymentStatusNodeRuleProvider impl);
    @Binds
    abstract OccupationNodeRuleProvider provideOccupationNodeRuleProvider(BankBOccupationNodeRuleProvider impl);
    @Binds
    abstract EmployerNameNodeRuleProvider provideEmployerNameNodeRuleProvider(BankBEmployerNameNodeRuleProvider impl);
    @Binds
    abstract EmployerAddressNodeRuleProvider provideEmployerAddressNodeRuleProvider(BankBEmployerAddressNodeRuleProvider impl);
    @Binds
    abstract EmployerPhoneNodeRuleProvider provideEmployerPhoneNodeRuleProvider(BankBEmployerPhoneNodeRuleProvider impl);
    @Binds
    abstract EmploymentStartedNodeRuleProvider provideEmploymentStartedNodeRuleProvider(BankBEmploymentStartedNodeRuleProvider impl);
    @Binds
    abstract EmploymentEndedNodeRuleProvider provideEmploymentEndedNodeRuleProvider(BankBEmploymentEndedNodeRuleProvider impl);
    @Binds
    abstract UnemployedOnBenefitFlagNodeRuleProvider provideUnemployedOnBenefitFlagNodeRuleProvider(BankBUnemployedOnBenefitFlagNodeRuleProvider impl);
    @Binds
    abstract StudentFlagNodeRuleProvider provideStudentFlagNodeRuleProvider(BankBStudentFlagNodeRuleProvider impl);
    @Binds
    abstract StudentTypeNodeRuleProvider provideStudentTypeNodeRuleProvider(BankBStudentTypeNodeRuleProvider impl);
    @Binds
    abstract HouseDutiesFlagNodeRuleProvider provideHouseDutiesFlagNodeRuleProvider(BankBHouseDutiesFlagNodeRuleProvider impl);
    @Binds
    abstract UnemployedSinceNodeRuleProvider provideUnemployedSinceNodeRuleProvider(BankBUnemployedSinceNodeRuleProvider impl);
    @Binds
    abstract RetiredOnBenefitFlagNodeRuleProvider provideRetiredOnBenefitFlagNodeRuleProvider(BankBRetiredOnBenefitFlagNodeRuleProvider impl);
    @Binds
    abstract RetiredSinceNodeRuleProvider provideRetiredSinceNodeRuleProvider(BankBRetiredSinceNodeRuleProvider impl);
    @Binds
    abstract YesNoOptionNodeRuleProvider provideYesNoOptionNodeRuleProvider(BankBYesNoOptionNodeRuleProvider impl);
    @Binds
    abstract BaseCountryNodeRuleProvider provideBaseCountryNodeRuleProvider(BankBBaseCountryNodeRuleProvider impl);
    @Binds
    abstract DobNodeRuleProvider provideDobNodeRuleProvider(BankBDobNodeRuleProvider impl);
    @Binds
    abstract SelectRelatedPersonListNodeRuleProvider provideSelectRelatedPersonListNodeRuleProvider(BankBSelectRelatedPersonListNodeRuleProvider impl);
    @Binds
    abstract SelectAccountHolderListNodeRuleProvider provideSelectAccountHolderListNodeRuleProvider(BankBSelectAccountHolderListNodeRuleProvider impl);
    @Binds
    abstract OwnershipListNodeRuleProvider provideOwnershipListNodeRuleProvider(BankBOwnershipListNodeRuleProvider impl);
    @Binds
    abstract OwnershipPercentageNodeRuleProvider provideOwnershipPercentageNodeRuleProvider(BankBOwnershipPercentageNodeRuleProvider impl);
    @Binds
    abstract ResponsibleSignificantChangeFlagNodeRuleProvider provideResponsibleSignificantChangeFlagNodeRuleProvider(BankBResponsibleSignificantChangeFlagNodeRuleProvider impl);
    @Binds
    abstract ResponsibleTypeOfChangeNodeRuleProvider provideResponsibleTypeOfChangeNodeRuleProvider(BankBResponsibleTypeOfChangeNodeRuleProvider impl);
    @Binds
    abstract ResponsibleMitigationMethodNodeRuleProvider provideResponsibleMitigationMethodNodeRuleProvider(BankBResponsibleMitigationMethodNodeRuleProvider impl);
    @Binds
    abstract ResponsibleRepaymentDifficultyNodeRuleProvider provideResponsibleRepaymentDifficultyNodeRuleProvider(BankBResponsibleRepaymentDifficultyNodeRuleProvider impl);
    @Binds
    abstract BaseOtherIncomeListNodeRuleProvider provideBaseOtherIncomeListNodeRuleProvider(BankBBaseOtherIncomeListNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeTypeNodeRuleProvider provideOtherIncomeTypeNodeRuleProvider(BankBOtherIncomeTypeNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeAddBackTypeNodeRuleProvider provideOtherIncomeAddBackTypeNodeRuleProvider(BankBOtherIncomeAddBackTypeNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeAmountNodeRuleProvider provideOtherIncomeAmountNodeRuleProvider(BankBOtherIncomeAmountNodeRuleProvider impl);
    @Binds
    abstract CreditCheckFlagNodeRuleProvider provideCreditCheckFlagNodeRuleProvider(BankBCreditCheckFlagNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyDisclosureFlagNodeRuleProvider provideThirdPartyDisclosureFlagNodeRuleProvider(BankBThirdPartyDisclosureFlagNodeRuleProvider impl);
    @Binds
    abstract LegalActionNodeRuleProvider provideLegalActionNodeRuleProvider(BankBLegalActionNodeRuleProvider impl);
    @Binds
    abstract TrustTypeNodeRuleProvider provideTrustTypeNodeRuleProvider(BankBTrustTypeNodeRuleProvider impl);
    @Binds
    abstract TrustCountryNodeRuleProvider provideTrustCountryNodeRuleProvider(BankBTrustCountryNodeRuleProvider impl);
    @Binds
    abstract BaseApplicantTypeNodeRuleProvider provideBaseApplicantTypeNodeRuleProvider(BankBBaseApplicantTypeNodeRuleProvider impl);

}
