package ${targetPackage}.gen.node;
/* template name: child_rule_provider.ftl */
import zhy2002.neutron.core.*;
import zhy2002.neutron.core.di.ComponentScope;
import javax.inject.*;
import ${targetPackage}.gen.di.*;
import java.util.*;


@ComponentScope
public class ${parentType.typeName}Child${name?cap_first}RuleProvider implements RuleProvider<${typeName}> {

    @Inject
    public ${parentType.typeName}Child${name?cap_first}RuleProvider() {
    }

<#if rules??>
    <#list rules as rule>
    @Inject
    Provider<${rule.typeName}> ${rule.typeName?uncap_first}Provider;
    </#list>
</#if>

    @Override
    public void createRules(List<UiNodeRule<?>> createdRules) {
    <#if rules??>
        <#list rules as rule>
        createdRules.add(${rule.typeName?uncap_first}Provider.get());
        </#list>
    </#if>
    }
}
