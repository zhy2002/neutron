package ${targetPackage}.gen.event;

import ${targetPackage}.gen.${typeName};
import zhy2002.neutron.NodeLoadEvent;
import zhy2002.neutron.UiNode;

public class ${typeName}LoadEvent extends NodeLoadEvent<${genericTypeName}> {

    public ${typeName}LoadEvent(${genericTypeName} target) {
        super(target);
    }
}
