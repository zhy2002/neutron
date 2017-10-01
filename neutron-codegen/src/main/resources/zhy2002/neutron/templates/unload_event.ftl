package ${targetPackage}.gen.event;
/* template name: unload_event.ftl */
import ${targetPackage}.gen.node.${typeName};
import zhy2002.neutron.core.NodeUnloadEvent;
import zhy2002.neutron.core.UiNode;

public class ${typeName}UnloadEvent extends NodeUnloadEvent<${genericTypeName}> {

    public ${typeName}UnloadEvent(${genericTypeName} target) {
        super(target);
    }
}
