package ${targetPackage}.gen.di;
import dagger.*;
import ${targetPackage}.gen.*;
import zhy2002.neutron.event.EventRegistryImpl;
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
    abstract EventRegistryImpl provideEventRegistryImpl(${rootType.typeName}ClassRegistry impl);

}