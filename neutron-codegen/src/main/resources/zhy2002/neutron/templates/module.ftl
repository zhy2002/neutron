package ${targetPackage}.gen.di;
import dagger.*;
import javax.inject.*;
import ${targetPackage}.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;
<#if !abstractNode && parentType.children ??>
import java.util.*;
</#if>


@Module
public class ${typeName}Module {

    private final ${genericTypeName} owner;

    public ${typeName}Module(${genericTypeName} owner) {
        this.owner = owner;
    }

<#--make the owner node as injectable for all base types-->
<#list baseTypes as baseType>
    @Provides @ComponentScope @Owner ${baseType.genericTypeName} provide${baseType.typeName}() {
        return owner;
    }

</#list>
    @Provides @ChildName String provideChildName() {
        return owner.getContext().getNameOfNodeBeingCreated();
    }

<#if parentType.typeName != "VoidUiNode">
    @Provides @ComponentScope ${parentType.genericTypeName} provide${parentType.typeName}() {
        return owner.getParent();
    }

</#if>
    @Provides @ComponentScope
    RuleProvider<${typeName}> provideRuleProvider(Provider<${typeName}RuleProvider> provider) {
        return provider.get();
    }

<#if !abstractNode && parentType.children ??>
    @Provides @ComponentScope
    Map<String, RuleProvider<${typeName}>> provideInstanceProviderMap(
    <#assign firstItem = true />
    <#list parentType.children as child>
        <#if child.typeName == typeName>
        <#if firstItem><#assign firstItem = false/><#else>,</#if>Provider<${parentType.typeName}ChildProvider.${child.name?cap_first}RuleProvider> ${child.name}RuleProvider
        </#if>
    </#list>
    ) {
        Map<String, RuleProvider<${typeName}>> result = new HashMap<>();
    <#list parentType.children as child>
        <#if child.typeName == typeName>
        result.put("${child.name}", ${child.name}RuleProvider.get());
        </#if>
    </#list>
        return result;
    }
</#if>
}