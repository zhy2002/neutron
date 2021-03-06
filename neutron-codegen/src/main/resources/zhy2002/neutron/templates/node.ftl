package ${targetPackage}.gen.node;
/* template name: node.ftl */
import zhy2002.neutron.core.*;
import zhy2002.neutron.core.node.*;
<#if actions??>
import zhy2002.neutron.core.event.*;
import ${targetPackage}.data.*;
</#if>
<#if hasComponent>
import ${targetPackage}.gen.di.${typeName}Component;
</#if>
<#if valueTypeName??>
import zhy2002.neutron.core.data.NodeIdentity;
</#if>
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
import zhy2002.neutron.core.di.*;
</#if>
<#if children?? && children?size gt 0>
import java.util.*;
</#if>
<#if valueTypeName?? || init?? || properties??>
import ${targetPackage}.data.*;
</#if>
<#if properties?? && properties?size gt 0 || valueTypeName??>
import zhy2002.neutron.core.config.MetadataRegistry;
import zhy2002.neutron.core.config.PropertyMetadata;
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
<#if itemTypeName??>
import ${targetPackage}.gen.event.*;
</#if>


<#if parentType.typeName == 'VoidUiNode'>
@Singleton
</#if>
public<#if abstractNode> abstract</#if> class ${typeName}<#if parentBaseTypeName??><P extends ${parentBaseTypeName}></#if> extends ${baseTypeName}<#compress>
<#if baseType.parentBaseTypeName??>
    <#if valueTypeName??>
    <${parentType.genericTypeName}, ${valueTypeName}>
    <#elseif itemTypeName??>
    <${parentType.genericTypeName}, ${itemTypeName}>
    <#else>
    <${parentType.genericTypeName}>
    </#if>
</#if>
</#compress> {

<#if parentType.typeName == "VoidUiNode">
    @Inject
    public ${typeName}(@NotNull ${typeName}Context context) {
        super(context);
    }
<#else>
    <#if abstractNode>
    protected ${typeName}(${parentType.genericTypeName} parent) {
        super(parent);
    }
    <#else>
    @Inject
    protected ${typeName}(@Owner ${parentType.genericTypeName} parent) {
        super(parent);
    }
    </#if>
</#if>

<#if !abstractNode>
    @Override
    public final Class<?> getConcreteClass() {
    return ${typeName}.class;
    }

</#if>
<#if hasComponent>
    <#if abstractNode>
    protected abstract ${typeName}Component getComponent();
    <#else>
    protected final ${typeName}Component getComponent() {
        return component;
    }
    </#if>

</#if>

<#if !abstractNode>
    private ${typeName}Component component;

    @Inject
    void createComponent(${typeName}Component.Builder builder) {
        this.component = builder.set${typeName}Module(new ${typeName}Module(this)).build();
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

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
        setNameOfChildBeingCreated(name);
        ${itemTypeName} item = getComponent().create${itemTypeName}();
        setNameOfChildBeingCreated(null);
        return new ${itemTypeName}AddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<${itemTypeName}> createItemRemoveEvent(${itemTypeName} item) {
        return new ${itemTypeName}RemoveEvent(item);
    }

</#if>
<#if valueTypeName??>
    public static final PropertyMetadata<${valueTypeName}> VALUE_PROPERTY = MetadataRegistry.createProperty(${typeName}.class, "value", ${valueTypeName}.class);
    public static final PropertyMetadata<${valueTypeName}> EMPTY_VALUE_PROPERTY = MetadataRegistry.createProperty(${typeName}.class, "emptyValue", ${valueTypeName}.class, new ${valueTypeName}(), ChangeModeEnum.DIRECT);
</#if>
<#if properties??>
    <#list properties as prop>
    public static final PropertyMetadata<${prop.stateTypeName}> ${prop.nameAllCaps}_PROPERTY = MetadataRegistry.createProperty(${typeName}.class, "${prop.name}", ${prop.stateTypeName}.class<#if prop.default??>, ${prop.default}</#if><#if prop.trackingMode??>, ChangeTrackingModeEnum.${prop.trackingMode}</#if>);
    </#list>
    <#list properties as prop>

    @JsMethod
    public ${prop.typeName} get${prop.name?cap_first}() {
        return getStateValue(${prop.nameAllCaps}_PROPERTY);
    }

    @JsMethod
    public void set${prop.name?cap_first}(${prop.typeName} value) {
        setStateValue(${prop.nameAllCaps}_PROPERTY, value);
    }

    </#list>
</#if>
<#if valueTypeName??>
    @JsMethod
    @Override
    public final ${valueTypeName} getValue() {
        ${valueTypeName} value = super.getStateValue(VALUE_PROPERTY);
        return value == null ? null : new ${valueTypeName}(value);
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
    //region children getters

    <#list children as child>
    @SuppressWarnings("unusable-by-js")
    @JsMethod
    public ${child.typeName} get${child.name?cap_first}() {
        return (${child.typeName})getChildByName("${child.name}");
    }

    </#list>
    //endregion
</#if>
<#if children?? && children?size gt 0>
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
    <#list children as child>
        setChildNodeIdentity("${child.name}");
        children.add(getComponent().create${child.typeName}());
    </#list>
        setChildNodeIdentity(null);
        return children;
    }

</#if>
<#if valueTypeName??>
    @Override
    protected void clearNodeIdentity() {
        NodeIdentity nodeIdentity = getNodeIdentity();
        if (nodeIdentity != null) {
            setValue(${valueTypeName}.fromJs(nodeIdentity.getValue()));
        }

        super.clearNodeIdentity();
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
    public PropertyMetadata<${valueTypeName}> getValuePropertyMetadata() {
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
<#if actions??>
    <#list actions as action>
    @JsMethod
    public void dispatch${action.name}Action(${action.parameterTypeName} parameter) {
        getContext().processEvent(new ${action.parameterTypeName}ActionEvent(this, ${contextName}Constants.${action.nameAllCaps}_ACTION, parameter));
    }
    </#list>
</#if>
}
