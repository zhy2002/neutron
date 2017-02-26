package ${targetPackage}.gen.di;
import dagger.*;
import javax.inject.Named;
import ${targetPackage}.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ${typeName}Module {

    private final ${genericTypeName} owner;

    public ${typeName}Module(${genericTypeName} owner) {
        this.owner = owner;
    }

<#--make the owner node as injectable for all base types-->
<#list baseTypes as baseType>
    @Provides @${typeName}Scope @Owner ${baseType.genericTypeName} provide${baseType.typeName}() {
        return owner;
    }

</#list>
}