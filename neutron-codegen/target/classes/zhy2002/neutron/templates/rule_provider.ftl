package ${targetPackage}.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import ${targetPackage}.gen.di.*;
import javax.inject.*;
import ${targetPackage}.gen.node.${typeName};


<#if !abstractNode>@${typeName}Scope</#if>
public <#if abstractNode>abstract </#if>class ${typeName}RuleProvider<#if abstractNode><N extends ${genericTypeName}></#if>
    extends ${baseTypeName}RuleProvider<#if abstractNode> <N><#else><${genericTypeName}></#if> {

<#if !abstractNode>
    @Inject
    public ${typeName}RuleProvider() {}

    @Override
    public void initializeState(${genericTypeName} node) {
    }

</#if>

<#if rules??>
    <#list rules as rule>
    @Inject
    Provider<${rule.typeName}> ${rule.typeName?uncap_first}Provider;
    </#list>
</#if>

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        <#if rules??>
            <#list rules as rule>
            createdRules.add(${rule.typeName?uncap_first}Provider.get());
            </#list>
        </#if>
    }

}
