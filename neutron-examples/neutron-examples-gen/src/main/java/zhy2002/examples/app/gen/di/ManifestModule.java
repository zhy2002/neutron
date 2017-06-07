package zhy2002.examples.app.gen.di;

import dagger.*;
import dagger.multibindings.IntoSet;
import zhy2002.neutron.event.EventRegistry;
import zhy2002.neutron.config.ContextConfigurer;
import zhy2002.examples.app.gen.GlobalUiStateNodeContextConfigurer;
import zhy2002.examples.app.gen.GlobalUiStateNodeContext;
import zhy2002.examples.app.gen.event.*;
import javax.inject.Singleton;
import zhy2002.neutron.di.NeutronModule;


@Module(includes = {NeutronModule.class},
subcomponents = {
    GlobalUiStateNodeComponent.class,
    HeaderNodeComponent.class,
    OpenAppsNodeComponent.class,
    OpenAppNodeComponent.class,
    AppManagerNodeComponent.class,
    ApplicationListNodeComponent.class
})
public abstract class ManifestModule {

    @Binds
    @Singleton
    abstract EventRegistry provideEventRegistryImpl(GlobalUiStateEventRegistry impl);

    @Binds
    @IntoSet
    abstract ContextConfigurer<GlobalUiStateNodeContext> provideGlobalUiStateNodeContextConfigurer(
        GlobalUiStateNodeContextConfigurer impl
    );

}