package zhy2002.examples.app.gen;

import zhy2002.examples.app.gen.event.*;
import zhy2002.examples.app.gen.node.*;
import zhy2002.examples.app.data.*;
import zhy2002.neutron.event.EventRegistryImpl;
import javax.inject.*;

@Singleton
public class LodgementNodeClassRegistry extends EventRegistryImpl {

    @Inject
    LodgementNodeClassRegistry() {
        loadStateChangeEventFactories();
    }

    private void loadStateChangeEventFactories() {
    }
}
