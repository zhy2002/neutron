package zhy2002.examples.lodgement.anz.gen.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.rule.*;

@Module(includes = {ManifestModule.class})
public abstract class AnzProfileModule {

    @Binds
    abstract ApplicationNodeRuleProvider provideApplicationNodeRuleProvider(AnzApplicationNodeRuleProvider impl);
    @Binds
    abstract PersonListNodeRuleProvider providePersonListNodeRuleProvider(AnzPersonListNodeRuleProvider impl);
    @Binds
    abstract TitleNodeRuleProvider provideTitleNodeRuleProvider(AnzTitleNodeRuleProvider impl);
    @Binds
    abstract FirstNameNodeRuleProvider provideFirstNameNodeRuleProvider(AnzFirstNameNodeRuleProvider impl);
    @Binds
    abstract LastNameNodeRuleProvider provideLastNameNodeRuleProvider(AnzLastNameNodeRuleProvider impl);
    @Binds
    abstract GenderNodeRuleProvider provideGenderNodeRuleProvider(AnzGenderNodeRuleProvider impl);
    @Binds
    abstract DateOfBirthNodeRuleProvider provideDateOfBirthNodeRuleProvider(AnzDateOfBirthNodeRuleProvider impl);
    @Binds
    abstract PrimaryApplicantFlagNodeRuleProvider providePrimaryApplicantFlagNodeRuleProvider(AnzPrimaryApplicantFlagNodeRuleProvider impl);
    @Binds
    abstract DriversLicenseNodeRuleProvider provideDriversLicenseNodeRuleProvider(AnzDriversLicenseNodeRuleProvider impl);
    @Binds
    abstract ApplicationTypeNodeRuleProvider provideApplicationTypeNodeRuleProvider(AnzApplicationTypeNodeRuleProvider impl);
    @Binds
    abstract MaritalStatusNodeRuleProvider provideMaritalStatusNodeRuleProvider(AnzMaritalStatusNodeRuleProvider impl);
    @Binds
    abstract FirstHomeBuyerFlagNodeRuleProvider provideFirstHomeBuyerFlagNodeRuleProvider(AnzFirstHomeBuyerFlagNodeRuleProvider impl);
    @Binds
    abstract HousingStatusNodeRuleProvider provideHousingStatusNodeRuleProvider(AnzHousingStatusNodeRuleProvider impl);
    @Binds
    abstract PersonContactNodeRuleProvider providePersonContactNodeRuleProvider(AnzPersonContactNodeRuleProvider impl);
    @Binds
    abstract PersonTelephoneNodeRuleProvider providePersonTelephoneNodeRuleProvider(AnzPersonTelephoneNodeRuleProvider impl);
    @Binds
    abstract PersonEmailNodeRuleProvider providePersonEmailNodeRuleProvider(AnzPersonEmailNodeRuleProvider impl);
    @Binds
    abstract MovedToCurrentAddressNodeRuleProvider provideMovedToCurrentAddressNodeRuleProvider(AnzMovedToCurrentAddressNodeRuleProvider impl);
    @Binds
    abstract MovedFromPreviousAddressNodeRuleProvider provideMovedFromPreviousAddressNodeRuleProvider(AnzMovedFromPreviousAddressNodeRuleProvider impl);
    @Binds
    abstract CurrentEmploymentListNodeRuleProvider provideCurrentEmploymentListNodeRuleProvider(AnzCurrentEmploymentListNodeRuleProvider impl);
    @Binds
    abstract CurrentEmploymentNodeRuleProvider provideCurrentEmploymentNodeRuleProvider(AnzCurrentEmploymentNodeRuleProvider impl);
    @Binds
    abstract PreviousEmploymentListNodeRuleProvider providePreviousEmploymentListNodeRuleProvider(AnzPreviousEmploymentListNodeRuleProvider impl);
    @Binds
    abstract PreviousEmploymentNodeRuleProvider providePreviousEmploymentNodeRuleProvider(AnzPreviousEmploymentNodeRuleProvider impl);
    @Binds
    abstract CompanyApplicationTypeNodeRuleProvider provideCompanyApplicationTypeNodeRuleProvider(AnzCompanyApplicationTypeNodeRuleProvider impl);
    @Binds
    abstract CompanyRegisteredNameNodeRuleProvider provideCompanyRegisteredNameNodeRuleProvider(AnzCompanyRegisteredNameNodeRuleProvider impl);
    @Binds
    abstract CompanyDescriptionNodeRuleProvider provideCompanyDescriptionNodeRuleProvider(AnzCompanyDescriptionNodeRuleProvider impl);
    @Binds
    abstract CompanyIndustryNodeRuleProvider provideCompanyIndustryNodeRuleProvider(AnzCompanyIndustryNodeRuleProvider impl);
    @Binds
    abstract CompanyAcnNodeRuleProvider provideCompanyAcnNodeRuleProvider(AnzCompanyAcnNodeRuleProvider impl);
    @Binds
    abstract CompanyRegistrationDateNodeRuleProvider provideCompanyRegistrationDateNodeRuleProvider(AnzCompanyRegistrationDateNodeRuleProvider impl);
    @Binds
    abstract CompanyRegistrationStateNodeRuleProvider provideCompanyRegistrationStateNodeRuleProvider(AnzCompanyRegistrationStateNodeRuleProvider impl);
    @Binds
    abstract FinancialPositionNodeRuleProvider provideFinancialPositionNodeRuleProvider(AnzFinancialPositionNodeRuleProvider impl);
    @Binds
    abstract SavingsTypeNodeRuleProvider provideSavingsTypeNodeRuleProvider(AnzSavingsTypeNodeRuleProvider impl);
    @Binds
    abstract SavingsBalanceNodeRuleProvider provideSavingsBalanceNodeRuleProvider(AnzSavingsBalanceNodeRuleProvider impl);
    @Binds
    abstract SavingsAccountNameNodeRuleProvider provideSavingsAccountNameNodeRuleProvider(AnzSavingsAccountNameNodeRuleProvider impl);
    @Binds
    abstract VehicleModelNodeRuleProvider provideVehicleModelNodeRuleProvider(AnzVehicleModelNodeRuleProvider impl);
    @Binds
    abstract VehicleYearNodeRuleProvider provideVehicleYearNodeRuleProvider(AnzVehicleYearNodeRuleProvider impl);
    @Binds
    abstract VehicleMarketValueNodeRuleProvider provideVehicleMarketValueNodeRuleProvider(AnzVehicleMarketValueNodeRuleProvider impl);
    @Binds
    abstract OtherAssetTypeNodeRuleProvider provideOtherAssetTypeNodeRuleProvider(AnzOtherAssetTypeNodeRuleProvider impl);
    @Binds
    abstract OtherAssetMarketValueNodeRuleProvider provideOtherAssetMarketValueNodeRuleProvider(AnzOtherAssetMarketValueNodeRuleProvider impl);
    @Binds
    abstract CreditCardTypeNodeRuleProvider provideCreditCardTypeNodeRuleProvider(AnzCreditCardTypeNodeRuleProvider impl);
    @Binds
    abstract CreditCardAmountOwingNodeRuleProvider provideCreditCardAmountOwingNodeRuleProvider(AnzCreditCardAmountOwingNodeRuleProvider impl);
    @Binds
    abstract CreditCardLimitAmountNodeRuleProvider provideCreditCardLimitAmountNodeRuleProvider(AnzCreditCardLimitAmountNodeRuleProvider impl);
    @Binds
    abstract CreditCardMonthlyRepaymentNodeRuleProvider provideCreditCardMonthlyRepaymentNodeRuleProvider(AnzCreditCardMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract CreditCardClearingFlagNodeRuleProvider provideCreditCardClearingFlagNodeRuleProvider(AnzCreditCardClearingFlagNodeRuleProvider impl);
    @Binds
    abstract CreditCardBreakCostNodeRuleProvider provideCreditCardBreakCostNodeRuleProvider(AnzCreditCardBreakCostNodeRuleProvider impl);
    @Binds
    abstract CreditCardOwnershipListNodeRuleProvider provideCreditCardOwnershipListNodeRuleProvider(AnzCreditCardOwnershipListNodeRuleProvider impl);
    @Binds
    abstract LoanTypeNodeRuleProvider provideLoanTypeNodeRuleProvider(AnzLoanTypeNodeRuleProvider impl);
    @Binds
    abstract LoanOwingAmountNodeRuleProvider provideLoanOwingAmountNodeRuleProvider(AnzLoanOwingAmountNodeRuleProvider impl);
    @Binds
    abstract LoanLimitAmountNodeRuleProvider provideLoanLimitAmountNodeRuleProvider(AnzLoanLimitAmountNodeRuleProvider impl);
    @Binds
    abstract LoanMonthlyRepaymentNodeRuleProvider provideLoanMonthlyRepaymentNodeRuleProvider(AnzLoanMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract LoanClearingFlagNodeRuleProvider provideLoanClearingFlagNodeRuleProvider(AnzLoanClearingFlagNodeRuleProvider impl);
    @Binds
    abstract LoanBreakCostNodeRuleProvider provideLoanBreakCostNodeRuleProvider(AnzLoanBreakCostNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityTypeNodeRuleProvider provideOtherLiabilityTypeNodeRuleProvider(AnzOtherLiabilityTypeNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityLimitAmountNodeRuleProvider provideOtherLiabilityLimitAmountNodeRuleProvider(AnzOtherLiabilityLimitAmountNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityAmountOwningNodeRuleProvider provideOtherLiabilityAmountOwningNodeRuleProvider(AnzOtherLiabilityAmountOwningNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityMonthlyRepaymentNodeRuleProvider provideOtherLiabilityMonthlyRepaymentNodeRuleProvider(AnzOtherLiabilityMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityClearingFlagNodeRuleProvider provideOtherLiabilityClearingFlagNodeRuleProvider(AnzOtherLiabilityClearingFlagNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityBreakCostNodeRuleProvider provideOtherLiabilityBreakCostNodeRuleProvider(AnzOtherLiabilityBreakCostNodeRuleProvider impl);
    @Binds
    abstract ExpenseTypeNodeRuleProvider provideExpenseTypeNodeRuleProvider(AnzExpenseTypeNodeRuleProvider impl);
    @Binds
    abstract ExpenseMonthlyRepaymentNodeRuleProvider provideExpenseMonthlyRepaymentNodeRuleProvider(AnzExpenseMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract TotalAssetNodeRuleProvider provideTotalAssetNodeRuleProvider(AnzTotalAssetNodeRuleProvider impl);
    @Binds
    abstract TotalLiabilityNodeRuleProvider provideTotalLiabilityNodeRuleProvider(AnzTotalLiabilityNodeRuleProvider impl);
    @Binds
    abstract TotalExpenseNodeRuleProvider provideTotalExpenseNodeRuleProvider(AnzTotalExpenseNodeRuleProvider impl);
    @Binds
    abstract RealEstateListNodeRuleProvider provideRealEstateListNodeRuleProvider(AnzRealEstateListNodeRuleProvider impl);
    @Binds
    abstract RealEstateNodeRuleProvider provideRealEstateNodeRuleProvider(AnzRealEstateNodeRuleProvider impl);
    @Binds
    abstract UsedAsSecurityFlagNodeRuleProvider provideUsedAsSecurityFlagNodeRuleProvider(AnzUsedAsSecurityFlagNodeRuleProvider impl);
    @Binds
    abstract BeingPurchasedFlagNodeRuleProvider provideBeingPurchasedFlagNodeRuleProvider(AnzBeingPurchasedFlagNodeRuleProvider impl);
    @Binds
    abstract OwnedOutrightFlagNodeRuleProvider provideOwnedOutrightFlagNodeRuleProvider(AnzOwnedOutrightFlagNodeRuleProvider impl);
    @Binds
    abstract PrimarySecurityFlagNodeRuleProvider providePrimarySecurityFlagNodeRuleProvider(AnzPrimarySecurityFlagNodeRuleProvider impl);
    @Binds
    abstract ApprovalInPrincipleFlagNodeRuleProvider provideApprovalInPrincipleFlagNodeRuleProvider(AnzApprovalInPrincipleFlagNodeRuleProvider impl);
    @Binds
    abstract MortgqageUnpaidBalanceNodeRuleProvider provideMortgqageUnpaidBalanceNodeRuleProvider(AnzMortgqageUnpaidBalanceNodeRuleProvider impl);
    @Binds
    abstract MortgageLimitAmountNodeRuleProvider provideMortgageLimitAmountNodeRuleProvider(AnzMortgageLimitAmountNodeRuleProvider impl);
    @Binds
    abstract MortgageMonthlyRepaymentNodeRuleProvider provideMortgageMonthlyRepaymentNodeRuleProvider(AnzMortgageMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract MortgageBorrowerRateNodeRuleProvider provideMortgageBorrowerRateNodeRuleProvider(AnzMortgageBorrowerRateNodeRuleProvider impl);
    @Binds
    abstract MortgageLoanTypeNodeRuleProvider provideMortgageLoanTypeNodeRuleProvider(AnzMortgageLoanTypeNodeRuleProvider impl);
    @Binds
    abstract MortgageLoanTermExpiryDateNodeRuleProvider provideMortgageLoanTermExpiryDateNodeRuleProvider(AnzMortgageLoanTermExpiryDateNodeRuleProvider impl);
    @Binds
    abstract MortgageInterestOnlyExpiryDateNodeRuleProvider provideMortgageInterestOnlyExpiryDateNodeRuleProvider(AnzMortgageInterestOnlyExpiryDateNodeRuleProvider impl);
    @Binds
    abstract MortgageClearingFlagNodeRuleProvider provideMortgageClearingFlagNodeRuleProvider(AnzMortgageClearingFlagNodeRuleProvider impl);
    @Binds
    abstract MortgageChargePositionNodeRuleProvider provideMortgageChargePositionNodeRuleProvider(AnzMortgageChargePositionNodeRuleProvider impl);
    @Binds
    abstract MortgageTermRemainingPeriodNodeRuleProvider provideMortgageTermRemainingPeriodNodeRuleProvider(AnzMortgageTermRemainingPeriodNodeRuleProvider impl);
    @Binds
    abstract MortgageInterestOnlyRemainingPeriodNodeRuleProvider provideMortgageInterestOnlyRemainingPeriodNodeRuleProvider(AnzMortgageInterestOnlyRemainingPeriodNodeRuleProvider impl);
    @Binds
    abstract RentedFlagNodeRuleProvider provideRentedFlagNodeRuleProvider(AnzRentedFlagNodeRuleProvider impl);
    @Binds
    abstract EstimatedMarketValueNodeRuleProvider provideEstimatedMarketValueNodeRuleProvider(AnzEstimatedMarketValueNodeRuleProvider impl);
    @Binds
    abstract PropertyTypeNodeRuleProvider providePropertyTypeNodeRuleProvider(AnzPropertyTypeNodeRuleProvider impl);
    @Binds
    abstract PropertySubTypeNodeRuleProvider providePropertySubTypeNodeRuleProvider(AnzPropertySubTypeNodeRuleProvider impl);
    @Binds
    abstract PropertyPurseNodeRuleProvider providePropertyPurseNodeRuleProvider(AnzPropertyPurseNodeRuleProvider impl);
    @Binds
    abstract AccessContactTypeNodeRuleProvider provideAccessContactTypeNodeRuleProvider(AnzAccessContactTypeNodeRuleProvider impl);
    @Binds
    abstract AccessContactTitleNodeRuleProvider provideAccessContactTitleNodeRuleProvider(AnzAccessContactTitleNodeRuleProvider impl);
    @Binds
    abstract AccessTelephoneNodeRuleProvider provideAccessTelephoneNodeRuleProvider(AnzAccessTelephoneNodeRuleProvider impl);
    @Binds
    abstract ProductNodeRuleProvider provideProductNodeRuleProvider(AnzProductNodeRuleProvider impl);
    @Binds
    abstract ProductGroupNodeRuleProvider provideProductGroupNodeRuleProvider(AnzProductGroupNodeRuleProvider impl);
    @Binds
    abstract ProductNameNodeRuleProvider provideProductNameNodeRuleProvider(AnzProductNameNodeRuleProvider impl);
    @Binds
    abstract ProductLoanPrimaryPurposeNodeRuleProvider provideProductLoanPrimaryPurposeNodeRuleProvider(AnzProductLoanPrimaryPurposeNodeRuleProvider impl);
    @Binds
    abstract ProductLendingPurposeNodeRuleProvider provideProductLendingPurposeNodeRuleProvider(AnzProductLendingPurposeNodeRuleProvider impl);
    @Binds
    abstract ProductPaymentTypeNodeRuleProvider provideProductPaymentTypeNodeRuleProvider(AnzProductPaymentTypeNodeRuleProvider impl);
    @Binds
    abstract ContributionTypeNodeRuleProvider provideContributionTypeNodeRuleProvider(AnzContributionTypeNodeRuleProvider impl);
    @Binds
    abstract ContributionDescriptionNodeRuleProvider provideContributionDescriptionNodeRuleProvider(AnzContributionDescriptionNodeRuleProvider impl);
    @Binds
    abstract ContributionAmountNodeRuleProvider provideContributionAmountNodeRuleProvider(AnzContributionAmountNodeRuleProvider impl);
    @Binds
    abstract FeeTypeNodeRuleProvider provideFeeTypeNodeRuleProvider(AnzFeeTypeNodeRuleProvider impl);
    @Binds
    abstract FeeDescriptionNodeRuleProvider provideFeeDescriptionNodeRuleProvider(AnzFeeDescriptionNodeRuleProvider impl);
    @Binds
    abstract FeePayFromNodeRuleProvider provideFeePayFromNodeRuleProvider(AnzFeePayFromNodeRuleProvider impl);
    @Binds
    abstract FeeAmountNodeRuleProvider provideFeeAmountNodeRuleProvider(AnzFeeAmountNodeRuleProvider impl);
    @Binds
    abstract RelatedPartyNodeRuleProvider provideRelatedPartyNodeRuleProvider(AnzRelatedPartyNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyTypeNodeRuleProvider provideThirdPartyTypeNodeRuleProvider(AnzThirdPartyTypeNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyDescriptionNodeRuleProvider provideThirdPartyDescriptionNodeRuleProvider(AnzThirdPartyDescriptionNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyTitleNodeRuleProvider provideThirdPartyTitleNodeRuleProvider(AnzThirdPartyTitleNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyFirstNameNodeRuleProvider provideThirdPartyFirstNameNodeRuleProvider(AnzThirdPartyFirstNameNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyLastNameNodeRuleProvider provideThirdPartyLastNameNodeRuleProvider(AnzThirdPartyLastNameNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyWorkPhoneNodeRuleProvider provideThirdPartyWorkPhoneNodeRuleProvider(AnzThirdPartyWorkPhoneNodeRuleProvider impl);
    @Binds
    abstract BrokerFirstNameNodeRuleProvider provideBrokerFirstNameNodeRuleProvider(AnzBrokerFirstNameNodeRuleProvider impl);
    @Binds
    abstract BrokerLastNameNodeRuleProvider provideBrokerLastNameNodeRuleProvider(AnzBrokerLastNameNodeRuleProvider impl);
    @Binds
    abstract BrokerCompanyNodeRuleProvider provideBrokerCompanyNodeRuleProvider(AnzBrokerCompanyNodeRuleProvider impl);
    @Binds
    abstract BrokerTelephoneNodeRuleProvider provideBrokerTelephoneNodeRuleProvider(AnzBrokerTelephoneNodeRuleProvider impl);
    @Binds
    abstract BrokerEmailNodeRuleProvider provideBrokerEmailNodeRuleProvider(AnzBrokerEmailNodeRuleProvider impl);
    @Binds
    abstract LenderIssuedBrokerNumberNodeRuleProvider provideLenderIssuedBrokerNumberNodeRuleProvider(AnzLenderIssuedBrokerNumberNodeRuleProvider impl);
    @Binds
    abstract TelephoneNodeRuleProvider provideTelephoneNodeRuleProvider(AnzTelephoneNodeRuleProvider impl);
    @Binds
    abstract AddressLineNodeRuleProvider provideAddressLineNodeRuleProvider(AnzAddressLineNodeRuleProvider impl);
    @Binds
    abstract SuburbNodeRuleProvider provideSuburbNodeRuleProvider(AnzSuburbNodeRuleProvider impl);
    @Binds
    abstract PostcodeNodeRuleProvider providePostcodeNodeRuleProvider(AnzPostcodeNodeRuleProvider impl);
    @Binds
    abstract CountryNodeRuleProvider provideCountryNodeRuleProvider(AnzCountryNodeRuleProvider impl);
    @Binds
    abstract MonthYearNodeRuleProvider provideMonthYearNodeRuleProvider(AnzMonthYearNodeRuleProvider impl);
    @Binds
    abstract MonthNodeRuleProvider provideMonthNodeRuleProvider(AnzMonthNodeRuleProvider impl);
    @Binds
    abstract YearNodeRuleProvider provideYearNodeRuleProvider(AnzYearNodeRuleProvider impl);
    @Binds
    abstract EmailNodeRuleProvider provideEmailNodeRuleProvider(AnzEmailNodeRuleProvider impl);
    @Binds
    abstract NameNodeRuleProvider provideNameNodeRuleProvider(AnzNameNodeRuleProvider impl);
    @Binds
    abstract BaseMobileNumberNodeRuleProvider provideBaseMobileNumberNodeRuleProvider(AnzBaseMobileNumberNodeRuleProvider impl);
    @Binds
    abstract BaseCurrencyNodeRuleProvider provideBaseCurrencyNodeRuleProvider(AnzBaseCurrencyNodeRuleProvider impl);
    @Binds
    abstract BasePercentageNodeRuleProvider provideBasePercentageNodeRuleProvider(AnzBasePercentageNodeRuleProvider impl);
    @Binds
    abstract EmploymentTypeNodeRuleProvider provideEmploymentTypeNodeRuleProvider(AnzEmploymentTypeNodeRuleProvider impl);
    @Binds
    abstract GrossYearlySalaryNodeRuleProvider provideGrossYearlySalaryNodeRuleProvider(AnzGrossYearlySalaryNodeRuleProvider impl);
    @Binds
    abstract ProfitThisYearNodeRuleProvider provideProfitThisYearNodeRuleProvider(AnzProfitThisYearNodeRuleProvider impl);
    @Binds
    abstract ProfitPreviousYearNodeRuleProvider provideProfitPreviousYearNodeRuleProvider(AnzProfitPreviousYearNodeRuleProvider impl);
    @Binds
    abstract EmployedNodeRuleProvider provideEmployedNodeRuleProvider(AnzEmployedNodeRuleProvider impl);
    @Binds
    abstract EmploymentStatusNodeRuleProvider provideEmploymentStatusNodeRuleProvider(AnzEmploymentStatusNodeRuleProvider impl);
    @Binds
    abstract OccupationNodeRuleProvider provideOccupationNodeRuleProvider(AnzOccupationNodeRuleProvider impl);
    @Binds
    abstract EmployerNameNodeRuleProvider provideEmployerNameNodeRuleProvider(AnzEmployerNameNodeRuleProvider impl);
    @Binds
    abstract EmployerAddressNodeRuleProvider provideEmployerAddressNodeRuleProvider(AnzEmployerAddressNodeRuleProvider impl);
    @Binds
    abstract EmployerPhoneNodeRuleProvider provideEmployerPhoneNodeRuleProvider(AnzEmployerPhoneNodeRuleProvider impl);
    @Binds
    abstract EmploymentStartedNodeRuleProvider provideEmploymentStartedNodeRuleProvider(AnzEmploymentStartedNodeRuleProvider impl);
    @Binds
    abstract EmploymentEndedNodeRuleProvider provideEmploymentEndedNodeRuleProvider(AnzEmploymentEndedNodeRuleProvider impl);
    @Binds
    abstract UnemployedOnBenefitFlagNodeRuleProvider provideUnemployedOnBenefitFlagNodeRuleProvider(AnzUnemployedOnBenefitFlagNodeRuleProvider impl);
    @Binds
    abstract StudentFlagNodeRuleProvider provideStudentFlagNodeRuleProvider(AnzStudentFlagNodeRuleProvider impl);
    @Binds
    abstract StudentTypeNodeRuleProvider provideStudentTypeNodeRuleProvider(AnzStudentTypeNodeRuleProvider impl);
    @Binds
    abstract HouseDutiesFlagNodeRuleProvider provideHouseDutiesFlagNodeRuleProvider(AnzHouseDutiesFlagNodeRuleProvider impl);
    @Binds
    abstract UnemployedSinceNodeRuleProvider provideUnemployedSinceNodeRuleProvider(AnzUnemployedSinceNodeRuleProvider impl);
    @Binds
    abstract RetiredOnBenefitFlagNodeRuleProvider provideRetiredOnBenefitFlagNodeRuleProvider(AnzRetiredOnBenefitFlagNodeRuleProvider impl);
    @Binds
    abstract RetiredSinceNodeRuleProvider provideRetiredSinceNodeRuleProvider(AnzRetiredSinceNodeRuleProvider impl);
    @Binds
    abstract YesNoOptionNodeRuleProvider provideYesNoOptionNodeRuleProvider(AnzYesNoOptionNodeRuleProvider impl);
    @Binds
    abstract BaseCountryNodeRuleProvider provideBaseCountryNodeRuleProvider(AnzBaseCountryNodeRuleProvider impl);
    @Binds
    abstract DobNodeRuleProvider provideDobNodeRuleProvider(AnzDobNodeRuleProvider impl);
    @Binds
    abstract SelectRelatedPersonListNodeRuleProvider provideSelectRelatedPersonListNodeRuleProvider(AnzSelectRelatedPersonListNodeRuleProvider impl);
    @Binds
    abstract SelectAccountHolderListNodeRuleProvider provideSelectAccountHolderListNodeRuleProvider(AnzSelectAccountHolderListNodeRuleProvider impl);
    @Binds
    abstract OwnershipListNodeRuleProvider provideOwnershipListNodeRuleProvider(AnzOwnershipListNodeRuleProvider impl);
    @Binds
    abstract OwnershipPercentageNodeRuleProvider provideOwnershipPercentageNodeRuleProvider(AnzOwnershipPercentageNodeRuleProvider impl);
    @Binds
    abstract ResponsibleSignificantChangeFlagNodeRuleProvider provideResponsibleSignificantChangeFlagNodeRuleProvider(AnzResponsibleSignificantChangeFlagNodeRuleProvider impl);
    @Binds
    abstract ResponsibleTypeOfChangeNodeRuleProvider provideResponsibleTypeOfChangeNodeRuleProvider(AnzResponsibleTypeOfChangeNodeRuleProvider impl);
    @Binds
    abstract ResponsibleMitigationMethodNodeRuleProvider provideResponsibleMitigationMethodNodeRuleProvider(AnzResponsibleMitigationMethodNodeRuleProvider impl);
    @Binds
    abstract ResponsibleRepaymentDifficultyNodeRuleProvider provideResponsibleRepaymentDifficultyNodeRuleProvider(AnzResponsibleRepaymentDifficultyNodeRuleProvider impl);
    @Binds
    abstract BaseOtherIncomeListNodeRuleProvider provideBaseOtherIncomeListNodeRuleProvider(AnzBaseOtherIncomeListNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeTypeNodeRuleProvider provideOtherIncomeTypeNodeRuleProvider(AnzOtherIncomeTypeNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeAddBackTypeNodeRuleProvider provideOtherIncomeAddBackTypeNodeRuleProvider(AnzOtherIncomeAddBackTypeNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeAmountNodeRuleProvider provideOtherIncomeAmountNodeRuleProvider(AnzOtherIncomeAmountNodeRuleProvider impl);
    @Binds
    abstract CreditCheckFlagNodeRuleProvider provideCreditCheckFlagNodeRuleProvider(AnzCreditCheckFlagNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyDisclosureFlagNodeRuleProvider provideThirdPartyDisclosureFlagNodeRuleProvider(AnzThirdPartyDisclosureFlagNodeRuleProvider impl);
    @Binds
    abstract LegalActionNodeRuleProvider provideLegalActionNodeRuleProvider(AnzLegalActionNodeRuleProvider impl);
    @Binds
    abstract TrustTypeNodeRuleProvider provideTrustTypeNodeRuleProvider(AnzTrustTypeNodeRuleProvider impl);
    @Binds
    abstract TrustCountryNodeRuleProvider provideTrustCountryNodeRuleProvider(AnzTrustCountryNodeRuleProvider impl);
    @Binds
    abstract BaseApplicantTypeNodeRuleProvider provideBaseApplicantTypeNodeRuleProvider(AnzBaseApplicantTypeNodeRuleProvider impl);

}
