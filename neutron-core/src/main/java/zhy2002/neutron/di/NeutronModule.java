package zhy2002.neutron.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.neutron.UiNodeChangeEngine;
import zhy2002.neutron.UiNodeChangeEngineImpl;
import zhy2002.neutron.UniqueIdGenerator;
import zhy2002.neutron.util.SequentialUniqueIdGenerator;

import javax.inject.Singleton;

@Module
public abstract class NeutronModule {

    @Binds
    @Singleton
    abstract UiNodeChangeEngine provideUiNodeChangeEngine(UiNodeChangeEngineImpl impl);

    @Binds
    @Singleton
    abstract UniqueIdGenerator provideSequentialUniqueIdGenerator(SequentialUniqueIdGenerator impl);

}

