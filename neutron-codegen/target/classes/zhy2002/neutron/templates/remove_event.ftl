package ${targetPackage}.gen.event;

import ${targetPackage}.gen.node.${typeName};
import zhy2002.neutron.NodeRemoveEvent;


public class ${typeName}RemoveEvent extends NodeRemoveEvent<${genericTypeName}> {
    public ${typeName}RemoveEvent(${genericTypeName} target) {
        super(target);
    }
}