package ${targetPackage}.<#if profileInfo??>${profileInfo.typeName?lower_case}.</#if>gen.rule;
/* template name: rule.ftl */
import zhy2002.neutron.core.*;
import ${targetPackage}.gen.node.*;


public abstract class ${typeName} extends ${baseTypeName}<${ownerType.genericTypeName}> {

    public ${typeName}(${ownerType.genericTypeName} owner) {
        super(owner);
    }

    protected ${ownerType.genericTypeName} get${ownerType.typeName}() {
        return getOwner();
    }
}
