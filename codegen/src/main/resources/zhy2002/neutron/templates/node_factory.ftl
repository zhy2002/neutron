package ${targetPackage}.gen;

import zhy2002.neutron.*;

public class ${typeName}Factory implements ChildNodeFactory<${typeName}, <#if parentTypeName??>${parentTypeName}<#else>${parent.typeName}<#if parent.isAbstract><?></#if></#if>> {

    @Override
    public ${typeName} create(<#if parentTypeName??>${parentTypeName}<#else>${parent.typeName}</#if> parent, String name) {
        return new ${typeName}(parent, name);
    }
}
