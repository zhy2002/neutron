package zhy2002.examples.app.di;

import dagger.Binds;
import dagger.Module;
import zhy2002.examples.app.gen.LodgementNodeContext;
import zhy2002.examples.app.impl.LodgementNodeContextImpl;
import zhy2002.examples.app.impl.LodgementNodeImplClassRegistry;
import zhy2002.neutron.ClassRegistryImpl;
import zhy2002.neutron.di.NeutronModule;

import javax.inject.Singleton;

@Module(includes = {NeutronModule.class})
abstract class LodgementContextModule {

    @Binds
    @Singleton
    abstract LodgementNodeContext provideLodgementNodeContext(LodgementNodeContextImpl impl);

    @Binds
    @Singleton
    abstract ClassRegistryImpl provideClassRegistryImpl(LodgementNodeImplClassRegistry impl);

}
