package ${targetPackage}.gen.event;

import ${targetPackage}.gen.${typeName};
import zhy2002.neutron.NodeAddEvent;


public class ${typeName}AddEvent extends NodeAddEvent<${typeName}> {

    public ${typeName}AddEvent(${typeName} target) {
        super(target);
    }
}
