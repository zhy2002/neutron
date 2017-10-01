package ${targetPackage}.gen.event;
/* template name: change_event.ftl */
import zhy2002.neutron.core.*;
import ${targetPackage}.data.*;

public class ${typeName}StateChangeEvent extends StateChangeEvent<${typeName}> {

    public ${typeName}StateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}