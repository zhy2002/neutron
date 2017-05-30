package ${targetPackage}.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import ${targetPackage}.gen.di.*;
import java.util.*;


interface ${typeName}ChildFactory {
<#list children as child>
    ${child.typeName} create${child.name?cap_first}();
</#list>
}

@Singleton
public class ${typeName}ChildProvider {
<#list distinctChildTypeNames as childTypeName>
    @Inject
    MembersInjector<${childTypeName}> ${childTypeName?uncap_first}Injector;
</#list>

    @Inject
    protected ${typeName}ChildProvider () {}

<#list distinctChildTypeNames as childTypeName>
    protected MembersInjector<${childTypeName}> get${childTypeName}Injector() {
        return this.${childTypeName?uncap_first}Injector;
    }

</#list>
<#list children as child>
    protected ${child.typeName} new${child.name?cap_first}(
        ${genericTypeName} parent,
        String name
    ) {
        return new ${child.typeName}(parent, name);
    }

    protected void configure${child.name?cap_first}(${child.typeName} node) {
    }

    @${child.typeName}Scope
    public static class ${child.name?cap_first}RuleProvider implements RuleProvider<${child.typeName}> {

        @Inject
        public ${child.name?cap_first}RuleProvider() {

        }

        @Override
        public void initializeState(${child.typeName} node) {
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
        <#if child.rules??>
            <#list child.rules as rule>
            createdRules.add(${rule.typeName?uncap_first}Provider.get());
            </#list>
        </#if>
        }
    }

</#list>
    ${typeName}ChildFactory createFactory(${genericTypeName} parent) {
        return new ${typeName}ChildFactoryImpl(parent);
    }

    private class ${typeName}ChildFactoryImpl implements ${typeName}ChildFactory {

        private final ${genericTypeName} parent;
        
        private ${typeName}ChildFactoryImpl(${genericTypeName} parent) {
            this.parent = parent;
        }

<#list children as child>
        @Override
        public ${child.typeName} create${child.name?cap_first}() {
            ${child.typeName} node = new${child.name?cap_first}(parent, "${child.name}");
            ${child.typeName?uncap_first}Injector.injectMembers(node);
            configure${child.name?cap_first}(node);
            return node;
        }

</#list>
    }
}
