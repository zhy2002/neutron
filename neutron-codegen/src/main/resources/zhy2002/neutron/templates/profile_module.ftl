package ${targetPackage}.${typeName?lower_case}.gen.di;

import dagger.Binds;
import dagger.Module;
import ${targetPackage}.gen.di.*;
import ${targetPackage}.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.rule.*;

@Module(includes = {ManifestModule.class})
public abstract class ${typeName}ProfileModule {

<#list configuredNodes as node>
    @Binds
    abstract ${node.typeName}RuleProvider provide${node.typeName}RuleProvider(${typeName}${node.typeName}RuleProvider impl);
</#list>

}
