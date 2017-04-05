package ${targetPackage}.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import ${targetPackage}.gen.di.*;
import javax.inject.*;
import ${targetPackage}.gen.rule.*;
import zhy2002.neutron.rule.*;
<#if init??>
import ${targetPackage}.data.*;
import java.math.*;
</#if>

<#if !abstractNode>@${typeName}Scope</#if>
public class ${typeName}RuleProvider implements RuleProvider<${genericTypeName}> {

    @Inject
    ${baseTypeName}RuleProvider parentRuleProvider;

    @Inject
    public ${typeName}RuleProvider() {
    }

    @Override
    public void initializeState(${genericTypeName} node) {
        parentRuleProvider.initializeState(node);

<#if init??>
    <#list init as prop>
        <#if prop.value??>
        node.set${prop.propertyName?cap_first}(${prop.value});
        </#if>
        <#if prop.mode??>
        node.setChangeTrackingMode(${contextName}Constants.${prop.nameAllCaps}, ChangeTrackingModeEnum.${prop.mode});
        </#if>
    </#list>
</#if>
    }

<#if rules??>
    <#list rules as rule>
    @Inject
    Provider<${rule.typeName}> ${rule.typeName?uncap_first}Provider;
    </#list>
</#if>

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        parentRuleProvider.createRules(createdRules);

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
