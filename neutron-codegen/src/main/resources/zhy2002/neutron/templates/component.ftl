package ${targetPackage}.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import ${targetPackage}.gen.node.*;
import zhy2002.neutron.RuleProvider;
<#if !abstractNode && parentType.children ??>
import java.util.*;
</#if>

<#if !abstractNode>
@ComponentScope
@Subcomponent(modules = {${typeName}Module.class})
</#if>
public interface ${typeName}Component <#if baseType?? && baseType.hasComponent>extends ${baseType.typeName}Component </#if>{

<#if childTypes??>
    <#list childTypes as childType>
    <#if !childType.abstractNode>
    ${childType.typeName} create${childType.typeName}();
    </#if>
    </#list>
</#if>

<#if !abstractNode>
    RuleProvider<${typeName}> get${typeName}RuleProvider();
    <#if parentType.children ??>
    Map<String, RuleProvider<${typeName}>> getInstanceRuleProviders();
    </#if>

    @Subcomponent.Builder
    interface Builder {

        Builder set${typeName}Module(${typeName}Module module);

        ${typeName}Component build();
    }

</#if>
}
