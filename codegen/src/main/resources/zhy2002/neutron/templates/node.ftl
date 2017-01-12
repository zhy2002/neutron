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
<#if rules??>
import ${targetPackage}.gen.rule.*;
</#if>

public <#if isAbstract>abstract</#if> class ${typeName}<#if parentBaseTypeName?? && isAbstract??><P extends ${parentBaseTypeName}></#if> extends ${baseTypeName}<#if valueTypeName??><<#if parentTypeName??>${parentTypeName},</#if>${valueTypeName}>
<#elseif itemTypeName??><<#if parentTypeName??>${parentTypeName},</#if>${typeName},${itemTypeName}>
<#else><#if parentTypeName??><${parentTypeName}></#if>
</#if>{
<#if children??>
    <#list children as child>
    private ${child.typeName} ${child.name};
    </#list>

</#if>
<#if parent??>
    protected ${typeName}(${parent.typeName} parent, String name) {
        super(parent, name);
<#else>
    protected ${typeName}(@NotNull AbstractUiNodeContext<?> context) {
        super(context);
</#if>
    }

<#if itemTypeName??>
    @Override
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
        <#if prop.value??>
        set${prop.propertyName?cap_first}(${prop.value});
        </#if>
        <#if prop.mode??>
        setChangeTrackingMode(${contextName}Constants.${prop.nameAllCaps}, ChangeTrackingModeEnum.${prop.mode});
        </#if>
    </#list>
    }

</#if>
<#if properties??>
    <#list properties as prop>
    @JsMethod
    public ${prop.externalTypeName} get${prop.name?cap_first}() {
        return getStateValue(${contextName}Constants.${prop.nameAllCaps}<#if prop.default??>, ${prop.default}</#if>);
    }

    @JsMethod
    public void set${prop.name?cap_first}(${prop.externalTypeName} value) {
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
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        UiNodeContext<?> context = getContext();
    <#list rules as rule>
        createdRules.add(context.createUiNodeRule(${rule.typeName}.class, this));
    </#list>
    }

</#if>

<#if valueTypeName??>
    @Override
    public ${valueTypeName} getCopyOfValue() {
        ${valueTypeName} value = getValue();
        if(value == null)
            return new ${valueTypeName}();
        return new ${valueTypeName}(value);
    }

    private static ${valueTypeName} EMPTY_VALUE = new ${valueTypeName}();

    @Override
    public boolean hasValue() {
        ${valueTypeName} value = getValue();
        return value != null && !value.equals(EMPTY_VALUE);
    }

    @Override
    public Class<${valueTypeName}> getValueClass() {
    return ${valueTypeName}.class;
    }

</#if>

<#if parent??>
    <#if parent.localRequired??>

    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

    </#if>
</#if>
}
