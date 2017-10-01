package ${targetPackage}.gen.event;
/* template name: add_event.ftl */
import ${targetPackage}.gen.node.${typeName};
import zhy2002.neutron.core.NodeAddEvent;


public class ${typeName}AddEvent extends NodeAddEvent<${genericTypeName}> {

    public ${typeName}AddEvent(${genericTypeName} target) {
        super(target);
    }
}
