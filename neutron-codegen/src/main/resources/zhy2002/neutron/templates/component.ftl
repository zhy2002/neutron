package ${targetPackage}.gen.di;
import dagger.Subcomponent;
import ${targetPackage}.gen.*;
import ${targetPackage}.gen.node.*;
<#if !abstractNode && parentType.children ??>
import zhy2002.neutron.RuleProvider;
import java.util.*;
</#if>

@${typeName}Scope
@Subcomponent(modules = {${typeName}Module.class})
public interface ${typeName}Component {

    ${typeName}RuleProvider get${typeName}RuleProvider();
<#if !abstractNode && parentType.children ??>
    Map<String, RuleProvider<${typeName}>> getInstanceRuleProviders();
</#if>

    @Subcomponent.Builder
    interface Builder {

        Builder set${typeName}Module(${typeName}Module module);

        ${typeName}Component build();
    }
}
