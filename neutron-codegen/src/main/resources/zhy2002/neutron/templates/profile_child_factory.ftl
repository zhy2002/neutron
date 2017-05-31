package ${targetPackage}.${profileInfo.typeName?lower_case}.gen.node;
/* template name: profile_child_factory.ftl */
import zhy2002.neutron.*;
import zhy2002.neutron.di.ComponentScope;
import dagger.MembersInjector;
import javax.inject.*;
import ${targetPackage}.gen.node.*;
import ${targetPackage}.gen.di.*;
import java.util.*;


public class ${profileInfo.typeName}${typeName}ChildProvider {
<#list children as child>

    @ComponentScope
    public static class ${child.name?cap_first}RuleProvider extends ${typeName}ChildProvider.${child.name?cap_first}RuleProvider {

        @Inject
        public ${child.name?cap_first}RuleProvider() {

        }

        @Override
        public void initializeState(${child.typeName} node) {
            super.initializeState(node);

    <#if child.init??>
        <#list child.init as prop>
            <#if prop.value??>
            node.set${prop.propertyName?cap_first}(${prop.value});
            </#if>
            <#if prop.mode??>
            node.setChangeTrackingMode(${contextName}Constants.${prop.nameAllCaps}, ChangeTrackingModeEnum.${prop.mode});
            </#if>
        </#list>
    </#if>
        }

    <#if child.rules??>
        <#list child.rules as rule>
        @Inject
        Provider<${rule.typeName}> ${rule.typeName?uncap_first}Provider;
        </#list>
    </#if>

        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
            super.createRules(createdRules);
        <#if child.rules??>
            <#list child.rules as rule>
            createdRules.add(${rule.typeName?uncap_first}Provider.get());
            </#list>
        </#if>
        }
    }

</#list>
}
