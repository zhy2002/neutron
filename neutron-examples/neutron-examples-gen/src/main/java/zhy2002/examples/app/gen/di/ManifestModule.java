package zhy2002.examples.app.gen.di;
import dagger.*;
import zhy2002.examples.app.gen.*;
import zhy2002.neutron.ClassRegistryImpl;
import javax.inject.Singleton;
import zhy2002.neutron.di.NeutronModule;


@Module(includes = {NeutronModule.class},
subcomponents = {
    ApplicationListNodeComponent.class,
    AppManagerNodeComponent.class,
    LodgementNodeComponent.class
})
public abstract class ManifestModule {

    @Binds
    @Singleton
    abstract ClassRegistryImpl provideClassRegistryImpl(LodgementNodeClassRegistry impl);

}