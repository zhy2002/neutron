package ${targetPackage}.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface ${typeName}ItemFactory {
<#list childTypes as childType>
    ${childType.typeName} create${childType.typeName}(String name);
</#list>
}

@Singleton
public class ${typeName}ItemProvider {
<#list childTypes as childType>
    @Inject
    MembersInjector<${childType.typeName}> ${childType.typeName?uncap_first}Injector;
</#list>

    @Inject
    protected ${typeName}ItemProvider () {}

<#list distinctChildTypeNames as childTypeName>
    protected MembersInjector<${childTypeName}> get${childTypeName}Injector() {
        return this.${childTypeName?uncap_first}Injector;
    }

</#list>
<#list childTypes as childType>
    protected ${childType.typeName} new${childType.typeName} (
        ${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if> parent,
        String name
    ) {
        return new ${childType.typeName}(parent, name);
    }

    protected void configure${childType.typeName}(${childType.typeName} node) {
    }

</#list>
    ${typeName}ItemFactory createFactory(${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if> parent) {
        return new ${typeName}ItemFactoryImpl(parent);
    }

    private class ${typeName}ItemFactoryImpl implements ${typeName}ItemFactory {

        private final ${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if> parent;
        
        private ${typeName}ItemFactoryImpl(${typeName}<#if parentBaseTypeName?? && isAbstract??><?></#if> parent) {
            this.parent = parent;
        }

<#list childTypes as childType>
        @Override
        public ${childType.typeName} create${childType.typeName}(String name) {
            ${childType.typeName} node = new${childType.typeName}(parent, name);
            ${childType.typeName?uncap_first}Injector.injectMembers(node);
            configure${childType.typeName}(node);
            return node;
        }

</#list>
    }
}
