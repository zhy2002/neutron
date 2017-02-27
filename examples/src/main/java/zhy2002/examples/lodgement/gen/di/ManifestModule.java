package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.ClassRegistryImpl;
import javax.inject.Singleton;
import zhy2002.neutron.di.NeutronModule;


@Module(includes = {NeutronModule.class},
subcomponents = {
    AddressLineNodeComponent.class,
    SuburbNodeComponent.class,
    PostcodeNodeComponent.class,
    CountryNodeComponent.class,
    MonthNodeComponent.class,
    YearNodeComponent.class,
    EmploymentTypeNodeComponent.class,
    GrossYearlySalaryNodeComponent.class,
    PayeEmployedNodeComponent.class,
    BusinessTypeNodeComponent.class,
    ProfitThisYearNodeComponent.class,
    ProfitPreviousYearNodeComponent.class,
    SelfEmployedNodeComponent.class,
    EmploymentStatusNodeComponent.class,
    OccupationNodeComponent.class,
    EmployerNameNodeComponent.class,
    EmployerAddressNodeComponent.class,
    EmployerPhoneNodeComponent.class,
    EmploymentStartedNodeComponent.class,
    EmploymentEndedNodeComponent.class,
    UnemployedOnBenefitFlagNodeComponent.class,
    StudentFlagNodeComponent.class,
    StudentTypeNodeComponent.class,
    HouseDutiesFlagNodeComponent.class,
    UnemployedSinceNodeComponent.class,
    UnemployedNodeComponent.class,
    RetiredOnBenefitFlagNodeComponent.class,
    RetiredSinceNodeComponent.class,
    RetiredEmploymentNodeComponent.class,
    AccountHolderReferenceNodeComponent.class,
    SelectAccountHolderFlagNodeComponent.class,
    SelectAccountHolderNodeComponent.class,
    ApplicantReferenceNodeComponent.class,
    OwnershipPercentageNodeComponent.class,
    AverageFlagNodeComponent.class,
    OwnershipNodeComponent.class,
    ResponsibleSignificantChangeFlagNodeComponent.class,
    ResponsibleTypeOfChangeNodeComponent.class,
    ResponsibleMitigationMethodNodeComponent.class,
    ResponsibleRepaymentDifficultyNodeComponent.class,
    OtherIncomeTypeNodeComponent.class,
    OtherIncomeAddBackTypeNodeComponent.class,
    OtherIncomeAmountNodeComponent.class,
    OtherIncomePreviousYearNodeComponent.class,
    OtherIncomeDescriptionNodeComponent.class,
    OtherIncomeNodeComponent.class,
    CreditCheckFlagNodeComponent.class,
    ThirdPartyDisclosureFlagNodeComponent.class,
    LegalActionNodeComponent.class,
    CreditHistoryNodeComponent.class,
    CreditHistoryListNodeComponent.class,
    AddressRefUiNodeComponent.class,
    AddressListNodeComponent.class,
    TitleNodeComponent.class,
    FirstNameNodeComponent.class,
    LastNameNodeComponent.class,
    GenderNodeComponent.class,
    DateOfBirthNodeComponent.class,
    PrimaryApplicantFlagNodeComponent.class,
    DriversLicenseNodeComponent.class,
    ApplicantTypeNodeComponent.class,
    ApplicationTypeNodeComponent.class,
    MaritalStatusNodeComponent.class,
    PermanentResidentFlagNodeComponent.class,
    SpouseNodeComponent.class,
    FirstHomeBuyerFlagNodeComponent.class,
    HousingStatusNodeComponent.class,
    PersonGeneralNodeComponent.class,
    ContactTelephoneNodeComponent.class,
    MobileNumberNodeComponent.class,
    ContactAddressNodeComponent.class,
    MovedToCurrentAddressNodeComponent.class,
    MovedToPreviousAddressNodeComponent.class,
    MovedFromPreviousAddressNodeComponent.class,
    ContactEmailNodeComponent.class,
    PersonContactNodeComponent.class,
    CurrentEmploymentNodeComponent.class,
    CurrentEmploymentListNodeComponent.class,
    PreviousEmploymentNodeComponent.class,
    PreviousEmploymentListNodeComponent.class,
    PersonTrustTypeNodeComponent.class,
    PersonTrustNameNodeComponent.class,
    PersonTrustRegistrationDateNodeComponent.class,
    PersonTrustCountryNodeComponent.class,
    PersonTrustAddressNodeComponent.class,
    PersonTrustSettlorNotRequiredReasonNodeComponent.class,
    PersonTrustIndustryNodeComponent.class,
    PersonTrustNodeComponent.class,
    PersonPrivacyNodeComponent.class,
    PersonOtherIncomeListNodeComponent.class,
    PersonResponsibleLendNodeComponent.class,
    PersonNodeComponent.class,
    PersonListNodeComponent.class,
    CompanyGeneralNodeComponent.class,
    CompanyContactNodeComponent.class,
    CompanyTrustNodeComponent.class,
    CompanyPrivacyNodeComponent.class,
    CompanyOtherIncomeListNodeComponent.class,
    CompanyResponsibleLendNodeComponent.class,
    CompanyNodeComponent.class,
    CompanyListNodeComponent.class,
    SavingsTypeNodeComponent.class,
    SavingsInstitutionNameNodeComponent.class,
    SavingsBalanceNodeComponent.class,
    SavingsBsbNoNodeComponent.class,
    SavingsAccountNoNodeComponent.class,
    SavingsAccountNameNodeComponent.class,
    SavingsOwnershipListNodeComponent.class,
    SavingsAccountNodeComponent.class,
    SavingsAccountListNodeComponent.class,
    VehicleModelNodeComponent.class,
    VehicleYearNodeComponent.class,
    VehicleMarketValueNodeComponent.class,
    MotorVehicleNodeComponent.class,
    MotorVehicleListNodeComponent.class,
    OtherAssetTypeNodeComponent.class,
    OtherAssetDescriptionNodeComponent.class,
    OtherAssetMarketValueNodeComponent.class,
    OtherAssetNodeComponent.class,
    OtherAssetListNodeComponent.class,
    AssetsNodeComponent.class,
    CreditCardTypeNodeComponent.class,
    CreditCardAmountOwingNodeComponent.class,
    CreditCardLimitAmountNodeComponent.class,
    CreditCardMonthlyRepaymentNodeComponent.class,
    CreditCardClearingFlagNodeComponent.class,
    CreditCardBreakCostNodeComponent.class,
    CreditCardLenderNameNodeComponent.class,
    CreditCardNodeComponent.class,
    CreditCardListNodeComponent.class,
    LoanTypeNodeComponent.class,
    LoanOwingAmountNodeComponent.class,
    LoanLimitAmountNodeComponent.class,
    LoanMonthlyRepaymentNodeComponent.class,
    LoanClearingFlagNodeComponent.class,
    LoanBreakCostNodeComponent.class,
    LoanLenderNameNodeComponent.class,
    LoanNodeComponent.class,
    LoanListNodeComponent.class,
    OtherLiabilityTypeNodeComponent.class,
    OtherLiabilityDescriptionNodeComponent.class,
    OtherLiabilityLimitAmountNodeComponent.class,
    OtherLiabilityAmountOwningNodeComponent.class,
    OtherLiabilityMonthlyRepaymentNodeComponent.class,
    OtherLiabilityClearingFlagNodeComponent.class,
    OtherLiabilityBreakCostNodeComponent.class,
    OtherLiabilityNodeComponent.class,
    OtherLiabilityListNodeComponent.class,
    LiabilitiesNodeComponent.class,
    ExpenseTypeNodeComponent.class,
    ExpenseDescriptionNodeComponent.class,
    ExpenseMonthlyRepaymentNodeComponent.class,
    ExpenseNodeComponent.class,
    ExpenseListNodeComponent.class,
    TotalAssetNodeComponent.class,
    TotalLiabilityNodeComponent.class,
    TotalExpenseNodeComponent.class,
    FinancialPositionNodeComponent.class,
    UsedAsSecurityFlagNodeComponent.class,
    BeingPurchasedFlagNodeComponent.class,
    OwnedOutrightFlagNodeComponent.class,
    PrimarySecurityFlagNodeComponent.class,
    ApprovalInPrincipleFlagNodeComponent.class,
    MortgageLenderInstitutionNodeComponent.class,
    MortgqageUnpaidBalanceNodeComponent.class,
    MortgageLimitAmountNodeComponent.class,
    MortgageMonthlyRepaymentNodeComponent.class,
    MortgageBorrowerRateNodeComponent.class,
    MortgageLoanTypeNodeComponent.class,
    MortgageLoanTermExpiryDateNodeComponent.class,
    MortgageInterestOnlyExpiryDateNodeComponent.class,
    MortgageClearingFlagNodeComponent.class,
    MortgageBreakFeeNodeComponent.class,
    MortgageChargePositionNodeComponent.class,
    MortgageTermRemainingPeriodNodeComponent.class,
    MortgageInterestOnlyRemainingPeriodNodeComponent.class,
    ExistingMortgageNodeComponent.class,
    ExistingMortgageListNodeComponent.class,
    UsageNodeComponent.class,
    RentedFlagNodeComponent.class,
    PropertyWeeklyRentNodeComponent.class,
    PropertyAddressNodeComponent.class,
    EstimatedMarketValueNodeComponent.class,
    ContractPriceNodeComponent.class,
    DefenseServiceFlagNodeComponent.class,
    PropertyTypeNodeComponent.class,
    PropertySubTypeNodeComponent.class,
    PropertyPurseNodeComponent.class,
    PropertyOwnershipListNodeComponent.class,
    PropertyNodeComponent.class,
    AccessContactTypeNodeComponent.class,
    AccessContactTitleNodeComponent.class,
    AccessContactFirstNameNodeComponent.class,
    AccessContactLastNameNodeComponent.class,
    AccessCompanyNameNodeComponent.class,
    AccessTelephoneNodeComponent.class,
    AccessOtherDescriptionNodeComponent.class,
    AccessNodeComponent.class,
    RealEstateNodeComponent.class,
    RealEstateListNodeComponent.class,
    ProductGroupNodeComponent.class,
    ProductNameNodeComponent.class,
    ProductLoanPrimaryPurposeNodeComponent.class,
    ProductLendingPurposeNodeComponent.class,
    ProductRequestedAmountNodeComponent.class,
    ProductTotalLoanTermNodeComponent.class,
    ProductPaymentTypeNodeComponent.class,
    ProductInterestOnlyTermNodeComponent.class,
    ProductFixedTermNodeComponent.class,
    ProductConstructionApplicationFlagNodeComponent.class,
    ProductCostRecuctionFlagNodeComponent.class,
    ProductConsolidationFlagNodeComponent.class,
    ProductDissatisfactionFlagNodeComponent.class,
    ProductSpecificFeaturesFlagNodeComponent.class,
    ProductAccountHolderListNodeComponent.class,
    ProductDescriptionNodeComponent.class,
    ProductPackageNameNodeComponent.class,
    ProductRepaymentFrequencyNodeComponent.class,
    ProductRateLockFlagNodeComponent.class,
    ProductTransactionAccountFlagNodeComponent.class,
    ProductOptOutReasonNodeComponent.class,
    ProductCreditCardFlagNodeComponent.class,
    ProductCreditCardTypeNodeComponent.class,
    ProductCreditCardLimitNodeComponent.class,
    ProductExpressConsentFlagNodeComponent.class,
    Product100PercentOffsetFlagNodeComponent.class,
    ProductCardHodlerNameNodeComponent.class,
    ProductRewardsProgramNodeComponent.class,
    ProductRewardsMembershipNodeComponent.class,
    ProductCardHolderNodeComponent.class,
    ProductFeaturesNodeComponent.class,
    ProductNodeComponent.class,
    ProductListNodeComponent.class,
    ProductCustomerContributionNodeComponent.class,
    ProductFeesNodeComponent.class,
    ProductLoanTypeNodeComponent.class,
    SettlementDateNodeComponent.class,
    ProductTotalLoanAmountNodeComponent.class,
    ProductTotalSecurityAmountNodeComponent.class,
    ProductTotalLoanLmiAmountNodeComponent.class,
    ProductTotalLvrNodeComponent.class,
    ProductTotalLvrLmiNodeComponent.class,
    ProductsNodeComponent.class,
    AdditionalCommentNodeComponent.class,
    ThirdPartyTypeNodeComponent.class,
    ThirdPartyDescriptionNodeComponent.class,
    ThirdPartyTitleNodeComponent.class,
    ThirdPartyFirstNameNodeComponent.class,
    ThirdPartyLastNameNodeComponent.class,
    ThirdPartyDobNodeComponent.class,
    ThirdPartyCompanyNameNodeComponent.class,
    ThirdPartyAddressNodeComponent.class,
    ThirdPartyWorkPhoneNodeComponent.class,
    ThirdPartyEmailNodeComponent.class,
    RelatedPartyNodeComponent.class,
    RelatedPartyListNodeComponent.class,
    AdditionalNodeComponent.class,
    SubmissionNodeComponent.class,
    ErrorNodeComponent.class,
    ErrorListNodeComponent.class,
    ApplicationNodeComponent.class
})
public abstract class ManifestModule {

    @Binds
    @Singleton
    abstract ClassRegistryImpl provideClassRegistryImpl(ApplicationNodeClassRegistry impl);

}