package zhy2002.examples.register.gen;

import zhy2002.examples.register.gen.event.*;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.data.*;
import zhy2002.neutron.event.*;

import java.math.BigDecimal;

/**
* The generated factory register with all the default implementation instances.
*/
class RegisterNodeClassRegistry extends ClassRegistryImpl {

    RegisterNodeClassRegistry() {
        loadChildNodeFactories();
        loadNodeAddEventFactories();
        loadNodeRemoveEventFactories();
        loadNodeLoadEventFactories();
        loadNodeUnloadEventFactories();
    }

    private void loadChildNodeFactories() {
        setChildNodeFactory(UsernameNode.class, new UsernameNodeFactory());
        setChildNodeFactory(EmailNode.class, new EmailNodeFactory());
        setChildNodeFactory(PasswordNode.class, new PasswordNodeFactory());
        setChildNodeFactory(RepeatPasswordNode.class, new RepeatPasswordNodeFactory());
        setChildNodeFactory(AgeNode.class, new AgeNodeFactory());
        setChildNodeFactory(PlanNode.class, new PlanNodeFactory());
        setChildNodeFactory(ReceiveOffersNode.class, new ReceiveOffersNodeFactory());
        setChildNodeFactory(OwnInvestmentPropertyNode.class, new OwnInvestmentPropertyNodeFactory());
        setChildNodeFactory(PropertyAddressNode.class, new PropertyAddressNodeFactory());
        setChildNodeFactory(PropertyStateNode.class, new PropertyStateNodeFactory());
        setChildNodeFactory(PropertyDetailsNode.class, new PropertyDetailsNodeFactory());
        setChildNodeFactory(CountryCodeNode.class, new CountryCodeNodeFactory());
        setChildNodeFactory(AreaCodeNode.class, new AreaCodeNodeFactory());
        setChildNodeFactory(PhoneNumberNode.class, new PhoneNumberNodeFactory());
        setChildNodeFactory(PhoneInfoNode.class, new PhoneInfoNodeFactory());
        setChildNodeFactory(ErrorNode.class, new ErrorNodeFactory());
        setChildNodeFactory(ErrorListNode.class, new ErrorListNodeFactory());
    }

    private void loadNodeAddEventFactories() {
        super.setNodeAddEventFactory(ErrorNode.class, ErrorNodeAddEvent::new);
    }

    private void loadNodeRemoveEventFactories() {
        super.setNodeRemoveEventFactory(ErrorNode.class, ErrorNodeRemoveEvent::new);
    }

    private void loadNodeLoadEventFactories() {
        super.setNodeLoadEventFactory(PropertyDetailsNode.class, PropertyDetailsNodeLoadEvent::new);
        super.setNodeLoadEventFactory(RegisterNode.class, RegisterNodeLoadEvent::new);
    }

    private void loadNodeUnloadEventFactories() {
        super.setNodeUnloadEventFactory(PropertyDetailsNode.class, PropertyDetailsNodeUnloadEvent::new);
        super.setNodeUnloadEventFactory(RegisterNode.class, RegisterNodeUnloadEvent::new);
    }
}
