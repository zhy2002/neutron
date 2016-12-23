package ${targetPackage}.gen;

import ${targetPackage}.gen.event.*;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.data.*;
import zhy2002.neutron.event.*;

import java.math.BigDecimal;

/**
* The generated factory register with all the default implementation instances.
*/
class ${contextName}ClassRegistry extends ClassRegistryImpl {

    ${contextName}ClassRegistry() {
        loadChildNodeFactories();
        loadNodeAddEventFactories();
        loadNodeRemoveEventFactories();
        loadNodeLoadEventFactories();
        loadNodeUnloadEventFactories();
    }

    private void loadChildNodeFactories() {
<#list childNodes as child>
        setChildNodeFactory(${child.typeName}.class, new ${child.typeName}Factory());
</#list>
    }

    private void loadNodeAddEventFactories() {
<#list addEventNodes as node>
        super.setNodeAddEventFactory(${node.typeName}.class, ${node.typeName}AddEvent::new);
</#list>
    }

    private void loadNodeRemoveEventFactories() {
<#list addEventNodes as node>
        super.setNodeRemoveEventFactory(${node.typeName}.class, ${node.typeName}RemoveEvent::new);
</#list>
    }

    private void loadNodeLoadEventFactories() {
<#list loadEventNodes as node>
        super.setNodeLoadEventFactory(${node.typeName}.class, ${node.typeName}LoadEvent::new);
</#list>
    }

    private void loadNodeUnloadEventFactories() {
<#list loadEventNodes as node>
        super.setNodeUnloadEventFactory(${node.typeName}.class, ${node.typeName}UnloadEvent::new);
</#list>
    }
}
