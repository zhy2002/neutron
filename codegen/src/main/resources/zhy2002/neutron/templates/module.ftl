package ${targetPackage}.gen.di;
import dagger.*;
import javax.inject.Named;
import ${targetPackage}.gen.*;

@Module(subcomponents = {
<#list parent.moduleChildTypes as childType>
    ${childType.typeName}<#if childType.itemTypeName??>Item<#else>Child</#if>Component.class<#if childType?has_next>,</#if>
</#list>
})
@${typeName}Scope
public class ${typeName}Module {

    private final ${parent.typeName} parent;

    public ${typeName}Module(${parent.typeName} parent) {
        this.parent = parent;
    }

<#if parent.itemTypeName??>
    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }
</#if>

<#list exports as child>
    @Provides
    @${typeName}Scope
    <#if child.name??>
    @Named("${child.name}")
    </#if>
    ${child.typeName} provide<#if child.name??>${child.name?cap_first}<#else>${child.typeName}</#if>(
        MembersInjector<${child.typeName}> injector
    ) {
        ${child.typeName} node = new ${child.typeName}(parent, <#if child.name??>"${child.name}"<#else>getItemName()</#if>);

        injector.injectMembers(node);
        return node;
    }

</#list>
}