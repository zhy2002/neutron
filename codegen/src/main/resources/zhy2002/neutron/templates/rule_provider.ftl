package ${targetPackage}.gen.rule;

import zhy2002.neutron.*;
import java.util.*;
import ${targetPackage}.gen.*;
import ${targetPackage}.impl.*;
import javax.inject.*;
import dagger.MembersInjector;

@Singleton
public class ${typeName}RuleProvider implements RuleProvider<${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if>> {

    @Inject
    public ${typeName}RuleProvider() {}

<#list rules as rule>
    @Inject
    MembersInjector<${rule.typeName}> ${rule.typeName?uncap_first}Injector;
 </#list>

    @Override
    public List<UiNodeRule<${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if>>> createRules(${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if> node) {
        List<UiNodeRule<${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if>>> rules = new ArrayList<>();
    <#list rules as rule>
        rules.add(create${rule.typeName}(node));
    </#list>
        return rules;
    }

<#list rules as rule>
    private ${rule.typeName} create${rule.typeName}(${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if> node) {
        ${rule.typeName} rule = new${rule.typeName}(node);
        ${rule.typeName?uncap_first}Injector.injectMembers(rule);
        return rule;
    }

</#list>

<#list rules as rule>
    protected ${rule.typeName} new${rule.typeName}(${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if> node) {
        return new ${rule.typeName}Impl(node);
    }
</#list>
}
