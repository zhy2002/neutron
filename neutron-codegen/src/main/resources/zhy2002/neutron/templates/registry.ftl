package ${targetPackage}.gen.event;

import ${targetPackage}.data.*;
import zhy2002.neutron.event.EventRegistryImpl;
import javax.inject.*;

@Singleton
public class ${typeName}EventRegistry extends EventRegistryImpl {

    @Inject
    ${typeName}EventRegistry() {
        loadStateChangeEventFactories();
    }

    private void loadStateChangeEventFactories() {
<#list changeEvents as event>
    super.setStateChangeEventFactory(${event.typeName}.class, ${event.typeName}StateChangeEvent::new);
</#list>
    }
}
