package ${targetPackage}.gen.di;
import dagger.*;

@Module(subcomponents = {
<#list concreteNodes as node>
    ${node.typeName}Component.class<#sep>,</#sep>
</#list>
})
public class ManifestModule {
}