package ${targetPackage}.gen.rule;

import zhy2002.neutron.*;
import ${targetPackage}.gen.node.*;


public abstract class ${typeName} extends ${baseTypeName}<${ownerType.genericTypeName}> {

    public ${typeName}(${ownerType.genericTypeName} owner) {
        super(owner);
    }

    protected ${ownerType.genericTypeName} get${ownerType.typeName}() {
        return getOwner();
    }
}
