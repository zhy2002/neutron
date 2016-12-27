package zhy2002.examples.lodgement.gen;

import zhy2002.examples.lodgement.gen.event.*;
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
    }

    private void loadNodeAddEventFactories() {
        super.setNodeAddEventFactory(PersonNode.class, PersonNodeAddEvent::new);
        super.setNodeAddEventFactory(CompanyNode.class, CompanyNodeAddEvent::new);
        super.setNodeAddEventFactory(RealEstateNode.class, RealEstateNodeAddEvent::new);
    }

    private void loadNodeRemoveEventFactories() {
        super.setNodeRemoveEventFactory(PersonNode.class, PersonNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(CompanyNode.class, CompanyNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(RealEstateNode.class, RealEstateNodeRemoveEvent::new);
    }

    private void loadNodeLoadEventFactories() {
        super.setNodeLoadEventFactory(ApplicationNode.class, ApplicationNodeLoadEvent::new);
    }

    private void loadNodeUnloadEventFactories() {
        super.setNodeUnloadEventFactory(ApplicationNode.class, ApplicationNodeUnloadEvent::new);
    }
}
