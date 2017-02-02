package zhy2002.examples.lodgement.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.config.ApplicationNodeImplClassRegistry;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.impl.ApplicationNodeContextImpl;
import zhy2002.neutron.ClassRegistryImpl;

@Module
abstract class ContextModule {

    @Binds
    abstract ApplicationNodeContext provideApplicationNodeContext(ApplicationNodeContextImpl impl);

    @Binds
    abstract ClassRegistryImpl provideClassRegistryImpl(ApplicationNodeImplClassRegistry impl);

}
