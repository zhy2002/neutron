package ${targetPackage}.gen.di;
/* template name: module.ftl */
import dagger.*;
import dagger.multibindings.*;
import javax.inject.*;
import ${targetPackage}.gen.node.*;
import zhy2002.neutron.core.*;
import zhy2002.neutron.core.node.*;
import zhy2002.neutron.core.di.*;
import zhy2002.neutron.core.config.NeutronConstants;
<#if !abstractNode && parentType.children ??></#if>
import java.util.*;


@Module
public class ${typeName}Module {

    private final ${genericTypeName} owner;

    public ${typeName}Module(${genericTypeName} owner) {
        this.owner = owner;
    }

<#--make the owner node as injectable for all base types-->
<#list baseTypes as baseType>
    @Provides @ComponentScope @Owner ${baseType.genericTypeName} provide${baseType.typeName}() {
        return owner;
    }

</#list>
<#if parentType.typeName != "VoidUiNode">
    @Provides @ComponentScope ${parentType.genericTypeName} provide${parentType.typeName}() {
        return owner.getParent();
    }

</#if>
    @Provides @Named("${typeName}RuleProvider") @IntoMap @StringKey(NeutronConstants.PLACEHOLDER_RULE_PROVIDER)
    RuleProvider<${typeName}> providePlaceholderRuleProvider() {
        return null;
    }

    @Provides @Named("${typeName}RuleProvider") @IntoMap @StringKey(NeutronConstants.TYPE_RULE_PROVIDER)
    RuleProvider<${typeName}> provideTypeRuleProvider(${typeName}RuleProvider provider) {
        return provider;
    }

<#if parentType.children ??>
    <#list parentType.children as child>
        <#if child.typeName == typeName && child.hasRuleProvider>
        @Provides @Named("${typeName}RuleProvider") @IntoMap @StringKey("${child.name}")
        RuleProvider<${typeName}> provide${child.name?cap_first}ChildRuleProvider(
            ${parentType.typeName}Child${child.name?cap_first}RuleProvider provider
        ) {
            return provider;
        }

        </#if>
    </#list>
</#if>

    @Provides @ComponentScope
    List<RuleProvider<${typeName}>> provideRuleProviders(
        @Named("${typeName}RuleProvider")  Map<String, Provider<RuleProvider<${typeName}>>> ruleProviderProviderMap
    ) {
        String[] potentialRuleProviderKeys = {NeutronConstants.TYPE_RULE_PROVIDER, owner.getName(), owner.getName() + "-test"};
        return RuleProvider.extractRuleProviders(potentialRuleProviderKeys, ruleProviderProviderMap);
    }
}