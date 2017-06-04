package zhy2002.examples.app.gen.event;

import zhy2002.examples.app.data.*;
import zhy2002.neutron.event.EventRegistryImpl;
import javax.inject.*;

@Singleton
public class LodgementEventRegistry extends EventRegistryImpl {

    @Inject
    LodgementEventRegistry() {
        loadStateChangeEventFactories();
    }

    private void loadStateChangeEventFactories() {
    }
}
