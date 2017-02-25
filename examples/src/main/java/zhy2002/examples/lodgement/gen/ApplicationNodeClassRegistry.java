package zhy2002.examples.lodgement.gen;

import zhy2002.examples.lodgement.gen.event.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.neutron.ClassRegistryImpl;

class ApplicationNodeClassRegistry extends ClassRegistryImpl {

    ApplicationNodeClassRegistry() {
        loadNodeLoadEventFactories();
        loadNodeUnloadEventFactories();
        loadStateChangeEventFactories();
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
