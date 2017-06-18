package ${targetPackage}.gen.di;
/* template name: manifest_module.ftl */
import dagger.*;
import dagger.multibindings.IntoSet;
import zhy2002.neutron.event.EventRegistry;
import zhy2002.neutron.config.ContextConfigurer;
import ${targetPackage}.gen.${rootType.typeName}ContextConfigurer;
import ${targetPackage}.gen.${rootType.typeName}Context;
import ${targetPackage}.gen.event.*;
import javax.inject.Singleton;
import zhy2002.neutron.di.NeutronModule;


@Module(includes = {NeutronModule.class},
subcomponents = {
<#list concreteNodes as node>
    ${node.typeName}Component.class<#sep>,</#sep>
</#list>
})
public abstract class ManifestModule {

    @Binds
    @Singleton
    abstract EventRegistry provideEventRegistryImpl(${typeName}EventRegistry impl);

    @Binds
    @IntoSet
    abstract ContextConfigurer<${rootType.typeName}Context> provide${rootType.typeName}ContextConfigurer(
        ${rootType.typeName}ContextConfigurer impl
    );

}