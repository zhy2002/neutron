package zhy2002.examples.app.gen;

import zhy2002.examples.app.gen.event.*;
import zhy2002.examples.app.data.*;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.data.*;
import zhy2002.neutron.event.*;

import java.math.BigDecimal;

/**
* The generated factory register with all the default implementation instances.
*/
class LodgementNodeClassRegistry extends ClassRegistryImpl {

    LodgementNodeClassRegistry() {
        loadChildNodeFactories();
        loadNodeAddEventFactories();
        loadNodeRemoveEventFactories();
        loadNodeLoadEventFactories();
        loadNodeUnloadEventFactories();
        loadStateChangeEventFactories();
    }

    private void loadChildNodeFactories() {
        setChildNodeFactory(AppManagerNode.class, new AppManagerNodeFactory());
    }

    private void loadNodeAddEventFactories() {
    }

    private void loadNodeRemoveEventFactories() {
    }

    private void loadNodeLoadEventFactories() {
        super.setNodeLoadEventFactory(LodgementNode.class, LodgementNodeLoadEvent::new);
    }

    private void loadNodeUnloadEventFactories() {
        super.setNodeUnloadEventFactory(LodgementNode.class, LodgementNodeUnloadEvent::new);
    }

private void loadStateChangeEventFactories() {
}
}
