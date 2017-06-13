package ${targetPackage}.${profileInfo.typeName?lower_case}.gen.node;
/* template name: profile_rule_provider.ftl */
import java.util.*;
import javax.inject.*;
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import ${targetPackage}.gen.di.*;
import ${targetPackage}.gen.node.*;
<#if init??>
import ${targetPackage}.data.*;
import java.math.*;
</#if>
<#if rules??>
import zhy2002.neutron.rule.*;
import ${targetPackage}.gen.rule.*;
import ${targetPackage}.${profileInfo.typeName?lower_case}.gen.rule.*;
import ${targetPackage}.shared.*;
</#if>


<#if !nodeInfo.abstractNode>@ComponentScope</#if>
public class ${profileInfo.typeName}${typeName}RuleProvider extends ${typeName}RuleProvider {

    @Inject
    public ${profileInfo.typeName}${typeName}RuleProvider() {
    }

    @Override
    public void initializeState(${nodeInfo.genericTypeName} node) {
        super.initializeState(node);

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
    <#list uniqueRuleTypeNames as ruleTypeName>
    @Inject
    Provider<${ruleTypeName}> ${ruleTypeName?uncap_first}Provider;
    </#list>

</#if>
    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

    <#if rules??>
        <#list rules as rule>
        {
            ${rule.typeName} ${rule.typeName?uncap_first} = ${rule.typeName?uncap_first}Provider.get();
            <#if rule.init??>
                <#list rule.init as prop>
            ${rule.typeName?uncap_first}.set${prop.propertyName?cap_first}(${prop.value});
                </#list>
            </#if>
            createdRules.add(${rule.typeName?uncap_first});
        }
        </#list>
    </#if>
    }

}
