package ${targetPackage}.gen;

import ${targetPackage}.gen.event.*;
import ${targetPackage}.gen.node.*;
import ${targetPackage}.data.*;
import zhy2002.neutron.event.EventRegistryImpl;
import javax.inject.*;

@Singleton
public class ${typeName}ClassRegistry extends EventRegistryImpl {

    @Inject
    ${typeName}ClassRegistry() {
        loadNodeLoadEventFactories();
        loadNodeUnloadEventFactories();
        loadStateChangeEventFactories();
    }

    private void loadNodeLoadEventFactories() {
<#list domainInfo.loadEventNodes as node>
        super.setNodeLoadEventFactory(${node.typeName}.class, ${node.typeName}LoadEvent::new);
</#list>
    }

    private void loadNodeUnloadEventFactories() {
<#list domainInfo.loadEventNodes as node>
        super.setNodeUnloadEventFactory(${node.typeName}.class, ${node.typeName}UnloadEvent::new);
</#list>
    }

    private void loadStateChangeEventFactories() {
<#list domainInfo.changeEventNodes as node>
    super.setStateChangeEventFactory(${node.valueTypeName}.class, ${node.valueTypeName}StateChangeEvent::new);
</#list>
    }
}
