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
        setChildNodeFactory(GeneralNode.class, new GeneralNodeFactory());
        setChildNodeFactory(ContactTelephoneNode.class, new ContactTelephoneNodeFactory());
        setChildNodeFactory(ContactAddressNode.class, new ContactAddressNodeFactory());
        setChildNodeFactory(ContactMonthYearNode.class, new ContactMonthYearNodeFactory());
        setChildNodeFactory(ContactEmailNode.class, new ContactEmailNodeFactory());
        setChildNodeFactory(ContactNode.class, new ContactNodeFactory());
        setChildNodeFactory(CurrentEmploymentNode.class, new CurrentEmploymentNodeFactory());
        setChildNodeFactory(CurrentEmploymentListNode.class, new CurrentEmploymentListNodeFactory());
        setChildNodeFactory(PreviousEmploymentNode.class, new PreviousEmploymentNodeFactory());
        setChildNodeFactory(PreviousEmploymentListNode.class, new PreviousEmploymentListNodeFactory());
        setChildNodeFactory(PersonNode.class, new PersonNodeFactory());
        setChildNodeFactory(PersonListNode.class, new PersonListNodeFactory());
        setChildNodeFactory(CompanyNode.class, new CompanyNodeFactory());
        setChildNodeFactory(CompanyListNode.class, new CompanyListNodeFactory());
        setChildNodeFactory(FinancialPositionNode.class, new FinancialPositionNodeFactory());
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
        setChildNodeFactory(EmploymentStatusNode.class, new EmploymentStatusNodeFactory());
        setChildNodeFactory(OccupationNode.class, new OccupationNodeFactory());
        setChildNodeFactory(EmployedNode.class, new EmployedNodeFactory());
        setChildNodeFactory(UnemployedSinceNode.class, new UnemployedSinceNodeFactory());
        setChildNodeFactory(UnemployedNode.class, new UnemployedNodeFactory());
        setChildNodeFactory(RetiredSinceNode.class, new RetiredSinceNodeFactory());
        setChildNodeFactory(RetiredEmploymentNode.class, new RetiredEmploymentNodeFactory());
    }

    private void loadNodeAddEventFactories() {
        super.setNodeAddEventFactory(CurrentEmploymentNode.class, CurrentEmploymentNodeAddEvent::new);
        super.setNodeAddEventFactory(PreviousEmploymentNode.class, PreviousEmploymentNodeAddEvent::new);
        super.setNodeAddEventFactory(PersonNode.class, PersonNodeAddEvent::new);
        super.setNodeAddEventFactory(CompanyNode.class, CompanyNodeAddEvent::new);
        super.setNodeAddEventFactory(RealEstateNode.class, RealEstateNodeAddEvent::new);
        super.setNodeAddEventFactory(ErrorNode.class, ErrorNodeAddEvent::new);
    }

    private void loadNodeRemoveEventFactories() {
        super.setNodeRemoveEventFactory(CurrentEmploymentNode.class, CurrentEmploymentNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(PreviousEmploymentNode.class, PreviousEmploymentNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(PersonNode.class, PersonNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(CompanyNode.class, CompanyNodeRemoveEvent::new);
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
