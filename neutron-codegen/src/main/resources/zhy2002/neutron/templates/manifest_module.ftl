package ${targetPackage}.gen.di;
import dagger.*;
import ${targetPackage}.gen.event.*;
import zhy2002.neutron.event.EventRegistry;
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
    abstract EventRegistry provideEventRegistryImpl(${rootType.typeName}EventRegistry impl);

}