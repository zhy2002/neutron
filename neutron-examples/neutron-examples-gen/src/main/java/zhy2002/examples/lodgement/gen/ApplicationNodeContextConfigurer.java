package zhy2002.examples.lodgement.gen;

import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.config.ContextConfiguration;
import zhy2002.neutron.config.ContextConfigurer;
import javax.inject.Inject;
import java.util.*;


public class ApplicationNodeContextConfigurer implements ContextConfigurer<ApplicationNodeContext> {

    @Inject
    protected ApplicationNodeContextConfigurer() {}

    @Override
    public void configure(ApplicationNodeContext context) {
        ContextConfiguration configuration = context.getConfiguration();

        Set<String> names;
        names = new HashSet<>();
        names.add("addressLineNode");
        names.add("suburbNode");
        names.add("postcodeNode");
        names.add("countryNode");
        configuration.getConfig(AddressNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("monthNode");
        names.add("yearNode");
        configuration.getConfig(MonthYearNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("grossYearlySalaryNode");
        configuration.getConfig(PayeEmployedNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("businessTypeNode");
        names.add("profitThisYearNode");
        names.add("profitPreviousYearNode");
        configuration.getConfig(SelfEmployedNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("employmentStatusNode");
        names.add("occupationNode");
        names.add("employerNameNode");
        names.add("employerAddressNode");
        names.add("employerPhoneNode");
        names.add("employmentStartedNode");
        names.add("employmentEndedNode");
        configuration.getConfig(EmployedNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("unemployedOnBenefitFlagNode");
        names.add("studentFlagNode");
        names.add("studentTypeNode");
        names.add("houseDutiesFlagNode");
        names.add("unemployedSinceNode");
        configuration.getConfig(UnemployedNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("retiredOnBenefitFlagNode");
        names.add("retiredSinceNode");
        configuration.getConfig(RetiredEmploymentNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("employmentTypeNode");
        names.add("payeEmployedNode");
        names.add("selfEmployedNode");
        names.add("unemployedNode");
        names.add("retiredEmploymentNode");
        configuration.getConfig(EmploymentNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("relatedPersonReferenceNode");
        names.add("selectRelatedPersonFlagNode");
        configuration.getConfig(SelectRelatedPersonNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("accountHolderReferenceNode");
        names.add("selectAccountHolderFlagNode");
        configuration.getConfig(SelectAccountHolderNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("applicantReferenceNode");
        names.add("ownershipPercentageNode");
        names.add("averageFlagNode");
        configuration.getConfig(OwnershipNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("responsibleTypeOfChangeNode");
        names.add("responsibleMitigationMethodNode");
        names.add("responsibleSignificantChangeFlagNode");
        names.add("responsibleRepaymentDifficultyNode");
        configuration.getConfig(BaseResponsibleLendNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("otherIncomeAddBackTypeNode");
        names.add("otherIncomeAmountNode");
        names.add("otherIncomeDescriptionNode");
        names.add("otherIncomePreviousYearNode");
        names.add("otherIncomeTypeNode");
        configuration.getConfig(OtherIncomeNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("creditCheckFlagNode");
        names.add("thirdPartyDisclosureFlagNode");
        names.add("legalActionNode");
        names.add("creditHistoryListNode");
        configuration.getConfig(BasePrivacyNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("trustNameNode");
        names.add("trustRegistrationDateNode");
        names.add("trustTypeNode");
        names.add("trustCountryNode");
        names.add("trustAddressNode");
        names.add("trustIndustryNode");
        names.add("trustSettlorNotRequiredReasonNode");
        names.add("trustBeneficiaryListNode");
        names.add("trustSettlorListNode");
        names.add("trustBeneficialOwnerListNode");
        names.add("trustBeneficiaryClassListNode");
        configuration.getConfig(BaseTrustNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("titleNode");
        names.add("otherTitleNode");
        names.add("firstNameNode");
        names.add("lastNameNode");
        names.add("genderNode");
        names.add("dateOfBirthNode");
        names.add("primaryApplicantFlagNode");
        names.add("driversLicenseNode");
        names.add("personApplicantTypeNode");
        names.add("maritalStatusNode");
        names.add("permanentResidentFlagNode");
        names.add("spouseNode");
        names.add("nextOfKinNode");
        names.add("ageOfDependantsNode");
        names.add("firstHomeBuyerFlagNode");
        names.add("housingStatusNode");
        names.add("applicationTypeNode");
        configuration.getConfig(PersonGeneralNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("homePhoneNode");
        names.add("workPhoneNode");
        names.add("faxNumberNode");
        names.add("personMobileNumberNode");
        names.add("personEmailNode");
        names.add("currentAddressNode");
        names.add("movedToCurrentAddressNode");
        names.add("postalAddressNode");
        names.add("previousAddressNode");
        names.add("movedToPreviousAddressNode");
        names.add("movedFromPreviousAddressNode");
        configuration.getConfig(PersonContactNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("personGeneralNode");
        names.add("personContactNode");
        names.add("currentEmploymentListNode");
        names.add("previousEmploymentListNode");
        names.add("personTrustNode");
        names.add("personPrivacyNode");
        names.add("personOtherIncomeListNode");
        names.add("personResponsibleLendNode");
        configuration.getConfig(PersonNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("companyApplicantTypeNode");
        names.add("companyPrimaryApplicantFlagNode");
        names.add("companyApplicationTypeNode");
        names.add("companyRegisteredNameNode");
        names.add("companyTypeNode");
        names.add("companyDescriptionNode");
        names.add("companyIndustryNode");
        names.add("companyAbnNode");
        names.add("companyAcnNode");
        names.add("companyAbrnNode");
        names.add("companyRegistrationDateNode");
        names.add("companyRegistrationStateNode");
        names.add("companySelectDirectorNode");
        names.add("companySelectBeneficialOwnerNode");
        configuration.getConfig(CompanyGeneralNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("companyContactFirstNameNode");
        names.add("companyContactLastNameNode");
        names.add("workPhoneNode");
        names.add("faxNumberNode");
        names.add("companyMobileNumberNode");
        names.add("companyEmailNode");
        names.add("registeredAddressNode");
        names.add("postalAddressNode");
        names.add("tradingAddressNode");
        names.add("principalPlaceAddressNode");
        configuration.getConfig(CompanyContactNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("companyGeneralNode");
        names.add("companyContactNode");
        names.add("companyTrustNode");
        names.add("companyPrivacyNode");
        names.add("companyOtherIncomeListNode");
        names.add("companyResponsibleLendNode");
        configuration.getConfig(CompanyNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("savingsTypeNode");
        names.add("savingsInstitutionNameNode");
        names.add("savingsBalanceNode");
        names.add("savingsBsbNoNode");
        names.add("savingsAccountNoNode");
        names.add("savingsAccountNameNode");
        names.add("ownershipListNode");
        configuration.getConfig(SavingsAccountNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("vehicleModelNode");
        names.add("vehicleYearNode");
        names.add("vehicleMarketValueNode");
        names.add("ownershipListNode");
        configuration.getConfig(MotorVehicleNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("otherAssetTypeNode");
        names.add("otherAssetDescriptionNode");
        names.add("otherAssetMarketValueNode");
        names.add("ownershipListNode");
        configuration.getConfig(OtherAssetNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("savingsAccountListNode");
        names.add("motorVehicleListNode");
        names.add("otherAssetListNode");
        configuration.getConfig(AssetsNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("creditCardTypeNode");
        names.add("creditCardAmountOwingNode");
        names.add("creditCardLimitAmountNode");
        names.add("creditCardMonthlyRepaymentNode");
        names.add("creditCardClearingFlagNode");
        names.add("creditCardBreakCostNode");
        names.add("creditCardLenderNameNode");
        names.add("ownershipListNode");
        configuration.getConfig(CreditCardNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("loanTypeNode");
        names.add("loanLenderNameNode");
        names.add("loanLimitAmountNode");
        names.add("loanOwingAmountNode");
        names.add("loanMonthlyRepaymentNode");
        names.add("loanClearingFlagNode");
        names.add("loanBreakCostNode");
        names.add("ownershipListNode");
        configuration.getConfig(LoanNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("otherLiabilityTypeNode");
        names.add("otherLiabilityDescriptionNode");
        names.add("otherLiabilityLimitAmountNode");
        names.add("otherLiabilityAmountOwningNode");
        names.add("otherLiabilityMonthlyRepaymentNode");
        names.add("otherLiabilityClearingFlagNode");
        names.add("otherLiabilityBreakCostNode");
        names.add("ownershipListNode");
        configuration.getConfig(OtherLiabilityNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("creditCardListNode");
        names.add("loanListNode");
        names.add("otherLiabilityListNode");
        configuration.getConfig(LiabilitiesNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("expenseTypeNode");
        names.add("expenseDescriptionNode");
        names.add("expenseMonthlyRepaymentNode");
        names.add("ownershipListNode");
        configuration.getConfig(ExpenseNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("assetsNode");
        names.add("liabilitiesNode");
        names.add("expenseListNode");
        names.add("totalAssetNode");
        names.add("totalLiabilityNode");
        names.add("totalExpenseNode");
        configuration.getConfig(FinancialPositionNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("mortgageLenderInstitutionNode");
        names.add("mortgqageUnpaidBalanceNode");
        names.add("mortgageLimitAmountNode");
        names.add("mortgageMonthlyRepaymentNode");
        names.add("mortgageBorrowerRateNode");
        names.add("mortgageLoanTypeNode");
        names.add("mortgageLoanTermExpiryDateNode");
        names.add("mortgageInterestOnlyExpiryDateNode");
        names.add("mortgageClearingFlagNode");
        names.add("mortgageBreakFeeNode");
        names.add("mortgageChargePositionNode");
        names.add("mortgageTermRemainingPeriodNode");
        names.add("mortgageInterestOnlyRemainingPeriodNode");
        configuration.getConfig(ExistingMortgageNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("usedAsSecurityFlagNode");
        names.add("beingPurchasedFlagNode");
        names.add("ownedOutrightFlagNode");
        names.add("primarySecurityFlagNode");
        names.add("approvalInPrincipleFlagNode");
        names.add("existingMortgageListNode");
        configuration.getConfig(UsageNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("rentedFlagNode");
        names.add("propertyWeeklyRentNode");
        names.add("propertyAddressNode");
        names.add("estimatedMarketValueNode");
        names.add("contractPriceNode");
        names.add("defenseServiceFlagNode");
        names.add("propertyTypeNode");
        names.add("propertySubTypeNode");
        names.add("propertyPurseNode");
        names.add("propertyOwnershipListNode");
        configuration.getConfig(PropertyNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("accessContactTypeNode");
        names.add("accessContactTitleNode");
        names.add("accessContactFirstNameNode");
        names.add("accessContactLastNameNode");
        names.add("accessCompanyNameNode");
        names.add("accessTelephoneNode");
        names.add("accessOtherDescriptionNode");
        configuration.getConfig(AccessNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("usageNode");
        names.add("propertyNode");
        names.add("accessNode");
        configuration.getConfig(RealEstateNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("productGroupNode");
        names.add("productNameNode");
        names.add("productLoanPrimaryPurposeNode");
        names.add("productLendingPurposeNode");
        names.add("productRequestedAmountNode");
        names.add("productTotalLoanTermNode");
        names.add("productPaymentTypeNode");
        names.add("productInterestOnlyTermNode");
        names.add("productFixedTermNode");
        names.add("productConstructionApplicationFlagNode");
        names.add("productCostRecuctionFlagNode");
        names.add("productConsolidationFlagNode");
        names.add("productDissatisfactionFlagNode");
        names.add("productSpecificFeaturesFlagNode");
        names.add("productAccountHolderListNode");
        configuration.getConfig(ProductDescriptionNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("productCardHodlerNameNode");
        names.add("productRewardsProgramNode");
        names.add("productRewardsMembershipNode");
        configuration.getConfig(ProductCardHolderNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("productPackageNameNode");
        names.add("productRepaymentFrequencyNode");
        names.add("productRateLockFlagNode");
        names.add("productTransactionAccountFlagNode");
        names.add("productOptOutReasonNode");
        names.add("productCreditCardFlagNode");
        names.add("productCreditCardTypeNode");
        names.add("productCreditCardLimitNode");
        names.add("productExpressConsentFlagNode");
        names.add("product100PercentOffsetFlagNode");
        names.add("productPrimaryCardHolderNode");
        names.add("productAdditionalCardHolderNode");
        configuration.getConfig(ProductFeaturesNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("productDescriptionNode");
        names.add("productFeaturesNode");
        configuration.getConfig(ProductNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("contributionTypeNode");
        names.add("contributionDescriptionNode");
        names.add("contributionAmountNode");
        configuration.getConfig(ProductCustomerContributionNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("feeTypeNode");
        names.add("feeDescriptionNode");
        names.add("feePayFromNode");
        names.add("feeAmountNode");
        configuration.getConfig(ProductFeeNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("productListNode");
        names.add("productCustomerContributionListNode");
        names.add("productFeeListNode");
        names.add("productLoanTypeNode");
        names.add("settlementDateNode");
        names.add("productTotalLoanAmountNode");
        names.add("productTotalSecurityAmountNode");
        names.add("productTotalLoanLmiAmountNode");
        names.add("productTotalLvrNode");
        names.add("productTotalLvrLmiNode");
        configuration.getConfig(ProductsNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("thirdPartyTypeNode");
        names.add("thirdPartyDescriptionNode");
        names.add("thirdPartyTitleNode");
        names.add("thirdPartyFirstNameNode");
        names.add("thirdPartyLastNameNode");
        names.add("thirdPartyDobNode");
        names.add("thirdPartyCompanyNameNode");
        names.add("thirdPartyAddressNode");
        names.add("thirdPartyWorkPhoneNode");
        names.add("thirdPartyEmailNode");
        configuration.getConfig(RelatedPartyNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("additionalCommentNode");
        names.add("relatedPartyListNode");
        configuration.getConfig(AdditionalNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("brokerFirstNameNode");
        names.add("brokerLastNameNode");
        names.add("brokerCompanyNode");
        names.add("contactNumberNode");
        names.add("faxNumberNode");
        names.add("mobileNumberNode");
        names.add("brokerEmailNode");
        names.add("brokerAddressNode");
        names.add("lenderIssuedBrokerNumberNode");
        configuration.getConfig(SubmissionNode.class).setConfigValue("AutoLoadedChildNames", names);
        names = new HashSet<>();
        names.add("idNode");
        names.add("statusNode");
        names.add("owningUserNode");
        names.add("lenderNode");
        names.add("dateCreatedNode");
        names.add("dateUpdatedNode");
        names.add("dateLodgedNode");
        names.add("addressRefListNode");
        names.add("personListNode");
        names.add("companyListNode");
        names.add("financialPositionNode");
        names.add("realEstateListNode");
        names.add("productsNode");
        names.add("additionalNode");
        names.add("submissionNode");
        names.add("errorListNode");
        configuration.getConfig(ApplicationNode.class).setConfigValue("AutoLoadedChildNames", names);

    }
}
