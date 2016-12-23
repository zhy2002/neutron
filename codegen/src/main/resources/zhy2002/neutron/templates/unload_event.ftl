package ${targetPackage}.gen.event;

import ${targetPackage}.gen.${typeName};
import zhy2002.neutron.NodeUnloadEvent;
import zhy2002.neutron.UiNode;

public class ${typeName}UnloadEvent extends NodeUnloadEvent<${typeName}> {

    public ${typeName}UnloadEvent(UiNode<?> target) {
        super(target);
    }
}
