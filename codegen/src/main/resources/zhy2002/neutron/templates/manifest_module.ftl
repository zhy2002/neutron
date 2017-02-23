package ${targetPackage}.gen.di;
import dagger.*;
import javax.inject.Named;
import ${targetPackage}.gen.*;

@Module(subcomponents = {
<#list registryInfo.concreteNodes as node>
    ${node.typeName}Component.class<#sep>,</#sep>
</#list>
})
public class ManifestModule {
}