package ${targetPackage}.${profileInfo.typeName?lower_case}.gen.node;
/* template name: profile_child_factory.ftl */
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import dagger.MembersInjector;
import javax.inject.*;
import ${targetPackage}.gen.node.*;
import ${targetPackage}.gen.di.*;
import java.util.*;


@ComponentScope
public class ${profileInfo.typeName}${parentProfileNodeInfo.typeName}Child${name?cap_first}RuleProvider <#compress>
<#if nodeChildInfo.hasRuleProvider>
    extends ${targetPackage}.gen.node.Child${name?cap_first}RuleProvider
<#else>
    implements RuleProvider<${typeName}>
</#if>
</#compress> {

    @Inject
    public ${profileInfo.typeName}${parentProfileNodeInfo.typeName}Child${name?cap_first}RuleProvider() {
    }

    @Override
    public void initializeState(${typeName} node) {
<#if nodeChildInfo.hasRuleProvider>
        super.initializeState(node);

</#if>
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
<#if nodeChildInfo.hasRuleProvider>
        super.createRules(createdRules);
</#if>
    <#if rules??>
        <#list rules as rule>
        createdRules.add(${rule.typeName?uncap_first}Provider.get());
        </#list>
    </#if>
    }
}
