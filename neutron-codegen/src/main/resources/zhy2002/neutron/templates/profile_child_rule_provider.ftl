package ${targetPackage}.${profileInfo.typeName?lower_case}.gen.node;
/* template name: profile_child_factory.ftl */
import zhy2002.neutron.core.*;
import zhy2002.neutron.core.di.ComponentScope;
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
