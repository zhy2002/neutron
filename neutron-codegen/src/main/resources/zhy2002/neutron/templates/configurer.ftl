package ${targetPackage}.gen;

import ${targetPackage}.gen.node.*;
import ${targetPackage}.data.*;
import zhy2002.neutron.config.*;
import javax.inject.Inject;
import java.util.*;
import java.math.BigDecimal;


public class ${typeName}ContextConfigurer implements ContextConfigurer<${typeName}Context> {

    @Inject
    protected ${typeName}ContextConfigurer() {}

    @Override
    public int getOrderKey() {
        return NeutronConstants.DOMAIN_CONTEXT_CONFIGURER_ORDER;
    }

    @Override
    public void configure(${typeName}Context context) {
        ContextConfiguration configuration = context.getConfiguration();

<#list domainInfo.allNodes as node >
    <#if node.config?? >
        NodeConfiguration config${node.typeName} = configuration.getConfig(${node.typeName}.class);
        <#list node.config as item>
            config${node.typeName}.setConfigValue("${item.property}", ${item.value});
        </#list>
    </#if>
</#list>
    }
}
