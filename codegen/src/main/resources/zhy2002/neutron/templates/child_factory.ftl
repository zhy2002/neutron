package ${targetPackage}.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface ${typeName}ChildFactory {
<#list children as child>
    ${child.typeName} create${child.name?cap_first}();
</#list>
}

@Singleton
public class ${typeName}ChildProvider {
<#list distinctChildTypeNames as childTypeName>
    @Inject
    MembersInjector<${childTypeName}> ${childTypeName?uncap_first}Injector;
</#list>

    @Inject
    protected ${typeName}ChildProvider () {}

<#list distinctChildTypeNames as childTypeName>
    protected MembersInjector<${childTypeName}> get${childTypeName}Injector() {
        return this.${childTypeName?uncap_first}Injector;
    }

</#list>
<#list children as child>
    protected ${child.typeName} new${child.name?cap_first}(
        ${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if> parent,
        String name
    ) {
        return new ${child.typeName}(parent, name);
    }

    protected void configure${child.name?cap_first}(${child.typeName} node) {
    }

</#list>
    ${typeName}ChildFactory createFactory(${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if> parent) {
        return new ${typeName}ChildFactoryImpl(parent);
    }

    private class ${typeName}ChildFactoryImpl implements ${typeName}ChildFactory {

        private final ${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if> parent;
        
        private ${typeName}ChildFactoryImpl(${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if> parent) {
            this.parent = parent;
        }

<#list children as child>
        @Override
        public ${child.typeName} create${child.name?cap_first}() {
            ${child.typeName} node = new${child.name?cap_first}(parent, "${child.name}");
            ${child.typeName?uncap_first}Injector.injectMembers(node);
            configure${child.name?cap_first}(node);
            return node;
        }

</#list>
    }
}
