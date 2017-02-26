package ${targetPackage}.gen.event;

import ${targetPackage}.gen.node.${typeName};
import zhy2002.neutron.NodeUnloadEvent;
import zhy2002.neutron.UiNode;

public class ${typeName}UnloadEvent extends NodeUnloadEvent<${genericTypeName}> {

    public ${typeName}UnloadEvent(${genericTypeName} target) {
        super(target);
    }
}
