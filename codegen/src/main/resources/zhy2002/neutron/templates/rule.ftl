package ${targetPackage}.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import ${targetPackage}.gen.*;


public abstract class ${typeName} extends ${baseTypeName}<${ownerTypeName}> {

    public ${typeName}(${ownerTypeName} owner) {
        super(owner);
    }

    protected ${ownerTypeName} get${ownerTypeName}() {
        return getOwner();
    }
}
