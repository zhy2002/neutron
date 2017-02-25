package zhy2002.examples.app.gen;

import zhy2002.examples.app.gen.event.*;
import zhy2002.examples.app.data.*;
import zhy2002.neutron.ClassRegistryImpl;

class LodgementNodeClassRegistry extends ClassRegistryImpl {

    LodgementNodeClassRegistry() {
        loadNodeLoadEventFactories();
        loadNodeUnloadEventFactories();
        loadStateChangeEventFactories();
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
