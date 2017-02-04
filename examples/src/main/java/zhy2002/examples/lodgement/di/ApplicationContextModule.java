package zhy2002.examples.lodgement.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.lodgement.config.ApplicationNodeImplClassRegistry;
import zhy2002.examples.lodgement.gen.ApplicationNodeContext;
import zhy2002.examples.lodgement.impl.ApplicationNodeContextImpl;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.UiNodeChangeEngine;
import zhy2002.neutron.UiNodeChangeEngineImpl;
import zhy2002.neutron.UniqueIdGenerator;
import zhy2002.neutron.util.SequentialUniqueIdGenerator;

@Module
abstract class ApplicationContextModule {

    @Binds
    abstract ApplicationNodeContext provideApplicationNodeContext(ApplicationNodeContextImpl impl);

    @Binds
    abstract ClassRegistryImpl provideClassRegistryImpl(ApplicationNodeImplClassRegistry impl);

    @Binds
    @ApplicationNodeScope
    abstract UiNodeChangeEngine provideUiNodeChangeEngine(UiNodeChangeEngineImpl impl);

    @Binds
    @ApplicationNodeScope
    abstract UniqueIdGenerator provideSequentialUniqueIdGenerator(SequentialUniqueIdGenerator impl);

}
