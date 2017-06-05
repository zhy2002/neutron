package ${targetPackage}.${typeName?lower_case}.gen.di;
/* template name: profile_module.ftl */
import dagger.Binds;
import dagger.multibindings.IntoSet;
import dagger.Module;
<#if configuredChildren?size gt 0>
import dagger.multibindings.*;
import javax.inject.Named;
</#if>
import ${targetPackage}.gen.di.*;
import ${targetPackage}.gen.node.*;
<#if configuredChildren?size gt 0 || allNodes?size gt 0>
import ${targetPackage}.${typeName?lower_case}.gen.node.*;
</#if>
import zhy2002.neutron.*;
import zhy2002.neutron.rule.*;
import zhy2002.neutron.config.ContextConfigurer;
import ${targetPackage}.${typeName?lower_case}.gen.*;
import ${targetPackage}.gen.*;


@Module(includes = {ManifestModule.class})
public abstract class ${typeName}ProfileModule {

<#list allNodes as node>
    <#if node.hasRuleProvider>
    @Binds
    abstract ${node.typeName}RuleProvider provide${node.typeName}RuleProvider(${typeName}${node.typeName}RuleProvider impl);
    </#if>
</#list>

<#list configuredChildren as child>
    <#if !child.nodeChildInfo.hasRuleProvider>
    @Binds @Named("${child.typeName}RuleProvider") @IntoMap @StringKey("${child.name}")
    abstract RuleProvider<${child.typeName}><#else>
    @Binds
    abstract ${child.parentProfileNodeInfo.typeName}Child${child.name?cap_first}RuleProvider</#if> provide${child.typeName}${child.parentProfileNodeInfo.typeName}Child${child.name?cap_first}RuleProvider(
            ${child.profileInfo.typeName}${child.parentProfileNodeInfo.typeName}Child${child.name?cap_first}RuleProvider impl
    );

</#list>

    @Binds
    @IntoSet
    abstract ContextConfigurer<${rootType.typeName}Context> provide${typeName}${rootType.typeName}ContextConfigurer(
        ${typeName}${rootType.typeName}ContextConfigurer impl
    );
}
