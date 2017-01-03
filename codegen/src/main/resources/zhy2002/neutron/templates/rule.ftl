package ${targetPackage}.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import ${targetPackage}.gen.*;


public abstract class ${typeName} extends ${baseTypeName}<${parentTypeName}> {

    public ${typeName}(${parentTypeName} owner) {
        super(owner);
    }

    protected ${parentTypeName} get${ownerTypeName}() {
        return getOwner();
    }
}
