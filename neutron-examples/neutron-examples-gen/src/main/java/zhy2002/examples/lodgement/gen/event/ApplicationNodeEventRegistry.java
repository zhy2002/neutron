package zhy2002.examples.lodgement.gen.event;

import zhy2002.examples.lodgement.gen.event.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.neutron.event.EventRegistryImpl;
import javax.inject.*;

@Singleton
public class ApplicationNodeEventRegistry extends EventRegistryImpl {

    @Inject
    ApplicationNodeEventRegistry() {
        loadStateChangeEventFactories();
    }

    private void loadStateChangeEventFactories() {
    super.setStateChangeEventFactory(Telephone.class, TelephoneStateChangeEvent::new);
    }
}
