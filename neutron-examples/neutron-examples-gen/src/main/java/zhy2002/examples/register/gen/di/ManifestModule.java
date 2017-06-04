package zhy2002.examples.register.gen.di;

import dagger.*;
import zhy2002.neutron.event.EventRegistry;
import zhy2002.neutron.config.ContextConfigurer;
import zhy2002.examples.register.gen.RegisterNodeContextConfigurer;
import zhy2002.examples.register.gen.RegisterNodeContext;
import zhy2002.examples.register.gen.event.*;
import javax.inject.Singleton;
import zhy2002.neutron.di.NeutronModule;


@Module(includes = {NeutronModule.class},
subcomponents = {
    RegisterNodeComponent.class,
    UsernameNodeComponent.class,
    EmailNodeComponent.class,
    PasswordNodeComponent.class,
    RepeatPasswordNodeComponent.class,
    AgeNodeComponent.class,
    PlanNodeComponent.class,
    ReceiveOffersNodeComponent.class,
    OwnInvestmentPropertyNodeComponent.class,
    PropertyDetailsNodeComponent.class,
    PropertyAddressNodeComponent.class,
    PropertyStateNodeComponent.class,
    PhoneInfoNodeComponent.class,
    CountryCodeNodeComponent.class,
    AreaCodeNodeComponent.class,
    PhoneNumberNodeComponent.class,
    ErrorListNodeComponent.class,
    ErrorNodeComponent.class
})
public abstract class ManifestModule {

    @Binds
    @Singleton
    abstract EventRegistry provideEventRegistryImpl(RegisterEventRegistry impl);

    @Binds
    @Singleton
    abstract ContextConfigurer<RegisterNodeContext> provideRegisterNodeContextConfigurer(
        RegisterNodeContextConfigurer impl
    );

}