package ${targetPackage}.gen.di;
import dagger.*;
import javax.inject.Named;
import ${targetPackage}.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ${typeName}Module {

    private final ${typeName} owner;

    public ${typeName}Module(${typeName} owner) {
        this.owner = owner;
    }

<#--make the owner node as injectable for all base types-->
<#list baseTypes as baseType>
    @Provides @${typeName}Scope @Owner ${baseType.refName} provide${baseType.typeName}() {
        return owner;
    }

</#list>


<#--<#if parent.itemTypeName??>-->
<#--String getItemName() {-->
<#--return String.valueOf(parent.getChildSequenceNumber());-->
<#--}-->
<#--</#if>-->

<#--<#list exports as child>-->
<#--@Provides-->
<#--@${typeName}Scope-->
    <#--<#if child.name??>-->
    <#--@Named("${child.name}")-->
    <#--</#if>-->
<#--${child.typeName} provide<#if child.name??>${child.name?cap_first}<#else>${child.typeName}</#if>(-->
<#--MembersInjector<${child.typeName}> injector-->
<#--) {-->
<#--${child.typeName} node = new ${child.typeName}(parent, <#if child.name??>"${child.name}"<#else>getItemName()</#if>);-->

<#--injector.injectMembers(node);-->
<#--return node;-->
<#--}-->

<#--</#list>-->
}