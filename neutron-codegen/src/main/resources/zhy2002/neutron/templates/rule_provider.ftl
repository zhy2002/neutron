package ${targetPackage}.gen.node;
/* template name: rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.core.*;
import zhy2002.neutron.core.node.*;
import zhy2002.neutron.core.di.ComponentScope;
<#if rules??>
import zhy2002.neutron.core.rule.*;
import ${targetPackage}.rule.*;
import ${targetPackage}.gen.rule.*;
</#if>
import ${targetPackage}.gen.node.${typeName};
import ${targetPackage}.gen.di.*;
<#if init??>
import ${targetPackage}.data.*;
import java.math.*;
</#if>

<#if !abstractNode>@ComponentScope</#if>
public class ${typeName}RuleProvider implements RuleProvider<${genericTypeName}> {

    <#if baseTypeInDomain>
    @Inject
    ${baseTypeName}RuleProvider parentRuleProvider;
    </#if>

    @Inject
    public ${typeName}RuleProvider() {
    }

<#if rules??>
    <#list rules as rule>
    @Inject
    Provider<${rule.typeName}> ${rule.typeName?uncap_first}Provider;
    </#list>

</#if>
    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
<#if baseTypeInDomain>
        parentRuleProvider.createRules(createdRules);
</#if>
    <#if rules??>
        <#list rules as rule>
        ${rule.typeName} ${rule.typeName?uncap_first} = ${rule.typeName?uncap_first}Provider.get();
        <#if rule.init??>
            <#list rule.init as prop>
        ${rule.typeName?uncap_first}.set${prop.propertyName?cap_first}(${prop.value});
            </#list>
        </#if>
        createdRules.add(${rule.typeName?uncap_first});
        </#list>
    </#if>
    }

}
