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
        loadStateChangeEventFactories();
    }

    private void loadStateChangeEventFactories() {
<#list domainInfo.changeEventNodes as node>
    super.setStateChangeEventFactory(${node.valueTypeName}.class, ${node.valueTypeName}StateChangeEvent::new);
</#list>
    }
}
