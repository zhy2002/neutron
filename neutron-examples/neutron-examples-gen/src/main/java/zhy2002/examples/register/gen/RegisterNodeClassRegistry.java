package zhy2002.examples.register.gen;

import zhy2002.examples.register.gen.event.*;
import zhy2002.examples.register.gen.node.*;
import zhy2002.examples.register.data.*;
import zhy2002.neutron.event.EventRegistryImpl;
import javax.inject.*;

@Singleton
public class RegisterNodeClassRegistry extends EventRegistryImpl {

    @Inject
    RegisterNodeClassRegistry() {
        loadStateChangeEventFactories();
    }

    private void loadStateChangeEventFactories() {
    }
}
