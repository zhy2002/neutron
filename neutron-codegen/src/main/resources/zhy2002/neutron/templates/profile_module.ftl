package ${targetPackage}.${typeName?lower_case}.gen.di;
/* template name: profile_module.ftl */
import dagger.Binds;
import dagger.Module;
import ${targetPackage}.gen.di.*;
import ${targetPackage}.gen.node.*;
<#if hasChildProvider>
import ${targetPackage}.${typeName?lower_case}.gen.node.*;
</#if>
import zhy2002.neutron.*;
import zhy2002.neutron.rule.*;

@Module(includes = {ManifestModule.class})
public abstract class ${typeName}ProfileModule {

<#list configuredNodes as node>
    @Binds
    abstract ${node.typeName}RuleProvider provide${node.typeName}RuleProvider(${typeName}${node.typeName}RuleProvider impl);

    <#if node.children??>
        <#list node.children as child>
            <#if child.rules?? || child.init??>
    @Binds
    abstract ${node.typeName}ChildProvider.${child.name?cap_first}RuleProvider provide${typeName}${child.name}RuleProvider(
        ${typeName}${node.typeName}ChildProvider.${child.name?cap_first}RuleProvider impl
    );

            </#if>
        </#list>
    </#if>
</#list>
}
