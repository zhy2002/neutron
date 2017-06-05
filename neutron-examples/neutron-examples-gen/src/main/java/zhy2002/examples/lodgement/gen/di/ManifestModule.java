package zhy2002.examples.lodgement.gen.di;

import dagger.*;
import dagger.multibindings.IntoSet;
import zhy2002.neutron.event.EventRegistry;
import zhy2002.neutron.config.ContextConfigurer;
import zhy2002.examples.lodgement.gen.ApplicationNodeContextConfigurer;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.gen.event.*;
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
    PayeEmployedNodeComponent.class,
    GrossYearlySalaryNodeComponent.class,
    SelfEmployedNodeComponent.class,
    BusinessTypeNodeComponent.class,
    ProfitThisYearNodeComponent.class,
    ProfitPreviousYearNodeComponent.class,
    EmploymentStatusNodeComponent.class,
    OccupationNodeComponent.class,
    EmployerNameNodeComponent.class,
    EmployerAddressNodeComponent.class,
    EmployerPhoneNodeComponent.class,
    EmploymentStartedNodeComponent.class,
    EmploymentEndedNodeComponent.class,
    UnemployedNodeComponent.class,
    UnemployedOnBenefitFlagNodeComponent.class,
    StudentFlagNodeComponent.class,
    StudentTypeNodeComponent.class,
    HouseDutiesFlagNodeComponent.class,
    UnemployedSinceNodeComponent.class,
    RetiredEmploymentNodeComponent.class,
    RetiredOnBenefitFlagNodeComponent.class,
    RetiredSinceNodeComponent.class,
    SelectRelatedPersonNodeComponent.class,
    RelatedPersonReferenceNodeComponent.class,
    SelectRelatedPersonFlagNodeComponent.class,
    SelectAccountHolderNodeComponent.class,
    AccountHolderReferenceNodeComponent.class,
    SelectAccountHolderFlagNodeComponent.class,
    OwnershipNodeComponent.class,
    ApplicantReferenceNodeComponent.class,
    OwnershipPercentageNodeComponent.class,
    AverageFlagNodeComponent.class,
    ResponsibleSignificantChangeFlagNodeComponent.class,
    ResponsibleTypeOfChangeNodeComponent.class,
    ResponsibleMitigationMethodNodeComponent.class,
    ResponsibleRepaymentDifficultyNodeComponent.class,
    OtherIncomeNodeComponent.class,
    OtherIncomeTypeNodeComponent.class,
    OtherIncomeAddBackTypeNodeComponent.class,
    OtherIncomeAmountNodeComponent.class,
    OtherIncomePreviousYearNodeComponent.class,
    OtherIncomeDescriptionNodeComponent.class,
    CreditCheckFlagNodeComponent.class,
    ThirdPartyDisclosureFlagNodeComponent.class,
    LegalActionNodeComponent.class,
    CreditHistoryListNodeComponent.class,
    CreditHistoryNodeComponent.class,
    TrustTypeNodeComponent.class,
    TrustNameNodeComponent.class,
    TrustRegistrationDateNodeComponent.class,
    TrustCountryNodeComponent.class,
    TrustAddressNodeComponent.class,
    TrustSettlorNotRequiredReasonNodeComponent.class,
    TrustIndustryNodeComponent.class,
    TrustBeneficiaryListNodeComponent.class,
    TrustSettlorListNodeComponent.class,
    TrustBeneficialOwnerListNodeComponent.class,
    TrustBeneficiaryClassListNodeComponent.class,
    TrustBeneficiaryClassNodeComponent.class,
    ApplicationNodeComponent.class,
    IdNodeComponent.class,
    StatusNodeComponent.class,
    OwningUserNodeComponent.class,
    LenderNodeComponent.class,
    DateCreatedNodeComponent.class,
    DateUpdatedNodeComponent.class,
    DateLodgedNodeComponent.class,
    AddressRefListNodeComponent.class,
    AddressRefNodeComponent.class,
    PersonListNodeComponent.class,
    PersonNodeComponent.class,
    PersonGeneralNodeComponent.class,
    TitleNodeComponent.class,
    OtherTitleNodeComponent.class,
    FirstNameNodeComponent.class,
    LastNameNodeComponent.class,
    GenderNodeComponent.class,
    DateOfBirthNodeComponent.class,
    PrimaryApplicantFlagNodeComponent.class,
    DriversLicenseNodeComponent.class,
    PersonApplicantTypeNodeComponent.class,
    ApplicationTypeNodeComponent.class,
    MaritalStatusNodeComponent.class,
    PermanentResidentFlagNodeComponent.class,
    SpouseNodeComponent.class,
    NextOfKinNodeComponent.class,
    AgeOfDependantsNodeComponent.class,
    FirstHomeBuyerFlagNodeComponent.class,
    HousingStatusNodeComponent.class,
    PersonContactNodeComponent.class,
    PersonTelephoneNodeComponent.class,
    PersonMobileNumberNodeComponent.class,
    PersonEmailNodeComponent.class,
    PersonAddressNodeComponent.class,
    MovedToCurrentAddressNodeComponent.class,
    MovedToPreviousAddressNodeComponent.class,
    MovedFromPreviousAddressNodeComponent.class,
    CurrentEmploymentListNodeComponent.class,
    CurrentEmploymentNodeComponent.class,
    PreviousEmploymentListNodeComponent.class,
    PreviousEmploymentNodeComponent.class,
    PersonTrustNodeComponent.class,
    PersonPrivacyNodeComponent.class,
    PersonOtherIncomeListNodeComponent.class,
    PersonResponsibleLendNodeComponent.class,
    CompanyListNodeComponent.class,
    CompanyNodeComponent.class,
    CompanyGeneralNodeComponent.class,
    CompanyApplicantTypeNodeComponent.class,
    CompanyPrimaryApplicantFlagNodeComponent.class,
    CompanyApplicationTypeNodeComponent.class,
    CompanyRegisteredNameNodeComponent.class,
    CompanyTypeNodeComponent.class,
    CompanyDescriptionNodeComponent.class,
    CompanyIndustryNodeComponent.class,
    CompanyAbnNodeComponent.class,
    CompanyAcnNodeComponent.class,
    CompanyAbrnNodeComponent.class,
    CompanyRegistrationDateNodeComponent.class,
    CompanyRegistrationStateNodeComponent.class,
    CompanySelectDirectorNodeComponent.class,
    CompanySelectBeneficialOwnerNodeComponent.class,
    CompanyContactNodeComponent.class,
    CompanyContactFirstNameNodeComponent.class,
    CompanyContactLastNameNodeComponent.class,
    CompanyTelephoneNodeComponent.class,
    CompanyMobileNumberNodeComponent.class,
    CompanyEmailNodeComponent.class,
    CompanyAddressNodeComponent.class,
    CompanyTrustNodeComponent.class,
    CompanyPrivacyNodeComponent.class,
    CompanyOtherIncomeListNodeComponent.class,
    CompanyResponsibleLendNodeComponent.class,
    FinancialPositionNodeComponent.class,
    AssetsNodeComponent.class,
    SavingsAccountListNodeComponent.class,
    SavingsAccountNodeComponent.class,
    SavingsTypeNodeComponent.class,
    SavingsInstitutionNameNodeComponent.class,
    SavingsBalanceNodeComponent.class,
    SavingsBsbNoNodeComponent.class,
    SavingsAccountNoNodeComponent.class,
    SavingsAccountNameNodeComponent.class,
    SavingsOwnershipListNodeComponent.class,
    MotorVehicleListNodeComponent.class,
    MotorVehicleNodeComponent.class,
    VehicleModelNodeComponent.class,
    VehicleYearNodeComponent.class,
    VehicleMarketValueNodeComponent.class,
    VehicleOwnershipListNodeComponent.class,
    OtherAssetListNodeComponent.class,
    OtherAssetNodeComponent.class,
    OtherAssetTypeNodeComponent.class,
    OtherAssetDescriptionNodeComponent.class,
    OtherAssetMarketValueNodeComponent.class,
    OtherAssetOwnershipListNodeComponent.class,
    LiabilitiesNodeComponent.class,
    CreditCardListNodeComponent.class,
    CreditCardNodeComponent.class,
    CreditCardTypeNodeComponent.class,
    CreditCardAmountOwingNodeComponent.class,
    CreditCardLimitAmountNodeComponent.class,
    CreditCardMonthlyRepaymentNodeComponent.class,
    CreditCardClearingFlagNodeComponent.class,
    CreditCardBreakCostNodeComponent.class,
    CreditCardLenderNameNodeComponent.class,
    CreditCardOwnershipListNodeComponent.class,
    LoanListNodeComponent.class,
    LoanNodeComponent.class,
    LoanTypeNodeComponent.class,
    LoanOwingAmountNodeComponent.class,
    LoanLimitAmountNodeComponent.class,
    LoanMonthlyRepaymentNodeComponent.class,
    LoanClearingFlagNodeComponent.class,
    LoanBreakCostNodeComponent.class,
    LoanLenderNameNodeComponent.class,
    LoanOwnershipListNodeComponent.class,
    OtherLiabilityListNodeComponent.class,
    OtherLiabilityNodeComponent.class,
    OtherLiabilityTypeNodeComponent.class,
    OtherLiabilityDescriptionNodeComponent.class,
    OtherLiabilityLimitAmountNodeComponent.class,
    OtherLiabilityAmountOwningNodeComponent.class,
    OtherLiabilityMonthlyRepaymentNodeComponent.class,
    OtherLiabilityClearingFlagNodeComponent.class,
    OtherLiabilityBreakCostNodeComponent.class,
    OtherLiabilityOwnershipListNodeComponent.class,
    ExpenseListNodeComponent.class,
    ExpenseNodeComponent.class,
    ExpenseTypeNodeComponent.class,
    ExpenseDescriptionNodeComponent.class,
    ExpenseMonthlyRepaymentNodeComponent.class,
    ExpenseOwnershipListNodeComponent.class,
    TotalAssetNodeComponent.class,
    TotalLiabilityNodeComponent.class,
    TotalExpenseNodeComponent.class,
    RealEstateListNodeComponent.class,
    RealEstateNodeComponent.class,
    UsageNodeComponent.class,
    UsedAsSecurityFlagNodeComponent.class,
    BeingPurchasedFlagNodeComponent.class,
    OwnedOutrightFlagNodeComponent.class,
    PrimarySecurityFlagNodeComponent.class,
    ApprovalInPrincipleFlagNodeComponent.class,
    ExistingMortgageListNodeComponent.class,
    ExistingMortgageNodeComponent.class,
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
    PropertyNodeComponent.class,
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
    AccessNodeComponent.class,
    AccessContactTypeNodeComponent.class,
    AccessContactTitleNodeComponent.class,
    AccessContactFirstNameNodeComponent.class,
    AccessContactLastNameNodeComponent.class,
    AccessCompanyNameNodeComponent.class,
    AccessTelephoneNodeComponent.class,
    AccessOtherDescriptionNodeComponent.class,
    ProductsNodeComponent.class,
    ProductListNodeComponent.class,
    ProductNodeComponent.class,
    ProductDescriptionNodeComponent.class,
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
    ProductFeaturesNodeComponent.class,
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
    ProductCardHolderNodeComponent.class,
    ProductCardHodlerNameNodeComponent.class,
    ProductRewardsProgramNodeComponent.class,
    ProductRewardsMembershipNodeComponent.class,
    ProductCustomerContributionListNodeComponent.class,
    ProductCustomerContributionNodeComponent.class,
    ContributionTypeNodeComponent.class,
    ContributionDescriptionNodeComponent.class,
    ContributionAmountNodeComponent.class,
    ProductFeeListNodeComponent.class,
    ProductFeeNodeComponent.class,
    FeeTypeNodeComponent.class,
    FeeDescriptionNodeComponent.class,
    FeePayFromNodeComponent.class,
    FeeAmountNodeComponent.class,
    ProductLoanTypeNodeComponent.class,
    SettlementDateNodeComponent.class,
    ProductTotalLoanAmountNodeComponent.class,
    ProductTotalSecurityAmountNodeComponent.class,
    ProductTotalLoanLmiAmountNodeComponent.class,
    ProductTotalLvrNodeComponent.class,
    ProductTotalLvrLmiNodeComponent.class,
    AdditionalNodeComponent.class,
    AdditionalCommentNodeComponent.class,
    RelatedPartyListNodeComponent.class,
    RelatedPartyNodeComponent.class,
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
    SubmissionNodeComponent.class,
    BrokerFirstNameNodeComponent.class,
    BrokerLastNameNodeComponent.class,
    BrokerCompanyNodeComponent.class,
    BrokerTelephoneNodeComponent.class,
    BrokerMobileNumberNodeComponent.class,
    BrokerEmailNodeComponent.class,
    BrokerAddressNodeComponent.class,
    LenderIssuedBrokerNumberNodeComponent.class,
    ErrorListNodeComponent.class,
    ErrorNodeComponent.class
})
public abstract class ManifestModule {

    @Binds
    @Singleton
    abstract EventRegistry provideEventRegistryImpl(ApplicationEventRegistry impl);

    @Binds
    @IntoSet
    abstract ContextConfigurer<ApplicationNodeContext> provideApplicationNodeContextConfigurer(
        ApplicationNodeContextConfigurer impl
    );

}