package ${targetPackage}.gen.event;

import ${targetPackage}.gen.${typeName};
import zhy2002.neutron.NodeLoadEvent;
import zhy2002.neutron.UiNode;

public class ${typeName}LoadEvent extends NodeLoadEvent<${typeName}> {

    public ${typeName}LoadEvent(UiNode<?> target) {
        super(target);
    }
}
