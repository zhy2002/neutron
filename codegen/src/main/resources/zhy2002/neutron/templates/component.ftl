package ${targetPackage}.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import ${targetPackage}.gen.*;
import ${targetPackage}.gen.rule.*;

@${typeName}Scope
@Subcomponent(modules = {${typeName}Module.class})
public interface ${typeName}Component {
<#--<#list exports as child>-->
    <#--<#if child.name??>-->
    <#--${child.typeName} provide${child.name?cap_first}(@Named("${child.name}") ${child.typeName} impl);-->
    <#--<#else>-->
    <#--${child.typeName} provide${child.typeName}();-->
    <#--</#if>-->
<#--</#list>-->

    ${typeName}RuleProvider get${typeName}RuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder set${typeName}Module(${typeName}Module module);

        ${typeName}Component build();
    }
}
