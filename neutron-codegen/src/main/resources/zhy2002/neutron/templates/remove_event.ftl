package ${targetPackage}.gen.event;
/* template name: remove_event.ftl */
import ${targetPackage}.gen.node.${typeName};
import zhy2002.neutron.core.NodeRemoveEvent;


public class ${typeName}RemoveEvent extends NodeRemoveEvent<${genericTypeName}> {
    public ${typeName}RemoveEvent(${genericTypeName} target) {
        super(target);
    }
}