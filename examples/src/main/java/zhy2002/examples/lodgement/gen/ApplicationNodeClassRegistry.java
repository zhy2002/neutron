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
        loadNodeAddEventFactories();
        loadNodeRemoveEventFactories();
        loadNodeLoadEventFactories();
        loadNodeUnloadEventFactories();
        loadStateChangeEventFactories();
    }

    private void loadNodeAddEventFactories() {
        super.setNodeAddEventFactory(AddressRefUiNode.class, AddressRefUiNodeAddEvent::new);
        super.setNodeAddEventFactory(CurrentEmploymentNode.class, CurrentEmploymentNodeAddEvent::new);
        super.setNodeAddEventFactory(PreviousEmploymentNode.class, PreviousEmploymentNodeAddEvent::new);
        super.setNodeAddEventFactory(PersonOtherIncomeNode.class, PersonOtherIncomeNodeAddEvent::new);
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
        super.setNodeRemoveEventFactory(AddressRefUiNode.class, AddressRefUiNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(CurrentEmploymentNode.class, CurrentEmploymentNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(PreviousEmploymentNode.class, PreviousEmploymentNodeRemoveEvent::new);
        super.setNodeRemoveEventFactory(PersonOtherIncomeNode.class, PersonOtherIncomeNodeRemoveEvent::new);
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
