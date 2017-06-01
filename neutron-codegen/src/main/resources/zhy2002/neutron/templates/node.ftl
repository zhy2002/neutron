package ${targetPackage}.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
<#if valueTypeName?? || properties?? || valueWrappers?? || children??>
import jsinterop.annotations.*;
import java.math.BigDecimal;
</#if>
<#if children?? || itemTypeName?? || !abstractNode || rules?? && rules?size gt 0>
import javax.inject.*;
</#if>
<#if parentType.typeName == "VoidUiNode">
import javax.validation.constraints.NotNull;
<#else>
import zhy2002.neutron.di.*;
</#if>
<#if children?? && children?size gt 0>
import java.util.*;
</#if>
<#if valueTypeName?? || init?? || properties??>
import ${targetPackage}.data.*;
</#if>
<#if properties?? && properties?size gt 0>
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
</#if>
import ${targetPackage}.gen.rule.*;
<#if !abstractNode>
import ${targetPackage}.gen.di.*;
import java.util.List;
</#if>
<#if parentType.typeName == "VoidUiNode">
import ${targetPackage}.gen.*;
</#if>
<#if unloadable>
import ${targetPackage}.gen.event.*;
</#if>

<#if parentType.typeName == 'VoidUiNode'>
@Singleton
</#if>
public<#if abstractNode> abstract</#if> class ${typeName}<#if parentBaseTypeName??><P extends ${parentBaseTypeName}></#if> extends ${baseTypeName}<#compress>
<#if valueTypeName??>
    <<#if parentTypeName??>${parentTypeName},</#if>${valueTypeName}>
<#elseif itemTypeName??>
    <<#if parentTypeName??>${parentTypeName},</#if>${itemTypeName}>
<#else>
    <#if parentTypeName??><${parentTypeName}></#if>
</#if>
</#compress> {

<#if parentType.typeName == "VoidUiNode">
    @Inject
    public ${typeName}(@NotNull ${typeName}Context context) {
        super(context);
    }
<#else>
    <#if abstractNode>
    public ${typeName}(${parentType.genericTypeName} parent, String name) {
        super(parent, name);
    }
    <#else>
    @Inject
    public ${typeName}(@Owner ${parentType.genericTypeName} parent, @ChildName String name) {
        super(parent, name);
    }
    </#if>
</#if>

<#if !abstractNode>
    @Override
    public final Class<?> getConcreteClass() {
    return ${typeName}.class;
    }

</#if>
<#if children?? && children?size gt 0 || itemTypeName??>
    private ${typeName}<#if itemTypeName??>Item<#else>Child</#if>Factory <#if itemTypeName??>item<#else>child</#if>Factory;

    @Inject
    void receiveNodeProvider(${typeName}<#if itemTypeName??>Item<#else>Child</#if>Provider provider) {
        <#if itemTypeName??>item<#else>child</#if>Factory = provider.createFactory(this);
    }

</#if>
<#if !abstractNode>
    private ${typeName}Component component;

    @Inject
    void createComponent(${typeName}Component.Builder builder) {
        this.component = builder.set${typeName}Module(new ${typeName}Module(this)).build();
    }

    private RuleProvider<${typeName}> getRuleProvider() {
        return component.get${typeName}RuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    <#if parentType.children ??>
        getInstanceRuleProvider().initializeState(this);
    </#if>
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    <#if parentType.children ??>
        getInstanceRuleProvider().createRules(createdRules);
    </#if>
    }

    <#if parentType.children ??>
    private RuleProvider<${typeName}> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    </#if>
    <#if unloadable>
    @Override
    protected final NodeLoadEvent<${typeName}> createNodeLoadEvent() {
        return new ${typeName}LoadEvent(this);
    }

    @Override
    protected final NodeUnloadEvent<${typeName}> createNodeUnloadEvent() {
        return new ${typeName}UnloadEvent(this);
    }

    </#if>
</#if>
<#if itemTypeName??>
    @Override
    public Class<${itemTypeName}> getItemClass() {
        return ${itemTypeName}.class;
    }

    @Override
    public NodeAddEvent<${itemTypeName}> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<${itemTypeName}> createItemRemoveEvent(${itemTypeName} item) {
        return itemFactory.createItemRemoveEvent(item);
    }

</#if>
<#if valueTypeName??>
    public static final PropertyMetadata<${valueTypeName}> VALUE_PROPERTY = MetadataRegistry.createProperty(${typeName}.class, "value", ${valueTypeName}.class);
    public static final PropertyMetadata<${valueTypeName}> EMPTY_VALUE_PROPERTY = MetadataRegistry.createProperty(${typeName}.class, "emptyValue", ${valueTypeName}.class, new ${valueTypeName}(), ChangeModeEnum.DIRECT);
</#if>
<#if properties??>
    <#list properties as prop>
    public static final PropertyMetadata<${prop.typeName}> ${prop.nameAllCaps}_PROPERTY = MetadataRegistry.createProperty(${typeName}.class, "${prop.name}", ${prop.typeName}.class<#if prop.default??>, ${prop.default}</#if><#if prop.trackingMode??>, ChangeTrackingModeEnum.${prop.trackingMode}</#if>);
    </#list>
    <#list properties as prop>

    @JsMethod
    public ${prop.externalTypeName} get${prop.name?cap_first}() {
        return getStateValue(${prop.nameAllCaps}_PROPERTY);
    }

    @JsMethod
    public void set${prop.name?cap_first}(${prop.externalTypeName} value) {
        setStateValue(${prop.nameAllCaps}_PROPERTY, value);
    }

    </#list>
</#if>
<#if valueTypeName??>
    @JsMethod
    @Override
    public final ${valueTypeName} getValue() {
        return super.getStateValue(VALUE_PROPERTY);
    }

    @JsMethod
    @Override
    public final void setValue(${valueTypeName} value) {
        super.setStateValue(VALUE_PROPERTY, value);
    }

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
        return (${child.typeName})getChildByName("${child.name}");
    }

    </#list>
</#if>
<#if children?? && children?size gt 0>
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
    <#list children as child>
        setChildNodeIdentity("${child.name}");
        children.add(childFactory.create${child.name?cap_first}());
    </#list>
        setChildNodeIdentity(null);
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

    public void setEmptyValue(${valueTypeName} value) {
        super.setStateValue(EMPTY_VALUE_PROPERTY, value);
    }

    @Override
    public ${valueTypeName} getEmptyValue() {
        return super.getStateValue(EMPTY_VALUE_PROPERTY);
    }

    @Override
    public Class<${valueTypeName}> getValueClass() {
        return ${valueTypeName}.class;
    }

    @Override
    protected PropertyMetadata<${valueTypeName}> getValuePropertyMetadata() {
        return VALUE_PROPERTY;
    }

</#if>
<#if parentType.localRequired>
    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

</#if>
}
