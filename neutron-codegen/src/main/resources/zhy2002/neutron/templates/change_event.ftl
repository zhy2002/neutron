package ${targetPackage}.gen.event;

import zhy2002.neutron.*;
import ${targetPackage}.data.*;

public class ${typeName}StateChangeEvent extends StateChangeEvent<${typeName}> {

    public ${typeName}StateChangeEvent(UiNode<?> target, String key) {
        super(target, key);
    }
}