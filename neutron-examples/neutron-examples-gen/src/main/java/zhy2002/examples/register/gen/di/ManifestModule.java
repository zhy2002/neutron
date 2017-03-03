package zhy2002.examples.register.gen.di;
import dagger.*;
import zhy2002.examples.register.gen.*;
import zhy2002.neutron.ClassRegistryImpl;
import javax.inject.Singleton;
import zhy2002.neutron.di.NeutronModule;


@Module(includes = {NeutronModule.class},
subcomponents = {
    UsernameNodeComponent.class,
    EmailNodeComponent.class,
    PasswordNodeComponent.class,
    RepeatPasswordNodeComponent.class,
    AgeNodeComponent.class,
    PlanNodeComponent.class,
    ReceiveOffersNodeComponent.class,
    OwnInvestmentPropertyNodeComponent.class,
    PropertyAddressNodeComponent.class,
    PropertyStateNodeComponent.class,
    PropertyDetailsNodeComponent.class,
    CountryCodeNodeComponent.class,
    AreaCodeNodeComponent.class,
    PhoneNumberNodeComponent.class,
    PhoneInfoNodeComponent.class,
    ErrorNodeComponent.class,
    ErrorListNodeComponent.class,
    RegisterNodeComponent.class
})
public abstract class ManifestModule {

    @Binds
    @Singleton
    abstract ClassRegistryImpl provideClassRegistryImpl(RegisterNodeClassRegistry impl);

}