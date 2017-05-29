package zhy2002.examples.lodgement.cba.gen.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.gen.di.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.rule.*;

@Module(includes = {ManifestModule.class})
public abstract class CbaProfileModule {

    @Binds
    abstract ApplicationNodeRuleProvider provideApplicationNodeRuleProvider(CbaApplicationNodeRuleProvider impl);
    @Binds
    abstract PersonListNodeRuleProvider providePersonListNodeRuleProvider(CbaPersonListNodeRuleProvider impl);
    @Binds
    abstract TitleNodeRuleProvider provideTitleNodeRuleProvider(CbaTitleNodeRuleProvider impl);
    @Binds
    abstract FirstNameNodeRuleProvider provideFirstNameNodeRuleProvider(CbaFirstNameNodeRuleProvider impl);
    @Binds
    abstract LastNameNodeRuleProvider provideLastNameNodeRuleProvider(CbaLastNameNodeRuleProvider impl);
    @Binds
    abstract GenderNodeRuleProvider provideGenderNodeRuleProvider(CbaGenderNodeRuleProvider impl);
    @Binds
    abstract DateOfBirthNodeRuleProvider provideDateOfBirthNodeRuleProvider(CbaDateOfBirthNodeRuleProvider impl);
    @Binds
    abstract PrimaryApplicantFlagNodeRuleProvider providePrimaryApplicantFlagNodeRuleProvider(CbaPrimaryApplicantFlagNodeRuleProvider impl);
    @Binds
    abstract DriversLicenseNodeRuleProvider provideDriversLicenseNodeRuleProvider(CbaDriversLicenseNodeRuleProvider impl);
    @Binds
    abstract ApplicationTypeNodeRuleProvider provideApplicationTypeNodeRuleProvider(CbaApplicationTypeNodeRuleProvider impl);
    @Binds
    abstract MaritalStatusNodeRuleProvider provideMaritalStatusNodeRuleProvider(CbaMaritalStatusNodeRuleProvider impl);
    @Binds
    abstract FirstHomeBuyerFlagNodeRuleProvider provideFirstHomeBuyerFlagNodeRuleProvider(CbaFirstHomeBuyerFlagNodeRuleProvider impl);
    @Binds
    abstract HousingStatusNodeRuleProvider provideHousingStatusNodeRuleProvider(CbaHousingStatusNodeRuleProvider impl);
    @Binds
    abstract PersonContactNodeRuleProvider providePersonContactNodeRuleProvider(CbaPersonContactNodeRuleProvider impl);
    @Binds
    abstract PersonTelephoneNodeRuleProvider providePersonTelephoneNodeRuleProvider(CbaPersonTelephoneNodeRuleProvider impl);
    @Binds
    abstract PersonEmailNodeRuleProvider providePersonEmailNodeRuleProvider(CbaPersonEmailNodeRuleProvider impl);
    @Binds
    abstract MovedToCurrentAddressNodeRuleProvider provideMovedToCurrentAddressNodeRuleProvider(CbaMovedToCurrentAddressNodeRuleProvider impl);
    @Binds
    abstract MovedFromPreviousAddressNodeRuleProvider provideMovedFromPreviousAddressNodeRuleProvider(CbaMovedFromPreviousAddressNodeRuleProvider impl);
    @Binds
    abstract CurrentEmploymentListNodeRuleProvider provideCurrentEmploymentListNodeRuleProvider(CbaCurrentEmploymentListNodeRuleProvider impl);
    @Binds
    abstract CurrentEmploymentNodeRuleProvider provideCurrentEmploymentNodeRuleProvider(CbaCurrentEmploymentNodeRuleProvider impl);
    @Binds
    abstract PreviousEmploymentListNodeRuleProvider providePreviousEmploymentListNodeRuleProvider(CbaPreviousEmploymentListNodeRuleProvider impl);
    @Binds
    abstract PreviousEmploymentNodeRuleProvider providePreviousEmploymentNodeRuleProvider(CbaPreviousEmploymentNodeRuleProvider impl);
    @Binds
    abstract CompanyApplicationTypeNodeRuleProvider provideCompanyApplicationTypeNodeRuleProvider(CbaCompanyApplicationTypeNodeRuleProvider impl);
    @Binds
    abstract CompanyRegisteredNameNodeRuleProvider provideCompanyRegisteredNameNodeRuleProvider(CbaCompanyRegisteredNameNodeRuleProvider impl);
    @Binds
    abstract CompanyDescriptionNodeRuleProvider provideCompanyDescriptionNodeRuleProvider(CbaCompanyDescriptionNodeRuleProvider impl);
    @Binds
    abstract CompanyIndustryNodeRuleProvider provideCompanyIndustryNodeRuleProvider(CbaCompanyIndustryNodeRuleProvider impl);
    @Binds
    abstract CompanyAcnNodeRuleProvider provideCompanyAcnNodeRuleProvider(CbaCompanyAcnNodeRuleProvider impl);
    @Binds
    abstract CompanyRegistrationDateNodeRuleProvider provideCompanyRegistrationDateNodeRuleProvider(CbaCompanyRegistrationDateNodeRuleProvider impl);
    @Binds
    abstract CompanyRegistrationStateNodeRuleProvider provideCompanyRegistrationStateNodeRuleProvider(CbaCompanyRegistrationStateNodeRuleProvider impl);
    @Binds
    abstract FinancialPositionNodeRuleProvider provideFinancialPositionNodeRuleProvider(CbaFinancialPositionNodeRuleProvider impl);
    @Binds
    abstract SavingsTypeNodeRuleProvider provideSavingsTypeNodeRuleProvider(CbaSavingsTypeNodeRuleProvider impl);
    @Binds
    abstract SavingsBalanceNodeRuleProvider provideSavingsBalanceNodeRuleProvider(CbaSavingsBalanceNodeRuleProvider impl);
    @Binds
    abstract SavingsAccountNameNodeRuleProvider provideSavingsAccountNameNodeRuleProvider(CbaSavingsAccountNameNodeRuleProvider impl);
    @Binds
    abstract VehicleModelNodeRuleProvider provideVehicleModelNodeRuleProvider(CbaVehicleModelNodeRuleProvider impl);
    @Binds
    abstract VehicleYearNodeRuleProvider provideVehicleYearNodeRuleProvider(CbaVehicleYearNodeRuleProvider impl);
    @Binds
    abstract VehicleMarketValueNodeRuleProvider provideVehicleMarketValueNodeRuleProvider(CbaVehicleMarketValueNodeRuleProvider impl);
    @Binds
    abstract OtherAssetTypeNodeRuleProvider provideOtherAssetTypeNodeRuleProvider(CbaOtherAssetTypeNodeRuleProvider impl);
    @Binds
    abstract OtherAssetMarketValueNodeRuleProvider provideOtherAssetMarketValueNodeRuleProvider(CbaOtherAssetMarketValueNodeRuleProvider impl);
    @Binds
    abstract CreditCardTypeNodeRuleProvider provideCreditCardTypeNodeRuleProvider(CbaCreditCardTypeNodeRuleProvider impl);
    @Binds
    abstract CreditCardAmountOwingNodeRuleProvider provideCreditCardAmountOwingNodeRuleProvider(CbaCreditCardAmountOwingNodeRuleProvider impl);
    @Binds
    abstract CreditCardLimitAmountNodeRuleProvider provideCreditCardLimitAmountNodeRuleProvider(CbaCreditCardLimitAmountNodeRuleProvider impl);
    @Binds
    abstract CreditCardMonthlyRepaymentNodeRuleProvider provideCreditCardMonthlyRepaymentNodeRuleProvider(CbaCreditCardMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract CreditCardClearingFlagNodeRuleProvider provideCreditCardClearingFlagNodeRuleProvider(CbaCreditCardClearingFlagNodeRuleProvider impl);
    @Binds
    abstract CreditCardBreakCostNodeRuleProvider provideCreditCardBreakCostNodeRuleProvider(CbaCreditCardBreakCostNodeRuleProvider impl);
    @Binds
    abstract CreditCardOwnershipListNodeRuleProvider provideCreditCardOwnershipListNodeRuleProvider(CbaCreditCardOwnershipListNodeRuleProvider impl);
    @Binds
    abstract LoanTypeNodeRuleProvider provideLoanTypeNodeRuleProvider(CbaLoanTypeNodeRuleProvider impl);
    @Binds
    abstract LoanOwingAmountNodeRuleProvider provideLoanOwingAmountNodeRuleProvider(CbaLoanOwingAmountNodeRuleProvider impl);
    @Binds
    abstract LoanLimitAmountNodeRuleProvider provideLoanLimitAmountNodeRuleProvider(CbaLoanLimitAmountNodeRuleProvider impl);
    @Binds
    abstract LoanMonthlyRepaymentNodeRuleProvider provideLoanMonthlyRepaymentNodeRuleProvider(CbaLoanMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract LoanClearingFlagNodeRuleProvider provideLoanClearingFlagNodeRuleProvider(CbaLoanClearingFlagNodeRuleProvider impl);
    @Binds
    abstract LoanBreakCostNodeRuleProvider provideLoanBreakCostNodeRuleProvider(CbaLoanBreakCostNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityTypeNodeRuleProvider provideOtherLiabilityTypeNodeRuleProvider(CbaOtherLiabilityTypeNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityLimitAmountNodeRuleProvider provideOtherLiabilityLimitAmountNodeRuleProvider(CbaOtherLiabilityLimitAmountNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityAmountOwningNodeRuleProvider provideOtherLiabilityAmountOwningNodeRuleProvider(CbaOtherLiabilityAmountOwningNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityMonthlyRepaymentNodeRuleProvider provideOtherLiabilityMonthlyRepaymentNodeRuleProvider(CbaOtherLiabilityMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityClearingFlagNodeRuleProvider provideOtherLiabilityClearingFlagNodeRuleProvider(CbaOtherLiabilityClearingFlagNodeRuleProvider impl);
    @Binds
    abstract OtherLiabilityBreakCostNodeRuleProvider provideOtherLiabilityBreakCostNodeRuleProvider(CbaOtherLiabilityBreakCostNodeRuleProvider impl);
    @Binds
    abstract ExpenseTypeNodeRuleProvider provideExpenseTypeNodeRuleProvider(CbaExpenseTypeNodeRuleProvider impl);
    @Binds
    abstract ExpenseMonthlyRepaymentNodeRuleProvider provideExpenseMonthlyRepaymentNodeRuleProvider(CbaExpenseMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract TotalAssetNodeRuleProvider provideTotalAssetNodeRuleProvider(CbaTotalAssetNodeRuleProvider impl);
    @Binds
    abstract TotalLiabilityNodeRuleProvider provideTotalLiabilityNodeRuleProvider(CbaTotalLiabilityNodeRuleProvider impl);
    @Binds
    abstract TotalExpenseNodeRuleProvider provideTotalExpenseNodeRuleProvider(CbaTotalExpenseNodeRuleProvider impl);
    @Binds
    abstract RealEstateListNodeRuleProvider provideRealEstateListNodeRuleProvider(CbaRealEstateListNodeRuleProvider impl);
    @Binds
    abstract RealEstateNodeRuleProvider provideRealEstateNodeRuleProvider(CbaRealEstateNodeRuleProvider impl);
    @Binds
    abstract UsedAsSecurityFlagNodeRuleProvider provideUsedAsSecurityFlagNodeRuleProvider(CbaUsedAsSecurityFlagNodeRuleProvider impl);
    @Binds
    abstract BeingPurchasedFlagNodeRuleProvider provideBeingPurchasedFlagNodeRuleProvider(CbaBeingPurchasedFlagNodeRuleProvider impl);
    @Binds
    abstract OwnedOutrightFlagNodeRuleProvider provideOwnedOutrightFlagNodeRuleProvider(CbaOwnedOutrightFlagNodeRuleProvider impl);
    @Binds
    abstract PrimarySecurityFlagNodeRuleProvider providePrimarySecurityFlagNodeRuleProvider(CbaPrimarySecurityFlagNodeRuleProvider impl);
    @Binds
    abstract ApprovalInPrincipleFlagNodeRuleProvider provideApprovalInPrincipleFlagNodeRuleProvider(CbaApprovalInPrincipleFlagNodeRuleProvider impl);
    @Binds
    abstract MortgqageUnpaidBalanceNodeRuleProvider provideMortgqageUnpaidBalanceNodeRuleProvider(CbaMortgqageUnpaidBalanceNodeRuleProvider impl);
    @Binds
    abstract MortgageLimitAmountNodeRuleProvider provideMortgageLimitAmountNodeRuleProvider(CbaMortgageLimitAmountNodeRuleProvider impl);
    @Binds
    abstract MortgageMonthlyRepaymentNodeRuleProvider provideMortgageMonthlyRepaymentNodeRuleProvider(CbaMortgageMonthlyRepaymentNodeRuleProvider impl);
    @Binds
    abstract MortgageBorrowerRateNodeRuleProvider provideMortgageBorrowerRateNodeRuleProvider(CbaMortgageBorrowerRateNodeRuleProvider impl);
    @Binds
    abstract MortgageLoanTypeNodeRuleProvider provideMortgageLoanTypeNodeRuleProvider(CbaMortgageLoanTypeNodeRuleProvider impl);
    @Binds
    abstract MortgageLoanTermExpiryDateNodeRuleProvider provideMortgageLoanTermExpiryDateNodeRuleProvider(CbaMortgageLoanTermExpiryDateNodeRuleProvider impl);
    @Binds
    abstract MortgageInterestOnlyExpiryDateNodeRuleProvider provideMortgageInterestOnlyExpiryDateNodeRuleProvider(CbaMortgageInterestOnlyExpiryDateNodeRuleProvider impl);
    @Binds
    abstract MortgageClearingFlagNodeRuleProvider provideMortgageClearingFlagNodeRuleProvider(CbaMortgageClearingFlagNodeRuleProvider impl);
    @Binds
    abstract MortgageChargePositionNodeRuleProvider provideMortgageChargePositionNodeRuleProvider(CbaMortgageChargePositionNodeRuleProvider impl);
    @Binds
    abstract MortgageTermRemainingPeriodNodeRuleProvider provideMortgageTermRemainingPeriodNodeRuleProvider(CbaMortgageTermRemainingPeriodNodeRuleProvider impl);
    @Binds
    abstract MortgageInterestOnlyRemainingPeriodNodeRuleProvider provideMortgageInterestOnlyRemainingPeriodNodeRuleProvider(CbaMortgageInterestOnlyRemainingPeriodNodeRuleProvider impl);
    @Binds
    abstract RentedFlagNodeRuleProvider provideRentedFlagNodeRuleProvider(CbaRentedFlagNodeRuleProvider impl);
    @Binds
    abstract EstimatedMarketValueNodeRuleProvider provideEstimatedMarketValueNodeRuleProvider(CbaEstimatedMarketValueNodeRuleProvider impl);
    @Binds
    abstract PropertyTypeNodeRuleProvider providePropertyTypeNodeRuleProvider(CbaPropertyTypeNodeRuleProvider impl);
    @Binds
    abstract PropertySubTypeNodeRuleProvider providePropertySubTypeNodeRuleProvider(CbaPropertySubTypeNodeRuleProvider impl);
    @Binds
    abstract PropertyPurseNodeRuleProvider providePropertyPurseNodeRuleProvider(CbaPropertyPurseNodeRuleProvider impl);
    @Binds
    abstract AccessContactTypeNodeRuleProvider provideAccessContactTypeNodeRuleProvider(CbaAccessContactTypeNodeRuleProvider impl);
    @Binds
    abstract AccessContactTitleNodeRuleProvider provideAccessContactTitleNodeRuleProvider(CbaAccessContactTitleNodeRuleProvider impl);
    @Binds
    abstract AccessTelephoneNodeRuleProvider provideAccessTelephoneNodeRuleProvider(CbaAccessTelephoneNodeRuleProvider impl);
    @Binds
    abstract ProductNodeRuleProvider provideProductNodeRuleProvider(CbaProductNodeRuleProvider impl);
    @Binds
    abstract ProductGroupNodeRuleProvider provideProductGroupNodeRuleProvider(CbaProductGroupNodeRuleProvider impl);
    @Binds
    abstract ProductNameNodeRuleProvider provideProductNameNodeRuleProvider(CbaProductNameNodeRuleProvider impl);
    @Binds
    abstract ProductLoanPrimaryPurposeNodeRuleProvider provideProductLoanPrimaryPurposeNodeRuleProvider(CbaProductLoanPrimaryPurposeNodeRuleProvider impl);
    @Binds
    abstract ProductLendingPurposeNodeRuleProvider provideProductLendingPurposeNodeRuleProvider(CbaProductLendingPurposeNodeRuleProvider impl);
    @Binds
    abstract ProductPaymentTypeNodeRuleProvider provideProductPaymentTypeNodeRuleProvider(CbaProductPaymentTypeNodeRuleProvider impl);
    @Binds
    abstract ContributionTypeNodeRuleProvider provideContributionTypeNodeRuleProvider(CbaContributionTypeNodeRuleProvider impl);
    @Binds
    abstract ContributionDescriptionNodeRuleProvider provideContributionDescriptionNodeRuleProvider(CbaContributionDescriptionNodeRuleProvider impl);
    @Binds
    abstract ContributionAmountNodeRuleProvider provideContributionAmountNodeRuleProvider(CbaContributionAmountNodeRuleProvider impl);
    @Binds
    abstract FeeTypeNodeRuleProvider provideFeeTypeNodeRuleProvider(CbaFeeTypeNodeRuleProvider impl);
    @Binds
    abstract FeeDescriptionNodeRuleProvider provideFeeDescriptionNodeRuleProvider(CbaFeeDescriptionNodeRuleProvider impl);
    @Binds
    abstract FeePayFromNodeRuleProvider provideFeePayFromNodeRuleProvider(CbaFeePayFromNodeRuleProvider impl);
    @Binds
    abstract FeeAmountNodeRuleProvider provideFeeAmountNodeRuleProvider(CbaFeeAmountNodeRuleProvider impl);
    @Binds
    abstract RelatedPartyNodeRuleProvider provideRelatedPartyNodeRuleProvider(CbaRelatedPartyNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyTypeNodeRuleProvider provideThirdPartyTypeNodeRuleProvider(CbaThirdPartyTypeNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyDescriptionNodeRuleProvider provideThirdPartyDescriptionNodeRuleProvider(CbaThirdPartyDescriptionNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyTitleNodeRuleProvider provideThirdPartyTitleNodeRuleProvider(CbaThirdPartyTitleNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyFirstNameNodeRuleProvider provideThirdPartyFirstNameNodeRuleProvider(CbaThirdPartyFirstNameNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyLastNameNodeRuleProvider provideThirdPartyLastNameNodeRuleProvider(CbaThirdPartyLastNameNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyWorkPhoneNodeRuleProvider provideThirdPartyWorkPhoneNodeRuleProvider(CbaThirdPartyWorkPhoneNodeRuleProvider impl);
    @Binds
    abstract BrokerFirstNameNodeRuleProvider provideBrokerFirstNameNodeRuleProvider(CbaBrokerFirstNameNodeRuleProvider impl);
    @Binds
    abstract BrokerLastNameNodeRuleProvider provideBrokerLastNameNodeRuleProvider(CbaBrokerLastNameNodeRuleProvider impl);
    @Binds
    abstract BrokerCompanyNodeRuleProvider provideBrokerCompanyNodeRuleProvider(CbaBrokerCompanyNodeRuleProvider impl);
    @Binds
    abstract BrokerTelephoneNodeRuleProvider provideBrokerTelephoneNodeRuleProvider(CbaBrokerTelephoneNodeRuleProvider impl);
    @Binds
    abstract BrokerEmailNodeRuleProvider provideBrokerEmailNodeRuleProvider(CbaBrokerEmailNodeRuleProvider impl);
    @Binds
    abstract LenderIssuedBrokerNumberNodeRuleProvider provideLenderIssuedBrokerNumberNodeRuleProvider(CbaLenderIssuedBrokerNumberNodeRuleProvider impl);
    @Binds
    abstract TelephoneNodeRuleProvider provideTelephoneNodeRuleProvider(CbaTelephoneNodeRuleProvider impl);
    @Binds
    abstract AddressLineNodeRuleProvider provideAddressLineNodeRuleProvider(CbaAddressLineNodeRuleProvider impl);
    @Binds
    abstract SuburbNodeRuleProvider provideSuburbNodeRuleProvider(CbaSuburbNodeRuleProvider impl);
    @Binds
    abstract PostcodeNodeRuleProvider providePostcodeNodeRuleProvider(CbaPostcodeNodeRuleProvider impl);
    @Binds
    abstract CountryNodeRuleProvider provideCountryNodeRuleProvider(CbaCountryNodeRuleProvider impl);
    @Binds
    abstract MonthYearNodeRuleProvider provideMonthYearNodeRuleProvider(CbaMonthYearNodeRuleProvider impl);
    @Binds
    abstract MonthNodeRuleProvider provideMonthNodeRuleProvider(CbaMonthNodeRuleProvider impl);
    @Binds
    abstract YearNodeRuleProvider provideYearNodeRuleProvider(CbaYearNodeRuleProvider impl);
    @Binds
    abstract EmailNodeRuleProvider provideEmailNodeRuleProvider(CbaEmailNodeRuleProvider impl);
    @Binds
    abstract NameNodeRuleProvider provideNameNodeRuleProvider(CbaNameNodeRuleProvider impl);
    @Binds
    abstract BaseMobileNumberNodeRuleProvider provideBaseMobileNumberNodeRuleProvider(CbaBaseMobileNumberNodeRuleProvider impl);
    @Binds
    abstract BaseCurrencyNodeRuleProvider provideBaseCurrencyNodeRuleProvider(CbaBaseCurrencyNodeRuleProvider impl);
    @Binds
    abstract BasePercentageNodeRuleProvider provideBasePercentageNodeRuleProvider(CbaBasePercentageNodeRuleProvider impl);
    @Binds
    abstract EmploymentTypeNodeRuleProvider provideEmploymentTypeNodeRuleProvider(CbaEmploymentTypeNodeRuleProvider impl);
    @Binds
    abstract GrossYearlySalaryNodeRuleProvider provideGrossYearlySalaryNodeRuleProvider(CbaGrossYearlySalaryNodeRuleProvider impl);
    @Binds
    abstract ProfitThisYearNodeRuleProvider provideProfitThisYearNodeRuleProvider(CbaProfitThisYearNodeRuleProvider impl);
    @Binds
    abstract ProfitPreviousYearNodeRuleProvider provideProfitPreviousYearNodeRuleProvider(CbaProfitPreviousYearNodeRuleProvider impl);
    @Binds
    abstract EmployedNodeRuleProvider provideEmployedNodeRuleProvider(CbaEmployedNodeRuleProvider impl);
    @Binds
    abstract EmploymentStatusNodeRuleProvider provideEmploymentStatusNodeRuleProvider(CbaEmploymentStatusNodeRuleProvider impl);
    @Binds
    abstract OccupationNodeRuleProvider provideOccupationNodeRuleProvider(CbaOccupationNodeRuleProvider impl);
    @Binds
    abstract EmployerNameNodeRuleProvider provideEmployerNameNodeRuleProvider(CbaEmployerNameNodeRuleProvider impl);
    @Binds
    abstract EmployerAddressNodeRuleProvider provideEmployerAddressNodeRuleProvider(CbaEmployerAddressNodeRuleProvider impl);
    @Binds
    abstract EmployerPhoneNodeRuleProvider provideEmployerPhoneNodeRuleProvider(CbaEmployerPhoneNodeRuleProvider impl);
    @Binds
    abstract EmploymentStartedNodeRuleProvider provideEmploymentStartedNodeRuleProvider(CbaEmploymentStartedNodeRuleProvider impl);
    @Binds
    abstract EmploymentEndedNodeRuleProvider provideEmploymentEndedNodeRuleProvider(CbaEmploymentEndedNodeRuleProvider impl);
    @Binds
    abstract UnemployedOnBenefitFlagNodeRuleProvider provideUnemployedOnBenefitFlagNodeRuleProvider(CbaUnemployedOnBenefitFlagNodeRuleProvider impl);
    @Binds
    abstract StudentFlagNodeRuleProvider provideStudentFlagNodeRuleProvider(CbaStudentFlagNodeRuleProvider impl);
    @Binds
    abstract StudentTypeNodeRuleProvider provideStudentTypeNodeRuleProvider(CbaStudentTypeNodeRuleProvider impl);
    @Binds
    abstract HouseDutiesFlagNodeRuleProvider provideHouseDutiesFlagNodeRuleProvider(CbaHouseDutiesFlagNodeRuleProvider impl);
    @Binds
    abstract UnemployedSinceNodeRuleProvider provideUnemployedSinceNodeRuleProvider(CbaUnemployedSinceNodeRuleProvider impl);
    @Binds
    abstract RetiredOnBenefitFlagNodeRuleProvider provideRetiredOnBenefitFlagNodeRuleProvider(CbaRetiredOnBenefitFlagNodeRuleProvider impl);
    @Binds
    abstract RetiredSinceNodeRuleProvider provideRetiredSinceNodeRuleProvider(CbaRetiredSinceNodeRuleProvider impl);
    @Binds
    abstract YesNoOptionNodeRuleProvider provideYesNoOptionNodeRuleProvider(CbaYesNoOptionNodeRuleProvider impl);
    @Binds
    abstract BaseCountryNodeRuleProvider provideBaseCountryNodeRuleProvider(CbaBaseCountryNodeRuleProvider impl);
    @Binds
    abstract DobNodeRuleProvider provideDobNodeRuleProvider(CbaDobNodeRuleProvider impl);
    @Binds
    abstract SelectRelatedPersonListNodeRuleProvider provideSelectRelatedPersonListNodeRuleProvider(CbaSelectRelatedPersonListNodeRuleProvider impl);
    @Binds
    abstract SelectAccountHolderListNodeRuleProvider provideSelectAccountHolderListNodeRuleProvider(CbaSelectAccountHolderListNodeRuleProvider impl);
    @Binds
    abstract OwnershipListNodeRuleProvider provideOwnershipListNodeRuleProvider(CbaOwnershipListNodeRuleProvider impl);
    @Binds
    abstract OwnershipPercentageNodeRuleProvider provideOwnershipPercentageNodeRuleProvider(CbaOwnershipPercentageNodeRuleProvider impl);
    @Binds
    abstract ResponsibleSignificantChangeFlagNodeRuleProvider provideResponsibleSignificantChangeFlagNodeRuleProvider(CbaResponsibleSignificantChangeFlagNodeRuleProvider impl);
    @Binds
    abstract ResponsibleTypeOfChangeNodeRuleProvider provideResponsibleTypeOfChangeNodeRuleProvider(CbaResponsibleTypeOfChangeNodeRuleProvider impl);
    @Binds
    abstract ResponsibleMitigationMethodNodeRuleProvider provideResponsibleMitigationMethodNodeRuleProvider(CbaResponsibleMitigationMethodNodeRuleProvider impl);
    @Binds
    abstract ResponsibleRepaymentDifficultyNodeRuleProvider provideResponsibleRepaymentDifficultyNodeRuleProvider(CbaResponsibleRepaymentDifficultyNodeRuleProvider impl);
    @Binds
    abstract BaseOtherIncomeListNodeRuleProvider provideBaseOtherIncomeListNodeRuleProvider(CbaBaseOtherIncomeListNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeTypeNodeRuleProvider provideOtherIncomeTypeNodeRuleProvider(CbaOtherIncomeTypeNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeAddBackTypeNodeRuleProvider provideOtherIncomeAddBackTypeNodeRuleProvider(CbaOtherIncomeAddBackTypeNodeRuleProvider impl);
    @Binds
    abstract OtherIncomeAmountNodeRuleProvider provideOtherIncomeAmountNodeRuleProvider(CbaOtherIncomeAmountNodeRuleProvider impl);
    @Binds
    abstract CreditCheckFlagNodeRuleProvider provideCreditCheckFlagNodeRuleProvider(CbaCreditCheckFlagNodeRuleProvider impl);
    @Binds
    abstract ThirdPartyDisclosureFlagNodeRuleProvider provideThirdPartyDisclosureFlagNodeRuleProvider(CbaThirdPartyDisclosureFlagNodeRuleProvider impl);
    @Binds
    abstract LegalActionNodeRuleProvider provideLegalActionNodeRuleProvider(CbaLegalActionNodeRuleProvider impl);
    @Binds
    abstract TrustTypeNodeRuleProvider provideTrustTypeNodeRuleProvider(CbaTrustTypeNodeRuleProvider impl);
    @Binds
    abstract TrustCountryNodeRuleProvider provideTrustCountryNodeRuleProvider(CbaTrustCountryNodeRuleProvider impl);
    @Binds
    abstract BaseApplicantTypeNodeRuleProvider provideBaseApplicantTypeNodeRuleProvider(CbaBaseApplicantTypeNodeRuleProvider impl);

}
