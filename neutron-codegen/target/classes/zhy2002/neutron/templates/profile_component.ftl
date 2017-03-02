package ${targetPackage}.gen.di;
<#assign profileName = 'Default' />

import dagger.Component;
import ${targetPackage}.gen.${domainInfo.rootType.typeName}Context;
import ${targetPackage}.di.${profileName}ProfileModule;
import javax.inject.Singleton;


@Singleton
@Component(modules = {${profileName}ProfileModule.class}) //Please provide this class if it is missing.
public interface ${profileName}ProfileComponent {

    ${domainInfo.rootType.typeName}Context provide${domainInfo.rootType.typeName}Context();

}
