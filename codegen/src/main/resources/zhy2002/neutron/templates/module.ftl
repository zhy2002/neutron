package ${targetPackage}.gen.di;
import dagger.*;
import javax.inject.Named;
import ${targetPackage}.gen.*;

@Module(subcomponents = {
})
@${typeName}Scope
public class ${typeName}Module {

<#if parent.itemTypeName??>
    String getItemName() {
        return "";
    }
</#if>

<#list exports as child>
    @Provides
    @${typeName}Scope
    <#if child.name??>
    @Named("${child.name}")
    </#if>
    ${child.typeName} provide<#if child.name??>${child.name?cap_first}<#else>${child.typeName}</#if>(
        ${parent.typeName} parent,
        MembersInjector<${child.typeName}> injector
    ) {
        ${child.typeName} node = new ${child.typeName}(parent, <#if child.name??>"${child.name}"<#else>getItemName()</#if>);

        injector.injectMembers(node);
        return node;
    }

</#list>
}