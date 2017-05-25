package ${targetPackage}.gen.di;
import dagger.Subcomponent;
import ${targetPackage}.gen.node.*;
import zhy2002.neutron.RuleProvider;
<#if !abstractNode && parentType.children ??>
import java.util.*;
</#if>

@${typeName}Scope
@Subcomponent(modules = {${typeName}Module.class})
public interface ${typeName}Component {

    RuleProvider<${typeName}> get${typeName}RuleProvider();
<#if parentType.children ??>
    Map<String, RuleProvider<${typeName}>> getInstanceRuleProviders();
</#if>

    @Subcomponent.Builder
    interface Builder {

        Builder set${typeName}Module(${typeName}Module module);

        ${typeName}Component build();
    }
}
