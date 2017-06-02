package ${targetPackage}.gen;

import ${targetPackage}.gen.node.*;
import zhy2002.neutron.config.ContextConfiguration;
import zhy2002.neutron.config.ContextConfigurer;
import javax.inject.Inject;
import java.util.*;


public class ${typeName}ContextConfigurer implements ContextConfigurer<${typeName}Context> {

    @Inject
    protected ${typeName}ContextConfigurer() {}

    @Override
    public void configure(${typeName}Context context) {
        ContextConfiguration configuration = context.getConfiguration();

        Set<String> names;
<#list domainInfo.allNodes as node >
    <#if node.children?? && node.children?size gt 0>
        names = new HashSet<>();
    <#list node.children as child>
        <#if child.loadWithParent>
        names.add("${child.name}");
        </#if>
    </#list>
        configuration.getConfig(${node.typeName}.class).setConfigValue("AutoLoadedChildNames", names);
    </#if>
</#list>

    }
}
