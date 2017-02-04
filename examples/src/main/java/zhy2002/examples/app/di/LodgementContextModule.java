package zhy2002.examples.app.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.app.gen.LodgementNodeContext;
import zhy2002.examples.app.impl.LodgementNodeContextImpl;
import zhy2002.examples.app.impl.LodgementNodeImplClassRegistry;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.UiNodeChangeEngine;
import zhy2002.neutron.UiNodeChangeEngineImpl;
import zhy2002.neutron.UniqueIdGenerator;
import zhy2002.neutron.util.SequentialUniqueIdGenerator;

@Module
abstract class LodgementContextModule {

    @Binds
    abstract LodgementNodeContext provideLodgementNodeContext(LodgementNodeContextImpl impl);

    @Binds
    abstract ClassRegistryImpl provideClassRegistryImpl(LodgementNodeImplClassRegistry impl);

    @Binds
    @LodgementNodeScope
    abstract UiNodeChangeEngine provideUiNodeChangeEngine(UiNodeChangeEngineImpl impl);

    @Binds
    @LodgementNodeScope
    abstract UniqueIdGenerator provideSequentialUniqueIdGenerator(SequentialUniqueIdGenerator impl);

}
