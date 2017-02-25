package ${targetPackage}.gen;

import ${targetPackage}.gen.event.*;
import ${targetPackage}.data.*;
import zhy2002.neutron.ClassRegistryImpl;

class ${contextName}ClassRegistry extends ClassRegistryImpl {

    ${contextName}ClassRegistry() {
        loadNodeLoadEventFactories();
        loadNodeUnloadEventFactories();
        loadStateChangeEventFactories();
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

    private void loadStateChangeEventFactories() {
<#list changeEventNodes as node>
    super.setStateChangeEventFactory(${node.valueTypeName}.class, ${node.valueTypeName}StateChangeEvent::new);
</#list>
    }
}
