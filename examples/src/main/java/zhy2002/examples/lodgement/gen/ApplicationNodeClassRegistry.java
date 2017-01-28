package zhy2002.examples.lodgement.gen;

import zhy2002.examples.lodgement.gen.event.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.data.*;
import zhy2002.neutron.event.*;

import java.math.BigDecimal;

/**
* The generated factory register with all the default implementation instances.
*/
class ApplicationNodeClassRegistry extends ClassRegistryImpl {

    ApplicationNodeClassRegistry() {
        loadChildNodeFactories();
        loadNodeAddEventFactories();
        loadNodeRemoveEventFactories();
        loadNodeLoadEventFactories();
        loadNodeUnloadEventFactories();
        loadStateChangeEventFactories();
    }

    private void loadChildNodeFactories() {
        setChildNodeFactory(TitleNode.class, new TitleNodeFactory());
        setChildNodeFactory(FirstNameNode.class, new FirstNameNodeFactory());
        setChildNodeFactory(LastNameNode.class, new LastNameNodeFactory());
        setChildNodeFactory(GenderNode.class, new GenderNodeFactory());
        setChildNodeFactory(DateOfBirthNode.class, new DateOfBirthNodeFactory());
        setChildNodeFactory(PrimaryApplicantFlagNode.class, new PrimaryApplicantFlagNodeFactory());
        setChildNodeFactory(DriversLicenseNode.class, new DriversLicenseNodeFactory());
        setChildNodeFactory(ApplicantTypeNode.class, new ApplicantTypeNodeFactory());
        setChildNodeFactory(ApplicationTypeNode.class, new ApplicationTypeNodeFactory());
        setChildNodeFactory(MaritalStatusNode.class, new MaritalStatusNodeFactory());
        setChildNodeFactory(PermanentResidentFlagNode.class, new PermanentResidentFlagNodeFactory());
        setChildNodeFactory(SpouseNode.class, new SpouseNodeFactory());
        setChildNodeFactory(FirstHomeBuyerFlagNode.class, new FirstHomeBuyerFlagNodeFactory());
        setChildNodeFactory(HousingStatusNode.class, new HousingStatusNodeFactory());
        setChildNodeFactory(PersonGeneralNode.class, new PersonGeneralNodeFactory());
        setChildNodeFactory(ContactTelephoneNode.class, new ContactTelephoneNodeFactory());
        setChildNodeFactory(MobileNumberNode.class, new MobileNumberNodeFactory());
        setChildNodeFactory(ContactAddressNode.class, new ContactAddressNodeFactory());
        setChildNodeFactory(ContactMonthYearNode.class, new ContactMonthYearNodeFactory());
        setChildNodeFactory(ContactEmailNode.class, new ContactEmailNodeFactory());
        setChildNodeFactory(PersonContactNode.class, new PersonContactNodeFactory());
        setChildNodeFactory(CurrentEmploymentNode.class, new CurrentEmploymentNodeFactory());
        setChildNodeFactory(CurrentEmploymentListNode.class, new CurrentEmploymentListNodeFactory());
        setChildNodeFactory(PreviousEmploymentNode.class, new PreviousEmploymentNodeFactory());
        setChildNodeFactory(PreviousEmploymentListNode.class, new PreviousEmploymentListNodeFactory());
        setChildNodeFactory(PersonTrustNode.class, new PersonTrustNodeFactory());
        setChildNodeFactory(PersonPrivacyNode.class, new PersonPrivacyNodeFactory());
        setChildNodeFactory(OtherIncomeNode.class, new OtherIncomeNodeFactory());
        setChildNodeFactory(PersonOtherIncomeListNode.class, new PersonOtherIncomeListNodeFactory());
        setChildNodeFactory(PersonResponsibleLendNode.class, new PersonResponsibleLendNodeFactory());
        setChildNodeFactory(PersonNode.class, new PersonNodeFactory());
        setChildNodeFactory(PersonListNode.class, new PersonListNodeFactory());
        setChildNodeFactory(CompanyNode.class, new CompanyNodeFactory());
        setChildNodeFactory(CompanyListNode.class, new CompanyListNodeFactory());
        setChildNodeFactory(SavingsTypeNode.class, new SavingsTypeNodeFactory());
        setChildNodeFactory(SavingsInstitutionNameNode.class, new SavingsInstitutionNameNodeFactory());
        setChildNodeFactory(SavingsBalanceNode.class, new SavingsBalanceNodeFactory());
        setChildNodeFactory(SavingsBsbNoNode.class, new SavingsBsbNoNodeFactory());
        setChildNodeFactory(SavingsAccountNoNode.class, new SavingsAccountNoNodeFactory());
        setChildNodeFactory(SavingsAccountNameNode.class, new SavingsAccountNameNodeFactory());
        setChildNodeFactory(SavingsAccountNode.class, new SavingsAccountNodeFactory());
        setChildNodeFactory(SavingsAccountListNode.class, new SavingsAccountListNodeFactory());
        setChildNodeFactory(VehicleModelNode.class, new VehicleModelNodeFactory());
        setChildNodeFactory(VehicleYearNode.class, new VehicleYearNodeFactory());
        setChildNodeFactory(VehicleMarketValueNode.class, new VehicleMarketValueNodeFactory());
        setChildNodeFactory(MotorVehicleNode.class, new MotorVehicleNodeFactory());
        setChildNodeFactory(MotorVehicleListNode.class, new MotorVehicleListNodeFactory());
        setChildNodeFactory(OtherAssetTypeNode.class, new OtherAssetTypeNodeFactory());
        setChildNodeFactory(OtherAssetDescriptionNode.class, new OtherAssetDescriptionNodeFactory());
        setChildNodeFactory(OtherAssetMarketValueNode.class, new OtherAssetMarketValueNodeFactory());
        setChildNodeFactory(OtherAssetNode.class, new OtherAssetNodeFactory());
        setChildNodeFactory(OtherAssetListNode.class, new OtherAssetListNodeFactory());
        setChildNodeFactory(AssetsNode.class, new AssetsNodeFactory());
        setChildNodeFactory(CreditCardTypeNode.class, new CreditCardTypeNodeFactory());
        setChildNodeFactory(CreditCardAmountOwingNode.class, new CreditCardAmountOwingNodeFactory());
        setChildNodeFactory(CreditCardLimitAmount.class, new CreditCardLimitAmountFactory());
        setChildNodeFactory(CreditCardMonthlyRepayment.class, new CreditCardMonthlyRepaymentFactory());
        setChildNodeFactory(CreditCardClearingFlagNode.class, new CreditCardClearingFlagNodeFactory());
        setChildNodeFactory(CreditCardBreakCostNode.class, new CreditCardBreakCostNodeFactory());
        setChildNodeFactory(CreditCardLenderNameNode.class, new CreditCardLenderNameNodeFactory());
        setChildNodeFactory(CreditCardNode.class, new CreditCardNodeFactory());
        setChildNodeFactory(CreditCardListNode.class, new CreditCardListNodeFactory());
        setChildNodeFactory(LoanTypeNode.class, new LoanTypeNodeFactory());
        setChildNodeFactory(LoanOwingAmountNode.class, new LoanOwingAmountNodeFactory());
        setChildNodeFactory(LoanLimitAmountNode.class, new LoanLimitAmountNodeFactory());
        setChildNodeFactory(LoanMonthlyRepaymentNode.class, new LoanMonthlyRepaymentNodeFactory());
        setChildNodeFactory(LoanClearingFlagNode.class, new LoanClearingFlagNodeFactory());
        setChildNodeFactory(LoanBreakCostNode.class, new LoanBreakCostNodeFactory());
        setChildNodeFactory(LoanLenderNameNode.class, new LoanLenderNameNodeFactory());
        setChildNodeFactory(LoanNode.class, new LoanNodeFactory());
        setChildNodeFactory(LoanListNode.class, new LoanListNodeFactory());
        setChildNodeFactory(OtherLiabilityTypeNode.class, new OtherLiabilityTypeNodeFactory());
        setChildNodeFactory(OtherLiabilityDescriptionNode.class, new OtherLiabilityDescriptionNodeFactory());
        setChildNodeFactory(OtherLiabilityMarketValueNode.class, new OtherLiabilityMarketValueNodeFactory());
        setChildNodeFactory(OtherLiabilityNode.class, new OtherLiabilityNodeFactory());
        setChildNodeFactory(OtherLiabilityListNode.class, new OtherLiabilityListNodeFactory());
        setChildNodeFactory(LiabilitiesNode.class, new LiabilitiesNodeFactory());
        setChildNodeFactory(ExpenseTypeNode.class, new ExpenseTypeNodeFactory());
        setChildNodeFactory(ExpenseDescriptionNode.class, new ExpenseDescriptionNodeFactory());
        setChildNodeFactory(ExpenseMonthlyRepaymentNode.class, new ExpenseMonthlyRepaymentNodeFactory());
        setChildNodeFactory(ExpenseNode.class, new ExpenseNodeFactory());
        setChildNodeFactory(ExpensesNode.class, new ExpensesNodeFactory());
        setChildNodeFactory(FinancialPositionNode.class, new FinancialPositionNodeFactory());
        setChildNodeFactory(UsedAsSecurityFlagNode.class, new UsedAsSecurityFlagNodeFactory());
        setChildNodeFactory(BeingPurchasedFlagNode.class, new BeingPurchasedFlagNodeFactory());
        setChildNodeFactory(OwnedOutrightFlagNode.class, new OwnedOutrightFlagNodeFactory());
        setChildNodeFactory(PrimarySecurityFlagNode.class, new PrimarySecurityFlagNodeFactory());
        setChildNodeFactory(ApprovalInPrincipleFlagNode.class, new ApprovalInPrincipleFlagNodeFactory());
        setChildNodeFactory(UsageNode.class, new UsageNodeFactory());
        setChildNodeFactory(RentedFlagNode.class, new RentedFlagNodeFactory());
        setChildNodeFactory(PropertyWeeklyRentNode.class, new PropertyWeeklyRentNodeFactory());
        setChildNodeFactory(PropertyAddressNode.class, new PropertyAddressNodeFactory());
        setChildNodeFactory(EstimatedMarketValueNode.class, new EstimatedMarketValueNodeFactory());
        setChildNodeFactory(ContractPriceNode.class, new ContractPriceNodeFactory());
        setChildNodeFactory(DefenseServiceFlagNode.class, new DefenseServiceFlagNodeFactory());
        setChildNodeFactory(PropertyTypeNode.class, new PropertyTypeNodeFactory());
        setChildNodeFactory(PropertySubTypeNode.class, new PropertySubTypeNodeFactory());
        setChildNodeFactory(PropertyPurseNode.class, new PropertyPurseNodeFactory());
        setChildNodeFactory(PropertyNode.class, new PropertyNodeFactory());
        setChildNodeFactory(AccessContactTypeNode.class, new AccessContactTypeNodeFactory());
        setChildNodeFactory(AccessContactTitleNode.class, new AccessContactTitleNodeFactory());
        setChildNodeFactory(AccessContactFirstNameNode.class, new AccessContactFirstNameNodeFactory());
        setChildNodeFactory(AccessContactLastNameNode.class, new AccessContactLastNameNodeFactory());
        setChildNodeFactory(AccessCompanyNameNode.class, new AccessCompanyNameNodeFactory());
        setChildNodeFactory(AccessTelephoneNode.class, new AccessTelephoneNodeFactory());
        setChildNodeFactory(AccessOtherDescriptionNode.class, new AccessOtherDescriptionNodeFactory());
        setChildNodeFactory(AccessNode.class, new AccessNodeFactory());
        setChildNodeFactory(RealEstateNode.class, new RealEstateNodeFactory());
        setChildNodeFactory(RealEstateListNode.class, new RealEstateListNodeFactory());
        setChildNodeFactory(ProductsNode.class, new ProductsNodeFactory());
        setChildNodeFactory(AdditionalNode.class, new AdditionalNodeFactory());
        setChildNodeFactory(SubmissionNode.class, new SubmissionNodeFactory());
        setChildNodeFactory(ErrorNode.class, new ErrorNodeFactory());
        setChildNodeFactory(ErrorListNode.class, new ErrorListNodeFactory());
        setChildNodeFactory(AddressLineNode.class, new AddressLineNodeFactory());
        setChildNodeFactory(SuburbNode.class, new SuburbNodeFactory());
        setChildNodeFactory(PostcodeNode.class, new PostcodeNodeFactory());
        setChildNodeFactory(CountryNode.class, new CountryNodeFactory());
        setChildNodeFactory(MonthNode.class, new MonthNodeFactory());
        setChildNodeFactory(YearNode.class, new YearNodeFactory());
        setChildNodeFactory(EmploymentTypeNode.class, new EmploymentTypeNodeFactory());
        setChildNodeFactory(GrossYearlySalaryNode.class, new GrossYearlySalaryNodeFactory());
        setChildNodeFactory(PayeEmployedNode.class, new PayeEmployedNodeFactory());
        setChildNodeFactory(BusinessTypeNode.class, new BusinessTypeNodeFactory());
        setChildNodeFactory(ProfitThisYearNode.class, new ProfitThisYearNodeFactory());
        setChildNodeFactory(ProfitPreviousYearNode.class, new ProfitPreviousYearNodeFactory());
        setChildNodeFactory(SelfEmployedNode.class, new SelfEmployedNodeFactory());
        setChildNodeFactory(EmploymentStatusNode.class, new EmploymentStatusNodeFactory());
        setChildNodeFactory(OccupationNode.class, new OccupationNodeFactory());
        setChildNodeFactory(EmployerNameNode.class, new EmployerNameNodeFactory());
        setChildNodeFactory(EmployerAddressNode.class, new EmployerAddressNodeFactory());
        setChildNodeFactory(EmployerPhoneNode.class, new EmployerPhoneNodeFactory());
        setChildNodeFactory(EmploymentStartedNode.class, new EmploymentStartedNodeFactory());
        setChildNodeFactory(EmploymentEndedNode.class, new EmploymentEndedNodeFactory());
        setChildNodeFactory(UnemployedOnBenefitFlagNode.class, new UnemployedOnBenefitFlagNodeFactory());
        setChildNodeFactory(StudentFlagNode.class, new StudentFlagNodeFactory());
        setChildNodeFactory(StudentTypeNode.class, new StudentTypeNodeFactory());
        setChildNodeFactory(HouseDutiesFlagNode.class, new HouseDutiesFlagNodeFactory());
        setChildNodeFactory(UnemployedSinceNode.class, new UnemployedSinceNodeFactory());
        setChildNodeFactory(UnemployedNode.class, new UnemployedNodeFactory());
        setChildNodeFactory(RetiredOnBenefitFlagNode.class, new RetiredOnBenefitFlagNodeFactory());
        setChildNodeFactory(RetiredSinceNode.class, new RetiredSinceNodeFactory());
        setChildNodeFactory(RetiredEmploymentNode.class, new RetiredEmploymentNodeFactory());
    }

    private void loadNodeAddEventFactories() {
        super.setNodeAddEventFactory(CurrentEmploymentNode.class, CurrentEmploymentNodeAddEvent::new);
        super.setNodeAddEventFactory(PreviousEmploymentNode.class, PreviousEmploymentNodeAddEvent::new);
        super.setNodeAddEventFactory(OtherIncomeNode.class, OtherIncomeNodeAddEvent::new);
        super.setNodeAddEventFactory(PersonNode.class, PersonNodeAddEvent::new);
        super.setNodeAddEventFactory(CompanyNode.class, CompanyNodeAddEvent::new);
        super.setNodeAddEventFactory(SavingsAccountNode.class, SavingsAccountNodeAddEvent::new);
        super.setNodeAddEventFactory(MotorVehicleNode.class, MotorVehicleNodeAddEvent::new);
        super.setNodeAddEventFactory(OtherAssetNode.class, OtherAssetNodeAddEvent::new);
        super.setNodeAddEventFactory(CreditCardNode.class, CreditCardNodeAddEvent::new);
        super.setNodeAddEventFactory(LoanNode.class, LoanNodeAddEvent::new);
        super.setNodeAddEventFactory(OtherLiabilityNode.class, OtherLiabilityNodeAddEvent::new);
        super.setNodeAddEventFactory(ExpenseNode.class, ExpenseNodeAddEvent::new);
        super.setNodeAddEventFactory(RealEstateNode.class, RealEstateNodeAddEvent::new);
        super.setNodeAddEventFactory(ErrorNode.class, ErrorNodeAddEvent::new);
    }

    private void loadNodeRemoveEventFactories() {
        super.setNodeRemoveEventFactory(CurrentEmploymentNode.class, CurrentEmploymentNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(PreviousEmploymentNode.class, PreviousEmploymentNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(OtherIncomeNode.class, OtherIncomeNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(PersonNode.class, PersonNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(CompanyNode.class, CompanyNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(SavingsAccountNode.class, SavingsAccountNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(MotorVehicleNode.class, MotorVehicleNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(OtherAssetNode.class, OtherAssetNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(CreditCardNode.class, CreditCardNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(LoanNode.class, LoanNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(OtherLiabilityNode.class, OtherLiabilityNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(ExpenseNode.class, ExpenseNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(RealEstateNode.class, RealEstateNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(ErrorNode.class, ErrorNodeRemoveEvent::new);
    }

    private void loadNodeLoadEventFactories() {
        super.setNodeLoadEventFactory(ApplicationNode.class, ApplicationNodeLoadEvent::new);
    }

    private void loadNodeUnloadEventFactories() {
        super.setNodeUnloadEventFactory(ApplicationNode.class, ApplicationNodeUnloadEvent::new);
    }

private void loadStateChangeEventFactories() {
    super.setStateChangeEventFactory(Telephone.class, TelephoneStateChangeEvent::new);
}
}
