package zhy2002.examples.app.gen.di;

import dagger.*;
import zhy2002.neutron.event.EventRegistry;
import zhy2002.neutron.config.ContextConfigurer;
import zhy2002.examples.app.gen.LodgementNodeContextConfigurer;
import zhy2002.examples.app.gen.LodgementNodeContext;
import zhy2002.examples.app.gen.event.*;
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
    abstract EventRegistry provideEventRegistryImpl(LodgementNodeEventRegistry impl);


    @Binds
    @Singleton
    abstract ContextConfigurer<LodgementNodeContext> provideLodgementNodeContextConfigurer(
        LodgementNodeContextConfigurer impl
    );

}