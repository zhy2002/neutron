package ${targetPackage}.gen.event;

import ${targetPackage}.gen.event.*;
import ${targetPackage}.gen.node.*;
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
<#list domainInfo.changeEventNodes as node>
    super.setStateChangeEventFactory(${node.valueTypeName}.class, ${node.valueTypeName}StateChangeEvent::new);
</#list>
    }
}
