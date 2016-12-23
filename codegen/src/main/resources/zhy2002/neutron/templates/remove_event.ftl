package ${targetPackage}.gen.event;

import ${targetPackage}.gen.${typeName};
import zhy2002.neutron.NodeRemoveEvent;


public class ${typeName}RemoveEvent extends NodeRemoveEvent<${typeName}> {
    public ${typeName}RemoveEvent(${typeName} target) {
        super(target);
    }
}