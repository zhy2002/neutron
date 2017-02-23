package ${targetPackage}.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import ${targetPackage}.gen.event.*;

interface ${typeName}ItemFactory {
<#list childTypes as childType>
    NodeAddEvent<${childType.typeName}> createItemAddEvent(String name);
    NodeRemoveEvent<${childType.typeName}> createItemRemoveEvent(${childType.typeName} item);
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
        ${typeName}<#if parentBaseTypeName?? && abstractNode??><?></#if> parent,
        String name
    ) {
        return new ${childType.typeName}(parent, name);
    }

    protected void configure${childType.typeName}(${childType.typeName} node) {
    }

    protected NodeAddEvent<${childType.typeName}> newItemAddEvent(${childType.typeName} item) {
        return new ${childType.typeName}AddEvent(item);
    }

    protected NodeRemoveEvent<${childType.typeName}> newItemRemoveEvent(${childType.typeName} item) {
        return new ${childType.typeName}RemoveEvent(item);
    }

</#list>
    ${typeName}ItemFactory createFactory(${typeName}<#if parentBaseTypeName?? && abstractNode??><?></#if> parent) {
        return new ${typeName}ItemFactoryImpl(parent);
    }

    private class ${typeName}ItemFactoryImpl implements ${typeName}ItemFactory {

        private final ${typeName}<#if parentBaseTypeName?? && abstractNode??><?></#if> parent;
        
        private ${typeName}ItemFactoryImpl(${typeName}<#if parentBaseTypeName?? && abstractNode??><?></#if> parent) {
            this.parent = parent;
        }

<#list childTypes as childType>
        @Override
        public final NodeAddEvent<${childType.typeName}> createItemAddEvent(String name) {
            ${childType.typeName} item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<${childType.typeName}> createItemRemoveEvent(${childType.typeName} item) {
            return newItemRemoveEvent(item);
        }

        private ${childType.typeName} createItemNode(String name) {
            ${childType.typeName} node = new${childType.typeName}(parent, name);
            ${childType.typeName?uncap_first}Injector.injectMembers(node);
            configure${childType.typeName}(node);
            return node;
        }

</#list>
    }
}
