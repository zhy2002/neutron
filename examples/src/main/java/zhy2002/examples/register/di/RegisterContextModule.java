package zhy2002.examples.register.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.register.config.RegisterNodeImplClassRegistry;
import zhy2002.examples.register.gen.RegisterNodeContext;
import zhy2002.examples.register.impl.RegisterNodeContextImpl;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.UiNodeChangeEngine;
import zhy2002.neutron.UiNodeChangeEngineImpl;
import zhy2002.neutron.UniqueIdGenerator;
import zhy2002.neutron.util.SequentialUniqueIdGenerator;

@Module
abstract class RegisterContextModule {

    @Binds
    abstract RegisterNodeContext provideApplicationNodeContext(RegisterNodeContextImpl impl);

    @Binds
    abstract ClassRegistryImpl provideClassRegistryImpl(RegisterNodeImplClassRegistry impl);

    @Binds
    @RegisterNodeScope
    abstract UiNodeChangeEngine provideUiNodeChangeEngine(UiNodeChangeEngineImpl impl);

    @Binds
    @RegisterNodeScope
    abstract UniqueIdGenerator provideSequentialUniqueIdGenerator(SequentialUniqueIdGenerator impl);

}
