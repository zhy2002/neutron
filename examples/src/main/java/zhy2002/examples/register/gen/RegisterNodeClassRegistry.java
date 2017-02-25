package zhy2002.examples.register.gen;

import zhy2002.examples.register.gen.event.*;
import zhy2002.examples.register.data.*;
import zhy2002.neutron.ClassRegistryImpl;

class RegisterNodeClassRegistry extends ClassRegistryImpl {

    RegisterNodeClassRegistry() {
        loadNodeLoadEventFactories();
        loadNodeUnloadEventFactories();
        loadStateChangeEventFactories();
    }

    private void loadNodeLoadEventFactories() {
        super.setNodeLoadEventFactory(PropertyDetailsNode.class, PropertyDetailsNodeLoadEvent::new);
        super.setNodeLoadEventFactory(RegisterNode.class, RegisterNodeLoadEvent::new);
    }

    private void loadNodeUnloadEventFactories() {
        super.setNodeUnloadEventFactory(PropertyDetailsNode.class, PropertyDetailsNodeUnloadEvent::new);
        super.setNodeUnloadEventFactory(RegisterNode.class, RegisterNodeUnloadEvent::new);
    }

    private void loadStateChangeEventFactories() {
    }
}
