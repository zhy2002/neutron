package zhy2002.examples.register.gen.event;

import zhy2002.examples.register.data.*;
import zhy2002.neutron.event.EventRegistryImpl;
import javax.inject.*;

@Singleton
public class RegisterEventRegistry extends EventRegistryImpl {

    @Inject
    RegisterEventRegistry() {
        loadStateChangeEventFactories();
    }

    private void loadStateChangeEventFactories() {
    }
}
