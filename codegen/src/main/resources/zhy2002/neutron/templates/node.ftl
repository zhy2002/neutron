package ${targetPackage}.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
<#if children?? || itemTypeName?? || !isAbstract || rules?? && rules?size gt 0>
import javax.inject.*;
</#if>
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import ${targetPackage}.data.*;
<#if rules??>
import ${targetPackage}.gen.rule.*;
</#if>

<#if parent?? == false>
@Singleton
</#if>
public<#if isAbstract> abstract</#if> class ${typeName}<#if parentBaseTypeName?? && isAbstract??><P extends ${parentBaseTypeName}></#if> extends ${baseTypeName}<#if valueTypeName??><<#if parentTypeName??>${parentTypeName},</#if>${valueTypeName}>
<#elseif itemTypeName??><<#if parentTypeName??>${parentTypeName},</#if>${itemTypeName}>
<#else><#if parentTypeName??><${parentTypeName}></#if>
</#if>{
<#if children?? && children?size gt 0>
    <#list children as child>
    private ${child.typeName} ${child.name};
    </#list>

</#if>
<#if children?? && children?size gt 0 || itemTypeName??>
    private ${typeName}<#if itemTypeName??>Item<#else>Child</#if>Factory <#if itemTypeName??>item<#else>child</#if>Factory;

    @Inject
    void receiveNodeProvider(${typeName}<#if itemTypeName??>Item<#else>Child</#if>Provider provider) {
        <#if itemTypeName??>item<#else>child</#if>Factory = provider.createFactory(this);
    }

</#if>
<#if !isAbstract>
    @Override
    public final Class<?> getConcreteClass() {
        return ${typeName}.class;
    }

</#if>
<#if rules?? && rules?size gt 0>
    @Inject
    ${typeName}RuleProvider ruleProvider;

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.addAll(ruleProvider.createRules(this));
    }

</#if>
<#if parent??>
    public ${typeName}(${parent.typeName} parent, String name) {
        super(parent, name);
<#else>
    @Inject
    public ${typeName}(@NotNull ${typeName}Context context) {
        super(context);
</#if>
    }

<#if itemTypeName??>
    @Override
    public Class<${itemTypeName}> getItemClass() {
        return ${itemTypeName}.class;
    }

    public NodeAddEvent<${itemTypeName}> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<${itemTypeName}> createItemRemoveEvent(${itemTypeName} item) {
        return itemFactory.createItemRemoveEvent(item);
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
<#if children?? && children?size gt 0>
    <#list children as child>
    @JsMethod
    public ${child.typeName} get${child.name?cap_first}() {
        return ${child.name};
    }

    </#list>
</#if>
<#if children?? && children?size gt 0>
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
    <#list children as child>
        ${child.name} = childFactory.create${child.name?cap_first}();
        children.add(${child.name});
    </#list>
        return children;
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
    <#if parent.localRequired>

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
