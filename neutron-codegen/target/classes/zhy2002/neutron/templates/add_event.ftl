package ${targetPackage}.gen.event;

import ${targetPackage}.gen.node.${typeName};
import zhy2002.neutron.NodeAddEvent;


public class ${typeName}AddEvent extends NodeAddEvent<${genericTypeName}> {

    public ${typeName}AddEvent(${genericTypeName} target) {
        super(target);
    }
}
