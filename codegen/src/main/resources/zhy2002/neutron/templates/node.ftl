package ${targetPackage}.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import ${targetPackage}.data.*;
import ${targetPackage}.gen.rule.*;

public <#if isAbstract>abstract</#if> class ${typeName} extends ${baseTypeName}<#if valueTypeName??><<#if parentTypeName??>${parentTypeName},</#if>${valueTypeName}>
<#elseif itemTypeName??><<#if parentTypeName??>${parentTypeName},</#if>${typeName},${itemTypeName}>
<#else><#if parentTypeName??><${parentTypeName}></#if>
</#if>{
<#if children??>
    <#list children as child>
    private ${child.typeName} ${child.name};
    </#list>

</#if>
<#if parent??>
    ${typeName}(${parent.typeName} parent, String name) {
        super(parent, name);
<#else>
    ${typeName}(@NotNull AbstractUiNodeContext<?> context) {
        super(context);
</#if>
    }

<#if itemTypeName??>
    public Class<${itemTypeName}> getItemClass() {
        return ${itemTypeName}.class;
    }

</#if>
<#if valueTypeName??>
    @JsMethod
    @Override
    public final void setValue(${valueTypeName} value) {
        setValue(${valueTypeName}.class, value);
    }

</#if>
<#if init??>
    @Override
    protected void initializeState() {
        super.initializeState();

    <#list init as prop>
        set${prop.propertyName?cap_first}(${prop.value});
    </#list>
    }

</#if>
<#if properties??>
    <#list properties as prop>
    @JsMethod
    public ${prop.typeName} get${prop.name?cap_first}() {
        return getStateValue(${contextName}Constants.${prop.nameAllCaps}<#if prop.default??>, ${prop.default}</#if>);
    }

    @JsMethod
    public void set${prop.name?cap_first}(${prop.typeName} value) {
        setStateValue(${contextName}Constants.${prop.nameAllCaps}, ${prop.typeName}.class, value);
    }

    </#list>
</#if>
<#if valueWrappers??>
    <#list valueWrappers as wrapper>
    ${wrapper.jsIgnore?then('@JsIgnore', '@JsMethod')}
    public ${wrapper.typeName} get${wrapper.name?cap_first}() {
        return getValue().get${wrapper.wrap?cap_first}();
    }

    ${wrapper.jsIgnore?then('@JsIgnore', '@JsMethod')}
    public void set${wrapper.name?cap_first}(${wrapper.typeName} value) {
        getValue().set${wrapper.wrap?cap_first}(value);
    }
    </#list>
</#if>
<#if children??>
    <#list children as child>
    @JsMethod
    public ${child.typeName} get${child.name?cap_first}() {
        return ${child.name};
    }

    </#list>
</#if>
<#if children??>
    @Override
    protected List<UiNode<?>> createChildren() {
        UiNodeContext<?> context = getContext();

    <#list children as child>
        ${child.name} = context.createChildNode(${child.typeName}.class, this, "${child.name}");
    </#list>

        return Arrays.asList(
    <#list children as child>
            ${child.name}<#if child?has_next>,</#if>
    </#list>
        );
    }

</#if>
<#if rules??>
    @Override
    protected EnhancedLinkedList<UiNodeRule<?>> createOwnRules() {
        return super.createOwnRules()
    <#list rules as rule>
            .and(getContext().createUiNodeRule(${rule.typeName}.class, this))
    </#list>
        ;
    }
</#if>
}
