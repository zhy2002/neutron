package ${targetPackage}.gen.event;
/* template name: load_event.ftl */
import ${targetPackage}.gen.node.${typeName};
import zhy2002.neutron.core.NodeLoadEvent;


public class ${typeName}LoadEvent extends NodeLoadEvent<${genericTypeName}> {

    public ${typeName}LoadEvent(${genericTypeName} target) {
        super(target);
    }
}
