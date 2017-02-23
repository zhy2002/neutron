package ${targetPackage}.gen.rule;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import java.util.*;
import ${targetPackage}.gen.di.*;
import javax.inject.*;

<#if !isAbstract>@${typeName}Scope</#if>
public <#if isAbstract>abstract </#if>class ${typeName}RuleProvider extends ${baseTypeName}RuleProvider {

<#if !isAbstract>
    @Inject
    public ${typeName}RuleProvider() {}
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
