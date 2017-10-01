package ${targetPackage}.${profileInfo.typeName?lower_case}.gen;
/* template name: profile_configurer.ftl */
import ${targetPackage}.gen.*;
import ${targetPackage}.data.*;
import ${targetPackage}.gen.node.*;
import zhy2002.neutron.core.config.*;
import javax.inject.Inject;
import java.util.*;
import java.math.BigDecimal;


public class ${profileInfo.typeName}${typeName}ContextConfigurer implements ContextConfigurer<${typeName}Context> {

    @Inject
    protected ${profileInfo.typeName}${typeName}ContextConfigurer() {}

    @Override
    public int getOrderKey() {
        return NeutronConstants.PROFILE_CONTEXT_CONFIGURER_ORDER;
    }

    @Override
    public void configure(${typeName}Context context) {
        ContextConfiguration configuration = context.getConfiguration();
<#list profileInfo.allNodes as nodeProfile>
    <#if nodeProfile.config??>

        NodeConfiguration config${nodeProfile.typeName} = configuration.getConfig(${nodeProfile.typeName}.class);
        <#if nodeProfile.config??>
        <#list nodeProfile.config as item>
        config${nodeProfile.typeName}.setConfigValue("${item.property}", ${item.value});
        </#list>
        </#if>
    </#if>
    <#if nodeProfile.notAutoLoadedChildren?? && nodeProfile.notAutoLoadedChildren?size gt 0>

        <#list nodeProfile.notAutoLoadedChildren as child>
        configuration.getConfig(${child.typeName}.class).setConfigValue("${child.name}/@loadWithParent", false);
        </#list>
    </#if>
</#list>
    }
}
