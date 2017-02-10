package zhy2002.examples.lodgement.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.config.ApplicationNodeImplClassRegistry;
import zhy2002.examples.lodgement.gen.ApplicationNode;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.impl.ApplicationNodeContextImpl;
import zhy2002.examples.lodgement.impl.ApplicationNodeImpl;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.di.NeutronModule;

import javax.inject.Singleton;

@Module(includes = {NeutronModule.class, CustomModule.class})
abstract class ApplicationContextModule {

    @Binds
    @Singleton
    abstract ApplicationNodeContext provideApplicationNodeContext(ApplicationNodeContextImpl impl);

    @Binds
    @Singleton
    abstract ClassRegistryImpl provideClassRegistryImpl(ApplicationNodeImplClassRegistry impl);

    @Binds
    @Singleton
    abstract ApplicationNode provideApplicationNode(ApplicationNodeImpl impl);

}

